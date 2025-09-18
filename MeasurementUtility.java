package classeinternas;

public class MeasurementUtility {

    // Classe estática aninhada
    public static class Conversion {

        public static double metersToCentimeters(double m) {
            return m * 100;
        }

        public static double centimetersToMeters(double cm) {
            return cm / 100;
        }

        public static double millimetersToNanometers(double mm) {
            return mm * 1_000_000;
        }

        public static double kilometersToMeters(double km) {
            return km * 1000;
        }
    }

    public static void main(String[] args) {
        System.out.println("5 metros = " + Conversion.metersToCentimeters(5) + " cm");
        System.out.println("250 cm = " + Conversion.centimetersToMeters(250) + " m");
        System.out.println("2 mm = " + Conversion.millimetersToNanometers(2) + " nm");
        System.out.println("3 km = " + Conversion.kilometersToMeters(3) + " m");
    }
}
