import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		//Первое задание
		Integer[] arr = {4, 5, 7, 3, 6};
		System.out.println(Arrays.toString(arr));
		SwapTwoArrayThings.swapElements(arr, 1, 2);
		System.out.println(Arrays.toString(arr));

		//Второе задание
		Box<Apple> appleBox = new Box<>();

		appleBox.addFruit(new Apple());
		appleBox.addFruit(new Apple());
		appleBox.addFruit(new Apple());

		System.out.println(appleBox.getCurrentWeight());

		Box<Orange> orangeBox = new Box<>();
		orangeBox.addFruit(new Orange());
		orangeBox.addFruit(new Orange());

		System.out.println(orangeBox.getCurrentWeight());

		System.out.println(appleBox.compare(orangeBox));

		Box<Orange> orangeBox1 = new Box<>();
		orangeBox1.addFruit(new Orange());
		orangeBox.moveFruits(orangeBox1);

		System.out.println(orangeBox.getCurrentWeight());
		System.out.println(orangeBox1.getCurrentWeight());

	}
}
