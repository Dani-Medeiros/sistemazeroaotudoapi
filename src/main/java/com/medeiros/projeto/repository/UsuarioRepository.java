package com.medeiros.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medeiros.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
