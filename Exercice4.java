import java.util.Scanner;
/**
 * Exercice 4
  *  Saisir une date puis determiner la date suivante puis la date precedente 
  *  1- pas de classe de java 
  *  2- Faire avec les classes Java 
 */
public class Exercice4 {
    public static void main(String[] args)
    {
    int annee, mois, jour ;
    int annee_pre, mois_pre, jour_pre;
    int annee_suiv, mois_suiv, jour_suiv;
    annee_pre = mois_pre = jour_pre = 0 ;
    annee_suiv = mois_suiv = jour_suiv = 0 ;

    Scanner sc = new Scanner(System.in);
    System.out.print("Entrer l'année : ");
    annee = sc.nextInt();

    System.out.print("Entrer le mois : ");
    mois = sc.nextInt();

    System.out.print("Entrer le jour : ");
    jour = sc.nextInt();
    sc.close();

    if ((mois == 2 ) && ((annee%4 == 0 &&annee% 100!= 0 ) || (annee % 400 == 0 ))){
        if ( jour == 29 ){
            mois_suiv = mois + 1 ;
            jour_suiv = 1;
            mois_pre = mois;
            jour_pre = jour - 1 ;
            annee_pre = annee_suiv = annee;
        }
        else{
            mois_suiv = mois ;
            jour_suiv = jour + 1;
            mois_pre = mois;
            jour_pre = jour -1 ;
            annee_pre = annee_suiv = annee;
        }

    }else if(mois == 3 && jour == 1)
    {
        mois_suiv = mois ;
        jour_suiv = jour +1;
        mois_pre = mois-1;
        annee_pre = annee_suiv = annee;
        if ((annee % 4 == 0 && annee% 100!= 0 ) || (annee % 400 == 0 )){
            jour_pre = 29;
        }
        else {
            jour_pre = 28;
        }

    }
    else if(mois == 2)
    {
        if ( jour == 28 ){
            mois_suiv = mois + 1 ;
            jour_suiv = 1;
            mois_pre = mois;
            jour_pre = jour-1 ;
            annee_pre = annee_suiv = annee;
        }
        else{
            mois_suiv = mois ;
            jour_suiv = jour + 1;
            mois_pre = mois;
            jour_pre = jour -1 ;
            annee_pre = annee_suiv = annee;
        }
    }else if(mois == 12 )
    {
        if ( jour == 31 ){
            annee_suiv = annee + 1 ;
            mois_suiv = 1 ;
            jour_suiv = 1;
            mois_pre = mois;
            jour_pre = jour - 1 ;
            annee_pre = annee_suiv = annee;
        }
        else{
            mois_suiv = mois ;
            jour_suiv = jour + 1;
            mois_pre = mois;
            jour_pre = jour -1 ;
            annee_pre = annee_suiv = annee;
        }
    }
    else{
        int mois31[] = {1,3,5,7,8,10};
        int mois30[] = {4,6,9,11};
        for(int element:mois31 )
        {
            if (mois==element )
            {
                if(jour == 31 )
                {
                    mois_suiv = mois + 1 ;
                    jour_suiv = 1;
                    mois_pre = mois;
                    jour_pre = jour - 1 ;
                    annee_pre = annee_suiv = annee;
                }
                else if (jour == 1 )
                {
                    mois_suiv = mois  ;
                    jour_suiv = jour + 1;
                    mois_pre = mois -1 ;
                    jour_pre = 30 ;
                    annee_pre = annee_suiv = annee;
                }
                else
                {
                    mois_suiv = mois ;
                    jour_suiv = jour + 1;
                    mois_pre = mois;
                    jour_pre = jour -1 ;
                    annee_pre = annee_suiv = annee;
                }

            }

        }
        for(int element:mois30 )
        {
            if (mois==element )
            {
                if(jour == 30 )
                {
                    mois_suiv = mois + 1 ;
                    jour_suiv = 1;
                    mois_pre = mois;
                    jour_pre = jour - 1 ;
                    annee_pre = annee_suiv = annee;
                }
                else if (jour == 1 )
                {
                    mois_suiv = mois  ;
                    jour_suiv = jour + 1;
                    mois_pre = mois - 1 ;
                    jour_pre = 31 ;
                    annee_pre = annee_suiv = annee;
                }
                else
                {
                    mois_suiv = mois ;
                    jour_suiv = jour + 1;
                    mois_pre = mois;
                    jour_pre = jour -1 ;
                    annee_pre = annee_suiv = annee;
                }

            }

        }

    }
    System.out.println("La date d'ajourd'hui est  : " + jour + "/"+ mois + "/"+ annee);
    System.out.println("La date precedante est    : " + jour_pre + "/"+ mois_pre + "/"+ annee_pre);
    System.out.println("La date suivante est      : " + jour_suiv + "/"+ mois_suiv + "/"+ annee_suiv);
    
} 
}
