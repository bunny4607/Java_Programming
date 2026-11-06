import java.util.Scanner ; 

public class program4 {
    public static void main(String A[]){
        Scanner sc = new Scanner (System.in);

        int iValue1   , iValue2, iValue3;

        System.out.println("Enter first number : ");
        iValue1 = sc.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sc.nextInt();


        iValue3 = iValue1+ iValue2 ;
        System.out.println(iValue3);
    }
}
