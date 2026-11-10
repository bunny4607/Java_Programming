import java.util.Scanner ; 

class Check{
    public void check(int iNo){
        if (iNo < 0 ) iNo = -iNo ; 
        if(iNo == 1 )System.out.println("One");
        else if (iNo == 2 )System.out.println("Two");
        else if (iNo == 3)System.out.println("Three");
        else if (iNo == 4 )System.out.println("Four");
        else if (iNo == 5 )System.out.println("Five");
        else if (iNo == 6 )System.out.println("Six");
        else if (iNo == 7 )System.out.println("Seven");
        else if (iNo == 8 )System.out.println("Eight");
        else if (iNo == 9 )System.out.println("Nine");
        else System.out.println("Invalid input"); 


    }
}
/*
........................................................................

                                        entry point

........................................................................

*/
public class a8_2 {
    public static void main(String A[]){
        int iValue = 0 ; 


        Check cobj = new Check(); 
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter a number : ");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);
        }
        iValue = scanner.nextInt(); 

        cobj.check(iValue);

        scanner.close();

    }
}
/*

........................................................................


                                Sample output : 



Enter a number : 
4
Four



Enter a number : 
-5
Five



Enter a number : 
12
Invalid input




........................................................................

*/
