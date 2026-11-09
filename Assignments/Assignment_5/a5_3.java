import java.util.Scanner;

class Grades{
    public char grades(int iNo){
        if (iNo <= 100 && iNo >=90) return 'A';
        else if (iNo <= 89 && iNo >=75) return 'B';
        else if (iNo <= 74 && iNo >=60) return 'C';
        else if (iNo <= 40 && iNo >=59) return 'D';
        else if (iNo <= 0 && iNo >=39) return 'E';

        return 'F';

    }
}
public class a5_3 {
    public static void main(String a[]) {
        int iValue = 0 ; 
        char iRet = '\0'; 

        Scanner scanner = new Scanner(System.in); 
        Grades gobj = new Grades();
        System.out.println("Enter marks :");
        if(!scanner.hasNextInt()){
            System.err.println("Invalid input");
            System.exit(1); 

        }
        iValue = scanner.nextInt(); 

        iRet = gobj.grades(iValue); 
        if(iRet == 'F') {
            System.out.println("Invalid input "); 
            return ; 
        
        }
        else if (iRet == 'E') {
            System.out.println("Fail");
            return ;
        }

        System.out.println(iRet);
    }


}

/*
Sample outputs : 

Enter marks :
-40
Invalid input 

Enter marks :
23
Invalid input 



Enter marks :
98
A



Enter marks :
76
B

*/
