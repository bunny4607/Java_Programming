import java.util.Scanner ; 

class Numbers { 
    public int evenFactoril(int iNo ){
        if(iNo < 0) iNo = -iNo ; 
        
        int i = 0 ; 
        int m = 1 ; 
        for(i =1 ; i<= iNo ; i++){
            if(i%2 == 0 ){
                m = m* i ; 
            }
        }
        return m ; 
    }
}
/*
...............................................................


                            Entery point 


...............................................................
*/
public class a9_3{
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
        
        iRet = dobj.evenFactoril(iValue);

        System.out.println(iRet );

    }
}
/*

...............................................................

                    Sample output 


Enter a number : 
5
8
vedantbarne@Vedants-MacBook-Air-2 Assignment_9 % java a9_3.java
Enter a number : 
4
8
vedantbarne@Vedants-MacBook-Air-2 Assignment_9 % java a9_3.java
Enter a number : 
9
384
vedantbarne@Vedants-MacBook-Air-2 Assignment_9 % java a9_3.java
Enter a number : 
-5
8


...............................................................

*/