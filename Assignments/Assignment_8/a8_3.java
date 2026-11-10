import java.util.Scanner ; 

class Number{
    public int Factorial(int iNo){
        if(iNo < 0 ) iNo = -iNo ; 
        
        int i = 0 ;
        int m = 1 ;  
        for(i = 1 ; i<= iNo ;i++){
            m = m*i ; 
        }
        return m ; 
    }
}
/*
........................................................................

                                        entry point

........................................................................

*/
public class a8_3 {
    public static void main(String A[]){
        int iValue = 0 ;
        int iRet = 0 ;  


        Number nobj = new Number(); 
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter a number : ");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);
        }
        iValue = scanner.nextInt(); 

        iRet = nobj.Factorial(iValue);
        System.out.println(iRet );

        scanner.close();

    }
}
/*

........................................................................


                                Sample output : 



Enter a number : 
5
120



Enter a number : 
4
24



Enter a number : 
8
40320




........................................................................

*/
