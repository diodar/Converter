package app;

public class ConverterMain {
    public static void main(String[] args) {
        double mi = 1287.5;
        System.out.println("Distance from NewYork to Miami in miles: " + mi);
        double distanceInKm = convertMilesToKms(mi);
        System.out.println("Distance from NewYork to Miami in kilometres: " + distanceInKm);
    }

    private static double convertMilesToKms(double mi) {
        return mi * 1.60934;
    }
}