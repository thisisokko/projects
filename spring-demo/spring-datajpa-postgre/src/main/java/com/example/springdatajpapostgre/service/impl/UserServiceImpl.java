package com.example.springdatajpapostgre.service.impl;

import com.example.springdatajpapostgre.dao.entity.ADDRESS_TYPE;
import com.example.springdatajpapostgre.dao.entity.Address;
import com.example.springdatajpapostgre.dao.entity.User;
import com.example.springdatajpapostgre.dao.repository.AddressRepository;
import com.example.springdatajpapostgre.dao.repository.UserRepository;
import com.example.springdatajpapostgre.dto.UserDto;
import com.example.springdatajpapostgre.service.UserService;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;
  private final AddressRepository addressRepository;

  @Override
  @Transactional
  public UserDto save(UserDto userDto) {
    User user = new User();
    user.setName(userDto.getName());
    user.setSurname(userDto.getSurname());
    user = userRepository.save(user);
    List<Address> addressList = new ArrayList<>();
    User finalUser = user;
    userDto.getAddressList().forEach(item -> {
      Address address = new Address();
      address.setAddress(item);
      address.setAddress_type(ADDRESS_TYPE.OTHER);
      address.setIsActive(true);
      address.setUser(finalUser);
    });
    addressRepository.saveAll(addressList);
    userDto.setId(finalUser.getId());
    return userDto;
  }

  @Override
  public void delete(Long id) {

  }

  @Override
  public UserDto getAll(UserDto userDto) {
    return null;
  }

  @Override
  public Page<UserDto> getAll(Pageable pageable) {
    return null;
  }
}
