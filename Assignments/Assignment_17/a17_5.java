import java.util.Scanner; 
/*
Enter number of rows :
4
Enter number of columns :
4
1	2	3	4	
2	3	4	5	
3	4	5	6	
4	5	6	7	
vedantbarne@Vedants-MacBook-Air-2 Assignment_17 % java a17_5.java
Enter number of rows :
5
Enter number of columns :
6
1	2	3	4	5	6	
2	3	4	5	6	7	
3	4	5	6	7	8	
4	5	6	7	8	9	
5	6	7	8	9	10
*/
class print{
    public void pattern(int iRow , int iCol ){
        int i = 0 ; 
        int j = 0 ; 
        int iCount = 0 ; 



        for(i = 1 ; i<= iRow ; i++){
            iCount = i ; 
            for(j =1 ; j <= iCol ; j++){
                System.out.print(iCount + "\t");
                iCount ++; 


            }
            System.out.println();
        }
    }
}
public class a17_5{
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