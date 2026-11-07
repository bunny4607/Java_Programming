import java.util.Scanner ; 


class Vowel{
    public boolean checkVowel(char ch){
        int i = 0 ;
        int iCount = 0 ; 


        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch+32);

        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        for(i = 0 ; i <= vowel.length -1 ; i++ ){

            if (ch == vowel[i]) iCount++ ; 
                
        }
        if(iCount >0) return true ; 
        else return false ;

    }
}
public class a3_5{
    public static void main(String A[]){
        char cValue = '\0'; 
        boolean iRet = false ; 

        Scanner scanner = new Scanner (System.in); 
        Vowel vobj = new Vowel(); 

        System.out.println("Enter a single character : "); 
        if(!scanner.hasNext(".")){
            System.err.println("Invalid input"); 
            System.exit(1);

        }
        cValue = scanner.next().charAt(cValue); 

        iRet = vobj.checkVowel(cValue); 

        if(iRet == true ) System.out.println("Vowel");
        else if(iRet == false) System.out.println("Not vowel");

        scanner.close();



    }
}
/*
                        Sample output 


                        
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