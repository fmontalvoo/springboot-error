package com.fmontalvoo.springboot.error.app.services;

import java.util.List;
import java.util.Optional;

import com.fmontalvoo.springboot.error.app.models.Usuario;

public interface UsuarioService {

	public List<Usuario> listar();

	public Usuario obtenerPorId(Integer id);

	public Optional<Usuario> buscarPorId(Integer id);

}
