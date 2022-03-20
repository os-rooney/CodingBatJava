/**
 * This library contains static methods that output the solutions of codingbat
 * code challenges.
 */

public class CodingBat {

    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation
     * is true if we are on vacation.
     * We sleep in if it is not a weekday or we're on vacation.
     * 
     * @param weekday  boolean, weekday is true if it is a weekday
     * @param vacation boolean, vacation is true if we are on vacation
     * @return boolean
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    /**
     * Given an int n, return the absolute difference between n and 21, except
     * return double
     * the absolute difference if n is over 21.
     * 
     * @param n int
     * @return int
     */
    public static int diff21(int n) {
        if (n > 21) {
            return Math.abs(21 - n) * 2;
        } else {
            return Math.abs(21 - n);
        }
    }

    /**
     * Given an int n, return true if it is within 10 of 100 or 200.
     * Note: Math.abs(num) computes the absolute value of a number.
     * 
     * @param n
     * @return boolean
     */
    public static boolean nearHundred(int n) {
        return (n > 89 && n < 111) || (n > 189 && n < 211);
    }

    /**
     * Given a non-empty string and an int n, return a new string where the char
     * at index n has been removed. The value of n will be a valid index index of a
     * char in the original string
     * (i.e. n will be in the range 0..str.length()-1 inclusive).
     * 
     * @param str String
     * @param n   int
     * @return String
     */
    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());
        return front + back;
    }

    /**
     * 
     * Takes the last char and returns a new string with the last char added at the
     * front and back,
     * so "cat" yields "tcatt". The original string will be length 1 or more.
     * TODO: throw exception if the string length is less than 1.
     * 
     * @param str String
     * @return String
     */
    public String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }

    /**
     * Returns true if the string starts with "hi" and false otherwise
     * 
     * @param str String
     * @return boolean
     */
    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    /**
     * Returns ture if 1 or more the given numbers are "teen".
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * TODO: check if the given numbers are in the range 13..19 inclusive, throw
     * exception otherwise
     * 
     * @param a int
     * @param b int
     * @param c int
     * @return boolean
     */
    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    /**
     * Returns true if the given string begins with "mix"m except the 'm' can
     * anything.
     * 
     * @param str String
     * @return boolean
     */
    public static boolean mixStart(String str) {
        if (str.length() >= 3) {
            if (str.charAt(1) == 'i' && str.charAt(2) == 'x') {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns whichever value is nearest to the value 10, or return 0 in the event
     * of a tie
     * 
     * @param a int
     * @param b int
     * @return int
     */
    public static int close10(int a, int b) {
        if (Math.abs(a - 10) < Math.abs(b - 10)) {
            return a;
        } else if (Math.abs(b - 10) < Math.abs(a - 10)) {
            return b;
        } else if (a == b) {
            return 0;
        }
        return 0;
    }

    /**
     * Returns true if the given string contains between 1 and 3 'e' chars.
     * 
     * @param str String
     * @return boolean
     */
    public static boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e')
                count++;
        }
        return (count >= 1 && count <= 3);
    }

    /**
     * Given a non-empty string and int N, return the string made starting with char
     * 0,
     * and then every Nth char of the string.
     * TODO: check if the given string is empty, if so throw exception
     * 
     * @param str String
     * @param n   int
     * @return String
     */
    public static String everyNth(String str, int n) {
        String newStr = "";
        for (int i = 0; i < str.length(); i += n) {
            newStr += str.charAt(i);
        }
        return newStr;
    }

    /**
     * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
     * if each is smiling.
     * We are in trouble if they are both smiling or if neither of them is smiling.
     * Returns true if we are in trouble
     * 
     * @param aSmile boolean
     * @param bSmile boolean
     * @return boolean
     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (aSmile == false && bSmile == false);
    }

    /**
     * The "hour" parameter is the current hour time in the range 0..23.
     * We are in trouble if the parrot is talking and the hour is before 7
     * or after 20. Returns true if we are in trouble
     * 
     * @param talking boolean
     * @param hour    int
     * @return boolean
     */
    public static boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }

    /**
     * Returns true if one is negative and one is positive.
     * Except if the parameter "negative" is true, then return
     * true only if both are negative.
     * 
     * @param a        int
     * @param b        int
     * @param negative boolean
     * @return boolean
     */
    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }

    /**
     * Returns a new string where the first and last chars have been exchanged
     * 
     * @param str String
     * @return Strign
     */
    public static String frontBack(String str) {
        String first;
        String center;
        String last;
        if (str.length() > 1) {
            center = str.substring(1, str.length() - 1);
            last = str.substring(str.length() - 1);
            first = str.substring(0, 1);
        } else if (str.length() > 2) {
            last = str.substring(str.length() - 1);
            center = "";
            first = str.substring(0, 1);
        } else {
            first = "";
            center = str;
            last = "";
        }
        return last + center + first;
    }

    /**
     * Returns true if the given non-negative number is a multiple of 3 or a
     * multiple of 5.
     * 
     * @param n int
     * @return boolean
     */
    public static boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    /**
     * Return true if one is less than 0 and the other is greater than 100.
     * 
     * @param temp1 int
     * @param temp2 int
     * @return boolean
     */
    public static boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

    /**
     * Returns true if one or the other is teen, but not both.
     * 
     * @param a int
     * @param b int
     * @return boolean
     */
    public static boolean loneTeen(int a, int b) {
        // Store teen-ness in boolean local vars first. Boolean local
        // vars like this are a little rare, but here they work great.
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);
        // Translation: one or the other, but not both.
        // Alternately could use the Java xor operator, but it's obscure.
    }

    /**
     * Returns a string made of the first 2 cahrs (if present),
     * however include first char only if it is 'o' and include the second
     * only if it is 'z', so "ozymandias" yields "oz".
     * 
     * @param str String
     * @return String
     */
    public static String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }

        return result;
    }

    /**
     * Reutrns true if both numbers are in the range 30..40 inclusive,
     * or they are both in the range 40..50 inclusive
     * 
     * @param a int
     * @param b int
     * @return boolean
     */
    public static boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        }
        if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
            return true;
        }
        return false;
        // This could be written as one very large expression,
        // connecting the two main parts with ||
    }

    /**
     * Given two non-negative int values, return true if they have the last digit,
     * such as 27 and 57.
     * 
     * @param a
     * @param b
     * @return
     */
    public static boolean lastDigit(int a, int b) {
        // True if the last digits are the same
        return (a % 10 == b % 10);
    }

    /**
     * Returns sum of two giben int values.
     * 
     * @param a int
     * @param b int
     * @return int
     */
    public static int sumDouble(int a, int b) {
        if (a == b) {
            return a + a + a + a;
        } else {
            return a + b;
        }
    }

    /**
     * Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10
     * 
     * @param a int
     * @param b int
     * @return boolean
     */
    public static boolean makes10(int a, int b) {
        return (a == 10 || b == 10) || (a + b == 10);
    }

    /**
     * Given a string, return a new string where "not " has been added to the front.
     * However, if the string already begins with "not", return the string
     * unchanged.
     * 
     * @param str string
     * @return string
     */
    public static String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }

    /**
     * Given a string, we'll say that the front is the first 3 cahrs of the string.
     * If the string length
     * is less than 3, the front is whatever is there. Return a new string which is
     * 3 copies of the front.
     * 
     * @param str string
     * @return string
     */
    public static String front3(String str) {
        String copy;
        String newStr;
        if (str.length() > 3) {
            copy = str.substring(0, 3);
            newStr = copy + copy + copy;
        } else {
            newStr = str + str + str;
        }
        return newStr;
    }

    /**
     * Given a sttring, take the frist 2 chars and return the string with the 2
     * chars added at both the front
     * and back, so "kitten" yields "kikittenki". If the string length is less than
     * 2, use whatever chars are there.
     * 
     * @param str string
     * @return string
     */
    public static String front22(String str) {
        if (str.length() == 1) {
            return str + str + str;
        } else if (str.length() == 0) {
            return "";
        } else {
            String first2 = str.substring(0, 2);
            return first2 + str + first2;
        }
    }

    /**
     * Returns true if either of them is in the range 10..20 inclusive.
     * 
     * @param a int
     * @param b int
     * @return boolean
     */
    public static boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    /**
     * Given a string, if the string "del" appears starting at index 1, return a
     * string where that "del"
     * has been deleted. Otherwise, return the string inchanged.
     * 
     * @param str string
     * @return string
     */
    public static String delDel(String str) {
        if (str.contains("del") && str.indexOf("del") == 1) {
            str = str.replace("del", "");
        }
        return str;
    }

    /**
     * Given three int values a, b and c, return the largest.
     * @param a int
     * @param b int
     * @param c int
     * @return int
     */
    public static int intMax(int a, int b, int c) {
        int max = Integer.MIN_VALUE;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }
        return max;
    }

    /**
     * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
     * or return 0 if neither is in that range.
     * @param a
     * @param b
     * @return
     */
    public static int max1020(int a, int b) {
        // First make it so the bigger value is in a
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20)
            return a;
        if (b >= 10 && b <= 20)
            return b;
        return 0;
    }

    /**
     * Given a string, return a new string where the last 3 chars are now in upper case.
     * If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase()
     * returns the uppercase version of a string.
     * @param str string
     * @return string
     */
    public static String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        }
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back = str.substring(cut); // cut to the end

        return front + back.toUpperCase();
    }

    // Warmup-2

    /**
     * Return a larger string that is n copies of the original string.
     * @param str string
     * @param n int
     * @return string
     */
    public static String stringTimes(String str, int n) {
        String newStr = "";
        for (int i = 1; i <= n; i++) {
            newStr += str;
        }
        return newStr;
    }


    /**
     * Returns true, if the first instance of "x" in the string is immediately followed by another "x". 
     * @param str string
     * @return boolean
     */
    public static boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1)
            return false; // no "x" at all
        String x = str.substring(i);
        return x.startsWith("xx");
    }

    /**
     * Returns the count of the number of times that a substring length 2 apears in the string and also
     * as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
     * @param str
     * @return
     */
    public static int last2(String str) {
        // Screen out too-short string case.
        if (str.length() < 2)
            return 0;

        String end = str.substring(str.length() - 2);
        // Note: substring() with 1 value goes through the end of the string
        int count = 0;

        // Check each substring length 2 starting at i
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(end)) { // Use .equals() with strings
                count++;
            }
        }

        return count;
    }


    /**
     * Given an array of ints, return true if the sequence of numbers 1,2,3 appears in the array somewhere.
     * @param nums array of ints
     * @return boolean true if the sequence of numbers 1, 2, 3 appears
     */
    public static boolean array123(int[] nums){
        for(int i = 0; i < nums.length-2; i++){
            if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) return true;
          }
          return false;
    }

}
