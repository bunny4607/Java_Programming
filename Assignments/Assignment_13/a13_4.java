import java.util.Scanner ; 

class Num {
    public int Mul(int iNo){
        int iMul = 1 ; 
        int i = 0 ; 
        while (iNo != 0 ){
            i = iNo %10 ; 
            if(i != 0) iMul = iMul * i ; 
            iNo = iNo /10 ; 
        }
        return iMul ; 
    }
}
public class a13_4{
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in); 

        Num nobj = new Num(); 
        int iValue = 0 ; 
        int iRet =  0 ; 

        System.out.println("Enter a number : ");
        if(!scanner.hasNextInt()){
            System.err.println("Invalid input ");
            System.exit(1);
        }iValue = scanner.nextInt(); 

        iRet = nobj.Mul(iValue);
        System.out.println(iRet );



    }
}
/*
Enter a number : 
2395
270



Enter a number : 
1018
8



Enter a number : 
9440
144



Enter a number : 
922432
864
*/