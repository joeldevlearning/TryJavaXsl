package JAXB;
import javax.xml.bind.*;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

/*
Generate an empty XML document from catalog and cd classes
*/

public class XmlGenerator {
    public static void main(String[] args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance(Catalog.class);

        jc.generateSchema(new SchemaOutputResolver() {
            public Result createOutput(String namespaceURI, String suggestedFileName) {
                StreamResult result = new StreamResult(System.out);
                result.setSystemId(suggestedFileName);
                return result;
            }
        });
    }
}