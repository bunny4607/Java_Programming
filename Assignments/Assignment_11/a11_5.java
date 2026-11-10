import java.util.Scanner ; 
class Display{
    public void display(int iNo1, int iNo2){
        int i = 0 ; 
        int iSum = 0 ; 
        if(iNo1<iNo2){
            for(i = iNo2; i>= iNo1 ; i--){
                System.out.print(i+"\t");
            }
            System.out.println(iSum );
        }
        else {
            for(i = iNo1 ; i>= iNo1 ; i--){
                System.out.print(i+"\t");
            }
            System.out.println(iSum );
        }
        System.out.println();
    }
}

public class a11_5{
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


vedantbarne@Vedants-MacBook-Air-2 Assignment_11 % java a11_5.java
Enter first number : 
23
Enter second number : 
35
35	34	33	32	31	30	29	28	27	26	25	24	23	0

vedantbarne@Vedants-MacBook-Air-2 Assignment_11 % java a11_5.java
Enter first number : 
10
Enter second number : 
18
18	17	16	15	14	13	12	11	10	0

vedantbarne@Vedants-MacBook-Air-2 Assignment_11 % 




*/