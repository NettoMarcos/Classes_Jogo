import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do Heroi: ");
        String name = sc.next();
        System.out.print("Digite a idade do Heroi: ");
        int age = sc.nextInt();
        int nClass = 0;
        String tipe = "";
        while (nClass < 1 || nClass > 4) {
            System.out.println("===========================");
            System.out.println("Classes: ");
            System.out.println("[1]-Guerreiro");
            System.out.println("[2]-Mago");
            System.out.println("[3]-Monge");
            System.out.println("[4]-Ninja");
            System.out.print("Escolha a classe do heroi: ");
            System.out.println("===========================");
            nClass = sc.nextInt();
            switch (nClass) {
                case 1:
                    tipe = "Guerreiro";
                    break;
                case 2:
                    tipe = "Mago";
                    break;
                case 3:
                    tipe = "Monge";
                    break;
                case 4:
                    tipe = "Ninja";
                    break;
                default:
                    System.out.println("A opção escolhida não é valida, escolha novamente!");
                    break;

            }
        }

        Hero hero = new Hero(name, age, tipe);

        int x;
        do {
            int atackOrRum = 0;
            while(atackOrRum != 1 && atackOrRum != 2 ) {
                System.out.print("Atacar [1]-Sim // [2]- Correr: ");
                atackOrRum = sc.nextInt();
            }

            if (atackOrRum == 1) {
                System.out.println();
                System.out.println("===============");
                System.out.println(hero);
                System.out.println("===============");
                System.out.println();
                x = 1;
            } else {
                System.out.println("Você saiu correndo!");
                x = 2;
            }
        } while (x == 1);

        sc.close();
    }
}
