public class Note {
    public String nomEtud;
    public double note;

    public Note(String nomEtud, double note) {
        this.nomEtud = nomEtud;
        this.note = note;
    }

    public int compareTo(Note other) {
        return nomEtud.compareToIgnoreCase(other.nomEtud);
    }
    @Override
    public String toString() {
        return nomEtud + " : " + note;
    }
}
