package org.datacoins.ventalibros.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.datacoins.ventalibros.persistence.entity.Pedido;

public interface PedidoCrud extends JpaRepository<Pedido, Integer> {

}
