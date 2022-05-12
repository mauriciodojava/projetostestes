package com.mauriciodojava.classes;

import java.util.Objects;

public class Aluno {
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	
	private String diciplina1;
	private  double nota1;
	private String diciplina2;
	private double nota2;
	private String diciplina3;
	private double nota3;
	private String diciplina4;
	private double nota4;
	
	public Aluno() {
		
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getDiciplina1() {
		return diciplina1;
	}

	public void setDiciplina1(String diciplina1) {
		this.diciplina1 = diciplina1;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public String getDiciplina2() {
		return diciplina2;
	}

	public void setDiciplina2(String diciplina2) {
		this.diciplina2 = diciplina2;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public String getDiciplina3() {
		return diciplina3;
	}

	public void setDiciplina3(String diciplina3) {
		this.diciplina3 = diciplina3;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public String getDiciplina4() {
		return diciplina4;
	}

	public void setDiciplina4(String diciplina4) {
		this.diciplina4 = diciplina4;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataMatricula, dataNascimento, diciplina1, diciplina2, diciplina3, diciplina4, idade, nome,
				nomeEscola, nomeMae, nomePai, nota1, nota2, nota3, nota4, numeroCpf, registroGeral);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataMatricula, other.dataMatricula)
				&& Objects.equals(dataNascimento, other.dataNascimento) && Objects.equals(diciplina1, other.diciplina1)
				&& Objects.equals(diciplina2, other.diciplina2) && Objects.equals(diciplina3, other.diciplina3)
				&& Objects.equals(diciplina4, other.diciplina4) && idade == other.idade
				&& Objects.equals(nome, other.nome) && Objects.equals(nomeEscola, other.nomeEscola)
				&& Objects.equals(nomeMae, other.nomeMae) && Objects.equals(nomePai, other.nomePai)
				&& Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1)
				&& Double.doubleToLongBits(nota2) == Double.doubleToLongBits(other.nota2)
				&& Double.doubleToLongBits(nota3) == Double.doubleToLongBits(other.nota3)
				&& Double.doubleToLongBits(nota4) == Double.doubleToLongBits(other.nota4)
				&& Objects.equals(numeroCpf, other.numeroCpf) && Objects.equals(registroGeral, other.registroGeral);
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", diciplina1=" + diciplina1
				+ ", nota1=" + nota1 + ", diciplina2=" + diciplina2 + ", nota2=" + nota2 + ", diciplina3=" + diciplina3
				+ ", nota3=" + nota3 + ", diciplina4=" + diciplina4 + ", nota4=" + nota4 + "]";
	}
	

}
