class Print
{
    public void displayASCII()
    {
        int iCnt = 0 ;
        char cValue = '\0' ;
        String sSymbol = null ;

        System.out.println("-------------------------------------------") ;
        System.out.printf("%-10s%-10s%-12s%-10s%n", "Symbol", "Decimal", "Hexadecimal", "Octal") ;
        System.out.println("-------------------------------------------") ;

        for(iCnt = 0 ; iCnt <= 255 ; iCnt++)
        {
            cValue = (char) iCnt ;

            if(Character.isISOControl(cValue)) sSymbol = "CTRL" ; else sSymbol = String.valueOf(cValue) ;

            System.out.printf("%-10s%-10d%-12X%-10o%n", sSymbol, iCnt, iCnt, iCnt) ;
        }

        System.out.println("-------------------------------------------") ;
    }
}

public class a26_1
{
    public static void main(String A[])
    {
        Print pobj = new Print() ;

        pobj.displayASCII() ;
    }
}

////////////////////////////////////////////////////////////////////////
//
//  Sample output
//
//  vedantbarne@Vedants-MacBook-Air-2 Assignment_26 % java a26_1.java
//
//  -------------------------------------------
//  Symbol    Decimal   Hexadecimal Octal
//  -------------------------------------------
//  CTRL      0         0           0
//  CTRL      1         1           1
//  CTRL      2         2           2
//  ....
//  CTRL      31        1F          37
//            32        20          40
//  !         33        21          41
//  "         34        22          42
//  #         35        23          43
//  ....
//  A         65        41          101
//  B         66        42          102
//  ....
//  a         97        61          141
//  b         98        62          142
//  ....
//  ~         126       7E          176
//  CTRL      127       7F          177
//  CTRL      128       80          200
//  ....
//  CTRL      159       9F          237
//            160       A0          240
//  ¡         161       A1          241
//  ....
//  þ         254       FE          376
//  ÿ         255       FF          377
//  -------------------------------------------
//  vedantbarne@Vedants-MacBook-Air-2 Assignment_26 %
//
////////////////////////////////////////////////////////////////////////