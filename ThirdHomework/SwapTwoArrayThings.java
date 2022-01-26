public class SwapTwoArrayThings {

	public static <T> void swapElements(T[] array, int something1, int something2) {
		T temp = array[something1];
		array[something1] = array[something2];
		array[something2] = temp;
	}

}
