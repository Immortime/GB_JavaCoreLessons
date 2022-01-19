public class ObstacleCourse {

	private int obstacleHeight;

	public ObstacleCourse(int obstacleHeight) {
		this.obstacleHeight = obstacleHeight;
	}

	public int getObstacleHeight() {
		return obstacleHeight;
	}

	void jumpingThrough(int height) {
		if (getObstacleHeight() > height) {
			System.out.println("Участник команды не справился");
		}
		else {
			System.out.println("Участник команды успешно прошел все припятствия");
		}
	}
}
