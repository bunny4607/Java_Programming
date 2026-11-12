/*
Enter number of rows : 
4
Enter number of columns :
4
A	A	A	A	
B	B	B	B	
C	C	C	C	
D	D	D	D
*/
import java.util.Scanner ; 

class print{
    public void pattern(int iRow , int iCol){
        char i = '\0' ; 
        int j = 0 ; 

        for(i = 'A' ; i<= iRow+ 'A' -1 ; i++){
            for(j = 1; j <= iCol ; j++ ){
                System.out.print(i+"\t");
            }
            System.out.println();
        }
        
    }
}
public class a16_3 {
    public static void main(String A[]){
        Scanner scanner = new Scanner(System.in);
        print pobj = new print(); 
        
        int iValue1 = 0 ; 
        int iValue2 = 0 ; 

        System.out.println("Enter number of rows : ");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input"); 
            System.exit(1);
        }iValue1 = scanner. nextInt(); 

        System.out.println("Enter number of columns :");
        if(!scanner.hasNextInt()){
            System.err.println("Invalid input"); 
            System.exit(1);
        }iValue2 = scanner.nextInt(); 

        pobj.pattern(iValue1, iValue2); 
    }   
}
