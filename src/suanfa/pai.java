package suanfa;

import java.util.*;
public class pai{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//java的输入流
        while(sc.hasNext()){
            String s1 = sc.nextLine();//enter键结束，且输入为enter之前的内容
            String s2 = sc.nextLine();
            int l1 = s1.length();
            int l2 = s2.length();
            int result = 0;
            int[][] dp = new int[l1 + 1][l2 + 1];
            for (int i = 1; i <= l1; i++){
                for (int j = 1; j <= l2; j++){
                    if (s1.charAt(i - 1) == s1.charAt(j - 1)){
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                        result = Math.max(dp[i][j], result);
                    }
                    else{
                        dp[i][j] = 0;
                    }  
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}