package com.springdemo.elastic.springelasticsearch.controller;

import com.springdemo.elastic.springelasticsearch.dao.entity.User;
import java.util.Calendar;
import java.util.List;
import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

  private final UserControllerService userControllerService;

  @PostConstruct
  public void init() {
    User user = new User();
    user.setId("1");
    user.setName("test");
    user.setSurname("test");
    user.setAddress("test");
    user.setBirthDate(Calendar.getInstance().getTime());
    saveInıtUser(user);
  }

  public void saveInıtUser(User user) {
    userControllerService.saveInıtUser(user);
  }

  @GetMapping("/{search}")
  public ResponseEntity<List<User>> getAllUser(@PathVariable String search) {
    return new ResponseEntity<>(userControllerService.getByCustomSearch(search), HttpStatus.OK);
  }
}
