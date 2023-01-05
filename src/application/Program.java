package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.ContractService;
import model.entities.Installment;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//LocalDate date;
		
		List<Installment>installments = new ArrayList<>();
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate.parse(sc.nextLine());
		System.out.println("Valor do contrato: ");
		double contractValue = sc.nextDouble();
		
		System.out.println("Entre com o numero de parcelas: ");
		int installmentQuantity = sc.nextInt(); 
		LocalDate date = LocalDate.parse(sc.next(), dtf);
		date = LocalDate.now().plusDays(30);
		//date = LocalDate.now().plusDays(30);
		
		Contract contract = new Contract(number, date, contractValue);
		
		ContractService contractService = new ContractService()

		
		
		

		

		sc.close();

	}

}
