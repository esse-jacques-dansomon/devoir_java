import java.util.Scanner;

public class Exercice1 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        /*
        * Exercice 1
        * Saisir une année qui est un entier positif puis 
        * determiner si l'année est bisextile ou pas 
        */

        int annee;
        System.out.println("Enter une année ");
        annee = input.nextInt();
        if ((annee > 0 ) && ((annee%4 == 0 &&annee% 100!= 0 ) || (annee % 400== 0 )))
        {
            System.out.println("L'année est bisextile ");
        }
        else{
            System.out.println("L'année n'est pas bisextile");
        }
        input.close();
    }
}
