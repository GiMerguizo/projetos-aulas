public class Ponto {
    private double x;
    private double y;
    
    public Ponto() {
        x = -1;
        y = -1;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistancia(Ponto p) {
        double difX = x - p.getX();
        double difY = y - p.getY();
        double distancia = Math.sqrt(Math.pow(difX, 2) + Math.pow(difY, 2));

        return distancia;
    }

}
