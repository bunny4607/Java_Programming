import java.util.Scanner;
class Display{
    public void pattern(int iNo ){
        int i = 0 ; 
        for(i = 1 ; i <= 5 ; i++){
            System.out.print(iNo*i+"\t");
        }
        System.out.println();

    }
}
/*
............................................................................


                    ENTRY POINT 


............................................................................
*/
public class a7_5{
    public static void main(String A[]){
        int iValue = 0 ; 

        Display dobj = new Display(); 
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter a number ");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1); 
        }
        iValue = scanner.nextInt(); 

        dobj.pattern(iValue);
    }
}
/*
............................................................................

                    Sample output 

Enter a number 
4
4	8	12	16	20	


Enter a number 
5
5	10	15	20	25	


Enter a number 
6
6	12	18	24	30	                                                                                                                   

............................................................................
*/