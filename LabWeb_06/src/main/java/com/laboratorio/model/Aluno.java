package com.laboratorio.model;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "bAluno")
public class Aluno implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int maticula;
	private String nome;
	private int idade;
	private String sexo;
	private float peso;
	private float altura;
	public int getMaticula() {
		return maticula;
	}
	public void setMaticula(int maticula) {
		this.maticula = maticula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	


}
