package com.example.springdatajpapostgre.dao.repository;

import com.example.springdatajpapostgre.dao.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
