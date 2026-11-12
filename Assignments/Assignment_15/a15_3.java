/*
write a program to accept two numbers from user and check weather those two numbers are same or not 
*/
import java.util.Scanner ; 

class check{
    public boolean checkEqual (int iNo1 , int iNo2 ){
        return (iNo1 == iNo2 ); 
    }
}
public class a15_3 {
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in); 
        check cobj = new check(); 

        int iValue1 = 0 ; 
        int iValue2 = 0 ; 
        boolean bRet = false ; 

        System.out.println("Enter first number :");
        if(!scanner.hasNextInt()){
            System.err.println("Invalid input ");
            System.exit(1);

        }iValue1 = scanner.nextInt() ; 

        System.out.println("Enter second number :");
        if(!scanner.hasNextInt()){
            System.err.println("Invalid input "); 
            System.exit(1);
        }iValue2 = scanner.nextInt() ; 

        bRet = cobj.checkEqual(iValue1, iValue2);
        if (bRet == true ){
            System.out.println("Equal numbers ");

        }
        else {
            System.out.println("Numbers are not equal ");
        }
    }
}
/*
Enter first number :
78
Enter second number :
98
Numbers are not equal 



Enter first number :
1
Enter second number :
1
Equal numbers 
*/