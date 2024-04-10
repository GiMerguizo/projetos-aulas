public class Calculadora {
    private int num1;
    private int num2;
    private String operador;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getOperador() {
        return operador;
    }

    public void Calcular() {
        double resultado = 0;

        if (getOperador().equals("+"))
            resultado = getNum1() + getNum2();
        else if (getOperador().equals("-"))
            resultado = getNum1() - getNum2();
        else if (getOperador().equals("*"))
            resultado = getNum1() * getNum2();
        else if (getOperador().equals("/")) {
            resultado = (double) getNum1() / getNum2();
        }
        else
            resultado = -9999;

        System.out.println(resultado);
    }
}
