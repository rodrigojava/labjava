import javax.swing.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Alunos 
{

	private String nome;
	private int idade, qtde, novo_aluno;
	private Alunos[] alunos;

	public Alunos (int q, String n, int id) 
	{
		
		this.nome = nome;
		this.idade = idade;
		this.qtde = quantidade;
		alunos = new Alunos[quantidade];
		novo_aluno=0;
	}

	public void exibirDados()
	{
	
	JOptionPane.showMessageDialog(null,"NOME: " + nome + " ,IDADE: " + idade);
        }


	public void incluirRegistro (Novo Aluno)
	{
	
	alunos [novoAluno] = novo;
	novoAluno = novoAluno + 1;
	
	}


	public void exibirRegistros()
	{
	
        	for(int i = 0; i < alunos.length; i ++)
		{
			if(alunos[i] !=null)
			{
		
			alunos[i].exibirDados();
			
			}
		
		}
	
	}


	public void salvarDados() throws Exception
	{
	
	File arquivo = new File("C:\\Users\\Renan\\Desktop\\Exercicios-Alander\\RegistroDeAlunos.log");
	FileWriter gravar = new FileWriter(arquivo);
	gravar.write("Registros de Alunos: " + alunos);
	gravar.close();
	
	}
}