
import java.util.Scanner;
public class Main
{
 public static void main(String[] args){
     Scanner in =  new Scanner(System.in);  
     String palindromeIn = new String();
     palindromeIn = in.nextLine();
    if(methods.palindrome(palindromeIn)){
        System.out.println("True");
    }else{
         System.out.println("False");
    }
    
    String pigLatinIn = in.nextLine();
    methods.pigLatin(pigLatinIn);
 }
   
}
