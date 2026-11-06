import java.util.Scanner ; 

public class program17 {
    public static void main(String a[]) {
        int iValue = 0;
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Enter number : ");
        iValue = scanner.nextInt();

        if (iValue%2 == 0 ){
            System.out.println("Even");
        }else System.out.println("Odd");
    }
}
