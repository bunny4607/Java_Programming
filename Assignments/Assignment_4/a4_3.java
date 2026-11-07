import java.util.Scanner; 
class Num{
    public boolean checkGreater(int iNo1 , int iNo2 ){
        return (iNo1 > iNo2); 
    }
}
public class a4_3{
    public static void main(){
        int iValue1 = 0 ; 
        int iValue2 = 0 ; 
        boolean iRet = false  ; 

        Num nobj = new Num() ; 
        Scanner scanner = new Scanner (System.in) ; 

        System.out.println("Enter first number : ");
        if(!scanner.hasNextInt()){
            System.err.println("Invalid input"); 
            System.exit(1);
        }
        iValue1 = scanner.nextInt(); 

        System.out.println("Enter second number : ");
        if(!scanner.hasNextInt()){
            System.err.println("Invalid input"); 
            System.exit(1);
        }
        iValue2 = scanner.nextInt(); 

        iRet = nobj.checkGreater(iValue1, iValue2); 

        if(iRet == true ) System.out.println(iValue1+" is greater than "+iValue2);
        else System.out.println(iValue2+ " is greater than "+iValue1);


    }
}

/*
    SAMPLE OUTPUT 
Enter second number : 
5
5 is greater than 4
vedantbarne@Vedants-MacBook-Air-2 Assignment_4 % java a4_3.java
Enter first number : 
5
Enter second number : 
4
5 is greater than 4

*/