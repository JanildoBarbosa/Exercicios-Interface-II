package model.entities;

import java.time.LocalDate;

public class ContractService {
	
	public void processContract(Contract contract, Integer months) {
		
		LocalDate dueDate = contract.getDate();
		
		for (int i = 1; i <= months; i++) {		
			
			dueDate = dueDate.plusDays(30);
			
			double installment = contract.getTotalValue() / months;
			double fees = installment * 0.01;
			double result = installment + fees * i;
			double amount = result * 1.02; 

			contract.setInstallments(new Installment(dueDate, amount));
			
		}
		
	}

}
