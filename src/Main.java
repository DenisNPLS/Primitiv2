public class Main {
    public static void main(String[] args) {
        int score = 500;
        int depositAmount = 1100;

        if (depositAmount > 1000) {
            int newAmount = depositAmount / 100 + depositAmount;
            score = score + newAmount;
            System.out.println("Ваш баланс равен: " + score);
        } else {
            score = score + depositAmount;
            System.out.println("Ваш баланс равен: " + score);
        }
    }
}
