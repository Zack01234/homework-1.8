public class Main {
    public static void main(String[] args) {

        //Задание 1
        int year = 2001;
        printMessageLeapYear(leapYear(year), year);

        //Задание 2
    }

    public static boolean leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printMessageLeapYear(boolean leapYear, int year) {
        if (leapYear) {
            System.out.println(year + " — високосный год.");
        } else {
            System.out.println(year + " — не високосный год.");
        }
    }
}
