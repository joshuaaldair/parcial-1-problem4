package problema4;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class Problem4 {
	private static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner (System.in);
		Scanner scan = scanner.useLocale(Locale.US);
		DecimalFormat df = new DecimalFormat("0.00");
		df.setMaximumFractionDigits(2);
		double numero, mayor=-999999999, menor=999999999, total=0, positivos=0, negativos=0, media=0;
		int i=0;
		
		 do {
			System.out.print("Ingrese el numero (-1 para terminar la entada): ");
			numero= scan.nextDouble();
			if (numero!=-1) {
				if (numero>mayor)
					mayor=numero;
				if (numero<menor)
					menor=numero;
				if (numero>0)
					positivos=positivos+numero;
				if (numero<0)
					negativos=negativos+numero;
				total=total+numero;
				i++;
			} 
		} while(numero!=-1);
		media=total/i;
		System.out.println("\nMayor numero introducido:\t\t"+mayor+"\nMenor numero introducido:\t\t"+menor+"\nSuma de todos los numeros:\t\t"+total+"\nSuma de todos los numeros positivos:\t"+positivos+"\nSuma de todos los numeros negativos:\t"+negativos+"\nMedia de la suma:\t\t\t"+df.format(media));
		scan.close();
	}

}
