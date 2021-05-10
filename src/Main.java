public class Main {
    public static void main(String[] args) {
        int beginBalance = 100;
        int insert = 1100;
        int bonus = insert > 1000 ? insert / 100 : 0;
        int balanceWithBonus = beginBalance + insert + bonus;

        System.out.println("Начальный баланс: " + beginBalance);
        System.out.println("Внесено: " + insert);
        System.out.println("Бонусов: " + bonus);
        System.out.println("Итого: " + balanceWithBonus);
    }
}
