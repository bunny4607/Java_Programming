import java.util.Scanner ; 

class Numbers { 
    public int Factoril(int iNo ){
        if(iNo < 0) iNo = -iNo ; 
        
        int i = 0 ; 
        int m = 1 ; 
        for(i =1 ; i<= iNo ; i++){
             m = m* i ;
        }
        return m ; 
    }
}
/*
...............................................................


                            Entery point 


...............................................................
*/
public class a9_4{
    public static void main(String a[]){
        int iValue = 0 ;
        int iRet = 0 ;  

        Numbers dobj = new Numbers(); 
        Scanner scanner = new Scanner (System.in) ; 
        System.out.println("Enter a number : "); 
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);

        }
        iValue = scanner.nextInt(); 
        
        iRet = dobj.Factoril(iValue);

        System.out.println(iRet );

    }
}
/*

...............................................................

                    Sample output 


Enter a number : 
5
120
vedantbarne@Vedants-MacBook-Air-2 Assignment_9 % java a9_4.java
Enter a number : 
7
5040
vedantbarne@Vedants-MacBook-Air-2 Assignment_9 % java a9_4.java
Enter a number : 
-5
120


...............................................................

*/