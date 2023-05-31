package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("nacional")
public class MontoDebitarNacionalServiceImpl implements CalculoMontoDebitarService {

	@Override
	public BigDecimal calcular(BigDecimal monto) {
		// TODO Auto-generated method stub
		return monto;
	}

}
