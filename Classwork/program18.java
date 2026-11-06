import java.util.Scanner ; 

public class program18{
    public static boolean  checkEven (int iNo){
        if (iNo %2 ==0 ) return true;
        else return false; 

    }
    public static void main(String a[]) {
        int iValue = 0;
        boolean bRet = false ; 
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Enter number : ");
        iValue = scanner.nextInt();

        bRet = checkEven(iValue);

        if(bRet == true ) System.out.println("even");
        else if(bRet == false )System.out.println("odd ");
    }
}
