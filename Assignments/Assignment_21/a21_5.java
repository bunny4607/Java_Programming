/*
Enter number of rows :
3
Enter number of columns :
4
1	1	1	1	
2	2	2	2	
3	3	3	3	
4	4	4	4	



Enter number of rows :
5
Enter number of columns :
6
1	1	1	1	1	1	
2	2	2	2	2	2	
3	3	3	3	3	3	
4	4	4	4	4	4	
5	5	5	5	5	5	
6	6	6	6	6	6

*/
import java.util.Scanner ; 

class print{
    public void pattern(int iRow , int iCol){
        int i = 0 ; 
        int j = 0 ; 
        for (i = 1; i<= iRow ; i++){
            for( j =1 ; j<= iCol ; j++){
                
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}
public class a21_5 {
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in);
        print pobj = new print(); 

        int iValue1 = 0 ; 
        int iValue2 = 0 ; 

        System.out.println("Enter number of rows :");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);

        }iValue1 = scanner.nextInt(); 

        System.out.println("Enter number of columns :");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);

        }iValue2 = scanner.nextInt(); 

        pobj.pattern(iValue2, iValue2);


    }
}