package org.example.entity;

public class Calculator {

	//Atributos
	private int numero1;
	private int numero2;
	private int resultado;


	//Constructor
	public Calculator(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	//Meotos getters y setters
	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "Calculator{" +
				 "numero1=" + numero1 +
				 ", numero2=" + numero2 +
				 ", resultado=" + resultado +
				 '}';
	}


}
