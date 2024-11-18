class Demo{
    private int a;
    private int b;
    public Demo(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("Parmeterized Constructor is called.");
    }
    public void disp()
    {
        System.out.println("Value of first integer is:"+a);
        System.out.println("Value of second integer is:"+b);
    }
}
public class Q32ParameterizedConstructor {
    public static void main(String []args)
    {
    Demo d=new Demo(4,5);
    d.disp();
}
    
}