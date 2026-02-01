
public class Merce {

    private String nome;
    private double prezzo;
    private int giacenza;

    public Merce(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.giacenza = 0;
    }

    public Merce(Merce a) {
        if (a != null) {
            this.nome = a.nome;
            this.prezzo = a.prezzo;
            this.giacenza = giacenza;
        } else {
            this.nome = " ";
            this.prezzo = 0;
            this.giacenza = 0;
        }
    }

    public Merce() {
        this.nome = "default";
        this.prezzo = 67;
        this.giacenza = 0;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getGiacenza() {
        return giacenza;
    }

    public void setGiacenza(int x) {
        this.giacenza = x;
    }

    public void aumentaGiacenza(int x) {
        this.giacenza += x;
    }

    public void setPrezzo(double x) {
        this.prezzo = x;
    }

    @Override

    public String toString() {
        return "la merce ha una giacenza di " + giacenza + " e : " + nome + " costa: " + prezzo + " euro ";
    }

}
