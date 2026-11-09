import java.util.Scanner ; 

class Numbers { 
    public int diffFactoril(int iNo ){
        if(iNo < 0) iNo = -iNo ; 
        
        int i = 0 ; 
        int iEvenF = 1 ; 
        int iOddF = 1 ; 
        int iDiff = 0 ; 
        for(i = 1 ; i<= iNo ; i++){
            if(i%2 ==0 ) {
                iEvenF = iEvenF * i ; 
            }
            else {
                iOddF = iOddF* i ;
            }

        }
        iDiff = iEvenF - iOddF ; 
        if(iDiff < 0 ){
            iDiff = -iDiff ; 
        }

        return iDiff; 
    }
}
/*
...............................................................


                            Entery point 


...............................................................
*/
public class a9_5{
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
        
        iRet = dobj.diffFactoril(iValue);

        System.out.println(iRet );

    }
}
/*

...............................................................

                    Sample output 


Enter a number : 
-5
7
vedantbarne@Vedants-MacBook-Air-2 Assignment_9 % java a9_5.java
Enter a number : 
10
2895
vedantbarne@Vedants-MacBook-Air-2 Assignment_9 % java a9_5.java
Enter a number : 
99
373459037


...............................................................

*/