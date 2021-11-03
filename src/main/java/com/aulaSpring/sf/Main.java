package com.aulaSpring.sf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aulaSpring.sf.model.Usuario;
import com.aulaSpring.sf.servico.UsuarioServico;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				Main.class.getPackage().getName());
		
		Usuario usuario = new Usuario("Gabriela");
		
		UsuarioServico usuarioServico = applicationContext.getBean(UsuarioServico.class);
		
		usuarioServico.cadastrar(usuario);
		
		System.out.println("Fim!");
	}

}
