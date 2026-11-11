/*
program to accept a number and then print all the nonfactos of that number
*/

import java.util.Scanner;

class fact{
    public void nonFact(int iNo){
        int i = 0; 
        for(i = 1 ; i <= iNo; i++){
            if(iNo % i != 0){
                System.out.print(i+"\t"); 
            }
        }
        System.out.println();
    }
}
public class a14_3{
    public static void main(String A[]){
        Scanner scanner = new Scanner(System.in); 
        fact fobj = new fact (); 

        int iValue = 0 ; 

        System.out.println("Enter a number : ");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input ");
            System.exit(1); 

        }
        iValue = scanner.nextInt(); 

        fobj.nonFact(iValue);

    }
}
/*
Enter a number : 
12
5	7	8	9	10	11	



Enter a number : 
13
2	3	4	5	6	7	8	10	11	12	



Enter a number : 
15
2	4	6	7	8	9	10	11	12	13	14
*/