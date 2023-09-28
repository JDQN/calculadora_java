package org.example.services;

import org.example.entity.Calculator;

public class CalculatorService {

	//Instancia de la clase Calculator
	Calculator calculator = new Calculator(3, 6);


	//Metodo para sumar
	public int sumar() {
		return calculator.getNumero1() + calculator.getNumero2();
	}


	//Metodo para restar
	public int restar() {
		return calculator.getNumero1() - calculator.getNumero2();
	}

}
