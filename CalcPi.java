// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);

		double PI = Math.PI;
		double approximatedPi = 0;

		int i = 0;
		double denominator = 1;
		while (i < N) {
			if (i % 2 == 0) {
				approximatedPi += (1 / denominator);
			} else {
				approximatedPi -= (1 / denominator);
			}
			denominator += 2;
			i++;
		}

		approximatedPi = approximatedPi * 4;

		System.out.println("pi according to Java: " + PI);
		System.out.println("pi, approximated:	  " + approximatedPi);
	}
}
