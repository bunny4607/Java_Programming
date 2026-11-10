import java.util.Scanner ; 


class area {
    public int rect (int iNo1, int iNo2){
        int  iA = 0 ; 
        iA = iNo1 *iNo2;

        return iA; 
    }
}
/*
......................................................


                            Entry point 


......................................................
*/
public class a10_2 {
    public static void main(String A[]){
        int iValue1 = 0 ; 
        int iValue2 = 0 ; 
        int iRet = 0 ; 

        area aobj = new area (); 
        Scanner scanner = new Scanner (System.in) ; 

        System.out.println("Enter length :");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);
        }iValue1 = scanner.nextInt(); 

        System.out.println("Enter breadth :");
        if(!scanner.hasNextInt()){
            System.err.print("Invalid input "); 
            System.exit(1);
        }iValue2 = scanner.nextInt();

        iRet = aobj.rect(iValue1,iValue2);
        System.out.println(iRet );

    }
}

/*
......................................................

                        Sample output 


Enter length :
3
Enter breadth :
6
18
vedantbarne@Vedants-MacBook-Air-2 Assignment_10 % java a10_2.java
Enter length :
4
Enter breadth :
4
16
vedantbarne@Vedants-MacBook-Air-2 Assignment_10 % java a10_2.java
Enter length :
9
Enter breadth :
8
72

......................................................
*/
