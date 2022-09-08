package com.fmontalvoo.springboot.error.app.services;

import java.util.List;

import com.fmontalvoo.springboot.error.app.models.Usuario;

public interface UsuarioService {

	public Usuario obtenerPorId(Integer id);

	public List<Usuario> listar();

}
