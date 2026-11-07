import java.util.Scanner ; 
class Display{
    public void display(int iNo){
        int i = 0 ; 
        for(i = 1 ; i <= (iNo/2); i++){
            if(iNo % i == 0 )
                System.out.print(i+"\t");
        }
        System.out.println();
    }
}


public class a3_2 {
    public static void main(String A[]){
        int iValue = 0 ; 

        Scanner scanner = new Scanner(System.in) ; 
        Display dobj = new Display(); 

        System.out.println("Enter a number :");
        if(!scanner.hasNextInt()){
            System.err.println("invalid input"); 
            System.exit(1); 

        }
        iValue = scanner.nextInt(); 

        dobj.display(iValue);

    }
}


///////////////////////////////////////////////////////////////////////
/*              SAMPLE OUTPUT 
Enter a number :
12
1	2	3	4	6	
vedantbarne@Vedants-MacBook-Air-2 Assignment_3 % java a3_2.java
Enter a number :
6
1	2	3	
vedantbarne@Vedants-MacBook-Air-2 Assignment_3 % java a3_2.java
Enter a number :
9
1	3
*/
/// ///////////////////////////////////////////////////////////////////
