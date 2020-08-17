package nz.ac.eit.amazingtranslator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Enter a number to translate:" );
        Scanner scanner=new Scanner(System.in);
        String numberOption=scanner.nextLine();

        System.out.println("To What language (1-French, 2-German)?");
        String langOption=scanner.nextLine();
    }
}
