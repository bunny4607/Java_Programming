/*
question : 
program to accept a number form the 
user and then return the differnce of 
summation of factos and summation of
non factos 


*/
import java.util.Scanner ; 

class fact {
    public int DiffFact(int iNo){
        int i =0 ; 
        int idiff = 0 ; 
        int iFactSum = 0 ; 
        int iNonFactSum = 0 ; 
        for(i =1 ; i<= iNo ; i++){
            if(iNo % i == 0){
                iFactSum = iFactSum + i ; 
            }
            else {
                iNonFactSum = iNonFactSum + i ; 
            }
            idiff = iFactSum - iNonFactSum ; 
        }
        return idiff  ; 
    }
}
public class a14_5{
    public static void main(String A[]){
        Scanner scanner = new Scanner(System.in);
        fact fobj = new fact(); 

        int iValue = 0 ; 
        int iRet= 0 ; 

        System.out.println("Enter a number:") ; 
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1); 
        }iValue = scanner.nextInt(); 

        iRet = fobj.DiffFact(iValue);
        System.out.println(iRet );
        System.out.println();



    }
}
/*

Enter a number:
12
-22




Enter a number:
10
-19

*/