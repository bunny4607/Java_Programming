import java.util.Scanner ; 

class Number{
    public void Table (int iNo){
        int i = 0 ;
        System.out.println("..................");
        for(i =10 ;i >= 1 ; i--){
            System.out.println(i*iNo);
        }
 
    }
}
/*
........................................................................

                                        entry point

........................................................................

*/
public class a8_5 {
    public static void main(String A[]){
        int iValue = 0 ; 


        Number nobj = new Number(); 
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter a number : ");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);
        }
        iValue = scanner.nextInt(); 

        nobj.Table(iValue); 

    }
}
/*

........................................................................


                                Sample output : 



Enter a number : 
2
..................
20
18
16
14
12
10
8
6
4
2



Enter a number : 
5
..................
50
45
40
35
30
25
20
15
10
5



Enter a number : 
8
..................
80
72
64
56
48
40
32
24
16
8



........................................................................

*/
