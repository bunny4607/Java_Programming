/*
enter number of rows :
4
Enter number of columns :
4
*	
*	*	
*	*	*	
*	*	*	*	
vedantbarne@Vedants-MacBook-Air-2 Assignment_19 % java a19_1.java
enter number of rows :
5
Enter number of columns :
5
*	
*	*	
*	*	*	
*	*	*	*	
*	*	*	*	*
*/
import java.util.Scanner ; 
class print{
    public void pattern(int iRow , int iCol){
        int i = 0 ; 
        int j = 0 ; 
        for(i =1 ; i<= iRow ; i++){
            for(j =1 ; j<= i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
public class a19_1{
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in); 
        print pobj = new print(); 
        int iValue1 = 0 ; 
        int iValue2 = 0 ; 

        System.out.println("enter number of rows :");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);
        }
        iValue1 = scanner.nextInt() ; 

        System.out.println("Enter number of columns :"); 
        if(!scanner.hasNextInt()){
            System.err.print("Invaid input "); 
            System.exit(1);
        }
        iValue2 = scanner.nextInt(); 

        pobj.pattern(iValue2, iValue2);
    }
}