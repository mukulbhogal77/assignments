class one

{

    void display()
    {

        System.out.println("Base Class Display");

    }


}

class two extends one

{

    void display()
    {

        System.out.println("Derived Class Display");

        super.display();

    }

}

public class a

{

    public static void main(String args[])

    {

        two obj = new two();

        obj.display();

    }

}