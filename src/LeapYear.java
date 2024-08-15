public class LeapYear {

    public static void main(String[] args) {

        boolean firstLeapYear = isLeapYear(1985);
        System.out.println(firstLeapYear);
        boolean secondLeapYear = isLeapYear(2056);
        System.out.println(secondLeapYear);
        boolean thirdLeapYear = isLeapYear(-1543);
        System.out.println(thirdLeapYear);
    }
    public static boolean isLeapYear(int year){
        // Leap year A leap year is a year that is divisible by 4 but not 100.
        // If it's divisible by 100, it has to be divisible by 400.

        if (year < 1 || year > 9999){
            return false;
        } else if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0) {
            return true;
        }
        return false;
    }
}
