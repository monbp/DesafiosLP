package senai;

import javax.swing.JOptionPane;

public class Desafio03Mon {
	
	public static void main(String[] args) {
		
		//Média do Aluno, 3 notas, calcular a média e a frequencia e dizer se está aprovado
		// pela nota e pela frequencia. Média 7 e frequencia 75
		
		String nome = "";
		double nota1 = 0.0;
		double nota2 = 0.0;		
		double nota3 = 0.0;
		int frequencia = 0;
		double media = 0.0;
		
		nome = JOptionPane.showInputDialog("Qual o nome do aluno(a)?");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi sua primeira nota de 0 a 10?"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi sua segunda nota de 0 a 10?"));		
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi sua terceira nota de 0 a 10?"));
		frequencia = Integer.parseInt(JOptionPane.showInputDialog("No total de 100 aulas, quantas aulas o aluno(a) obteve teve presença?"));
		
		media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7.0) {
			
			JOptionPane.showMessageDialog(null, "O aluno(a) "+nome+" foi aprovado com a média "+media);		
		
		} else { 
			
			JOptionPane.showMessageDialog(null, "O aluno(a) "+nome+" foi reprovado com a média "+media);
		
		} 
		
		if (frequencia >= 75) {
			
			JOptionPane.showMessageDialog(null, "O aluno(a) "+nome+" foi aprovado(a) com a frequência "+frequencia+" em sala de aula");	
		
		} else {
			
			JOptionPane.showMessageDialog(null, "O aluno(a) "+nome+" foi reproprovado com a frequência "+frequencia+" em sala de aula");	
		
		}	
		
	}
	
}

		// Correções: Nos números eu coloquei 0, mas era 0.0
