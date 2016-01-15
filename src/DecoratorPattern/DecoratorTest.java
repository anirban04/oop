package DecoratorPattern;

public class DecoratorTest {
	public static void main(String[] args) {
		FrozenYoghurt yoghurt = new Chocolate();
		yoghurt = new Granola(yoghurt);
		yoghurt = new ShavedMilkChocolate(yoghurt);
		yoghurt = new CocoNibs(yoghurt);
		System.out.println("This is a " + yoghurt.getDescription() + "and it costs " + yoghurt.getCost());
	}
}
