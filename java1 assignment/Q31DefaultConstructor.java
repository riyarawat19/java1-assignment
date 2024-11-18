class Demo
{
    private int a;
    private int b;
    public Demo()
    {
        System.out.println("Default Constructor is called");
        a=10;
        b=20;
    }
    public void disp()
    {
        System.out.println("Value of integer a is :"+a);
        System.out.println("Value of integer b is :"+b);
    }
}
    public class Q31DefaultConstructor {
        public static void main(String []args)
        {
             Demo d=new Demo();
             d.disp();
        }
    
}