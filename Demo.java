class Encapsulate
{
    private String geekName;
    public String getName() 
    {
      return geekName;
    }
    public void setName(String newName)
    {
      geekName = newName;
    }
    
}
abstract class Abstraction
{
    abstract void run();
    void PrintingMethod()
    {
        System.out.println("Printing....This is Abstract class");
    }
}

class MyClass extends Abstraction
{
    void run()
    {
        super.PrintingMethod();
        System.out.println("Running the MyClass method");
    }
}

interface MyInterface
{
    int a = 10;
    public void method1();
}
class A implements MyInterface
{
    public void method1()
    {
        System.out.println(MyInterface.a);
        System.out.println("This is the method from Interface");
    }
    private void PrivateMethod()
    {
        System.out.println("This is a private method");
    }
    protected void ProtectedMethod()
    {
        PrivateMethod();
        System.out.println("This is a protected method");
    }
    public void PublicMethod()
    {
        System.out.println("This is a public method");
    }
    void OverridingMethod()
    {
        System.out.println("Overriding method in the super class");
    }
}

class B extends A
{
    int addition(int a,int b)
    {
        return a+b;
    }
    double addition(double a, int b, double c)
    {
        return a+b+c;
    }
    
    void OverridingMethod()
    {
        System.out.println("Overriding method in the sub class");
    }
    void CallingMethods()
    {
        super.ProtectedMethod();
        super.PublicMethod();
        // super.PrivateMethod() //Gives error 
    }
}

public class Demo {
    public static void main(String args[])
    {
        A objA = new A();
        B objB = new B();

       //Overloading
       System.out.println("Polymorphism : Overloading ");
       System.out.println(objB.addition(10,20));
       System.out.println(objB.addition(7.5, 100, 153.0256));
       System.out.println();

       //Overriding
       System.out.println("Polymorphism : Overriding ");
       objB.OverridingMethod();
       objA.OverridingMethod();
        
        System.out.println();
       //Access specifiers
       System.out.println("Inheritance , Access specifiers :  ");
       objB.CallingMethods();
       
       System.out.println();
       
       //Interface 
       System.out.println("Abstraction using interface : ");
       objA.method1();
       System.out.println();
       
       //Abstract class
       System.out.println("Abstraction using abstract class : ");
       MyClass mc = new MyClass();
       mc.run();
       System.out.println();
       
       System.out.println("Encapsulation : getter and setter methods ");
       Encapsulate ep = new Encapsulate();
       ep.setName("Ritesh");
       System.out.println("Name of the student : "+ep.getName());
       

    }
}
