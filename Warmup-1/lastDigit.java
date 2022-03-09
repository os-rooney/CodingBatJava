/**
 * https://codingbat.com/prob/p125339
 * Given two non-negative int values, return true if they have the same last digit,
 * such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
 */
public class lastDigit {
    public static boolean lastDigit(int a, int b){
        return ( a % 10 == b % 10 );
    }
    public static void main(String[] args) {
        System.out.println("(7, 17) -> " + lastDigit(7, 17));
        System.out.println("(6, 17) -> " + lastDigit(6, 17));
        System.out.println("(3, 113) -> " + lastDigit(3, 113));
    }   
}
