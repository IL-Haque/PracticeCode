public class CompassDirection {
    public static String getDirection(int angle) {
        String[] directions = {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};
        int index = (int) Math.round(((double) angle % 360) / 45) % 8;
        return directions[index];
    }
}

