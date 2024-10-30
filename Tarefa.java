import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Tarefa {
    private String titulo;
    List<Etiqueta> etiquetas;
    private DataPrazo prazo;

    public Tarefa (String titulo, LocalDate prazo) {
        this.titulo = titulo;
        this.etiquetas = new ArrayList<>();
        this.prazo = new DataPrazo(prazo);
    }

    public void adicionarEtiqueta(Etiqueta etiqueta) {
        this.etiquetas.add(etiqueta);
        //Para adicionar uma etiqueta a Tarefa
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Etiquetas: " + this.etiquetas);
        System.out.println("Prazo: " + this.prazo);
    }
}