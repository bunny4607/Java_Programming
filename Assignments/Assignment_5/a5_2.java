import java.util.Scanner; 

class Year {
    public boolean leapYear(int iYear){
        if(iYear % 100 == 0 ){
            if(iYear %400 == 0 ) return true ; 
        }
        else if(iYear % 4 == 0 ) return true ; 
        
        return false ;
    }
}
public class a5_2{
    public static void main(String a[]){
        int iValue = 0 ;
        boolean iRet = false ; 


        Year yobj = new Year (); 
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter year : ");
        if(!scanner.hasNextInt()) {
            System.err.println("Invalid input");
            System.exit(1); 
        }iValue = scanner.nextInt(); 

        iRet = yobj.leapYear(iValue);

        if(iRet == true ) System.out.println("Leap Year ");
        else System.out.println("Not a Leap year");

        scanner.close(); 






    }
}

/*
Sample outputs : 


Enter year : 
200
Not a Leap year


Enter year : 
400
Leap Year 



Enter year : 
28
Leap Year 
*/