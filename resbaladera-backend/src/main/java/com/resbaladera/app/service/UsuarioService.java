// Archivo: UsuarioService.java
// Ubicación: resbaladera-backend/src/main/java/com/resbaladera/app/service/UsuarioService.java
// Esta clase es la capa de servicio que contiene la lógica de negocio.
// Utiliza el repositorio para interactuar con la base de datos.

package com.resbaladera.app.service;

import com.resbaladera.app.model.Usuario;
import com.resbaladera.app.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }
}
