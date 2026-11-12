import java.util.Scanner; 
/*
Enter number of rows :
4
Enter number of columns :
4
a	b	c	d	
1	2	3	4	
a	b	c	d	
1	2	3	4	
vedantbarne@Vedants-MacBook-Air-2 Assignment_17 % java a17_3.java
Enter number of rows :
5
Enter number of columns :
5
a	b	c	d	e	
1	2	3	4	5	
a	b	c	d	e	
1	2	3	4	5	
a	b	c	d	e

*/
class print{
    public void pattern(int iRow , int iCol ){
        int i = 0 ; 
        int j = 0 ; 
        char  ch = '\0' ; 

        for(i = 1 ; i<= iRow ; i++){
            for( j = 1, ch = 'a'; j<= iCol ; j++,ch ++  ){

                if(i%2 == 0 ){
                    System.out.print(j+"\t");
                }
                else {
                    System.out.print(ch+"\t");
                }

                
                

            }
            System.out.println();
        }
    }
}
public class a17_3{
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