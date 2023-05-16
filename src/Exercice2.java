import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Exercice2 {
        /*
    prc   -, 1, 2, 2, 2, 3, 3, 1, 6, 4, 8, 4, 5, 7, 3, 5, 5, 2  prc = e
    e     1, 2, 2, 2, 3, 3, 1, 6, 4, 8, 4, 5, 7, 3, 5, 5, 2, 5  if(it.hasNext()) e = it.next();
    lgP   0, 1, 2, 3, 0, 0, 0, 1, 2, 3, 4, 0, 0, 0, 0, 0, 1, 0  if(e % 2 == 0) lgP = 1; res = 1; if(e % 2 == 0) ++lgP;
    res   0, 1, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4  if( lgP > res) res = lgP;
    */

    public static int lgPlusLongueSuitePair(SeqInt s){
        int res = 0;
        SeqIntIterator it = s.iterator();
        if(it.hasNext()){
            int e = it.next();
            int lgP = 0;
            if(e % 2 == 0){
                lgP = 1;
                res = lgP;
            }

            while(it.hasNext()){
                int prc = e;
                e = it.next();

                if(e % 2 == 0) ++lgP;
                else lgP = 0;
                if(res < lgP) res = lgP;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(1, 2, 2, 2, 3, 3, 3, 1, 6, 4, 8, 4, 5, 7, 3, 5, 5, 2, 5);
        System.out.print("Plus longue suite d'entiers pairs : ");
        System.out.println(lgPlusLongueSuitePair(s1));
    }
}
