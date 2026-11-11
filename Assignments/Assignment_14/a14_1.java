// program which accepts number from user and display its muliplication of factors

import java.util.Scanner; 

class number {
    public int Mul (int iNo){
        int iMul = 1; 
        int i = 0 ; 

        for(i = 1 ; i<= iNo /2 ; i++){
            if(iNo % i == 0 ){
                iMul = iMul * i ; 
            }
        }
        return iMul ; 
    }
}

public class a14_1{
    public static void main(String a[]){
        Scanner scanner = new Scanner(System.in); 
        number nobj = new number(); 

        int iValue = 0 ; 
        int iRet = 0 ; 

        System.out.println("Enter a number :");
        if(!scanner.hasNextInt()){
            System.err.println("Invalid input"); 
            System.exit(1);
        }iValue = scanner.nextInt(); 

        iRet = nobj.Mul(iValue) ; 
        System.out.println(iRet);
    }
}
/*
Enter a number :
12
144



Enter a number :
13
1



Enter a number :
10
10
*/