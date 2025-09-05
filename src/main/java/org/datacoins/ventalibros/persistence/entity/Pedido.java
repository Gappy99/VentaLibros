package org.datacoins.ventalibros.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoPedido")
    private Integer codigoPedido;

    @Column(name = "codigoUsuario")
    private Integer codigoUsuario;

    @Column(name = "fechaPedido")
    private LocalDate fechaPedido;

    @Enumerated(EnumType.STRING)
    @Column(name = "estadoPedido")
    private EstadoPedido estadoPedido;

    public enum EstadoPedido {
        Entregado,
        No_entregado //Los enum no pueden tener espacio chinito y saul
    }
}
