import java.util.Scanner ; 

class Div{
    public boolean divBy5(int iNo ){
        return (iNo % 5 == 0); 
    }
}
public class a4_5 {
    public static void main(String A[]){
        int iValue = 0 ; 
        boolean iRet = false ; 

        Div dobj = new Div(); 
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter a number : ");
        if(!scanner.hasNextInt()){
            System.err.println("Invalid input "); 
            System.exit(1);
        }
        iValue = scanner.nextInt(); 

        iRet = dobj.divBy5(iValue); 

        if(iRet == true ) System.out.println(iValue+" is divisible by 5");
        else System.out.println(iValue +" is not divible by 5"); 
        


    }
    
}
