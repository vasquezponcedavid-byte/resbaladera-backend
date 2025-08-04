// Archivo: UsuarioRepository.java
// Ubicación: resbaladera-backend/src/main/java/com/resbaladera/app/repository/UsuarioRepository.java
// Esta interfaz es el repositorio que se encarga de las operaciones CRUD (Crear, Leer, Actualizar, Borrar)
// con la base de datos para la entidad Usuario. Spring Data JPA se encarga de la implementación.

package com.resbaladera.app.repository;

import com.resbaladera.app.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Aquí puedes añadir métodos de búsqueda personalizados si los necesitas.
    // Por ejemplo: Usuario findByEmail(String email);
}
