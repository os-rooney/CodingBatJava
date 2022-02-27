/*
Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
*/
public String frontBack(String str) {
  String first;
  String center;
  String last;
  if(str.length() > 1 ){
    center = str.substring(1, str.length()-1);
    last = str.substring(str.length()-1);
    first = str.substring(0,1);
  } else if(str.length()>2){
    last = str.substring(str.length()-1);
    center ="";
    first = str.substring(0,1);
  } else {
    first = "";
    center = str;
    last = "";
  }
  
  return last + center + first;
}
