import java.lang.*; 
import java.io.*; 
import java.util.*; 
  
public class ReverseString 
{ 
    public static void main(String[] args) 
    { 
        String input = "ABCDE"; 
        char[] arr = input.toCharArray(); 
  
        for (int i = arr.length-1; i>=0; i--) 
            System.out.print(arr[i]); 
    } 
} 
  