package JAXP;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

/*
Note: For simplicity, we include the XML and XSL files with the project.
To do this, we add the resources folder in this project directly to the classpath.
To do this in Intellij...
    1) Go to: Project Structure | Modules | Your Module | Dependencies
    2) Click Add, Single-Entry Module Library, specify the path to the "resources" folder.
*/

//TODO, identity possible errors
//TODO add tests
public class FileData {
    public static Source getCatalogXsl() {
        return new StreamSource(new File("transform_catalog.xsl"));
    }

    public static Source getCatalogXml() {
        return new StreamSource(new File("catalog.xml"));
    }

    public Source getListXsl() {
        return new StreamSource(new File("list.xsl"));
    }

    public Source getListXml() {
        return new StreamSource(new File("list.xml"));
    }
}
