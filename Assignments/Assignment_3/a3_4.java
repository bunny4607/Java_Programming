import java.util.Scanner ; 
class convert {
    public char CovertCase(char ch){
        char ch1 = '\0'; 
        if (ch >= 'A' && ch <= 'Z') 
            ch1=  (char)(ch +32) ; 

        else if (ch >= 'a' && ch <= 'z')
            ch1 = (char)(ch-32);

        return ch1 ; 

    }
}
public class a3_4{
    public static void main(String A[]) {
        char cValue = '\0' ; 
        char iRet = '\0'; 

        Scanner scanner = new Scanner (System.in); 

        convert cobj = new convert(); 

        System.out.println("Enter a signle character : ");
        if(!scanner.hasNext(".")){

            System.err.println("Enter single character");
            System.exit(1); 
        }
        cValue = scanner.next().charAt(0);

        iRet = cobj.CovertCase(cValue);

        System.out.println(iRet);




    }
}
///////////////////////////////////////////////////////////////////////
/*              SAMPLE OUTPUT 

Enter a signle character : 
d
D
vedantbarne@Vedants-MacBook-Air-2 Assignment_3 % java a3_4.java
Enter a signle character : 
i
I
vedantbarne@Vedants-MacBook-Air-2 Assignment_3 % java a3_4.java
Enter a signle character : 
P
p
vedantbarne@Vedants-MacBook-Air-2 Assignment_3 % 

*/
/// ///////////////////////////////////////////////////////////////////
