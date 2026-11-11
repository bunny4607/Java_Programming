import java.util.Scanner ; 

class Num{
    public int threeAndSeven(int iNo){
        int iCount = 0 ; 
        int i = 0 ; 
        while (iNo != 0 ){
            i = iNo%10; 
            if(i>3 && i<7 ) iCount ++ ; 
            iNo = iNo /10 ; 
        }
        return iCount ; 
    }
}
public class a13_3{
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

        iRet = nobj. threeAndSeven(iValue); 
        System.out.println(iRet );

    }
}

/*
Enter a number :
2395
1
vedantbarne@Vedants-MacBook-Air-2 Assignment_13 % java a13_3.java
Enter a number :
1018
0
vedantbarne@Vedants-MacBook-Air-2 Assignment_13 % java a13_3.java
Enter a number :
4521
2
*/