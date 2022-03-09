/**
 * Source: CodingBat, https://codingbat.com/prob/p151713
 * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix".. all count. 
 */
public class mixStart {
    public static boolean mixStart(String str){
        if(str.length() >= 3){
            if(str.charAt(1) == 'i' && str.charAt(2) == 'x'){
                return true;
            }
        }
        return false;
    }
   public static void main(String[] args) {
       System.out.println(mixStart("mix snacks"));
       System.out.println(mixStart("pix snacks"));
       System.out.println(mixStart("piz snacks"));
   } 
}
