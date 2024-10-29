package Interface;

public class MAin {

	public static void main(String[] args) {
		ProcessorPayment pp = new ProcessorPayment();
		
		Payment p1 = new CreditCard();
		Payment p2 = new PayPal();
		
		p1.pay();
		p2.pay();
		pp.process(p1);
		pp.process(p2);

	}

}
