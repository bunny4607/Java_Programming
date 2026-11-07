import java.util.Scanner;

class Char{
    public boolean Case(char ch){
        return  (ch >= 'A' && ch <= 'Z' ) ;
    }
}
public class a5_5 {
    public static void main(String a[]) {
        char cValue = 0 ;  
        boolean iRet =  false; 

        Scanner scanner = new Scanner(System.in); 
        Char dobj = new Char();
        System.out.println("Enter character :");
        if(!scanner.hasNext("[A-Za-z]")){
            System.err.println("Invalid input");
            System.exit(1); 

        }
        cValue = scanner.next().charAt(cValue); 

        iRet = dobj.Case(cValue);
        if (iRet == true ) System.out.println("Upper case");
        else System.out.println("Lower case");
    }


}

/*

Sample outputs :

Enter character :
;
Invalid input


Enter character :
A
Upper case

Enter character :
3
Invalid input

Enter character :
k
Lower case

*/
