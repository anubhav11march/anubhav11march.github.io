/*
 * Enter your code here. Read input from STDIN. Print your output to STDOUT.
 * Your class should be named CandidateCode.
 */

import java.util.*;

public class ct1 {

    public static void main(String args[] ) throws Exception {
        int totalVal = 2000;
        int[] denm = {10, 20, 50, 100, 200, 500, 1000, 2000};
        int[] dp = new int[totalVal+1];
        dp[0] = 1;
        for(int i=0; i<denm.length; i++){
            for(int j=denm[i]; j<=totalVal; j++){
                dp[j] += dp[j-denm[i]];
            }
        }
        System.out.println(dp[totalVal]);
    }


}
