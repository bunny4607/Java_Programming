/*
Enter number :
4
#	1	*	#	2	*	#	3	*	#	4	*	
vedantbarne@Vedants-MacBook-Air-2 Assignment_22 % java a22_4.java
Enter number :
5
#	1	*	#	2	*	#	3	*	#	4	*	#	5	*	
vedantbarne@Vedants-MacBook-Air-2 Assignment_22 % java a22_4.java
Enter number :
2
#	1	*	#	2	*
*/

import java.util.Scanner ; 

class print{
    public void pattern(int iNo ){
        int i = 0 ; 

        for(i = 1   ;i<= iNo ; i++){
            System.out.print("#\t");
            System.out.print(i+"\t");
            System.out.print("*\t");
        }
        System.out.println();
    }
}
public class a22_4 {
    public static void main(String A[]){
        Scanner scanner = new Scanner(System.in); 
        print pobj = new print(); 

        int iValue = 0 ; 
        System.out.println("Enter number :");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);
        }
        iValue = scanner.nextInt(); 

        pobj.pattern(iValue);

    }
}
