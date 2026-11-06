import java.util.Scanner ; 

public class program25 {

    public static void main(String A[]){
        String sName = null ; 
        int iAge = 0 ;
        float fMarks = 0.0f; 

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter your name : ");
        sName = scanner.nextLine(); 

        System.out.println("Enter age : ");
        iAge = scanner.nextInt();

        System.out.println("Enter marks : ");
        fMarks = scanner.nextFloat();

        System.out.println("Entered name is : "+sName );
        System.out.println("Entered age is : "+ iAge );
        System.out.println("Entered marks are : "+fMarks);






    }
    
}
