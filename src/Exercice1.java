import java.util.Scanner;

public class Exercice1 {
    public static int saisieLargeur(int min){
        Scanner sc = new Scanner(System.in);
        int lg = min;
        if(min % 2 != 0){
            System.out.print("Entrez une largeur impaire plus grande que "+min+" : ");
            lg = sc.nextInt();
            while(lg % 2 == 0 || lg <= min){
                System.out.print("Erreur ! Entrez une largeur impaire plus grande que "+min+" : ");
                lg = sc.nextInt();
            }


        }else{
            System.out.print("Entrez une largeur paire plus grande que "+min+" : ");
            lg = sc.nextInt();
            while(lg % 2 != 0 || lg <= min){
                System.out.print("Erreur ! Entrez une largeur paire plus grande que "+min+" : ");
                lg = sc.nextInt();
            }
        }
        return lg;
    }

    public static void afficheTexteCadre(String texte, int lg){
        for(int i = 0; i < lg; ++i){
            if(i == 0 || i == lg - 1) System.out.print("+");
            else System.out.print("-");
        }

        System.out.println();

        for(int j = 0; j < lg; ++j){
            if(j == 0 || j == lg - 1) System.out.print("|");
            else if(j < ((lg) - texte.length())/2 || j >= ((lg) - texte.length())/2 + texte.length()) {
                System.out.print(" ");
            }else if(j == ((lg) - texte.length())/2){
                for (int pos = 0; pos < texte.length(); ++pos) {
                    System.out.print(texte.charAt(pos));
                }
            }

        }

        System.out.println();

        for(int k = 0; k < lg; ++k){
            if(k == 0 || k == lg - 1) System.out.print("+");
            else System.out.print("-");
        }
    }

    public static String saisieTexte() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduisez le texte à encadrer : ");
        return scan.nextLine();
    }
    public static void main(String[] args) {
        String texte = saisieTexte();
        int lg = saisieLargeur(texte.length() + 2);
        afficheTexteCadre(texte, lg);
    }
}
