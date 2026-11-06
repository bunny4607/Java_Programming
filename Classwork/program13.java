import java.util.Scanner ; 

public class program13 {
    public static int Addition(int iNo1, int iNo2){
        int iAns = iNo1 + iNo2 ; 
        return iAns;
    }
//////////////////////////////////////////////////////////////
//
//          Entery point of application 
//
//////////////////////////////////////////////////////////////
    public static void main(String A[])
    {
        Scanner scanner = new Scanner (System.in);

        int iValue1 = 0 ;
        int iValue2 = 0;
        int iResult = 0;

        System.out.println("Enter first number : ");
        if(!scanner.hasNextInt()){
            System.err.println("Invalid input ");

        }
        iValue1 = scanner.nextInt();
        System.out.println("Valid input ");

        System.out.println("Enter second number : ");
        if(!scanner.hasNextInt()){
            System.err.println("Invalid input ");
            return; 

        }
        iValue2 = scanner.nextInt();

        iResult = Addition(iValue1 , iValue2);

        System.out.println("The addition of the numbers is : "+ iResult );
    }
    
}
