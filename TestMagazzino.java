
public class TestMagazzino {

    public static void main(String[] args) {
        Merce x = new Merce("Pala", 20.00);
        Merce y = new Merce("Zappa", 34);
        Merce[] iniziali = {x, y};
        Magazzino q = new Magazzino("China", iniziali);

        System.out.println(q);
        Magazzino f = new Magazzino();
        f.aggiungiMerce("Pala", 10, 25.00);
        System.out.println(f);
        f.aggiungiMerce("Pala", 100, 25.00);
        System.out.println(f);

    }

}
