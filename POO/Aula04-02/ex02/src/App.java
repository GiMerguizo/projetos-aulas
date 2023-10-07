public class App {
    public static void main(String[] args) {
        Vinho v1 = new Vinho("Goes", "Seco", 2000, 100);
        Vinho v2 = new Vinho("Portuga", "Doce", 1990, 50);
        Vinho v3 = new Vinho("Rico", "Tinto", 1999, 1000);
        Vinho vinhoMaisVelho;

        /* if(v1.getAnoFabricacao() < v2.getAnoFabricacao()) {
            if(v1.getAnoFabricacao() < v3.getAnoFabricacao()) {
                System.out.println("Mais velho: " + v1.getAnoFabricacao());
            } else {
                System.out.println("Mais velho: " + v3.getAnoFabricacao());
            }
        } else {
            if(v2.getAnoFabricacao() < v3.getAnoFabricacao()) {
                System.out.println("Mais velho: " + v2.getAnoFabricacao());
            } else {
                System.out.println("Mais velho: " + v3.getAnoFabricacao());
            }
        } */

        /* if(v1.getPreco() > v2.getPreco()) {
            if(v1.getPreco() > v3.getPreco()) {
                System.out.println("Mais caro: " + v1.getPreco());
            } else {
                System.out.println("Mais caro: " + v3.getPreco());
            }
        } else {
            if(v2.getPreco() > v3.getPreco()) {
                System.out.println("Mais caro: " + v2.getPreco());
            } else {
                System.out.println("Mais caro: " + v3.getPreco());
            }
        } */

        System.out.println("Mais caro: ");
        if(v1.getPreco() > v2.getPreco() && v1.getPreco() > v3.getPreco()) {
            System.out.println(v1.getNome());
        } else {
            if(v2.getPreco() > v3.getPreco()) {
                System.out.println(v2.getNome());
            } else {
                System.out.println(v3.getNome());
            }
        }

        if(v1.getAnoFabricacao() < v2.getAnoFabricacao() && v1.getAnoFabricacao() < v3.getAnoFabricacao()) {
            vinhoMaisVelho = v1;
        } else {
            if(v2.getAnoFabricacao() < v3.getAnoFabricacao()) {
                vinhoMaisVelho = v2;
            } else {
                vinhoMaisVelho = v3;
            }
        }
        System.out.println("Vinho mais velho: ");
        System.out.println(vinhoMaisVelho.getNome());
    }
}
