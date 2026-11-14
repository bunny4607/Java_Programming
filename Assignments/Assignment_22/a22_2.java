/*
vedantbarne@Vedants-MacBook-Air-2 Assignment_22 % java a22_2.java
Enter number :
5
5	#	4	#	3	#	2	#	1	#	
vedantbarne@Vedants-MacBook-Air-2 Assignment_22 % java a22_2.java
Enter number :
3
3	#	2	#	1	#	
vedantbarne@Vedants-MacBook-Air-2 Assignment_22 % java a22_2.java
Enter number :
4
4	#	3	#	2	#	1	#	
vedantbarne@Vedants-MacBook-Air-2 Assignment_22 % 
*/

import java.util.Scanner ; 

class print{
    public void pattern(int iNo ){
        int i = 0 ; 

        for(i = iNo   ;i>= 1 ; i--){
            System.out.print(i+"\t");
            System.out.print("#\t");
        }
        System.out.println();
    }
}
public class a22_2 {
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
