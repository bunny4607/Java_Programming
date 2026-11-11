import java.util.Scanner ; 

class factors {
    public void decreasing(int iNo){
        int i = 0 ; 
        for (i=  iNo/2 ; i>=1; i-- ){
            if(iNo%i == 0 ) {
                System.out.print(i+"\t");
            }
        }
        System.out.println();
    }
}

public class a14_2 {
    public static void main(String A[]){
        Scanner scanner = new Scanner(System.in); 
        factors fobj = new factors(); 

        int iValue = 0 ; 
        
        System.out.println("Enter a number :");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input");
            System.exit(1);

        }iValue = scanner.nextInt(); 

        fobj.decreasing(iValue);
    }
}
/*
sample output : 




Enter a number :
12
6	4	3	2	1	



Enter a number :
13
1	



Enter a number :
10
5	2	1
*/