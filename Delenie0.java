import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Delenie0 {
    public static void main(String[] args) {

        try {
            int a = 3;
            int b = 3;
            int c = (a / b);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Delenie 0 nie je povolene :)");
        }


        try {
            int vek = 8;
            overVek(vek);
        }
        catch(Exception e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    static void overVek(int vek) throws Exception {
        if(vek < 18)
        {
            throw new Exception("Možno nabudúce :)");
        }
        System.out.println("Vstúp");     }
    }