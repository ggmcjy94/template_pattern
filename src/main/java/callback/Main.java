package callback;

public class Main {

    public static void main(String[] args) {
        Solider solider = new Solider();
        solider.runContext("템플릿 콜백버전: 탕! 타탕!! 탕탕탕!");
        System.out.println();
        solider.runContext("템플릿 콜백버전: 수류탄 투척~! 쾅!!!");
//        solider.runContext(new Strategy() {
//            @Override
//            public void runStrategy() {
//                System.out.println("템플릿 콜백버전: 탕! 타탕!! 탕탕탕!");
//            }
//        });
//        System.out.println();
//
//
//        solider.runContext(new Strategy() {
//            @Override
//            public void runStrategy() {
//                System.out.println("템플릿 콜백버전: 수류탄 투척~! 쾅!!!");
//            }
//        });
    }
}
