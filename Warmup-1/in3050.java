/**
 * https://codingbat.com/prob/p132134
 * Given 2 int values, return true if they are both in the range 30..40 inclusive, 
 * or they are both in the range 40..50 inclusive.
 */
public class in3050 {
   public static boolean in3050(int a, int b){
        if((a >= 30 && a <= 40) && (b >= 30 && b <= 40)){
            return true;
        } else if((a >= 40 && a <= 50) && (b >= 40 && b <= 50)){
            return true;
        }
        return false;
   } 

   public static void main(String[] args) {
       System.out.println("(30, 31): " + in3050(30, 31));
       System.out.println("(30, 41): " + in3050(30, 41));
       System.out.println("(40, 50): " + in3050(40, 50));
       System.out.println("(40, 51): " + in3050(40, 51));
       System.out.println("(30, 31): " + in3050(39, 50));
       System.out.println("(50, 39): " + in3050(50, 39));
   }
}
