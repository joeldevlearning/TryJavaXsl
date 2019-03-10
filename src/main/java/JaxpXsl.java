import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

/*
Use Java API for XML Processing, JAXP
Pull data from static SampleData
*/

public class JaxpXsl {

    public static void main(String[] args) throws TransformerException {

        //Pull sample data
        String xml = SampleData.getXslCatalog();
        String xsl = SampleData.getXslCatalog();

        //1, Put XSL String into StreamSource
        Source xslSrc = new StreamSource(
                new StringReader(xsl));

        //2, Create transformer factory, then object wrapping XSL
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer t = tf.newTransformer(xslSrc);

        //3, Put XML String into StreamSource
        Source xmlSrc = new StreamSource(
                new StringReader(xml));

        t.transform(xmlSrc, new StreamResult(System.out));
    }
}
