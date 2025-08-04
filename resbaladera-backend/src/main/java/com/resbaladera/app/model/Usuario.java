// Archivo: Usuario.java
// Ubicación: resbaladera-backend/src/main/java/com/resbaladera/app/model/Usuario.java
// Esta clase representa la entidad 'Usuario' y se mapea a una tabla en la base de datos.
// Las anotaciones de Lombok (@Data) y JPA (@Entity, @Table) hacen que el código sea más conciso.

package com.resbaladera.app.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

}