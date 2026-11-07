import java.util.Scanner ; 

class checkEligiblity{
    public boolean age (int iNo){
        if (iNo >= 18) return true ; 
        else return false ; 
    }
}
public class a4_4 {
    public static void main(String A[]){
        int iAge = 0 ; 
        boolean iRet = false; 

        Scanner scanner = new Scanner(System.in); 
        checkEligiblity cobj = new checkEligiblity(); 
        System.out.println("Enter age : "); 
        if(!scanner.hasNextInt()){
            System.err.println("Invalid input "); 
            System.exit(1); 
        }
        iAge = scanner.nextInt(); 

        if(iAge < 0) {
            System.out.println("Invalid Age"); 
            return ; 
        }

        iRet = cobj.age(iAge);
        if(iRet == true ) System.out.println("Eligble "); 
        else System.out.println("Not eligible "); 


        scanner.close(); 


        
    }
    
}
/*
SAMPLE OUTPUT 


Enter age : 
4
Not eligible 



Enter age : 
19
Eligble 
 */
