import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "result")
public class Results {
    private List<Rate> rates = new ArrayList<>();

    public Results(List<Rate> rates) {
        this.rates = rates;
    }

    public Results() {
    }

    public List<Rate> getRates() {
        return rates;
    }

    @XmlElement(name = "rate")
    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "Results{" +
                "rates=" + rates +
                '}';
    }
}
