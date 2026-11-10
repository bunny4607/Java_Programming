import java.util.Scanner ; 

class Number{
    public void Table (int iNo){
        int i = 0 ;
        System.out.println("..................");
        for(i =1 ;i<= 10 ; i++){
            System.out.println(i*iNo);
        }
 
    }
}
/*
........................................................................

                                        entry point

........................................................................

*/
public class a8_4 {
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
2
4
6
8
10
12
14
16
18
20



Enter a number : 
7
..................
7
14
21
28
35
42
49
56
63
70



Enter a number : 
4
..................
4
8
12
16
20
24
28
32
36
40




........................................................................

*/
