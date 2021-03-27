
/* Exercice 5

  Saisir une serie de N nombres positif puis determinez la valeur
    1- La valeur min et la valeur max 
    2- les 2 valeurs min et les deux valeurs max
    3- La somme des valeurs premieres
    4- le produit des valeurs parfaites
    5- La valeur min premier et la valeur max parfaite  */ 
import java.util.Scanner;
public class Exercice5 {
    public static void main(String[] args ){
    /** maxi */
    int N, i =  0;
    int max =0 ;
    int max1 = 0;
    int max2 = 0;
    int min = 0;
    int min1 = 0;
    int min2 = 0;
    int somme = 0;
    int produit=1;
    Scanner input = new Scanner(System.in);
    System.out.print("Combien de nombre positive vous voulez entrer ? ");
    N = input.nextInt();
    int nombresPositifs[] = new int[N];
    while(i < N)
    {
        System.out.print("Valeur de la cellule : " + i +" : ");
        nombresPositifs[i] = input.nextInt();
        while (nombresPositifs[i] < 0)
        {
            System.out.println("Une valeur positive");
            System.out.print("Valeur de la cellule : " + i +" : ");
            nombresPositifs[i] = input.nextInt();
        }
        i++;
    }
    
    for ( int j =0;j<N ;j++)
    {   
        System.out.println("nombresPositifs["+j+"] = " + nombresPositifs[j]);

    }
    /*maxi et min */ 
    for ( int j =0;j<N ;j++)
    {   
        if (j==0)
        {
            max = max1=max2=nombresPositifs[0];
            min = min1=min2=nombresPositifs[0];

        }
        else
        {
            if (nombresPositifs[j] > max ){
                max1 = max2;
                max2 = max;
                max = nombresPositifs[j];
            }else{
                if (nombresPositifs[j]>max2)
                {
                    max1 = max2;
                    max2 = nombresPositifs[j] ;   
                }
            }


            if (nombresPositifs[j] < min ){
                min1=min2;
                min2 = min;
                min = nombresPositifs[j];
            }else{
                if (nombresPositifs[j] < min2)
                {
                    min1 = min2;
                    min2 = nombresPositifs[j] ;   
                }
            }

        }

    }
    System.out.println("max le plus grand : "+max+"   max3 : "+max1+"  max2 : "+max2);
    System.out.println("Minimum : "+min+"  minimum3 : "+min1+"  minimum2 : "+min2);
    /* somme des nombre 1er*/ 
    int s=0;
    for ( int j =2;j<N ;j++){
        s = 2;
        for (int v=2; v < nombresPositifs[j]; v++){
            if(nombresPositifs[j] % v == 0){
                s++;
                break;
            }
        }
        if ((s==2) || (nombresPositifs[j]==1 )){
            somme = somme + nombresPositifs[j];
        }

    }
    System.out.println("Somme des nombres premier est : " + somme);
    for (int element:nombresPositifs){
        int s2=0;
        for (int z=1 ;z < (element/2);z++ ){
            if (element%z==0){
                s2 += z;
            }
        }
        if (s2 == element){
            produit  =produit * element;
        }
    }
    System.out.println("Le produit des nombre parfait est est : "+ produit);
    input.close(); 
    
   
}
}
