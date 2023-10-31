
/**
 * Write a description of class methods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class methods
{
    public static boolean palindrome(String str){
        String nonLetters = ",.:;()[]{}!?@#$%^&*";
        String snippet = new String();
        String ans = new String();
        boolean yes = false;
        for(int i = str.length(); i > 0; i--){
            snippet = str.substring(i-1,i);
            if(nonLetters.contains(snippet)){

            } else{
                ans += snippet;
            }
        }
        if(ans.equals(str)) yes = true;
        return yes;
    }

    public static String pigLatin(String str){
        String finalString = new String();
        String temp = new String();
        int prevSpace;   
        str = " " + str + " ";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                prevSpace = str.lastIndexOf(" ", i-1);
                if(i == str.indexOf(" ")){
                    temp = "";
                } else{
                    temp = str.substring(prevSpace + 1, i);
                }
                if(temp.length() > 2){
                    finalString += temp.substring(1,temp.length()) + temp.charAt(0) + "ay ";
                }else{
                    finalString += temp + " ";
                }

            }

        }

        return finalString;
    }

    public static int saNumbers(int min, int max){
        int count = 0;
        int flag = 0;
        for(int i = min; i <= max; i++){
            int temp = i;
            boolean acsending = true;
            flag = 0;
            if(temp < 1000){
                while(temp > 9){
                    flag = 0;
                    if(temp%10 < (temp/10)%10){
                        acsending = false;

                    }
                    temp/= 10;
                    if(acsending){
                        flag = 1;

                    }

                }
            }
            if(temp > 999){
                while(temp > 9){
                    flag = 0;
                    if(temp%10 <= (temp/10)%10){
                        acsending = false;

                    }
                    temp/= 10;
                    if(acsending){
                        flag = 1;

                    }

                }

            }
            if(flag == 1){
                count++;

            }

        }
        return count;
    }

    public static void timesTable(int n){
        int d = n*n;
        int digits = 0;
        String space = new String();
        String spaces = "                           ";
        
        while(d > 0){
        d /= 10;
        digits++;
        }
        for(int i = 1; i <= n; i++){
            int val = i;
            for(int x = 1; x <= n; x++){
                int currentDigit = 0;
                int val2 = x;
                int printedVal = val*val2;
                int yes = printedVal;
                while(yes > 0){
                    yes /= 10;
                    currentDigit++;
                }
                //System.out.println(digits + currentDigit);
                int sPace = (digits - currentDigit);
                space = spaces.substring(0,sPace );
                System.out.print(space +  " " + printedVal);
            }
            System.out.println();
        }

    }

}

