package lang_utils;

/**
 * Integer的扩展工具类
 * @author PlainsVillager
 * @version pre_alpha
 * @since pre_alpha
 */
public class IntegerUtil {
    /**
     * 用于反转一个整数。
     * 调用示例：<br>int x = 123456789;<br>
     * IntegerUtil.reverseUtil(x);<br>
     * 然后对这个值进行处理<br>
     * 底层：StringBuilder
     * @param reverseTarget 形参
     * @return Integer.parseInt(String.valueOf(sb))  返回反转后的结果
     */
    public static int reverseUtil(int reverseTarget){
        StringBuilder sb = new StringBuilder().append(reverseTarget).reverse();
        return Integer.parseInt(String.valueOf(sb));
    }
}
