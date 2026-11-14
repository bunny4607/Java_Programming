/*
Enter a string :
Vedant04
04



Enter a string :
Marvellous1234
1234
*/

import java.util.Scanner; 
class print{
    public void onlyNum(String sValue){
        char ch [] = sValue.toCharArray(); 
        int i = 0 ; 
        for(i = 1 ; i<= sValue.length()-1 ; i++){
            if(ch[i]>= '0' && ch[i]<= '9'){
                System.out.print(ch[i]);
            }
        }
        System.out.println();
    }
}
public class a23_4 {
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in); 
        print pobj = new print(); 
        String sValue = null ; 
        System.out.println("Enter a string :");
        if(!scanner.hasNext("[A-Za-z0-9]+")){
            System.err.print("Inalid input "); 
            System.exit(1);
        }sValue = scanner.nextLine() ; 

        pobj.onlyNum(sValue);

    }
}
