import java.util.Scanner ; 

class Number {
    public int ret2(int iNo){
        int iCount = 0 ; 
        int i = 0 ; 

        while (iNo!= 0 ){
            i = iNo%10 ; 
            if(i == 2) iCount ++; 
            iNo = iNo /10 ; 
        }
        
        return iCount ; 
    }
}

public class a12_3{
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in); 
        Number nobj = new Number(); 

        int iRet = 0 ; 
        int iValue = 0 ; 
        System.out.println("Enter a number :");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input");
            System.exit(1); 
        }iValue = scanner.nextInt(); 

        iRet = nobj.ret2(iValue ); 
        System.out.println(iRet );
    }
}

/*
Enter a number :
45678
0



Enter a number :
23456
1



Enter a number :
2223452
4
*/