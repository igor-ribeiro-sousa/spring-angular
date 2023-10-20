package com.igor.pro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igor.pro.entities.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>
{

}
