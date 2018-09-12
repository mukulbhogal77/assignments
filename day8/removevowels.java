import java.util.Scanner;
public class prog
{
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
       String str = s.nextLine();
       String temp = "";
       int i;
       for(i = 0 ; i < str.length() ; i++)
       { 
           if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u')
           {
               temp += str.charAt(i);
           }
       }
       System.out.println(temp);
    }
    
}