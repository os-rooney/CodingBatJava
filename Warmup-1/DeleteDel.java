/**
 * Source: CodingBat, https://codingbat.com/prob/p100905
 * Warmup-1 delDel
 *Given a string, if the string "del" appears starting at index 1, 
 * return a string where that "del" has been deleted. Otherwise, return the string unchanged.
 */

class DeleteDel{
	public static String delDel(String str){
		if(str.contains("del") && str.indexOf("del")==1){
			str=str.replace("del", "");
		}
		return str;
	}

	public static void main(String[] args){
		System.out.println(delDel("adelbc"));
		System.out.println(delDel("a"));
		System.out.println(delDel("Hello del World"));
	}
}
