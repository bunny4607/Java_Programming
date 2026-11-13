import java.util.Scanner; 
/*
Enter number of rows :
4
Enter number of columns :
4
*	*	*	*	
*	*	*	#	
*	*	#	#	
*	#	#	#	
vedantbarne@Vedants-MacBook-Air-2 Assignment_18 % java a18_2.java
Enter number of rows :
5
Enter number of columns :
5
*	*	*	*	*	
*	*	*	*	#	
*	*	*	#	#	
*	*	#	#	#	
*	#	#	#	#
*/
class print{
    public void pattern(int iRow , int iCol ){
        int i = 0 ; 
        int j = 0 ; 
        for( i = 1 ; i <= iRow ; i++){
            for(j = iCol  ; j>= i  ; j--){
                System.out.print("*\t");
            }
            for(j = 1; j<= i -1 ; j++){
                System.out.print("#\t");
            }
            System.out.println();
        }

    }
}

public class a18_2 {
    public static void main(String A[]){
        Scanner scanner = new Scanner(System.in);
        print pobj = new print(); 

        int iValue1 = 0 ; 
        int iValue2 = 0 ; 

        System.out.println("Enter number of rows :"); 
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);
        }
        iValue1 = scanner.nextInt(); 

        System.out.println("Enter number of columns :"); 
        if(!scanner.hasNextInt()){
            System.err.print("Invaid input "); 
            System.exit(1);
        }
        iValue2 = scanner.nextInt(); 

        pobj.pattern(iValue1, iValue2);


    }
}
