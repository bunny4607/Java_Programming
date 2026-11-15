import java.util.Scanner ; 

/*
Enter a character :
I
TRUE
vedantbarne@Vedants-MacBook-Air-2 Assignment_25 % java a25_2.java
Enter a character :
i
FALSE%                                                           vedantbarne@Vedants-MacBook-Air-2 Assignment_25 % java a25_2.java
Enter a character :
0
FALSE% 
*/
public class a25_2 {
    public static void main(String A[]) {
        Scanner scanner  = new Scanner (System.in) ; 

        char ch = '\0'; 

        System.out.println("Enter a character :") ; 
        if(!scanner.hasNext("[A-Z]+")){
            System.err.print("FALSE") ; 
            System.exit(1);

        }ch = scanner.nextLine().charAt(0); 
        System.out.println("TRUE");

        scanner.close();



    }
}
