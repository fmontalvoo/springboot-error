package com.fmontalvoo.springboot.error.app.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fmontalvoo.springboot.error.app.models.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private List<Usuario> usuarios;

	public UsuarioServiceImpl() {
		this.usuarios = Arrays.asList(new Usuario(1, "Fulano", "Detal"), new Usuario(2, "Alan", "Brito"),
				new Usuario(3, "Aquiles", "Castro"));
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		for (Usuario usuario : usuarios) {
			if (usuario.getId().equals(id))
				return usuario;
		}
		return null;
	}

	@Override
	public Optional<Usuario> buscarPorId(Integer id) {
		return Optional.ofNullable(this.obtenerPorId(id));
	}

	@Override
	public List<Usuario> listar() {
		return this.usuarios;
	}

}
