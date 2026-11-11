import java.util.Scanner ; 

class Num{
    public int evenNum(int iNo){
        int iCount = 0 ; 
        int i = 0 ; 
        while (iNo != 0 ){
            i = iNo%10; 
            if(i%2 ==0 ) iCount ++ ; 
            iNo = iNo /10 ; 
        }
        return iCount ; 
    }
}
public class a13_1{
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

        iRet = nobj.evenNum(iValue); 
        System.out.println(iRet );

    }
}

/*
Enter a number :
2395
1
vedantbarne@Vedants-MacBook-Air-2 Assignment_13 % java a13_1.java
Enter a number :
6756
2
vedantbarne@Vedants-MacBook-Air-2 Assignment_13 % java a13_1.java
Enter a number :
900756
3
*/