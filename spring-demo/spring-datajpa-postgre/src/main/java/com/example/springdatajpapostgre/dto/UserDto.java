package com.example.springdatajpapostgre.dto;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

  private Long id;

  private String name;

  private String surname;

  private List<String> addressList;
}
