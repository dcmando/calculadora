package com.example.calculadora;

public class Calculadora {
	private double num1;
	private double num2;
	private char operador;
	private double resultado;
	
	public double getNum1() {
		return num1;
	}
	
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	
	public double getNum2() {
		return num2;
	}
	
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public char getOperador() {
		return operador;
	}
	
	public void setOperador(char operador) {
		this.operador = operador;
	}
	
	public float getResultado() {
		return resultado;
	}
	
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public void Calcular()
	{
		switch (operador) {
		case '+':
			resultado = num1 + num2;
			break;
		case '-':
			resultado = num1 - num2;
			break;
		case '*':
			resultado = num1 * num2;
			break;
		case '/':
			resultado = num1 / num2;
			break;
			default:
				break;
		}
	}

}
