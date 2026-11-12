import java.util.Scanner; 
/*
Enter number of rows: 
3
Enter number of columns :
4
1	2	3	4	
5	6	7	8	
9	10	11	12
*/
class print{
    public void pattern(int iRow , int iCol){
        int i = 0 ; 
        int j = 0 ; 
        int icount = 1 ; 
        for(i = iRow ;i>= 1; i-- ){
            for(j = 1 ; j<= iCol; j++){
                System.out.print(icount+"\t");
                icount++; 

            }
            System.out.println();
        }


    }
}

public class a16_5{
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