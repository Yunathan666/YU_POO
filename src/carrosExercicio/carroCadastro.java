package carrosExercicio;

import javax.swing.JOptionPane;

public class carroCadastro {
	
	
	String marca;
	String cor;
	int anoProd;
	
	void cadastro() {
		
		marca = JOptionPane.showInputDialog("Informe a marca do veiculo");
		cor = JOptionPane.showInputDialog("Informe a cor do veiculo");
		anoProd = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de produção de veiculo"));	
	}
	
	String exibirDados() {
		return marca + " - " + anoProd + " - " + cor +"\n";
		
	}
	
}
