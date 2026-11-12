/*
Enter number of rows :
4
Enter number of columns :
4
A	B	C	D	
a	b	c	d	
A	B	C	D	
a	b	c	d	
A	B	C	D	
*/

import java.util.Scanner; 

class print{
    public void pattern(int iRow , int iCol) {
        int i = 0; 
        int j = 0;
        char ch = '\0' ; 
        for(i = 0 ; i <= iCol ; i++){
            if(i%2 == 0 ){
                    ch = 'A'; 
                    
                }else {
                    ch = 'a'; 
                }
            for(j = 1 ; j <= iCol ; j++) {
                
                System.out.print(ch+"\t");
                ch ++ ; 
            }
            System.out.println();
        }
    }
}
public class a16_2 {
    public static void main(String A[]){
        Scanner scanner = new Scanner(System.in); 
        print pobj = new print (); 

        int iValue1 = 0 ; 
        int iValue2 = 0 ; 

        System.out.println("Enter number of rows :");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);

        }iValue1 = scanner.nextInt(); 

        System.out.println("Enter number of columns :");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input"); 
            System.exit(1);

        }iValue2 = scanner.nextInt(); 

        pobj.pattern(iValue1, iValue2); 
    }
}
