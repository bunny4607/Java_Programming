import java.util.Scanner ; 

class Display{
    public void pattern(int iNo){
        int i = 0 ; 
        for (i = 1; i<= iNo; i++){
            System.out.print("$\t");
            System.out.print("*\t");
        }
        System.out.println();
    }
}
/*
............................................................................


                    ENTRY POINT 


............................................................................
*/
public class a7_1 {
    public static void main(String A[]){
        int iValue = 0 ; 

        Display dobj = new Display() ; 
        Scanner scanner = new Scanner (System.in); 
        System.out.println("Enter number : ");
        if(!scanner.hasNextInt()){
            System.err.println("Invalid input ");
            System.exit(1);
        }
        iValue = scanner.nextInt(); 

        dobj.pattern(iValue);

        scanner.close(); 
    }
}
/*
............................................................................

                    Sample output 

vedantbarne@Vedants-MacBook-Air-2 Assignment_7 % java a7_1.java
Enter number : 
4
$	*	$	*	$	*	$	*	%    

vedantbarne@Vedants-MacBook-Air-2 Assignment_7 % java a7_1.java
Enter number : 
5
$	*	$	*	$	*	$	*	$	*	


vedantbarne@Vedants-MacBook-Air-2 Assignment_7 % java a7_1.java
Enter number : 
8
$	*	$	*	$	*	$	*	$	*	$	*	$	*	$	*	
vedantbarne@Vedants-MacBook-Air-2 Assignment_7 % 

............................................................................
*/
