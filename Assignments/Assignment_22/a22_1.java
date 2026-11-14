/*
vedantbarne@Vedants-MacBook-Air-2 Assignment_22 % java a22_1.java
Enter number :
5
A	B	C	D	E	
vedantbarne@Vedants-MacBook-Air-2 Assignment_22 % java a22_1.java
Enter number :
4
A	B	C	D	
vedantbarne@Vedants-MacBook-Air-2 Assignment_22 % java a22_1.java
Enter number :
8
A	B	C	D	E	F	G	H	
vedantbarne@Vedants-MacBook-Air-2 Assignment_22 % 
*/

import java.util.Scanner ; 

class print{
    public void pattern(int iNo ){
        int i = 0 ; 
        char ch = '\0'; 
        for(i = 1, ch = 'A' ;i<= iNo ; i++, ch++){
            System.out.print(ch+"\t");
        }
        System.out.println();
    }
}
public class a22_1 {
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
