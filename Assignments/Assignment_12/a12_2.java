import java.util.Scanner ; 

class Display{

    public boolean  checkZero(int iNo){
        int i = 0 ; 
        int iCount = 0 ; 

        while(iNo != 0 ){
            i = iNo %10 ; 
            
            if(i == 0 )iCount++; 
            iNo = iNo/10 ; 
            
        }
        if(iCount > 0 ) return true ; 
        else return false ; 

    }
}
public class a12_2 {
    public static void main(String A[]){

        Scanner scanner = new Scanner (System.in); 
        Display dobj = new Display();
        
        boolean bRet = false;
        int iValue = 0 ; 
        System.out.println("Enter a number : "); 
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input");
            System.exit(1); 
        }
        iValue = scanner.nextInt(); 

        bRet = dobj.checkZero(iValue);
        if(bRet == true ) System.out.println("Contains Zero ");
        else if(bRet == false )System.out.println("Does not contain zero ");


    }
}

/*
Enter a number : 
900756
Contains Zero 



Enter a number : 
34567
Does not contain zero 
*/
