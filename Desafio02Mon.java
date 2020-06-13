package senai;

import javax.swing.JOptionPane;

public class Desafio02Mon {

	//Peça nome do aluno
	//Receba 3 notas
	//Receba frequencia de sala (0 a 100)
	//Calcule sua média e depois apresente no final duas mensagens
	//Aprovado ou Reprovado na média 7 ou mais
	//Aprovado ou reprovado na presença presenca min 75

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual seu nome?");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura em metros?"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual seu peso em km?"));
		String genero = JOptionPane.showInputDialog("Qual seu gênero?");
		String email = JOptionPane.showInputDialog("Qual endereço do seu e-mail?");

		JOptionPane.showMessageDialog(null, nome+" tem "+idade+" anos de idade, possui "+altura+"m de altura, pesa "
		+peso+"kg, é do gênero "+genero+" e seu endereço de e-mail é "+email);

		int novaIdade = idade + 2;
		double novoPeso = peso + 4.5;
		double novaAltura = altura + 0.01;
		String novoEmail = JOptionPane.showInputDialog("Digite um novo endereço de e-mail");

		JOptionPane.showMessageDialog(null, nome+" tem "+novaIdade+" anos de idade, possui "+novaAltura+"m de altura, pesa "
		+novoPeso+"kg e seu novo endereço de e-mail é "+novoEmail);

	}

}
