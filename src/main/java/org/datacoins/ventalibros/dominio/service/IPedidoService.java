package org.datacoins.ventalibros.dominio.service;


import org.datacoins.ventalibros.persistence.entity.Pedido;

import java.util.List;

public interface IPedidoService {

    List<Pedido> listarPedidos();
    Pedido buscarPedidoPorId(Integer codigo);
    void guardarPedido(Pedido pedido);
    void eliminarPedido(Pedido pedido);
}
