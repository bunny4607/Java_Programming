import java.util.Scanner;
class Display{
    public void pattern(int iNo ){
        int i = 0 ; 
        for(i = -iNo ; i <= iNo ; i++){
            System.out.print(i+"\t");
        }
        System.out.println();

    }
}
/*
............................................................................


                    ENTRY POINT 


............................................................................
*/
public class a7_3 {
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
-4	-3	-2	-1	0	1	2	3	4	


Enter a number 
6
-6	-5	-4	-3	-2	-1	0	1	2	3	4	5	6	


Enter a number 
3
-3	-2	-1	0	1	2	3	                                                                                                                   

............................................................................
*/