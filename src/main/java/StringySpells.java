

public class StringySpells {

    public static String findMids(String text) {
        return String.valueOf(text.charAt(text.length()/2));
    }
    public static String alphaOmega(String text1, String text2) {


    return String.valueOf(text1.charAt(0))+text2.charAt(text2.length()-1);
}

public static String subtractive(String text, int num){
        return text.substring(0, num)+text.substring(num+1);
}

public static String flipper(String text1, String text2){


      return text2.charAt(0) + text1.substring(1);

    }
public static double aveLen(String text1, String text2) {
        return (double) (text1.length() + text2.length()) /2;
}




    // middleFinder

    // alphaOmega

    // subtractive

    // flipper

    // aveLen


}//end of class