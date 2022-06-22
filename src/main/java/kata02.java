

public class kata02 {
    public static Boolean solution(String str , String ending) {

//        Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
//        Examples:
//        solution('abc', 'bc') // returns true
//        solution('abc', 'd') // returns false

        //   System.out.println("" + str +"/"+ ending);
        int len0 = str.length();
        int len1 = ending.length();
     //   System.out.println("str length= " +"/"+ len0);
    //    System.out.println("ending length= " +"/"+ len1);
        boolean isEending;

        int pos0 = len0- len1;
        if (pos0 <0){return false;};
        String s2 = str.substring(pos0);
        isEending = s2.equals(ending);
           // System.out.println("s2 = "+s2);
            if (isEending) {
               // System.out.println("s2 is equals ending!");
            }
        return isEending;
    }


    public static void staticTests() {
        check("samurai", "ai", true);
        check("sumo", "omo", false);
        check("ninja", "ja", true);
        check("sensei", "i", true);
        check("samurai", "ra", false);
        check("abc", "abcd", false);
        check("abc", "abc", true);
        check("abcabc", "bc", true);
        check("ails", "fails", false);
        check("fails", "ails", true);
        check("this", "fails", false);
        check("this", "", true);
        check(":-)", ":-(", false);
        check("!@#$%^&*() :-)", ":-)", true);
        check("abc\n", "abc", false);
    }

    public static void check(String str, String ending, boolean expected) {
        boolean result = solution(str, ending);
        //assertEquals("Expected solution(\"" + str + "\", \"" + ending + "\") to return " + expected, expected, result);
        System.out.println(str+"/"+ending+"/"+result+"/"+expected);
    }

    public static void main(String args[]) {

        //   solution("adfffddddddqqqqqeeeq233qqq", "233qqq");

        staticTests();
    }

}//class
