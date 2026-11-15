/*
Enter a char :
m
m	n	o	p	q	r	s	t	u	vw	x	y	z	%  


Enter a char :


L
L	M	N	O	P	Q	R	S	T	UV	W	X	Y	Z	%  


*/

import java.util.Scanner; 
class print {

    public void print (char ch ) {
        char c = '\0'; 

        if(ch>='A' && ch <= 'Z'){
            for(c = ch; c <= 'Z'; c++){
                System.out.print(c+"\t");
            }
        }
        else if(ch>='a' && ch <= 'z'){
            for(c = ch; c <= 'z'; c++){
                System.out.print(c+"\t");
            }
        }
    }
}
public class a26_3 {
    public static void main(String A[]){
        Scanner scanner = new Scanner (System.in);
        print pobj = new print()  ;

        char ch = '\0' ; 

        System.out.println("Enter a char :");
        if(!scanner.hasNext("[A-Za-z]+")){
            System.err.print("Invaid input ") ;
            System.exit(1);

        }
        ch = scanner.nextLine().charAt(0);

        pobj.print(ch);
    }   

}