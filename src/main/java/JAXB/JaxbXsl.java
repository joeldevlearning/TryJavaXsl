package JAXB;

import javax.xml.bind.*;
import javax.xml.bind.util.JAXBSource;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;

//TODO fix foreach output
public class JaxbXsl {

    public static void main(String[] args) throws Exception {
        // Create objects
        Cd disc1 = new Cd();
        disc1.setArtist("Bob Dylan");
        disc1.setTitle("Empire Burlesque");
        disc1.setCountry("USA");
        disc1.setCompany("Columbia");
        disc1.setPrice("10.90");
        disc1.setPrice("1985");

        Cd disc2 = new Cd();
        disc2.setArtist("John Smith");
        disc2.setTitle("Jazz and Blues Forever");

        Catalog catalog = new Catalog();
        catalog.getCds().add(disc1);
        catalog.getCds().add(disc2);

        // Create Transformer
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer(InMemoryData.getCatalogXsl());

        // Bind objects to Source
        JAXBContext jc = JAXBContext.newInstance(Catalog.class);
        JAXBSource source = new JAXBSource(jc, catalog);

        // Transform source
        transformer.transform(source, new StreamResult(System.out));
    }

}
