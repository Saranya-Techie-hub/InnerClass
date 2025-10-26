
package InnerClass;

abstract class My
{
    abstract public void show();
}
class Outer 
{
    public void display()
    {
        My m = new My()
        {
            public void show()
            {
                System.out.println("Hello World");
            }
        }; // Anonymous class
        m.show();
    }
}


public class Anonymous {

    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
        
    }
    
}
