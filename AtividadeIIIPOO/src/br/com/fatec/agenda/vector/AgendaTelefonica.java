package br.com.fatec.agenda.vector;

import java.util.Scanner;

import br.com.fatec.agenda.Pessoa;

import java.util.Vector;

public class AgendaTelefonica {

	private Vector<Pessoa> pessoas;
	private Scanner scanner;

	public AgendaTelefonica() {
		pessoas = new Vector();
		scanner = new Scanner(System.in);
	}

	public void cadastrarPessoa() {
		System.out.println("\nInsira um nome para a pessoa: ");
		String nome = scanner.nextLine();
		System.out.println("\nInsira um telefone para a pessoa: ");
		String telefone = scanner.nextLine();
		System.out.println("\nInsira um e-mail para a pessoa: ");
		String email = scanner.nextLine();
		Pessoa nova = new Pessoa(nome, telefone, email);
		pessoas.add(nova);
		System.out.println("\nNovo contato adicionado!\n");
	}

	public void imprimirOpcoes() {
		System.out.println("\nEscolha uma das opções: \n");
		System.out.println("1 - Listar contatos. \n");
		System.out.println("2 - Incluir contatos. \n");
		System.out.println("3 - Sair \n");
	}

	public void imprimirPessoas() {
		for (Pessoa pessoa : pessoas) {
			if (pessoa != null) {
				System.out.println("\nNome: " + pessoa.getNome() + "\nTelefone: " + pessoa.getTelefone() + "\nE-mail: "
						+ pessoa.getEmail());

			}
		}
	}

	public Vector<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(Vector<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

}
