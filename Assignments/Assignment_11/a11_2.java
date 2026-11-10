import java.util.Scanner ; 
class Display{
    public void display(int iNo1, int iNo2){
        int i = 0 ; 
        if(iNo1<iNo2){
            for(i = iNo1; i<= iNo2 ; i++){
                if(i%2 == 0 ){
                    System.out.print(i+"\t");
                }
                
            }
        }
        else {
            for(i = iNo2 ; i<= iNo1 ; i++){
                if(i%2 == 0 ){
                    System.out.print(i+"\t");
                }
            }
        }
        System.out.println();
    }
}

public class a11_2{
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
23
Enter second number : 
35
24	26	28	30	32	34	



Enter first number : 
-10
Enter second number : 
2
-10	-8	-6	-4	-2	0	2
*/