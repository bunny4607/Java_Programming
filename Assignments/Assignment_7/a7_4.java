import java.util.Scanner;
class Display{
    public void pattern(int iNo ){
        int i = 0 ; 
        for(i = 1 ; i <= iNo ; i++){
            if(i %2 != 0 ){
                System.out.print(i+"\t");
            }
        }
        System.out.println();

    }
}
/*
............................................................................


                    ENTRY POINT 


............................................................................
*/
public class a7_4 {
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
12
1	3	5	7	9	11	


Enter a number 
16
1	3	5	7	9	11	13	15	


Enter a number 
8
1	3	5	7	                                                                                                                   

............................................................................
*/