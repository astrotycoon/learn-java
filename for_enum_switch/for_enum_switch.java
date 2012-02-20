enum Fruit {
	apple, pear, banana, watermelon 
}
public class for_enum_switch {
	public static void main(String args[]) {
		double price = 0;
		boolean show = false;
		
		for (Fruit fruit:Fruit.values()) {
			switch(fruit) {
			case apple:
					price = 1.5;
					show = true;
					break;
			case pear:
					price = 6.8;
					show = true;
					break;
			case banana:
					price = 2.8;
					show = true;
					break;
			case watermelon:
					price = 2.5;
					show = true;
					break;
			default:
					show = false;
			}
			if (show) {
				System.out.println(fruit +"500克的价格:"+ price +"元");
			}
		}
	}
}
