package chap_04;

public class _01_If {
    public static void main(String[] args) {
        int hour = 10;
        boolean morningCoffee = true;
        boolean ade = true;
        if (hour<14 && !morningCoffee) {
            System.out.println("ice americano + 1");
        } else if (ade) {
            System.out.println("ade + 1");
        } else {
            System.out.println("decaffein ice americano + 1");
        }
        System.out.println("주문 완료");
    }
}
