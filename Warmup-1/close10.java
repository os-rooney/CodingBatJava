/**
 * Source: https://codingbat.com/prob/p172021
 * Warmup-1 > close10
 * Given 2 int values, return whichever value is nearest to value 10, or return 0 in the
 * event of a tie. Note that Math.abs(n) returns the absolute value of a number.
 */
public class close10 {
    public static int close10(int a, int b){
        if(Math.abs(a - 10) < Math.abs(b - 10)){
            return a;
        } else if(Math.abs(b - 10) < Math.abs(a - 10)){
            return b;
        } else if(a == b){
         return 0; // in case of a tie 
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(close10(7, 10));
    }
}
