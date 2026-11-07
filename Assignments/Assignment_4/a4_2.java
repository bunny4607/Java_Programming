import java.util.Scanner ; 

class Number {
    public boolean evenOdd(int iNo){
        return (iNo % 2 == 0 ); 
    }
}
public class a4_2{
    public static void main(String A[]){
        int iValue= 0 ; 
        boolean iRet = false ;
        Number nobj = new Number(); 
        Scanner scanner = new Scanner (System.in) ; 

        System.out.println("Enter number ");
        if(!scanner.hasNextInt()) {
            System.err.print("Invalid input") ;
            System.exit(1);
        }
        iValue = scanner.nextInt(); 

        iRet = nobj.evenOdd(iValue) ;

        if (iRet == true )System.out.println("Even");
        else System.out.println("Odd"); 

        scanner.close();


    }
}

/*

SAMPLE OUTPUT 


Enter number 
4
Even
vedantbarne@Vedants-MacBook-Air-2 Assignment_4 % java a4_2.java
Enter number 
7
Odd
vedantbarne@Vedants-MacBook-Air-2 Assignment_4 % java a4_2.java
Enter number 
80
Even

*/