/*
Enter a string :
Vedant
vedant
vedantbarne@Vedants-MacBook-Air-2 Assignment_23 % java a23_1.java
Enter a string :
Vedant BArne 04
vedant barne 04
vedantbarne@Vedants-MacBook-Air-2 Assignment_23 % java a23_1.java
Enter a string :
Marvellous Infosystems 89
marvellous infosystems 89
*/

import java.util.Scanner; 
class print{
    public void small(String sValue ){
        char arr[] = sValue.toCharArray();
        int i = 0 ; 
        for(i = 0; i <= sValue.length()-1; i++ ){

            if(
                (arr[i]>= 'A')
                &&
                (arr[i] <= 'Z')
            ){
                arr[i] = (char )(arr[i]+32);
            }

        }
        System.out.println(new String(arr));
    }
}
public class a23_1{
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in); 
        print pobj = new print(); 

        String sValue = null;
        System.out.println("Enter a string :");
        if(!scanner.hasNext("[A-Za-z0-9]+")){
            System.err.print("Invalid Input");
            System.exit(1);
        }sValue = scanner.nextLine() ; 

        pobj.small(sValue);

    }
}