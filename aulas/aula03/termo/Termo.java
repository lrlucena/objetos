package aulas.aula03.termo;

public class Termo {
    private String palavra;
    private int tentativas;

    public Termo() {
        this.palavra = "MANHA";
        this.tentativas = 0;
    }

    private boolean invalida(String tentativa) {
        return tentativa.length() != 5;
    }

    public String teste(String tentativa){
        tentativa = tentativa.toUpperCase();
        if (invalida(tentativa)) {
            return "     ";
        }
        String blocos = "";
        for (int i=0; i<5; i++){
            if (tentativa.charAt(i) == palavra.charAt(i)){
                blocos = blocos + "🟩";
            } else if (palavra.contains(""+tentativa.charAt(i))) {
                blocos = blocos + "🟨";
            } else {
                blocos = blocos + "⬛";
            }
        }
        tentativas++;
        return blocos;
    }
}
