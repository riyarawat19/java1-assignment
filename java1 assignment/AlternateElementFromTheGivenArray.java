import java.util.Scanner;
public class AlternateElementFromTheGivenArray {
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number elements to be entered on array");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("Alternate Elements of provided array:");
        for(int i=0;i<n;i=i+2)
        {
            System.out.print(arr[i]+" ");
        }

    }
    
}