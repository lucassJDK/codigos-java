package processamentoDados;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReceberDadosFilme{
   private Show show;

  public Show getShow() {
      return show;
  }

    public void setShow(Show show) {
        this.show = show;
    }
}