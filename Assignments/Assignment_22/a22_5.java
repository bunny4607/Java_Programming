/*
Enter number :
8
2	4	6	8	10	12	14	16	
vedantbarne@Vedants-MacBook-Air-2 Assignment_22 % java a22_5.java
Enter number :
4
2	4	6	8	
vedantbarne@Vedants-MacBook-Air-2 Assignment_22 % java a22_5.java
Enter number :
5
2	4	6	8	10
*/

import java.util.Scanner ; 

class print{
    public void pattern(int iNo ){
        int i = 0 ; 

        for(i = 1   ;i<= iNo ; i++){
            System.out.print(i*2+"\t");
        }
        System.out.println();
    }
}
public class a22_5 {
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
