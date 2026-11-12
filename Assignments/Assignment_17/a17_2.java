import java.util.Scanner ; 
/*
Enter number of rows :
4
Enter number of columns :
4
2	4	6	8	
1	3	5	7	
2	4	6	8	
1	3	5	7

*/
class print{
    public void pattern(int iRow , int iCol ){
        int i = 0 ; 
        int j = 0 ; 
        int iCount = 0 ; 

        for(i = 1 ; i<= iRow ; i++){
            iCount = 0 ; 
            for( j = 1 ; j<= iCol ; j++){
                if(i%2 != 0 && j == 1) {
                    iCount = 2 ; 

                }else if(i%2 == 0 && j ==1 ){
                    iCount = 1 ; 
                    
                }
                System.out.print(iCount +"\t");
                iCount +=2 ; 

            }
            System.out.println();
        }
    }
}
public class a17_2{
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
            System.err.print("Invalid input"); 
            System.exit(1);
        }iValue2 = scanner.nextInt() ; 

        pobj.pattern(iValue1, iValue2 ); 

    }
}