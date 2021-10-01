package com.springdemo.elastic.springelasticsearch.dao.service;

import com.springdemo.elastic.springelasticsearch.dao.entity.User;
import com.springdemo.elastic.springelasticsearch.dao.repository.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
  private final UserRepository userRepository;

  public List<User> getByCustomSearch(String search) {
    return userRepository.findByNameLike(search);
  }

  public void saveInıtUser(User user) {
    userRepository.save(user);
  }
}
