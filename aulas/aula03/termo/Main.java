package aulas.aula03.termo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Termo jogo = new Termo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra de 5 letras");
        String tentativa = sc.next();
        while (!jogo.teste(tentativa).equals("🟩🟩🟩🟩🟩")){
            System.out.println(jogo.teste(tentativa));
            tentativa = sc.next();
        }
    }
}
