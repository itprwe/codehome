package my.javabase.conclusion;

public class SwitchLamdaTest {
    enum PlayerTypes {
        TENNIS, FOOTBALL, BASKETBALL, PINGPONG, UNKNOWN
    }

    public static void main(String[] args) {
        String a = lmethod(PlayerTypes.TENNIS);
        System.out.println(a);
    }

    public static String lmethod(PlayerTypes playerType) {
        String player = null;
        switch (playerType) {
            case TENNIS:
                player = "是个网球运动员";
                break;
            case FOOTBALL:
                player = "是个足球运动员";
                break;
            case PINGPONG:
                player = "是个乒乓球运动员";
                break;
            case BASKETBALL:
                player = "是个篮球运动员";
                break;
            case UNKNOWN:
                throw new IllegalArgumentException("未知");
        }
        return player;
    }

    public String lmethod2(PlayerTypes playerType) {
//        return switch (playerType) {
//            case TENNIS -> "网球运动员费德勒"
//                ;
//            case FOOTBALL -> "足球运动员C罗"
//                ;
//            case BASKETBALL -> "篮球运动员詹姆斯"
//                ;
//            case UNKNOWN ->
//                throw new IllegalArgumentException("未知");
//        }
        return null;
    }

}
