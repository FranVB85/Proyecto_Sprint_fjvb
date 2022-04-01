package com.nttdata.desafio3.nuevo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nttdata.desafio3.nuevo.entity.Cliente;
import com.nttdata.desafio3.nuevo.service.ClienteService;

@Controller
@RequestMapping("/*")
public class ClienteContralador {

	@Autowired
	private ClienteService clienteServicio;

	@GetMapping("verClientes")
	public String verClientes(Model modelAndView) {

		List<Cliente> clienteList = clienteServicio.buscarTodos();
		modelAndView.addAttribute("clientes", clienteList);
		return "cliente";
	}

	@GetMapping("/anadirCliente")
	public String anadirClientes(Model modelAndView) {

		return "anadirCliente";
	}

}
