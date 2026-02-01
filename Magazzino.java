
public class Magazzino {

    private Merce oggetti[];
    private String nome;
    private final static int MAX_CAPIENZA = 60;

    public Magazzino() {
        this.nome = "stock";
        oggetti = new Merce[MAX_CAPIENZA];
    }

    public Magazzino(String nome, Merce oggetti[]) {
        this.nome = nome;
        this.oggetti = new Merce[MAX_CAPIENZA];

        if (oggetti != null) {
            for (int i = 0; i < oggetti.length && i < MAX_CAPIENZA; i++) {
                if (oggetti[i] != null) {
                    this.oggetti[i] = new Merce(oggetti[i]);

                }
            }
        }
    }

    public void aggiungiMerce(String nome, int quantita, double prezzo) {
        for (int i = 0; i < oggetti.length; i++) {
            if (oggetti[i] != null && oggetti[i].getNome().equals(nome)) {
                oggetti[i].aumentaGiacenza(quantita);
                return;
            }

        }

        for (int i = 0; i < oggetti.length; i++) {
            if (oggetti[i] == null) {
                oggetti[i] = new Merce(nome, prezzo);
                oggetti[i].setGiacenza(quantita);
                return;
            }

        }
    }

    @Override
    public String toString() {
        String s = "il magazzino contiene: " + MAX_CAPIENZA + " Posti . \n";
        for (int i = 0; i < oggetti.length; i++) {
            if (oggetti[i] != null) {
                s += oggetti[i].toString() + "\n";
            } else {
                s += "posto vuoto \n";
            }
        }

        return s;
    }
}
