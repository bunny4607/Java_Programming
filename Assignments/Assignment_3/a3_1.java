import java.util.Scanner ; 

class Iterations {
    public void Ittr (int iNo){
        int iNo2 = 0 ; 
        for (iNo2 =1 ; iNo2 <= iNo ; iNo2 ++ ){
            System.out.print(iNo2*2+"\t");  
        }
    }
}
public class a3_1 {
    public static void main(String[] args) {
        int iValue = 0 ;
        Scanner scanner = new Scanner (System.in);

        System.out.println("enter a number : ");
        iValue = scanner.nextInt();

        Iterations itter = new Iterations();
        itter.Ittr(iValue);



    }
}
