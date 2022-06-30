public abstract class Direction {

    void setStartAndDest(String start, String end) {
        System.out.println("출발지 : " + start);
        System.out.println("도착지 : " + end);
    }

    void setPassThrough(String... points) {
        for (String point : points) {
            System.out.println("* 경유지 : " + point);
        }
    }

    abstract void getDirection();
}
