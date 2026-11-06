import java.util.Scanner ; 
/////////////////////////////////////////////////////////////////////////
/// 
///     class name : Display
///     description : displays pattern taking input form user 
///     date : 7/11/2026
///     author : Vedant Kalidas BArne 
/// 
/////////////////////////////////////////////////////////////////////////

class Display{
    /////////////////////////////////////////////////////////////////////////
    /// 
    ///     function name : display
    ///     description : displays pattern 
    ///     input : int 
    ///     output : void 
    ///     date : 7/11/2026
    ///     author : Vedant Kalidas Barne
    /// 
    /////////////////////////////////////////////////////////////////////////
    public void display(int iNo){
        while (iNo > 0 ){
            System.out.print("*\t");
            iNo --; 
        }
        System.out.println();
    }
}
/////////////////////////////////////////////////////////////////////////
/// 
///     Entry point 
/// 
/////////////////////////////////////////////////////////////////////////
public class a2_2 {
    public static void main(String A[]) {
        int iValue = 0 ; 

        Scanner sc = new Scanner(System.in); 
        Display dobj = new Display(); 

        System.out.println("enter a number : "); 
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
enter a number : 
5
*	*	*	*	*	
vedantbarne@Vedants-MacBook-Air-2 Assignment_2 % java a2_1.java
enter a number : 
4
*	*	*	*	
vedantbarne@Vedants-MacBook-Air-2 Assignment_2 % java a2_1.java
enter a number : 
7
*	*	*	*	*	*	*	
vedantbarne@Vedants-MacBook-Air-2 Assignment_2 % 

*/
///
/// 
/////////////////////////////////////////////////////////////////////////