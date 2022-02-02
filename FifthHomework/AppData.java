import java.io.*;


public class AppData {
	private String[] headers;
	private int[][] data;

	public void read (File file) {
		int size = 0;
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				size++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		headers = new String[3];
		data = new int[size - 1][];

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			headers = bufferedReader.readLine().split(";");
			int n = 0;
			String line;

			while ((line = bufferedReader.readLine()) != null) {
				String[] dataIntString = line.split(";");
				int d1 = Integer.parseInt(dataIntString[0]);
				int d2 = Integer.parseInt(dataIntString[1]);
				int d3 = Integer.parseInt(dataIntString[2]);
				data[n] = new int[]{d1, d2, d3};
				n++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void write (File file) {
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
			bufferedWriter.write(headers[0] + ";" + headers[1] + ";" + headers[2] +"\n");

			for (int[] arr: data) {
				bufferedWriter.write(arr[0] + ";" + arr[1] + ";" + arr[2] +"\n");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String[] getHeaders () {
		return headers;
	}

	public void setHeaders (String[]headers){
		this.headers = headers;
	}

	public int[][] getData () {
		return data;
	}

	public void setData (int[][] data){
		this.data = data;
	}
}
