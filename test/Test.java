import lang_utils.IntegerUtil;
import lang_utils.StringUtil;
import static java.lang.System.out;

public class Test {
    public static void main(String[] args) {
        String a = "hello world";
        out.println(StringUtil.reverseUtil(a));
        int x = 1234056789;
        out.println(IntegerUtil.reverseUtil(x));
    }
}
