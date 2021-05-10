public class Main {
    public static void main(String[] args) {
        float beginBalance = 100;
        float insert = 1100;
        int bonus = (int) (insert / 100);
        float balanceWithBonus = (insert >= 1000) ? (beginBalance + insert + bonus) : (beginBalance + insert);
        System.out.println("Начальный баланс: " + beginBalance);
        System.out.println("Внесено: " + insert);
        System.out.println("Бонусов: " + bonus);
        System.out.println("Итого: " + balanceWithBonus);
    }
}
