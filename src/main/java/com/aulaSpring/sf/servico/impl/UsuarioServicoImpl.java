package com.aulaSpring.sf.servico.impl;

import org.springframework.stereotype.Component;

import com.aulaSpring.sf.model.Usuario;
import com.aulaSpring.sf.servico.UsuarioServico;

@Component
public class UsuarioServicoImpl implements UsuarioServico {

	@Override
	public void cadastrar(Usuario usuario) {
		System.out.println("Novo usuário: " +usuario);
	}

}
