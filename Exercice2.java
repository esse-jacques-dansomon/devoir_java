import java.util.Scanner;
  /**
   * Saisir une année et un mois puis determiner le nombre de jour de ce mois dans l'année
   * 1- pas de classe de java 
   * 2- Faire avec les classes Java 
   *  */
public class Exercice2 {  

  public static void main(String[] args){

        /* SANS_FONCTION*/
        Scanner input = new Scanner(System.in);
        int annee_2, mois;
        System.out.println("Enter une année : ");
        annee_2 = input.nextInt();
        System.out.println("Enter un mois : ");
        mois = input.nextInt();

        if ((mois == 2 ) && ((annee_2 %4 == 0 && annee_2 %100 != 0 ) || (annee_2 % 400 == 0 ))) 
        {
            System.out.println("C'est le mois de février");
        }
        else{
            switch (mois)
            {
                case 1 : 
                    System.out.println("C'est le mois de Janvier");
                    break ;
                case 3 : 
                    System.out.println("C'est le mois de Mars");
                    break ;
                case 4 : 
                    System.out.println("C'est le mois de Avril");
                    break ;
                case 5 : 
                    System.out.println("C'est le mois de Mai");
                    break ;
                case 6 : 
                    System.out.println("C'est le mois de Juin");
                    break ;
                case 7 : 
                    System.out.println("C'est le mois de Juillet");
                    break ;
                case 8 : 
                    System.out.println("C'est le mois de Aout");
                    break ;
                case 9 : 
                    System.out.println("C'est le mois de Semptembre");
                    break ;
                case 10 : 
                    System.out.println("C'est le mois de Octobre");
                    break ;
                case 11 : 
                    System.out.println("C'est le mois de Novembre");
                    break ;
                case 12 : 
                    System.out.println("C'est le mois de Decembre");
                    break ;
                default :
                    System.out.println("Le mois ou l'année n'est pas valide");
            }
        }
    input.close();
  }

}
