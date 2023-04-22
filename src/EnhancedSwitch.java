public class EnhancedSwitch {

    public static void main(String[] args) {

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

    }

    public static void printDayOfWeek(int day) {

        String dayOfWeek;
        switch (day) {
            case 0 -> dayOfWeek = "Sunday";
            case 1 -> dayOfWeek = "Monday";
            case 2 -> dayOfWeek = "Tuesday";
            case 3 -> dayOfWeek = "Wednesday";
            case 4 -> dayOfWeek = "Thursday";
            case 5 -> dayOfWeek = "Friday";
            case 6 -> dayOfWeek = "Saturday";
            default -> dayOfWeek = day + " is an invalid value";
        }
        System.out.println(dayOfWeek);
    }
}
