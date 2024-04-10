import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dia1, mes1, ano1, dia2, mes2, ano2;
        Scanner input = new Scanner(System.in);

        System.out.println("Formato: (dd/mm/aaaa)\n");
        System.out.println("Dia 1: ");
        dia1 = input.nextInt();
        System.out.println("Mês 1: ");
        mes1 = input.nextInt();
        System.out.println("Ano 1: ");
        ano1 = input.nextInt();

        System.out.println("Dia 2: ");
        dia2 = input.nextInt();
        System.out.println("Mês 2: ");
        mes2 = input.nextInt();
        System.out.println("Ano 2: ");
        ano2 = input.nextInt();

        System.out.println("Dia 1: " + dia1 + "/" + mes1 + "/" + ano1);
        System.out.println("Dia 2: " + dia2 + "/" + mes2 + "/" + ano2);

        if (ano1 > ano2)
            System.out.println("A data 2 é maior.");
        else
            if (ano1 < ano2)
                System.out.println("A data 1 é maior.");
            else
                if (mes1 > mes2)
                    System.out.println("A data 2 é maior.");
                else
                    if (mes1 < mes2)
                        System.out.println("A data 1 é maior.");
                    else
                        if (dia1 > dia2)
                            System.out.println("A data 2 é maior.");
                        else
                            if (dia2 > dia1)
                                System.out.println("A data 1 é maior.");
                            else
                                System.out.println("As duas datas são iguais.");
    }
}