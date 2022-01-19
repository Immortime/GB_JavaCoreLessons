public class Main {

	public static void main(String[] args) {
		String[][] arr = new String[][]{
				{"5", "4", "3", "2"},
				{"1", "6", "2", "3"},
				{"3", "2", "4", "2"},
				{"1", "5"}
		};

		try {
			try {
				int result = ArrayMethod(arr);
				System.out.println(result);
			} catch (MyArraySizeException e) {
				System.out.println("Размерность массива должна быть 4 x 4");
			}
		} catch (MyArrayDataException e) {
			System.out.println("Ошибка в ячейке: " + e.i + e.j);
		}
	}

	public static int ArrayMethod (String[][] arr) throws MyArraySizeException, MyArrayDataException {
		int num = 0;
		if (arr.length != 4) {
			throw new MyArraySizeException();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length != 4) {
				throw new MyArraySizeException();
			}
			for (int j = 0; j < arr.length; j++) {
				try {
					num = num + Integer.parseInt(arr[i][j]);
				}
				catch (NumberFormatException e) {
					throw new MyArrayDataException(i, j);
				}
			}
		}
		return num;
	}
}
