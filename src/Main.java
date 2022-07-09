public class Main {
    public static void main(String[] args) {
        int initialAccount = 100; // начальный счет
        int replenishment = 900; // пополнение
        int bonusScale = 100; // бонусная шкала
        int bonus;

        if (replenishment > 1000) {
            bonus = replenishment / bonusScale;
        } else {
            bonus = 0;
        }
        int totalAmount = (initialAccount + replenishment + bonus);

        System.out.println("Вы пополнили счёт на " + replenishment + " руб.");
        System.out.println("Ваш бонус составил " + bonus + " руб.");
        System.out.println("Ваш баланс " + totalAmount + " руб.");
    }
}

