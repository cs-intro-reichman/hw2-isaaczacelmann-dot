// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
                String mode = args[1];

                for (int i = 1; i <= N; i++) {
                        int steps = 1;
                        int seed = i;
                        while (seed != 1 || steps == 1) {
                                if (mode.equals("v")) {
                                        System.out.print(seed + " ");
                                }
                                if (seed % 2 == 0) {
                                        seed /= 2;
                                } else {
                                        seed = seed * 3 + 1;
                                }
                                steps++;
                        }
                        if (mode.equals("v")) {
                                System.out.println(seed + " (" + steps + ")");
                        }
                }
                System.out.println(String.format("Every one of the first %s hailstone sequences reached 1.", N));
	}
}
