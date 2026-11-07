import java.util.Scanner ; 

class Display{
    public void display (int iNo){
        int i = 0 ;

        for(i = 1 ; i<= iNo; i++){
            System.out.print(2*i+"\t");
        }
        System.out.println();
    }
}
public class a3_1{
    public static void main(String A[]){
        int iValue = 0 ; 

        Scanner sc = new Scanner (System.in) ; 
        Display dobj = new Display();

        System.out.println("Enter a number : ");
        if(!sc.hasNextInt()){
            System.err.println("invalid input"); 
            System.exit(1); 
        }
        iValue = sc.nextInt(); 

        dobj.display(iValue);

    }
}
/////////////////////////////////////////////////////////////////////////
/// 
///     sample outputs :
/*    
Enter a number : 
4
2	4	6	8	
vedantbarne@Vedants-MacBook-Air-2 Assignment_3 % java a3_1.java
Enter a number : 
5
2	4	6	8	10	
vedantbarne@Vedants-MacBook-Air-2 Assignment_3 % java a3_1.java
Enter a number : 
6
2	4	6	8	10	12 

*/
///
/// 
/////////////////////////////////////////////////////////////////////////