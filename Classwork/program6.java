import java.util.Scanner ; 

public class program6 {
    public static int Addition(int iNo1, int iNo2 ){
        int iResult = 0 ;
        iResult = iNo1 + iNo2;
        return iResult;

    }
    public static void main(String A[]){
        Scanner sc = new Scanner (System.in);


        int iValue1 = 0, iValue2 = 0; 
        int iRet = 0 ;

        System.out.println("Enter first number : ");
        iValue1 = sc.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sc.nextInt();

        iRet = Addition(iValue1, iValue2);



        System.out.println("Addition of number is : "+ iRet );

    }
}

