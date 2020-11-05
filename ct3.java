/*
 * Enter your code here. Read input from STDIN. Print your output to STDOUT.
 * Your class should be named CandidateCode.
 */

import java.util.*;

public class ct1 {

    public static void main(String args[] ) throws Exception {
        int x = 1000;
        int a=0, b=0, c=0;
        for(a = 1; a <= x/3; a++){
            for(b=a+1; b<=x/2; b++){
                c = x-a-b;
                if((a*a + b*b) == c*c)
                    System.out.println(a*b*c);
            }
        }
    }


}
