import java.util.Scanner ; 

class Check{
    public int check(int iNo){

        if(iNo < 50 ) return 1; 
        else if (iNo > 50 && iNo <100) return 2 ; 
        else if (iNo > 100) return 3 ; 
        else return 4; 


    }
}
/*
........................................................................

                                        entry point

........................................................................

*/
public class a8_1 {
    public static void main(String A[]){
        int iValue = 0 ; 
        int iRet = 0 ; 

        Check cobj = new Check(); 
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter a number : ");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);
        }
        iValue = scanner.nextInt(); 

        iRet = cobj.check(iValue ); 
        if(iRet == 1) System.out.println("Small");
        else if (iRet == 2) System.out.println("Medium");
        else if (iRet == 3) System.out.println("Large");

        scanner.close();

    }
}
/*

........................................................................


                                Sample output : 



Enter a number : 
67
Medium



Enter a number : 
3
Small



Enter a number : 
-3
Small



Enter a number : 
-98
Small




........................................................................

*/
