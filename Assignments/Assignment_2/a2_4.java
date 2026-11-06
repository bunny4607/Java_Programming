import java.util.Scanner ;
/////////////////////////////////////////////////////////////////////////
/// 
///     class name : Display
///     description : displays number 1 , number 2 times 
///     date : 7/11/2026
///     author : Vedant Kalidas Barne 
/// 
/////////////////////////////////////////////////////////////////////////
class Display{
    /////////////////////////////////////////////////////////////////////////
    /// 
    ///     function name : display
    ///     description : displays number 1 , number 2 times 
    ///     input : int ,int 
    ///     output : void 
    ///     date : 7/11/2026
    ///     author : Vedant Kalidas Barne
    /// 
    /////////////////////////////////////////////////////////////////////////
    public void display(int iNo1, int iNo2){
        if (iNo2 < 0 ) iNo2 = - iNo2 ; 
        int i = 0 ; 

        for(i = 1 ; i <= iNo2; i++){
            System.out.print(iNo1+"\t");
        }
        System.out.println();
    }
}
/////////////////////////////////////////////////////////////////////////
/// 
///     Entry point 
/// 
/////////////////////////////////////////////////////////////////////////
public class a2_4{
    public static void main(String A[]){
        int iValue1 = 0 ; 
        int iValue2 = 0 ; 

        Scanner sc = new Scanner(System.in); 
        Display dobj = new Display(); 

        System.out.println("Enter first number : ");
        if(!sc.hasNextInt()){
            System.err.println("invalid input") ; 
            System.exit(1);

        }
        iValue1 = sc.nextInt(); 

        System.out.println("Enter second number : ");
        if(!sc.hasNextInt()){
            System.err.println("invalid input") ; 
            System.exit(1);

        }
        iValue2 = sc.nextInt(); 

        dobj.display(iValue1, iValue2);

        sc.close();



    }
}
/////////////////////////////////////////////////////////////////////////
/// 
///     sample outputs :
/*    
Enter first number : 
-3
Enter second number : 
6
-3	-3	-3	-3	-3	-3	
vedantbarne@Vedants-MacBook-Air-2 Assignment_2 % java a4_4.java
Enter first number : 
4
Enter second number : 
-5
4	4	4	4	4
*/
///
/// 
/////////////////////////////////////////////////////////////////////////