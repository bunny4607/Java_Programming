import java.util.Scanner;
class program61
{

    public static void main(String A[]){
        Scanner scanner = new Scanner(System.in);
        int iValue = 0; 


        
        System.out.println("Enter the frequency : ");
        iValue = scanner.nextInt();
        
        Iteration iteration = new Iteration();
        iteration.Display(iValue );

    }
}
class Iteration{
    public void Display (int iNo){
        int iCount = 0;

        //Input updater 
        if(iNo < 0){
            iNo = -iNo;
        } 
        for (iCount =1; iCount <=iNo; iCount ++){
            System.out.println("-------------");
            System.out.println(iCount);
            System.out.println("-------------");
        }
    }

}
