package simple;
/**
 * @author WawaGuess
 * @project leecode
 * @Date 1/9/22
 * 【到下一行】shift + enter
 * 【定位到某一行】command + L
 * 【定位到行首/行尾】command + 方向键
 * 【在下一行插入一个空行】command + enter
 * 【构造方法/toString/override提示】control + enter
 */



/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class Lc014 {

    public static void main(String[] args) {

        String [] strs = new String[]{"c","acc","ccc"};

        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 1){
            return strs[0];
        }
        StringBuilder re = new StringBuilder();

        // 获取字符数组中最小的字符长度
        
        int size = getMinSize(strs);
        
        if (size == 0){
            return "";
        }
        // i定义为当前要取所有字符的第几个下标
        for (int i = 0; i < size; i++) {
            boolean b = false;
            for (int j = 1; j < strs.length; j++) {
                b = strs[j].charAt(i) == strs[0].charAt(i);
                if (!b){
                    break;
                }
            }
            if (b){
                re.append(strs[0].charAt(i));
            }else {
                break;
            }

        }
        return re.toString();
    }

    private static int getMinSize(String[] strs) {
        int size = strs[0].length();

        for (int i = 0; i < strs.length; i++) {
            size = Math.min(strs[i].length(), size);
        }
        return size;
    }


    // 方法二

    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if(strs.length==0)return "";
            //公共前缀比所有字符串都短，随便选一个先
            String s=strs[0];
            for (String string : strs) {
                while(!string.startsWith(s)){
                    if(s.length()==0)return "";
                    //公共前缀不匹配就让它变短！
                    s=s.substring(0,s.length()-1);
                }
            }
            return s;
        }
    }

}
