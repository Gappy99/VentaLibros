package org.datacoins.ventalibros.dominio.service;

import org.datacoins.ventalibros.persistence.entity.Usuario;

import java.util.List;

public interface IUsuarioService {

    List<Usuario> listarUsuarios();
    Usuario buscarUsuarioProId(Integer codigo);
    void guardarUsuario(Usuario usuario);
    void eliminarUsurio(Usuario usuario);
}
