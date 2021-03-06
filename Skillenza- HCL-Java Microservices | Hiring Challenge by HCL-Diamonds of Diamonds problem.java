/*Diamond of Diamonds
Given width of diamond, output the diamond pattern as shown below

For width 2, the pattern is

  /\
  \/
/\  /\
\/  \/
  /\
  \/
For width 1, the pattern is

/\
\/
For width 4, the pattern is

      /\
      \/
    /\  /\
    \/  \/
  /\  /\  /\
  \/  \/  \/
/\  /\  /\  /\
\/  \/  \/  \/
  /\  /\  /\
  \/  \/  \/
    /\  /\
    \/  \/
      /\
      \/
Input Format
The first line of input consists of an integer t denoting the number of test cases. Next t test cases follow. Each test case consists of one line. Each line of test case consists of an integer w denoting the width of the diamond.

Output Format
For each test case output the diamond pattern.

Constraints
1 <= t (number of test cases) <= 100

1 <= w (width of diamond) <= 100

Sample Input
2
5
3
Sample Output
        /\
        \/
      /\  /\
      \/  \/
    /\  /\  /\
    \/  \/  \/
  /\  /\  /\  /\
  \/  \/  \/  \/
/\  /\  /\  /\  /\
\/  \/  \/  \/  \/
  /\  /\  /\  /\
  \/  \/  \/  \/
    /\  /\  /\
    \/  \/  \/
      /\  /\
      \/  \/
        /\
        \/
    /\
    \/
  /\  /\
  \/  \/
/\  /\  /\
\/  \/  \/
  /\  /\
  \/  \/
    /\
    \/
Environment
Read from STDIN and write to STDOUT.


#solution */

import java.util.*;
import java.lang.*;

class main{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t>0)
       {
           int n=sc.nextInt();
           for(int i=1;i<=n;i++)
           {
               for(int j=1;j<=n-i;j++)
               {
                   System.out.print("  ");
               }
               for(int j=1;j<=i;j++)
               {
                   System.out.print("/\\  ");
               }
                System.out.println();
                 for(int j=1;j<=n-i;j++)
               {
                   System.out.print("  ");
               }
                 for(int j=1;j<=i;j++){
                   System.out.print("\\/  ");
               }
               System.out.println();
           }
           
            for(int i=n-1;i>=1;i--)
           {
               for(int j=1;j<=n-i;j++)
               {
                   System.out.print("  ");
               }
               for(int j=i;j>=1;j--)
               {
                   System.out.print("/\\  ");
               }
                System.out.println();
                 for(int j=1;j<=n-i;j++)
               {
                   System.out.print("  ");
               }
                 for(int j=i;j>=1;j--){
                   System.out.print("\\/  ");
               }
               System.out.println();
           }
           t=t-1;
       }
    }
}
