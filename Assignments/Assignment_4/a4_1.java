import java.util.Scanner ; 

class checkNum{
    public int CheckNum(int iNo){
        if (iNo > 0 ) return 1; 
        else if (iNo == 0) return 2; 
        else return 3 ; 
    }
}
public class a4_1 {
    public static void main(String A[]){
        int iValue = 0 ; 
        int iRet = 0 ; 

        checkNum cobj = new checkNum() ; 
        Scanner scanner = new Scanner (System.in); 

        System.out.println("Enter a number : ");
        if(!scanner.hasNextInt()){
            System.err.println("Invalid input") ; 
            System.exit(1);
        }
        iValue = scanner.nextInt() ;

        iRet = cobj.CheckNum(iValue);

        if (iRet ==1 ) System.out.print("Positive number ");
        else if (iRet == 2 )System.out.print("Number is zero");
        else System.out.print("Negative number ");

    }
}

/*
sample output : 



Enter a number : 
5
Positive number %                                                                                                                           vedantbarne@Vedants-MacBook-Air-2 Assignment_4 % java a4_1.java
Enter a number : 
0
Number is zero%                                                                                                                             vedantbarne@Vedants-MacBook-Air-2 Assignment_4 % java a4_1.java
Enter a number : 
-7
Negative number %                                                                                                                           vedantbarne@Vedants-MacBook-Air-2 Assignment_4 % 
 */