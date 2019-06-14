public class BarkingDog {
    public static void main(String[] args) {

        // Coding exercise 3
        System.out.println(bark(true,1));
        System.out.println(bark(false,2));
        System.out.println(bark(true,8));
        System.out.println(bark(true,-1));


    }

    public static boolean bark(boolean barking, int hourOfDay) {

        if (barking && hourOfDay >= 0 && hourOfDay <= 24 && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else
            return false;

    }
}
