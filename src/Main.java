import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Veicolo[] veicoli = new Veicolo[2];

        veicoli[0] = new Automobile("Fiat 500", 2020, 5);
        veicoli[1] = new Moto("Yamaha R1", 2021, 998);
        System.out.println("Quanti veicoli devi inserire?");

    }
}