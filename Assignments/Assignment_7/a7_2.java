import java.util.Scanner; 
class Display { 
    public void Pattern(int iNo){
        int i = 0 ;
        for( i = 1 ; i <= iNo ; i++){
            System.out.print(i+"\t");
        }
    }
}
/*
............................................................................


                    ENTRY POINT 


............................................................................
*/
public class a7_2{
    public static void main(String A[]){

        Display dobj = new Display(); 
        Scanner scanner = new Scanner (System.in ); 

        int iValue = 0 ; 


        System.out.println("Enter a number : ");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);
        }
        iValue = scanner.nextInt() ; 

        dobj.Pattern(iValue);
    }
}
/*
............................................................................

                    Sample output 

vedantbarne@Vedants-MacBook-Air-2 Assignment_7 % java a7_2.java
Enter a number : 
4
1	2	3	4	%  


Enter a number : 
8
1	2	3	4	5	6	7	8	% 


Enter a number : 
6
1	2	3	4	5	6	%                                                                                                                        

............................................................................
*/