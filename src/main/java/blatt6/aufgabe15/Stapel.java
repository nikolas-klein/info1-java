package blatt6.aufgabe15;

public class Stapel<T> {

    private Knoten<T> kopf;

    public boolean isEmpty() {
        return kopf == null;
    }

    public T pop() throws StackIstLeerException{
        if (this.isEmpty()) {
            throw new StackIstLeerException("Stapel ist leer!");
        }
        T inhalt = kopf.inhalt;
        kopf = kopf.naechster;
        return inhalt;
    }

    public void push(T item) {
        kopf = new Knoten<T>(item, kopf);
    }

    public T peek() throws StackIstLeerException{
        if (this.isEmpty()) {
            throw new StackIstLeerException("Stapel ist leer!");
        }
        return kopf.inhalt;
    }

    public void reverse() {
        Knoten<T> alterKopf = kopf;
        kopf = null;
        while (alterKopf != null) {
            T item = alterKopf.inhalt;
            alterKopf = alterKopf.naechster;
            this.push(item);
        }
    }

    public void reverse2(){
        Stapel<T> tempStapel = new Stapel<>();
        while(!this.isEmpty()) {
            tempStapel.push(kopf.inhalt);
            kopf = kopf.naechster;
        }
        kopf = tempStapel.kopf;
    }

    private class Knoten<T>{
        Knoten<T> naechster;
        T inhalt;

        public Knoten(T inhalt, Knoten<T> naechster) {
            this.inhalt = inhalt;
            this.naechster = naechster;
        }
    }
}
