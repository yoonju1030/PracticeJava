package chap_06;

public class _01_Method {
    public static void sayHello() {
        System.out.println("初めまして！");
    }
    public static void introduce(int backnumber, String name) {
        System.out.println("私は"+backnumber+"番"+name+"です！");
    }
    public static String introduce_02(int backnumber, String name) {
        return "私は"+backnumber+"番"+name+"です！";
    }
    public static void main(String[] args) {
        sayHello();
        introduce(10, "桜木");
        System.out.println(introduce_02(11, "流川"));
    }
}
