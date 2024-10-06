package chap_05;

public class _03_MDArray {
    public static void main(String[] args) {
        String[][] seats = new String[][] {
                {"a1", "a2", "a3", "a4","a5"},
                {"b1", "b2", "b3", "b4","b5"},
                {"c1", "c2", "c3", "c4","c5"}
        };
        System.out.println(seats[1][1]);
        seats[2][4] = "d5";
        System.out.println(seats[2][4]);
    }
}
