package model.entities;

import java.time.LocalDate;

public class ContractService {
	
	public void processContract(Contract contract, Integer months) {
		
		LocalDate dueDate;
		double amount = 0.0;
		double capital = contract.getTotalValue() / months;
		double tax = 0.02 * capital;
		
		for (int i = 0; i < months; i++) {
			
			dueDate = contract.getDate().plusDays(30);

			amount = capital + tax * i;
			
			contract.setInstallments(new Installment(dueDate, amount));
			
		}
		
	}

}
