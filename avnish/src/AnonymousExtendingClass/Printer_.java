package AnonymousExtendingClass;

public class Printer_ {
	void createPrinter(){
		Printer p = new Printer(){

			@Override
			void printMessage() {
				System.out.println(">>>>> Overriding Printer Class Method <<<<<");
			}
			
		};
		p.printMessage();
	}
}
