import java.time.LocalDate;

public class DataPrazo {
    private LocalDate prazo;

    public DataPrazo(LocalDate prazo){
        this.prazo = prazo;        
    }

    public LocalDate getPrazo(){
        return this.prazo;
    }
}