import eu.epfc.prm2.Array;

public class Exercice3 {
    public static int pos(Array<Note> tab , Note n){
        int i = 0;
        while(i < tab.size() && tab.get(i).compareTo(n) < 0){
            ++i;
        }
        return i;
    }

    public static void ajout(Array<Note> tab , Note n, int pos){
        tab.add(null);
        for(int i = tab.size()-1; i > pos; --i){
            tab.set(i, tab.get(i - 1));
        }
        tab.set(pos, n);
    }

    public static void ajourner(Array<Note> tab , Note n){
        int pos = pos(tab,n);
        int lg = tab.size();
        int write = 0;

        for(int read = 0; read < tab.size(); ++read){
            if( tab.get(read).compareTo(n) != 0 || tab.get(read).note > n.note ){
                tab.set(write, tab.get(read));
                ++write;
            }else{
                pos = read;
            }
        }
        tab.reduceTo(write);
        if(tab.size() < lg ){
            ajout(tab, n, pos);
        }
    }

    public static void ajouteNote(Note n,Array<Note> tab){
        int pos = -1;
        int counter = 0;
        for(int i = 0; i < tab.size(); ++i){
            if(tab.get(i).compareTo(n) == 0 ){
                ++counter;
                pos = i;
            }
        }
        if(pos == -1 || counter < 3){
            pos = pos(tab, n);
            ajout(tab, n, pos);
        }
        if(counter == 3){
           ajourner(tab,n);
        }
    }

    public static void main(String[] args) {
        Array<Note> interros = new Array<>();
        System.out.println("Au départ :\n" +interros);
        ajouteNote(new Note("Ben", 8), interros);
        System.out.println("après ajouteNote(Ben,8) :\n" +interros);
        ajouteNote(new Note("Arthur", 9), interros);
        System.out.println("après ajouteNote(Arthur,9) :\n" +interros);
        ajouteNote(new Note("Arthur", 6), interros);
        System.out.println("après ajouteNote(Arthur,6) :\n" +interros);
        ajouteNote(new Note("Arthur", 9), interros);
        System.out.println("après ajouteNote(Arthur,9) :\n" +interros);
        ajouteNote(new Note("Arthur", 5), interros);
        System.out.println("après ajouteNote(Arthur,5) :\n" +interros);
        ajouteNote(new Note("Arthur", 7), interros);
        System.out.println("après ajouteNote(Arthur,7) :\n" +interros);
        ajouteNote(new Note("Caro", 9), interros);
        System.out.println("après ajouteNote(Caro,9) :\n" + interros);
    }
}
