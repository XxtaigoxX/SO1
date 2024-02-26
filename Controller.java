package ex1;
import javax.swing.JOptionPane;
public class Controller {
public static void iniciar(int vt1[],int vt2[],int vt3[]) {
	for (int i = 0; i < 1000; i++) {
		vt1[i]=1;
	}
	for (int i = 0; i < vt2.length; i++) {
		vt2[i]=0;
	}
	for (int j = 0; j < vt3.length; j++) {
		vt3[j]=0;
	}
}

public static void percorrer3(int[] vt3) {
	double startTime = System.nanoTime();
		for (int i = 0; i < vt3.length; i++) {
		}
		double endTime = System.nanoTime();

	   double tempo3= (endTime-startTime)/ Math.pow(10,9);
	   System.out.println(tempo3);	
}
public static void percorrer2(int[] vt2) {
	double startTime = System.nanoTime();
		for (int i = 0; i < vt2.length; i++) {

		}
	    double endTime = System.nanoTime();

	   double tempo2= (endTime-startTime)/ Math.pow(10,9);
	   System.out.println(tempo2);	
}
public static void percorrer(int[] vt1) {
	double startTime = System.nanoTime();
	for (int i = 0; i < vt1.length; i++) {
	}
	double endTime = System.nanoTime();

   double tempo= (endTime-startTime)/ Math.pow(10,9);
   System.out.println(tempo);
}

public static void separar(String frase) {
String[] vetorPalavras = frase.split(";");	
 for(String palavra : vetorPalavras) {
 System.out.println(palavra);	
}	
} 
}
