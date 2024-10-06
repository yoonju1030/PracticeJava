package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // 1등 전액장학금 / 2,3등 반액장학금 / 그 외 대상 X
        int ranking = 2;
        switch(ranking) {
            case 1:
                System.out.println("전액장학금");
                break;
            case 2: // break가 없으면 그냥 그 다음 case로 넘어감
            case 3:
                System.out.println("반액장학금");
                break;
            default:
                System.out.println("장학금 대상 X");
        }
    }
}
