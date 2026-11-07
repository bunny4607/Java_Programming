import java.util.Scanner ; 

class Display{
    public void evenFactors (int iNo ){
        int i = 0 ;
        for(i =2; i <= iNo/2; i+=2){
            if(iNo % i == 0 ) System.out.print(i+"\t");
        }
    }
}

public class a3_3 {
    public static void main(String A[]){
        int iValue = 0 ; 
        Scanner scanner = new Scanner (System.in); 
        Display dobj = new Display(); 

        System.out.println("Enter number : ");
        if(!scanner.hasNextInt()){
            System.err.println("Invalid input"); 
            System.exit(1);
        }iValue = scanner.nextInt(); 

        dobj.evenFactors(iValue);

    }
    
}
///////////////////////////////////////////////////////////////////////
/*              SAMPLE OUTPUT 

Enter number : 
36
2	4	6	12	18	% 
                                                                                                  vedantbarne@Vedants-MacBook-Air-2 Assignment_3 % java a3_3.java
Enter number : 
48
2	4	6	8	12	16	24	%  
                                                                                 vedantbarne@Vedants-MacBook-Air-2 Assignment_3 % java a3_3.java
Enter number : 
9
*/
/// ///////////////////////////////////////////////////////////////////

