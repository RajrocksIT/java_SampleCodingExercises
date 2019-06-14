public class SpeedConverter {


    public static void main(String[] args) {
        long miles = toMilesPerHour(1.5);
        System.out.println("Miles = " + miles);

        printConversion(1.5);

        System.out.println("***********************");

        miles = toMilesPerHour(10.25);
        System.out.println("Miles = " + miles);

        printConversion(10.25);

        System.out.println("***********************");

        miles = toMilesPerHour(-5.6);
        System.out.println("Miles = " + miles);

        printConversion(-5.6);

        System.out.println("***********************");

        miles = toMilesPerHour(25.42);
        System.out.println("Miles = " + miles);

        printConversion(25.42);

        System.out.println("***********************");

        miles = toMilesPerHour(75.114);
        System.out.println("Miles = " + miles);

        printConversion(75.114);

        System.out.println("***********************");






    }


    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        long milesPerHour = Math.round(kilometersPerHour/1.609);
        return milesPerHour;

        // short cut
        // return Math.round(kilometersPerHour/1.609);
    }


    public static void printConversion(double kilometersPerHour){

        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h= "
            + milesPerHour + " mi/h");
        }

    }

}
