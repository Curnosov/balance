public class Main {
    public static void main(String[] args) {
        int currentBalance = 350; // Начальная сумма на счету клиента
        int refillAmount = 1850; // Сумма пополнения
        int bonusThreshold = 1000; //Минимальная сумма пополнения для начисления бонуса
        int bonusRate = 100; // 1 рубль за каждые полные 100 рублей
        int bonus = 0; // Количество бонусных рублей
        int finalBalance; // Итоговая сумма на счету

        if (refillAmount > bonusThreshold) {
            bonus = refillAmount / bonusRate;
            System.out.println("Количество бонусных рублей: " + bonus);}

        else {System.out.println("Бонусы не начислены");
        }
        finalBalance = currentBalance + refillAmount + bonus;

        System.out.println("Итоговый счёт: " + finalBalance + " рублей");
    }
}