import java.util.Scanner ; 

class Display { 
    public void pattern(int iNo ){
        int i = 0 ; 
        for (i =1 ; i <= iNo ; i++){
            System.out.print("*\t");

        }
        for (i =1 ; i <= iNo ; i++){

            System.out.print("#\t");
        }
    }
}
/*
...............................................................


                            Entery point 


...............................................................
*/
public class a9_1 {
    public static void main(String a[]){
        int iValue = 0 ; 

        Display dobj = new Display(); 
        Scanner scanner = new Scanner (System.in) ; 
        System.out.println("Enter a number : "); 
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);

        }
        iValue = scanner.nextInt(); 
        
        dobj.pattern(iValue);

    }
}
/*

...............................................................

                    Sample output 


Enter a number : 
4
*	*	*	*	#	#	#	#	  



Enter a number : 
6
*	*	*	*	*	*	#	#	#	#	#	#	         



Enter a number : 
2
*	*	#	#	% 


...............................................................

*/