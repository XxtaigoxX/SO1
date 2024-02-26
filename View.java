package ex1;

import javax.swing.JOptionPane;
import ex1.Controller;
public class View {
public static void main(String[] args) {
	int vt1[] = new int [1000];
	int vt2[] = new int [10000];
	int vt3[] = new int [100000];
	Controller controller = new Controller();
 controller.iniciar(vt1,vt2,vt3);
	int n=0;
	int l=0;
	
	while (l!=9) {
	l=Integer.parseInt(JOptionPane.showInputDialog("1 para percorrer os vetores, 2 para separar a frase, 9 para sair"));
	switch (l) {

		case (1) :
			while (n!=9) {
		n=Integer.parseInt(JOptionPane.showInputDialog("1-ver o tempo do vetor de 1000 posições,2-ver o tempo do vetor de 10000 posições,3-ver o tempo do vetor de 100000 posições, 9-fechar "));
	switch (n) {
	case 1:
		controller.percorrer(vt1);
		break;
	case 2:
		controller.percorrer2(vt2);

		break;
	case 3: 
		controller.percorrer3(vt3);
		break;
	case 9:
	System.exit(0);
	}
	}
		break;
		case 2 :
			String frase= JOptionPane.showInputDialog("digite a frase");
			controller.separar(frase);
			break;
		case 9:
			System.exit(0);
				
	}
}
}
}

