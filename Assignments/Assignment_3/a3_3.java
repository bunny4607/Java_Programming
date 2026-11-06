import java.util.Scanner ; 
class  FACTORS{

    
    
    public void even(int iNo ){
        int i = 0 ; 
        for(i =1 ; i<= iNo/2 ; i++ ){
            if (i%2 == 0  && iNo%i == 0 ){
                System.out.println(i+"\t");
            }
        }

    }
    
}
public class a3_3 {
    public static void main(String A[]){
        Scanner sc = new Scanner (System.in);

        int iValue = 0 ; 
        int iRet = 0 ;

        System.out.println("Enter a number : ");
        iValue = sc.nextInt();

        

        FACTORS fact = new FACTORS();
        fact.even(iValue ); 






    }
    
}
