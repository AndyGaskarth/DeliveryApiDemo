package com.mbalem.demodeliveryapi.repository;

import com.mbalem.demodeliveryapi.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


}