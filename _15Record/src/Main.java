public class Main {
    public static void main(String[] args) {

        Punto p1 = new Punto(3.0, 1.0);

        System.out.println("Stampo x: " + p1.x());

        Punto p2 = new Punto(3.0, 1.0);
        System.out.println("p2 è uguale a p1? " + p2.equals(p1));
    }
}