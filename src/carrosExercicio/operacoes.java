package carrosExercicio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class operacoes {

	public static void main(String[] args) {
		
		ArrayList <carroCadastro> carros = new ArrayList <carroCadastro>();
		
		do {
		int operador = Integer.parseInt(JOptionPane.showInputDialog("OQUE VOCE DESEJA FAZER?\n\n" +
                "1 - CADASTRAR NOVO CARRO AO ESTOQUE\n" +
                "2 - LISTAR POR COR\n" +
                "3 - LISTAR POR MARCA\n" +
                "4 - SAIR"));
		
		
		switch(operador) {
		
		case 1:
			carroCadastro a = new carroCadastro();
			a.cadastro();
			carros.add(a);
		break;
		
		case 2:
			String result = "Carros cadastrados:\n\n";
			for (carroCadastro a1 : carros) {
				result += a1.exibirDados();
			} JOptionPane.showMessageDialog(null, result);
		}
		
		
		} while (1 == 1);
		
		
		
		
		
		
		
	}
	
	
}
