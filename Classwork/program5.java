import java.util.Scanner ; 

public class program5 {
    public static void main(String A[]){
        Scanner sc = new Scanner (System.in);

        int iValue1 =0  , iValue2=0, iValue3=0 ; 

        System.out.println("Enter first number : ");
        iValue1 = sc.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sc.nextInt();


        iValue3 = iValue1+ iValue2 ;
        System.out.println(iValue3);
    }
}

