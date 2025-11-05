//feedback

/*
Great work boaz!
*/

// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0];
                int times = Integer.parseInt(args[1]);

                String specialLetters = "AEFHILMNORSX";
                word = word.toUpperCase();
                for (int i = 0; i < word.length(); i++) {
                        char ch = word.charAt(i);
                        System.out.println(
                                        specialLetters.indexOf(ch) == -1 ? String.format("Give me a  %s: %s!", ch, ch)
                                                        : String.format("Give me an %s: %s!", ch, ch));
                }
                System.out.println("What does that spell?");
                for (int j = 0; j < times; j++) {
                        System.out.println(String.format("%s !!!", word));
                }
        }
}
