
import java.util.Scanner;
class demo{
    int sales ;
    demo( int x ){
          sales = x;

    }
    int com( ){
        int t =  (int)(0.1*sales);
        return t;
    }
    
}

public class Q33comission{
        @SuppressWarnings("resource")
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the sales ");
            int s = sc.nextInt();
            if(s<0){
                System.out.println("Invalid Input");
            }
            demo c1 = new demo(s);
            System.out.println("The comission is of Rs."+c1.com());
    
        }
}