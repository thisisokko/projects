package com.springdemo.elastic.springelasticsearch.controller;

import com.springdemo.elastic.springelasticsearch.dao.entity.User;
import com.springdemo.elastic.springelasticsearch.dao.service.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserControllerService {
  private final UserService userService;

  public List<User> getByCustomSearch(String search) {
    log.info(search);
    return userService.getByCustomSearch(search);
  }

  public void saveInıtUser(User user) {
    userService.saveInıtUser(user);
  }
}
