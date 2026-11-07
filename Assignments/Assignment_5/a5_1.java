import java.util.Scanner; 

class compare{
    public int compare3No(int iNo1, int iNo2, int iNo3){
        if (iNo1 > iNo2 && iNo1 > iNo3) return 1; 
        else if (iNo2>iNo1 && iNo2 > iNo3) return 2; 
        else return 3 ;
    }
}

public class a5_1 {
    public static void main(String A[]){
        int iValue1= 0 ; 
        int iValue2 = 0 ; 
        int iValue3 = 0;
        int iRet = 0 ; 


        Scanner scanner = new Scanner (System.in); 
        compare cobj = new compare();

        System.out.println("Enter first number :");
        if (!scanner.hasNextInt()){
            System.err.println("Invalid input"); 
            System.exit(1); 
        }iValue1 = scanner.nextInt(); 

        System.out.println("Enter second number :");
        if(!scanner.hasNextInt()){
            System.err.println("Inavlid input"); 
            System.exit(1); 

        }iValue2 = scanner.nextInt(); 

        System.out.println("Enter third number :"); 
        if(!scanner.hasNextInt()){
            System.err.println("Invalid input"); 
            System.exit(1); 
        }iValue3 = scanner.nextInt(); 

        iRet = cobj.compare3No(iValue1, iValue2, iValue3) ; 

        if(iRet == 1) System.out.println(iValue1+" is the greatest number ");
        else if(iRet == 2) System.out.println(iValue2+" is the greatest number ");
        else if(iRet == 3) System.out.println(iValue3+" is the greatest number ");
    }
}

/*
Sample outputs 


Enter first number :
5
Enter second number :
6
Enter third number :
7
7 is the greatest number 



Enter first number :
12
Enter second number :
56
Enter third number :
43
56 is the greatest number 
*/
