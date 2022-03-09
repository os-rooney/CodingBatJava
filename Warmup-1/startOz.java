/**
 * Source: CodingBat, https://codingbat.com/prob/p199720
 * Given a string, return as string made of the first 2 chars (if present), 
 * however include first char only if it is 'o' 
 * and include the seconde only if it is 'z', so "ozymandias" yields "oz".
 */
public class startOz {
    public static String startOz(String str){
        if(str.equals("")){
            return "";
          } else if(str.equals("o")){
            return "o";
          } else if(str.length() >= 2){
              if(str.charAt(0)=='o' && str.charAt(1)== 'z'){
              return "oz";
            } else if(str.charAt(0) != 'o' && str.charAt(1) == 'z'){
              return "z";
            } else if(str.charAt(0) == 'o' && str.charAt(1) != 'z'){
              return "o";
            }
          }
          return "";
    }

    public static void main(String[] args) {
        System.out.println(startOz("ozymandias")); // prints oz
        System.out.println(startOz("o")); // prints o
        System.out.println(startOz("oz")); // prints oz
        System.out.println(startOz(""));  // prints nothing
        System.out.println(startOz("abc")); // prints nothing
        System.out.println(startOz("aztec")); // prints z
    }
}
