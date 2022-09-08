package com.fmontalvoo.springboot.error.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.fmontalvoo.springboot.error.app.errrors.UserNotFoundException;
import com.fmontalvoo.springboot.error.app.models.Usuario;
import com.fmontalvoo.springboot.error.app.services.UsuarioService;

@Controller
public class AppController {

	@Autowired
	private UsuarioService usuarioService;

	@SuppressWarnings("unused")
	@GetMapping({ "", "/" })
	public String index() {
//		Integer i = 1 / 0;
		Integer i = Integer.parseInt("1a");
		return "index";
	}

	@GetMapping("/view/{id}")
	public String view(@PathVariable Integer id, Model model) {

		Usuario usuario = usuarioService.obtenerPorId(id);
		if (usuario == null)
			throw new UserNotFoundException(id.toString());

		model.addAttribute("usuario", usuario);
		return "view";
	}

	@GetMapping("/home")
	public String home() {
		return "home";
	}

}
