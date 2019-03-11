package JAXP;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;

/*
Use Java API for XML Processing (JAXP)
Pull data from static InMemoryData or static FileData
*/

//TODO, identity possible errors
//TODO add tests
public class JaxpXsl {

    public static void main(String[] args) throws TransformerException {

        //Create transformer factory, then object wrapping XSL
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer t = tf.newTransformer(InMemoryData.getCatalogXsl());

        //run transform and push results to console
        t.transform(InMemoryData.getCatalogXml(), new StreamResult(System.out));
    }
}
