//
//write a program which accpets three numbers form the user and prints its multiplicaiton 

import java.util.Scanner ; 

class Multi{
    public int Mul3(int ino1, int ino2 , int ino3){
        int imul = 1 ; 
        if(ino1 == 0 ) ino1 = 1 ; 
        else if(ino2 == 0 ) ino2 = 1 ;
        else if(ino3 == 0 ) ino3 = 1 ;
        imul = ino1*ino2*ino3; 
        return imul ; 
    }
}
public class a15_4{
    public static void main(String A[]){
        Scanner scanner = new Scanner(System.in); 
        Multi mobj  = new Multi(); 

        int iValue1 = 0 ; 
        int iValue2 = 0 ; 
        int iValue3 = 0 ; 

        int iRet = 0 ; 

        System.out.println("Enter first number : ");
        if(!scanner.hasNextInt()){
            System.err.println("Invalid inppt "); 
            System.exit(1);

        }iValue1 = scanner.nextInt(); 


        System.out.println("Enter second number : ");
        if(!scanner.hasNextInt()){
            System.err.println("Invalid input "); 
            System.exit(1);
        }iValue2 = scanner.nextInt(); 


        System.out.println("Enter third number :");
        if(!scanner.hasNextInt()){
            System.err.println("Invalid input"); 
            System.exit(1);
        }iValue3 = scanner.nextInt(); 

        iRet = mobj.Mul3(iValue1, iValue2, iValue3);
        System.out.println("Multiplication of entered numbers is : "+iRet );


    }
}
/*
Enter first number : 
1
Enter second number : 
2
Enter third number :
3
Multiplication of entered numbers is : 6
vedantbarne@Vedants-MacBook-Air-2 Assignment_15 % java a15_4.java
Enter first number : 
4
Enter second number : 
5
Enter third number :
6
Multiplication of entered numbers is : 120
*/