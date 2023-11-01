import java.util.Date;

public class Compromisso {
    private String assunto;
    private String local;
    private Date data;
    public Compromisso(String assunto, String local, Date data) {
        this.assunto = assunto;
        this.local = local;
        this.data = data;
    }

    public String toString() {
        return "Assunto: " + this.assunto + 
               ", Local: " + this.local +
               ", Data: " + this.data + 
               "."; 
    }
}
