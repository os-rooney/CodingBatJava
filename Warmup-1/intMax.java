/**
 * Source: https://codingbat.com/prob/p101887
 * Warmup-1 > intMax
 * Given three int values, a b c, return the largest.
 */
public class intMax {
    public static int intMax(int a, int b, int c){
        int max = Integer.MIN_VALUE;
        if(a > b && a > c){
            max = a;
        } else if(b > a && b > c){
            max = b;
        } else {
            max = c;
        }
        return max;
    }
}
