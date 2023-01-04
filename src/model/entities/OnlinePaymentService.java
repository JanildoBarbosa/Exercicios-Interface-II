package model.entities;

public interface OnlinePaymentService {
	
	double paymentFee(double amount);
	
	double interest(double amount, Integer months);

}
