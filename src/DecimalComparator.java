public class DecimalComparator {

    public static void main(String[] args) {

        boolean response = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(response);

        response = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(response);

        response = areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(response);

    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

        number1 = number1 * 1000;
        number2 = number2 * 1000;

        int extnumber1 = (int) number1;
        int extnumber2 = (int) number2;

        if (extnumber1 == extnumber2){
            return true;
        }else
            return false;
    }

}
