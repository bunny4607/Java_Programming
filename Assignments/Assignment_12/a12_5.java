import java.util.Scanner; 

class Num{
    public int lessThan6(int iNo){
        int iCount = 0 ; 
        int i = 0 ; 
        while (iNo != 0 ){
            i = iNo%10 ; 
            if(i < 6 ) iCount ++; 
            iNo = iNo/10 ; 
        }
        return iCount ; 
    }
}
public class a12_5 {
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in);
        Num nobj = new Num () ;

        int iValue = 0 ; 
        int iRet = 0 ; 

        System.out.println("Enter a number : ");
        if(!scanner.hasNextInt()){
            System.out.print("Invalid input ");
            System.exit(1);
        }iValue = scanner.nextInt(); 

        iRet = nobj.lessThan6(iValue);
        System.out.println(iRet );

    }
}
/*
Enter a number : 
12345
5
vedantbarne@Vedants-MacBook-Air-2 Assignment_12 % java a12_5.java
Enter a number : 
6782
1
vedantbarne@Vedants-MacBook-Air-2 Assignment_12 % java a12_5.java
Enter a number : 
3456789
3
*/