import java.util.Scanner ; 
class Display{
    public void display(int iNo1, int iNo2){
        int i = 0 ; 
        if(iNo1<iNo2){
            for(i = iNo1; i<= iNo2 ; i++){
                System.out.print(i+"\t");
            }
        }
        else {
            for(i = iNo2 ; i<= iNo1 ; i++){
                System.out.print(i+"\t");
            }
        }
        System.out.println();
    }
}

public class a11_1{
    public static void main(String A[]){
        int iValue1 = 0 ; 
        int iValue2 = 0 ; 

        Display dobj = new Display(); 
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter first number : ");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);
        }iValue1 = scanner.nextInt(); 

        System.out.println("Enter second number : ");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);
        }iValue2 = scanner.nextInt();
        
        dobj.display(iValue1, iValue2); 
    }
}
/*
Enter first number : 
-2
Enter second number : 
7
-2	-1	0	1	2	3	4	5	6	7	



Enter first number : 
7
Enter second number : 
-2
-2	-1	0	1	2	3	4	5	6	7
*/