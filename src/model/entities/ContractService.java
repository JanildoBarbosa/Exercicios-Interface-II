package model.entities;

import java.time.LocalDate;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public void processContract(Contract contract, Integer months, OnlinePaymentService onlinePaymentService) {
		
		LocalDate dueDate = contract.getDate();
		double installment = contract.getTotalValue() / months;
		
		for (int i = 1; i <= months; i++) {		
			
			dueDate = dueDate.plusDays(30);
			double interest = onlinePaymentService.interest(installment, i);
			double fee = onlinePaymentService.paymentFee(interest);
			double amount = interest + fee; 

			contract.setInstallments(new Installment(dueDate, amount));
			
		}
		
	}

}
