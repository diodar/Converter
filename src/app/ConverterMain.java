package app;

public class ConverterMain {
    public static void main(String[] args) {
        double mi = 1287.5;
        System.out.println("Distance from NewYork to Miami in miles: " + mi);
        double distanceInKm = convertMilesToKms(mi);
        System.out.println("Distance from NewYork to Miami in kilometres: " + distanceInKm);

        double km = 473;
        System.out.println("Distance from Kyiv to Odesa in kilometres: " + km);
        double distanceInMi = convertKmsToMiles(km);
        System.out.println("Distance from Kyiv to Odesa in miles: " + distanceInMi);
    }

    private static double convertMilesToKms(double mi) {
        return mi * 1.60934;
    }

    private static double convertKmsToMiles(double km) {
        return km / 1.60934;
    }
}