public class exercicio03 {
    public static void main(String[] args) {
        Equacao e = new Equacao();

        e.setA(0);
        e.setB(2);
        e.setC(3);

        if(e.isEquacao()) {
            System.out.println("Delta: " + e.calcularDelta());
            e.imprimirRaizes();
        } else {
            System.out.println("Não é uma equação 2nd grau");
        }
    }
}
