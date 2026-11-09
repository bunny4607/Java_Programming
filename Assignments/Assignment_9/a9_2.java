import java.util.Scanner ; 

class Display { 
    public int DtoI(int iNo ){
        int iRs = 0 ; 
        iRs = 70*iNo ;

        return iRs ;
    }
}
/*
...............................................................


                            Entery point 


...............................................................
*/
public class a9_2{
    public static void main(String a[]){
        int iValue = 0 ;
        int iRet = 0 ;  

        Display dobj = new Display(); 
        Scanner scanner = new Scanner (System.in) ; 
        System.out.println("Enter in dollar : "); 
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);

        }
        iValue = scanner.nextInt(); 
        
        iRet = dobj.DtoI(iValue);

        System.out.println(iRet );

    }
}
/*

...............................................................

                    Sample output 


Enter in dollar : 
10
700
vedantbarne@Vedants-MacBook-Air-2 Assignment_9 % java a9_2.java
Enter in dollar : 
90
6300
vedantbarne@Vedants-MacBook-Air-2 Assignment_9 % java a9_2.java
Enter in dollar : 
78
5460


...............................................................

*/