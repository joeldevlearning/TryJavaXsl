package JAXP;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

/*
Use Java API for XML Processing, JAXP
Pull data from static JAXP.SampleData
*/

public class JaxpXsl {

    public static void main(String[] args) throws TransformerException {

        //Pull sample data
        String xml = SampleData.getCatalog(Doc.XML);
        String xsl = SampleData.getCatalog(Doc.XSL);

        //Put XSL String into StreamSource
        Source xslSrc = new StreamSource(
                new StringReader(xsl));

        //Create transformer factory, then object wrapping XSL
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer t = tf.newTransformer(xslSrc);

        //Put XML String into StreamSource
        Source xmlSrc = new StreamSource(
                new StringReader(xml));

        //run transform and push results to console
        t.transform(xmlSrc, new StreamResult(System.out));
    }
}
