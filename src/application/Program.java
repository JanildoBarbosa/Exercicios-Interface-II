package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.ContractService;
import model.entities.Installment;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		
		System.out.print("Data dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), dtf);
		
		System.out.print("Valor do contrato: ");
		double contractValue = sc.nextDouble();
		
		System.out.print("Entre com o numero de parcelas: ");
		int installmentQuantity = sc.nextInt(); 
		Contract contract = new Contract(number, date, contractValue);
		
		ContractService contractService = new ContractService();
		
		contractService.processContract(contract, installmentQuantity);

		System.out.println("Parcelas: ");
		
		for (Installment installment : contract.getInstallments()) {
			System.out.println(dtf.format(installment.getDueDate()) + " - " + installment.getAmount());
		}
		
			

		sc.close();

	}

}
