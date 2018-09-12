import java.io.File; 
import java.util.*;
import java.io.*;
public class FileTest 
{
    public static void main(String[] args) 
    {
            File f = new File("C:/Users/Test/video.mp4");
            System.out.println("Length="+f.length()+" bytes");
            System.out.println("Name="+f.getName());
            System .out. println("Parent="+f.getParent() );
            System .out. println("Path=" +f.getPath() );
    }
}
