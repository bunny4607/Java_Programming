import java.util.Scanner ; 
/*
Enter number of rows :
5
Enter number of columns :
5
*	*	*	*	*	
*	 	 	*	*	
*	 	*	 	*	
*	*	 	 	*	
*	*	*	*	*	
vedantbarne@Vedants-MacBook-Air-2 Assignment_20 % java a20_3.java
Enter number of rows :
7
Enter number of columns :
7
*	*	*	*	*	*	*	
*	 	 	 	 	*	*	
*	 	 	 	*	 	*	
*	 	 	*	 	 	*	
*	 	*	 	 	 	*	
*	*	 	 	 	 	*
*	*	*	*	*	*	*	
*/
class print{
    public void pattern(int iRow ,int iCol ){
        int i = 0 ; 
        int j = 0 ; 

        for(i =1 ; i<= iRow ;i++){
            for(j =1 ; j<= iCol ; j++){
                if(i+j == iRow +1) System.out.print("*\t");
                else if (
                    (i ==1 || i == iRow)
                    ||
                    (j==1 || j== iCol)
                ){
                    System.out.print("*\t");
                }
                else{
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }


    }
}
public class a20_3{
    public static void main(String A[]){
        Scanner scanner = new Scanner(System.in); 
        print pobj = new print(); 

        int iValue1 = 0 ; 
        int iValue2 = 0 ; 

        System.out.println("Enter number of rows :");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input"); 
            System.exit(1);

        }iValue1 = scanner.nextInt(); 

        System.out.println("Enter number of columns :");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input"); 
            System.exit(1);

        }iValue2 = scanner.nextInt(); 

        pobj.pattern(iValue2, iValue2);


    }
}