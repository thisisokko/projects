package com.springdemo.elastic.springelasticsearch.dao.repository;

import com.springdemo.elastic.springelasticsearch.dao.entity.User;
import java.util.List;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ElasticsearchRepository<User, String> {

  @Query("{\"bool\": {\"must\": [{\"match\": {\"name\": \"?0\"}}]}}")
  List<User> getByCustomSearch(String search);

  List<User> findByNameLike(String name);
}
