package org.example.service;

import java.math.BigDecimal;

import org.example.model.Funcionario;

public interface ValidacaoReajuste {
	
	void validar(Funcionario funcionario, BigDecimal aumento);

}