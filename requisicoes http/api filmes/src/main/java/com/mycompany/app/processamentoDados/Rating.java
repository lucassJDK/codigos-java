package processamentoDados;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
    
public class Rating{
    private float average;
    
    public float getAverage() {
      return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }
}