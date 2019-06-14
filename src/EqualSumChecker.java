public class EqualSumChecker {

    public static void main(String[] args) {
        boolean response = hasEqualSum(1,1,1);
        System.out.println(response);

        response = hasEqualSum(1,1,2);
        System.out.println(response);

        response = hasEqualSum(1,-1,0);
        System.out.println(response);



    }

    public static boolean hasEqualSum(int number1, int number2, int number3) {


        if ((number1 + number2) == number3){
            return true;
        }else
            return false;
    }
}
