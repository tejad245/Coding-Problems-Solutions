/*Phobia (100 Marks)
Maya is a brilliant student but once she failed in mathematics and got 17 marks out of 100. Since then she has developed a phobia for number 17. 
She is so disturbed that she gets panic attacks in three conditions:
The number is 17
The number 17 is a part of a number.
The number is divisible by 17
Maya has a very happy face otherwise in any condition.
Her friend has a list of numbers with her and she wants your help in determining the numbers on which Maya will get Panic Attack or be Happy Face.
She does not want to frighten her friend. Can you help her out?                                                                                               

Input FormatThe first line consists of number of test cases, 
TThe only line of each test case consists of a single integer, 
N.Constraints1<= T <=1001<= N <=100000

Output FormatFor each test case, 
print if Maya will have Panic Attack or Happy Face.Sample TestCase 1                                                
                                                    
Input 
4
17
117
85
90
                                                                
Output 
                                                                
Panic Attack
Panic Attack
Panic Attack
Happy Face
*/

/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t>0){
      t=t-1;
      int n=sc.nextInt();
      if(n==17){
         System.out.println("Panic Attack");
      }
      else if(n%17==0){
          System.out.println("Panic Attack");
      }
      else{
          boolean c=Integer.toString(n).indexOf("17")>-1;
          if(c){
             System.out.println("Panic Attack");
          }
         else{
            System.out.println("Happy Face");
         }

      }
   }

   }
}
