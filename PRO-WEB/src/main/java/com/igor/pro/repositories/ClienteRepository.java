package com.igor.pro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igor.pro.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>
{

}
