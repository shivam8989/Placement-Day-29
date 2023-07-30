import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        String s = "Shivam";
        StringBuffer ans = new StringBuffer("");
        for(int i=s.length()-1;i>=0 ;i--){
            ans.append(s.charAt(i));
        }
        System.out.println(ans);
    }

}
