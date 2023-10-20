package com.igor.pro.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igor.pro.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>
{

   Optional<Pessoa> findByCpf(String cpf);

   Optional<Pessoa> findByEmail(String email);

}
