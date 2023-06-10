package app;

public class ConverterMain {
    public static void main(String[] args) {
        double km = 473;
        System.out.println("Distance from Kyiv to Odesa in kilometres: " + km);
        double distanceInMi = convertKmsToMiles(km);
        System.out.println("Distance from Kyiv to Odesa in miles: " + distanceInMi);
    }
    private static double convertKmsToMiles(double km) {
        return km / 1.60934;
    }
}