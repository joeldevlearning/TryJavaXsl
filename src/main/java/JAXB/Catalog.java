package JAXB;
import java.util.*;
import javax.xml.bind.annotation.*;

@XmlRootElement
public class Catalog {

        private List<Cd> cds = new ArrayList<Cd>();

        @XmlElement(name="catalog")
        public List<Cd> getCds() {
            return cds;
        }

}
