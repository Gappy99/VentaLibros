package org.datacoins.ventalibros.persistence.crud;

import org.datacoins.ventalibros.persistence.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioCrud extends JpaRepository<Usuario, Integer> {
}