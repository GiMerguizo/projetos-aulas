public class Equacao {
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double calcularDelta() {
        return (b*b) - 4 * a * c;
    }

    public boolean isEquacao() {
        return a > 0;
    }

    public double calcular1aRaiz() {
        return -1*(b + Math.sqrt(calcularDelta())/ (2 * a));
    }

    public double calcular2aRaiz() {
        return -1*(b - Math.sqrt(calcularDelta())/ (2 * a));
    }

    public void imprimirRaizes() {
        if(!isEquacao()) {
            System.out.println("--- Nao e uma equacao de segundo grau!! ---");
        }
        else {
            if(calcularDelta() > 0) {
                System.out.println("Raizes: ");
                System.out.println(calcular1aRaiz());
                System.out.println(calcular2aRaiz());
            } else {
                if(calcularDelta() < 0) {
                    System.out.println("--- Não possui raiz real ---");
                } else {
                    System.out.println(calcular1aRaiz());
                }
            }
        }
    }
}

