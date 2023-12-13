public class Main {
    public static void main(String[] args) {

        //task1
        int clientOS = 1;
        int iOS = 0;
        int android = 1;
        if (clientOS == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылк");
        } else if (clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS != iOS && clientOS != android) {
            System.out.println("Данное устройство не поддерживается");
        }

        //task2
        long clientDeviceYear = 2014;
        if (clientOS == iOS && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == iOS && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылк");
        } else if (clientOS == android && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == android && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //task3
        int year = 1800;
        if (year < 1584) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0 && year % 400 == 0 || year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //task4
        int deliveryDistance = 95;
        if (deliveryDistance >= 100) {
            System.out.println("Доставка не осуществляется на расстояние  " + deliveryDistance + " км");
        } else if (deliveryDistance >= 0 && deliveryDistance < 20) {
            System.out.println("Потребуется 1 день для доставки на расстояние " + deliveryDistance + " км");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня для доставки на расстояние " + deliveryDistance + " км");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется 3 дня для доставки на расстояние " + deliveryDistance + " км");
        }

        //task5
        int monthNumber = 3;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }

}