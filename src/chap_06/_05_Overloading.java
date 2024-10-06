package chap_06;
public class _05_Overloading {
    public static int getPower(int number) {
        int result = number*number;
        return result;
    }
    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number*number;
    }
    // Method Overloading
    // 같은 이름의 메소드를 여러 번 선언
    // 전달값의 타입이나 전달값의 개수가 다른경우 메서드 오버로딩 가능
    public static void main(String[] args) {
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
    }
}
