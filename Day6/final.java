final class temp

{

}

class abc extends temp

{

    void fun()

    {

        System.out.println("Final keyword");
 
    }

}

public class a

{

    public static void main(String args[])

    {

        abc obj = new abc();

        obj.fun();

    }

}