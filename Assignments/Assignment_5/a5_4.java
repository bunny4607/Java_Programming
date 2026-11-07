import java.util.Scanner;

class Div{
    public int DivBy3and5(int iNo){
        if (iNo %3== 0  && iNo%5 == 0) return 1;
        else if (iNo%3 ==0 ) return 2;
        else if (iNo %5 == 0 ) return 3; 
        else return 4 ; 

        

    }
}
public class a5_4 {
    public static void main(String a[]) {
        int iValue = 0 ; 
        int iRet = 0; 

        Scanner scanner = new Scanner(System.in); 
        Div dobj = new Div();
        System.out.println("Enter number :");
        if(!scanner.hasNextInt()){
            System.err.println("Invalid input");
            System.exit(1); 

        }
        iValue = scanner.nextInt(); 

        iRet = dobj.DivBy3and5(iValue); 

        if(iRet == 1 ) System.out.println("divisible by both 3 and 5");
        else if (iRet == 2)System.out.println("divisble by 3 only ");
        else if (iRet == 3 )System.out.println("divisible by 5 only "); 
        else if (iRet == 4) System.out.println("not divisble by 3 or 5"); 
        
    }


}

/*

Sample outputs :

Enter number :
30
divisible by both 3 and 5



Enter number :
10
divisible by 5 only 



Enter number :
3
divisble by 3 only 



Enter number :
7
not divisble by 3 or 5

*/
