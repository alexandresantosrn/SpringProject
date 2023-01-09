package com.example.algamoney.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.algamoney.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

	private PessoaRepository pessoaRepository;
	
}
