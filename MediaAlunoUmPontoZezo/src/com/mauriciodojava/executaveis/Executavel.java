package com.mauriciodojava.executaveis;

import javax.swing.JOptionPane;

import com.mauriciodojava.classes.Aluno;
import com.mauriciodojava.classes.Disciplina;

public class Executavel {
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("nome do Aluno ");
		String idade = JOptionPane.showInputDialog("idade ");
		String dataNascimento = JOptionPane.showInputDialog("data de nascimento ");
		String rg = JOptionPane.showInputDialog("RG ");
		String cpf = JOptionPane.showInputDialog("CPF ");
		String nomeMae = JOptionPane.showInputDialog("nome da mae do Aluno ");
		String nomePai = JOptionPane.showInputDialog("nome do pai do  Aluno ");
		String dataMatricula = JOptionPane.showInputDialog("data da matricula ");
		String serieMatriculado = JOptionPane.showInputDialog("serie  ");
		String escola = JOptionPane.showInputDialog("nome da escala ");
		
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNomeEscola(escola);
		
		
		Disciplina disciplina1 = new Disciplina();
		String discip1 = JOptionPane.showInputDialog("disciplina 1 ");
		String nota1 = JOptionPane.showInputDialog("nota 1");
		disciplina1.setDisciplina(discip1);
		disciplina1.setNota(Double.valueOf(nota1));
		
		Disciplina disciplina2 = new Disciplina();
		String discip2 = JOptionPane.showInputDialog("disciplina 2 ");
		String nota2 = JOptionPane.showInputDialog("nota 2 ");
		disciplina2.setDisciplina(discip2);
		disciplina2.setNota(Double.valueOf(nota2));
		
		Disciplina disciplina3 = new Disciplina();
		String discip3 = JOptionPane.showInputDialog("disciplina 3 ");
		String nota3 = JOptionPane.showInputDialog("nota 3 ");
		disciplina3.setDisciplina(discip3);
		disciplina3.setNota(Double.valueOf(nota3));
		
		Disciplina disciplina4 = new Disciplina();
		String discip4 = JOptionPane.showInputDialog("disciplina 4 ");
		String nota4 = JOptionPane.showInputDialog("nota 4 ");
		disciplina4.setDisciplina(discip4);
		disciplina4.setNota(Double.valueOf(nota4));
		
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);
		aluno1.getDisciplinas().add(disciplina3);
		aluno1.getDisciplinas().add(disciplina4);
		
		
		System.out.println(aluno1.toString());
		System.out.println("nome do Aluno  " + aluno1.getNome());
		System.out.println(" numero do cpf : " + aluno1.getNumeroCpf());
		System.out.println("A medea do Aluno e : " + aluno1.getMediaNota()+ "Status do Aluno : "+ aluno1.getAlunoAprovado());
		
		
		
		
		
		
		
	}

}
