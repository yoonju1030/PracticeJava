package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        String[] coffees = new String[4];
//        String coffees[] = new String[4];
        coffees[0] = "americano";
        coffees[1] = "caffemocha";
        coffees[2] = "latte";
        coffees[3] = "capuchino";

//        String[] shohoku = new String[] {"sakuragi", "rukawa", "mitsui", "miyagi", "akagi"};
        String[] shohoku = {"sakuragi", "rukawa", "mitsui", "miyagi", "akagi"};

        System.out.println(shohoku[0]);
        shohoku[1] = "서태웅";
        System.out.println(shohoku[1]);
    }
}
