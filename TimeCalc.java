public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);

        int hours = Integer.parseInt("" + time.charAt(0) + (time.charAt(1)));
		int minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4));

        int totalMinutes = hours * 60 + minutes + minutesToAdd;
        int newHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;

        System.out.println(String.format("%02d:%02d", newHours, newMinutes));
    }
}
