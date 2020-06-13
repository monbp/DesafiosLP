package senai;

import javax.swing.JOptionPane;

public class Desafio01Mon {
	
	public static void main(String[] args) {
		
		
		//Crie um Algoritmo onde um usuário irá digitar um veículo, e o seu consumo médio por km. 
		//Posteriormente ele irá digitar o nome de uma cidade e a distância da mesma em KM relação ao usuário. 
		//Por fim, o sistema deverá informar quantos litros de combustível o carro usará para chegar no destino.
		
		
		String veiculo = JOptionPane.showInputDialog("Informe o modelo do veículo");
		double consumo = Double.parseDouble(JOptionPane.showInputDialog("Informe o consumo médio do veículo em km/l"));
		String cidade = JOptionPane.showInputDialog("Informe a cidade destino");
		double distancia = Double.parseDouble(JOptionPane.showInputDialog("Informe a distância a sua distancia da cidade destino em km"));
		double litros = distancia / consumo;
		
		JOptionPane.showMessageDialog(null, "Para chegar até a cidade " +cidade+", na distância de "+distancia+"km, o "+veiculo+ " usará "
		+litros+" litros de combustível");
				
	}
	
	
}