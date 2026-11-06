import java.util.Scanner; 

/////////////////////////////////////////////////////////////////////////
/// 
///     class name : Display
///     description : checks if number is greater than 10
///     date : 7/11/2026
///     author : Vedant Kalidas BArne 
/// 
/////////////////////////////////////////////////////////////////////////
class Display{
    /////////////////////////////////////////////////////////////////////////
    /// 
    ///     function name : check10
    ///     description : returns true if i/p taken form user is greater than 10
    ///     input : int 
    ///     output : boolean 
    ///     date : 7/11/2026
    ///     author : Vedant Kalidas Barne
    /// 
    /////////////////////////////////////////////////////////////////////////
    public boolean check10(int iNo){
        return (iNo > 10); 
    }
}
/////////////////////////////////////////////////////////////////////////
/// 
///     Entry point 
/// 
/////////////////////////////////////////////////////////////////////////
public class a2_3{
    public static void main(String A[]){
        int iValue = 0 ; 
        boolean iRet = false ; 


        Scanner sc = new Scanner(System.in) ;
        Display dobj = new Display() ;  

        System.out.println("enter a number :");
        if(!sc.hasNextInt()){
            System.err.println("invalid input");
            System.exit(1);
        }
        iValue = sc.nextInt();

        iRet = dobj.check10(iValue); 
        if (iRet == true ) System.out.println("Demo");
        else System.out.println("Hello");



        
    }
}

/////////////////////////////////////////////////////////////////////////
/// 
///     sample outputs :
/*    
enter a number :
11
Demo
vedantbarne@Vedants-MacBook-Air-2 Assignment_2 % java a2_3.java
enter a number :
10
Hello
vedantbarne@Vedants-MacBook-Air-2 Assignment_2 % 

*/
///
/// 
/////////////////////////////////////////////////////////////////////////