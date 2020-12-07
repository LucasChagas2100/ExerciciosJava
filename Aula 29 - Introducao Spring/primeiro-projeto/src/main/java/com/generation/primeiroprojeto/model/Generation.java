package com.generation.primeiroprojeto.model;

public class Generation {
	String texto;
	boolean aprendendo;
	
	public Generation(String texto, boolean aprendendo) {
		super();
		this.texto = texto;
		this.aprendendo = aprendendo;
	}
	public Generation() {
		super();
	}
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public boolean isAprendendo() {
		return aprendendo;
	}
	public void setAprendendo(boolean aprendendo) {
		this.aprendendo = aprendendo;
	}
	
	

}
