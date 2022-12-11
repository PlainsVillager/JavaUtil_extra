package lang_utils;
//write codes herexhijie
public class StringUtil {
    public static String reverseUtil(String reverseTarget){
        StringBuilder sb = new StringBuilder().append(reverseTarget).reverse();
        return sb.toString();
    }
    public static String doubleReverse(String doubleReverseTarget){
        StringBuilder sb = new StringBuilder().append(doubleReverseTarget).reverse();
        String second = sb.toString();
        for (int i = 0; i < second.length(); i++) {
            String i1 = String.valueOf(second.charAt(i) + second.charAt(i + 1));
        }
        return sb.toString();
    }
}
