import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
	private List<T> fruitList;
	private float currentWeight;

	public Box() {
		this.fruitList = new ArrayList<>();
	}

	public void addFruit(T fruit) {
		fruitList.add(fruit);
		currentWeight = (currentWeight + fruit.getWeight());
	}

	public double getCurrentWeight() {
		return currentWeight;
	}

	public boolean compare(Box box) {
		if (currentWeight == box.currentWeight)
			return true;
		return false;
	}

	public void moveFruits (Box box) {
		box.currentWeight = box.currentWeight + currentWeight;
		if (currentWeight > 0) {
			currentWeight = 0;
		}

	}
}


