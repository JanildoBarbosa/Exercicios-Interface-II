package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		System.out.print("Data (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.nextLine());
		System.out.println("Valor do contrato: ");
		double contractValue = sc.nextDouble();
		System.out.println("Entre com o numero de parcelas: ");
		int installmentQuantity = sc.nextInt(); 
		
		sc.close();

	}

}
