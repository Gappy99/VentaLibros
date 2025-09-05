package org.datacoins.ventalibros.dominio.service;

import org.datacoins.ventalibros.persistence.crud.UsuarioCrud;
import org.datacoins.ventalibros.persistence.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{


    @Autowired
    private UsuarioCrud crud;



    @Override
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = crud.findAll();
    }

    @Override
    public Usuario buscarUsuarioProId(Integer codigo) {
        return null;
    }

    @Override
    public void guardarUsuario(Usuario usuario) {

    }

    @Override
    public void eliminarUsurio(Usuario usuario) {

    }
}
