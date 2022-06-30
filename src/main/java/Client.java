public class Client {

    public static void main(String[] args) {
        FreeDirection direction = new FreeDirection();
        direction.setStartAndDest("서울", "부산");
        direction.setPassThrough("천안", "대전", "대구");
        direction.getDirection();
    }
}
