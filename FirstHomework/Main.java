public class Main {

	public static void main(String[] args) {
		Team[] teams = {
				new Team("Володя", 55),
				new Team("Арсений", 60),
				new Team("Женя", 65),
				new Team("Саня", 75)
		};

		System.out.println(Team.getTeamName());
		for (Team team: teams) {
			System.out.println(team);
		}

		ObstacleCourse obstacles1 = new ObstacleCourse(55);
		ObstacleCourse obstacles2 = new ObstacleCourse(63);
		ObstacleCourse obstacles3 = new ObstacleCourse(65);

		for (Team team: teams) {
			System.out.println(team);
			team.run(obstacles1);
			team.run(obstacles2);
			team.run(obstacles3);
		}
	}

}
