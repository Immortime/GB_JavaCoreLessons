import java.util.*;

public class Main {

	public static void main(String[] args) {

		//Task 1
		System.out.println(" ");
		System.out.println("Task 1");
		ArrayList<String> randomwords = new ArrayList<>(Arrays.asList(
				"Какие-то", "слова", "которые", "повторяются", "еще строчка",
				"Они", "всё еще", "повторяются", "уже даже", "дополнительно",
				"Не знаю", "какие", "слова", "писать", "еще строчка",
				"Поэтому", "просто", "повторяю", "слова", "дополнительно",
				"Еще", "нужна", "строчка", "слова", "слова"
		));

		Set<String> differentwords = new HashSet<>(randomwords);
		System.out.println("Первоначальный массив");
		System.out.println(randomwords);
		System.out.println("Уникальные слова");
		System.out.println(differentwords);
		System.out.println("Частота встречаемости слов");
		for (String key : differentwords) {
			System.out.println(key + ": " + Collections.frequency(randomwords, key));
		}

		//Task 2
		System.out.println(" ");
		System.out.println("Task 2");
		PhoneBook phoneBook = new PhoneBook();
			phoneBook.add(896217056, "Саша");
			phoneBook.add(845623568, "Володя");
			phoneBook.add(844584383, "Володя");
			phoneBook.add(897623461, "Дима");
			phoneBook.add(898724574, "Классный парень");
			phoneBook.get("Володя");
			phoneBook.get("Классный парень");
			phoneBook.get("Кто-то левый");
	}
}
