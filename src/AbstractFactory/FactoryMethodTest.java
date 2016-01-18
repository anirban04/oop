package AbstractFactory;

public class FactoryMethodTest {
	public static void main(String[] args) {
		PizzaStore pC = new ChicagoStylePizzaStore();
		PizzaStore pN = new NyStylePizzaStore();
		
		pN.orderPizza("Cheese");
		System.out.println();
		//pN.orderPizza("Meat");
		//System.out.println();
	}
}
