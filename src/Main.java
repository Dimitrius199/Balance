public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int add = 1200;
        int bonus = 0;

        if (add > 1000) {
            bonus = add / 100;
        }
            int endBalance = bonus + balance + add;
            System.out.println("Итоговый баланс " + endBalance);
            System.out.println("Бонус " + bonus);

    }


}