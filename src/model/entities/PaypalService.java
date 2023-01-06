package model.entities;

public class PaypalService implements OnlinePaymentService{

	@Override
	public double paymentFee(double amount) {
		double fee = amount * 0.02;
		return fee;
	}

	@Override
	public double interest(double amount, Integer months) {
		double interest = amount + (amount * 0.01) * months;
		return interest;
	}
	
}