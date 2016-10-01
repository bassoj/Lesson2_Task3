import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "query")
public class Query {
    private Results results;

    public Query() {
    }

    public Query(Results results) {
        this.results = results;
    }

    public Results getResults() {
        return results;
    }

    @XmlElement(name = "results")
    public void setResults(Results results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Query{" +
                "results=" + results +
                '}';
    }
}
