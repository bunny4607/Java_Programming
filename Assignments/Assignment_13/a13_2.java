import java.util.Scanner ; 

class Num{
    public int oddNum(int iNo){
        int iCount = 0 ; 
        int i = 0 ; 
        while (iNo != 0 ){
            i = iNo%10; 
            if(i%2 !=0 ) iCount ++ ; 
            iNo = iNo /10 ; 
        }
        return iCount ; 
    }
}
public class a13_2{
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in); 
        Num nobj = new Num(); 

        int iRet = 0 ; 
        int iValue = 0 ; 
        System.out.println("Enter a number :");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);
        }iValue = scanner.nextInt(); 

        iRet = nobj.oddNum(iValue); 
        System.out.println(iRet );

    }
}

/*
Enter a number :
67677
3
vedantbarne@Vedants-MacBook-Air-2 Assignment_13 % java a13_2.java
Enter a number :
98765444
3
ve
*/