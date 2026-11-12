import java.util.Scanner; 
/*
Enter number of rows: 
4
Enter number of columns :
4
4	4	4	4	
3	3	3	3	
2	2	2	2	
1	1	1	1
*/
class print{
    public void pattern(int iRow , int iCol){
        int i = 0 ; 
        int j = 0 ; 
        for(i = iRow ;i>= 1; i-- ){
            for(j = 1 ; j<= iCol; j++){
                System.out.print(i+"\t");

            }
            System.out.println();
        }


    }
}

public class a16_4{
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in); 
        print pobj = new print(); 

        int iValue1 = 0 ; 
        int iValue2 = 0 ; 

        System.out.println("Enter number of rows: ");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input"); 
            System.exit(1);

        }iValue1 = scanner.nextInt() ; 

        System.out.println("Enter number of columns :");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input"); 
            System.exit(1);
        }iValue2 = scanner.nextInt() ;

        pobj.pattern(iValue1, iValue2); 

    }
}