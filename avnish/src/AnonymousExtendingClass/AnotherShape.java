package AnonymousExtendingClass;

public class AnotherShape {
		void createShape() {
			Shape s = new Shape() {

				@Override
				void draw() {
					System.out.println("Another Shape is Created");
				}
			};
			s.draw();
		}
}
