import java.time.LocalDate;

public class Main{
    public static void main (String[]args){
        Etiqueta etiqueta01 = new Etiqueta ("POO");
        Tarefa tarefa01 = new Tarefa("Estudar", LocalDate.of(2007, 12, 7));

        tarefa01.adicionarEtiqueta(etiqueta01); //Agregração
        //Adiciona a Etiqueta "POO" à Tarefa "Estudar"

        tarefa01.exibirDetalhes();
    }
}