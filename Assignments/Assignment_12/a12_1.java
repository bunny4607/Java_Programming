import java.util.Scanner ; 

class Display{

    public void revNum(int iNo){
        int i = 0 ; 

        while(iNo != 0 ){
            i = iNo %10 ; 
            System.out.println(i);
            iNo = iNo/10 ; 
            
        }
    }
}
public class a12_1 {
    public static void main(String A[]){

        Scanner scanner = new Scanner (System.in); 

        Display dobj = new Display(); 
        int iValue = 0 ; 
        System.out.println("Enter a number : "); 
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input");
            System.exit(1); 
        }
        iValue = scanner.nextInt(); 

        dobj.revNum(iValue);


    }
}

/*
Enter a number : 
4567
7
6
5
4



Enter a number : 
345678
8
7
6
5
4
3
*/
