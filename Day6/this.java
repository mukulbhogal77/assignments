public class abc

{

    abc()

    {

        System.out.println("Default constructor Called ");

    }

    abc(int a)

    {

        this();

    }

    public static void main(String args[])

    {

        abc obj = new abc(10);
    
    }

}