public class Main {
    public static void main(String[] args) {

        //Задание 1
        int year = 2001;
        printMessageLeapYear(leapYear(year), year);

        //Задание 2
        int releaseYear = 2010;
        int clientOS = 0;
        printMessageVersionOSRecommendation(clientOS, releaseYear);

        //Задание 3
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDistance(deliveryDistance);
        printMessageDeliveryDays(deliveryDays);

    }


    //для задания 1
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

    //для задания 2
    public static void printMessageVersionOSRecommendation(int clientOS, int releaseYear) {
        if (clientOS != 0 && clientOS != 1 || releaseYear < 2000) {
            System.out.println("Некорректные данные");
            return;
        }
        String message = "Установите обычную версию приложения для Android по ссылке";
        if (clientOS == 0) {
            message = message.replace("Android", "iOS");
        }
        if (releaseYear < 2015) {
            message = message.replace("обычную", "лайт -");
        }
        System.out.println(message);
    }

    //для задания 3
    public static int calculateDeliveryDistance(int deliveryDistance) {
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            return 3;
        } else {
            throw new IllegalArgumentException("Доставка на такое расстояние не осуществляестся.");
        }
    }
    public static void printMessageDeliveryDays (int deliveryDays){
        System.out.println("Потребуется примерно " + deliveryDays + " суток для доставки карты.");
    }
}
