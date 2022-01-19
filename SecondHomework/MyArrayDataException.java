class MyArrayDataException extends Exception {
	int i;
	int j;

	MyArrayDataException(int i, int j) {
		this.i = i;
		this.j = j;
	}
}
