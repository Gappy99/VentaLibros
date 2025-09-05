package org.datacoins.ventalibros.dominio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.datacoins.ventalibros.persistence.crud.PedidoCrud;
import org.datacoins.ventalibros.persistence.entity.Pedido;

import java.util.List;

@Service
public class PedidoService implements IPedidoService{

    //Ingeyeccion de dependencia de mi repositorio (ClienteCrud) (ClienteRepositori)
    @Autowired
    private PedidoCrud crud;

    @Override
    public List<Pedido> listarPedidos() {
        List<Pedido> pedidos = crud.findAll();
        return pedidos;
    }

    @Override
    public Pedido buscarPedidoPorId(Integer codigo) {
        Pedido pedido = crud.findById(codigo).orElse(null );
        return pedido;
    }

    @Override
    public void guardarPedido(Pedido pedido) {
        crud.save(pedido);
    }

    @Override
    public void eliminarPedido(Pedido pedido) {
        crud.delete(pedido);
    }
}
