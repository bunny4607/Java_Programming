import java.util.Scanner ; 

public class program12 {
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in);

        int iValue =0 ; 

        System.out.println("Enter number :");

        if (!scanner.hasNextInt()){
            System.err.println("Invalis input");
            return ; 
        }
        iValue = scanner.nextInt();

        System.out.println("Input is valid ");




    }
}
