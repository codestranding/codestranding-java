//import java.util.Scanner;

public class OverLoadedMethod {
	public static void main(String[] args) {
		//Scanner scnr = new Scanner(System.in);
		// overloaded method = method that share the same name
		// but different parameters
		//signature = name + parameters
		String pizza = bakePizza("flat bread", "mozzarella", "pepperoni");
		System.out.println(pizza);
	}
	// static double add(double a, double b){
	// 	return a + b;
	// }
	// static double add(double a, double b, double c){
	// 	return a + b+ c;
	// }
	static String bakePizza(String bread){
		return bread + " pizza";
	}
	static String bakePizza(String bread, String cheese){
		return cheese+ " "+bread + " pizza";
	}
	static String bakePizza(String bread, String cheese, String topping){
		return topping+" "+cheese+ " "+bread + " pizza";
	}
}