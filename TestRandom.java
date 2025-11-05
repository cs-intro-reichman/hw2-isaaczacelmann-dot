public class TestRandom {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int countAboveHalf = 0;
		int countBelowEqualHalf = 0;
		for (int i = 0; i < N; i++) {
			double r = Math.random();
			if (r > 0.5) {
				countAboveHalf++;
			} else {
				countBelowEqualHalf++;
			}
		}

		System.out.println("> 0.5:  " + countAboveHalf + " times");
		System.out.println("<= 0.5: " + countBelowEqualHalf + " times");

		if (countBelowEqualHalf != 0) {
			System.out.println("Ratio:  " + ((double) countAboveHalf / countBelowEqualHalf));
		}

	}
}
