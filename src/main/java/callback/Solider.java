package callback;

public class Solider {
    void runContext(String strategySound) {
        System.out.println("배틀그라운드 시작");
//        strategy.runStrategy();
        execute(strategySound).runStrategy();
        System.out.println("배틀 종료");
    }

    private Strategy execute(String strategySound) {
        return new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println(strategySound);
            }
        };
    }
}
