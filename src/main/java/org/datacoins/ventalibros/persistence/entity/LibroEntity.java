package org.datacoins.ventalibros.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="Libros")
@Data
public class LibroEntity {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Long codigoLibro;

    @Column(name = "titulo")
    private String titulo;
    @Column(name = "autor")
    private String autor;
    @Column(name = "precio")
    private Double precio;
    @Column(name = "stock")
    private Integer stock;
}
