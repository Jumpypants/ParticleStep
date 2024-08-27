public class Particle {
	int x = 0;
	int y = 0;

	public double simulate (int steps) {
		for (int i = 0; i < steps; i++) {
			step();
		}

		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	private void step () {
		int dir = (int) (Math.random() * 4);
		switch (dir) {
			case 0:
				x++;
				break;
			case 1:
				x--;
				break;
			case 2:
				y++;
				break;
			case 3:
				y--;
				break;
		}
	}
}
