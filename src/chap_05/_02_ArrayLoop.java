package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] shohoku = {"sakuragi", "rukawa", "mitsui", "miyagi", "akagi"};
        for (int i = 0 ; i<shohoku.length ; i++) {
            System.out.println(shohoku[i]);
        }
        System.out.println("-------------------------------");
        for (String senshu: shohoku) {
            System.out.println(senshu);
        }
    }
}
