import java.util.*;

public class App {
    public static void main(String[] args) {
        int diaInicial, mesInicial, anoInicial, diaFinal, mesFinal, anoFinal;
        Scanner input = new Scanner(System.in);

        System.out.println("Data 1: ");
        System.out.println("Dia: ");
        diaInicial = input.nextInt();
        System.out.println("Mês: ");
        mesInicial = input.nextInt();
        System.out.println("Ano: ");
        anoInicial = input.nextInt();

        System.out.println("Data 2: ");
        System.out.println("Dia: ");
        diaFinal = input.nextInt();
        System.out.println("Mês: ");
        mesFinal = input.nextInt();
        System.out.println("Ano: ");
        anoFinal = input.nextInt();

        System.out.println("Data 1: " + diaInicial + "/" + mesInicial + "/" + anoInicial);
        System.out.println("Data 2: " + diaFinal + "/" + mesFinal + "/" + anoFinal);

        if(anoInicial > anoFinal) {
            System.out.println("A Data 2 é maior.");
        }
        else {
            if (anoFinal > anoInicial) {
                System.out.println("A Data 1 é maior.");
            }
            else {
                if (mesInicial > mesFinal) {
                    System.out.println("A Data 2 é maior.");
                }
                else 
                { 
                    if (mesFinal > mesInicial) {
                        System.out.println("Data 1 é maior");
                    }
                    else {
                        if (diaInicial > diaFinal) {
                            System.out.println("Data 2 é maior");
                        }
                        else {
                            if (diaFinal > diaInicial) {
                                System.out.println("Data 1 maior");
                            }
                            else {
                                System.out.println("As datas são iguais!");
                            }
                        }
                    }
                }
            }
        }
    }
        
}
