public class Main {
    public static void main(String[] args) {
        //задание 1
        System.out.println("задание 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //задание 2
        System.out.println("задание 2");
        int clientDeviceYear = 2012;
        if (clientDeviceYear >= 2015 ) {
               if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if  (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }

        //задание 3
        System.out.println("задание 3");
        int year = 2021;
        if (year % 400 ==0|| year % 4 ==0 && year %100 !=0 ) {
            System.out.println(year + " год является високосным");
        }else {
            System.out.println(year + " год неявляется високосным");
        }

        //задание 4
        System.out.println("задание 4");
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance <= 100 ) { days = days + 2;
            if (deliveryDistance <= 60) { days = days - 1;
                if (deliveryDistance <=20) { days = days - 1;
                }}System.out.println("Потребуется дней на доставку: " + days);
        } else {
            System.out.println("Приносим свои извенения, доставка в отдаленные районы не осуществляется :(");
        }

        //задание 5
        System.out.println("задание 5");
        int mounthNumber =12;
        switch (mounthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень!");
                break;
            default:
                System.out.println("Месяц введён не корректно!");

        }
        }
}




