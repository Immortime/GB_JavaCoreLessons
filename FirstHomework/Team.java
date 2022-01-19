public class Team {

	private static String teamName;
	private String memberName;
	private int jumpHeight;

	public Team(String memberName, int jumpHeight) {
		teamName = "Крутые парни";
		this.memberName = memberName;
		this.jumpHeight = jumpHeight;
	}

	@Override
	public String toString() {
		return this.memberName + " " + this.jumpHeight;
	}

	public static String getTeamName() {
		return teamName;
	}

	public void run(ObstacleCourse obstacles) {
		obstacles.jumpingThrough(jumpHeight);
	}
}

