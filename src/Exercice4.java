import eu.epfc.prm2.Array;

public class Exercice4 {
    public static void replaceAll(Array<Integer> tab, int oldval, int newval){
        
    }

    public static void replaceAt(Array<Integer> tab, int index, int oldval, int newval){

    }

    public static void main(String[] args) {
        Array<Integer> tab = new Array<>(1, 2, 2, 5, 2, 3);
        System.out.println("tab : " + tab);
        replaceAll(tab, 2, 4);
        System.out.println("2 remplacé par 4 : " + tab);
        replaceAll(tab, 6, 4);
        System.out.println("6 remplacé par 4 : " + tab);
    }
}
