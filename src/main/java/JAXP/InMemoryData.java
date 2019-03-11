package JAXP;/*
Wrapper for XML samples
 */

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;

//TODO, identity possible errors
//TODO add tests
public class InMemoryData {

    public static Source getCatalogXsl() {
        //Put XSL String into StreamSource
        return new StreamSource(
                new StringReader(XSL_CATALOG));
    }

    public static Source getCatalogXml() {
        //Put XSL String into StreamSource
        return new StreamSource(
                new StringReader(XML_CATALOG));
    }

    public static Source getListXsl() {
        //Put XSL String into StreamSource
        return new StreamSource(
                new StringReader(XSL_LIST));
    }
    public static Source getListXml() {
        //Put XSL String into StreamSource
        return new StreamSource(
                new StringReader(XML_LIST));
    }

    //hard code XSL
    private static final String XSL_CATALOG =
            "<?xml version=\"1.0\"?>\n" +
                    "\n" +
                    "<xsl:stylesheet version=\"1.0\"\n" +
                    "xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\">\n" +
                    "\n" +
                    "<xsl:template match=\"/\">\n" +
                    "  <html>\n" +
                    "  <body>\n" +
                    "    <h2>My CD Collection</h2>\n" +
                    "    <table border=\"1\">\n" +
                    "      <tr bgcolor=\"#9acd32\">\n" +
                    "        <th>Title</th>\n" +
                    "        <th>Artist</th>\n" +
                    "      </tr>\n" +
                    "      <xsl:for-each select=\"catalog/cd\">\n" +
                    "        <tr>\n" +
                    "          <td><xsl:value-of select=\"title\"/></td>\n" +
                    "          <td><xsl:value-of select=\"artist\"/></td>\n" +
                    "        </tr>\n" +
                    "      </xsl:for-each>\n" +
                    "    </table>\n" +
                    "  </body>\n" +
                    "  </html>\n" +
                    "</xsl:template>\n" +
                    "\n" +
                    "</xsl:stylesheet>";

    //hard code XML
    private static final String XML_CATALOG = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<catalog>\n" +
            "\t<cd>\n" +
            "\t\t<title>Empire Burlesque</title>\n" +
            "\t\t<artist>Bob Dylan</artist>\n" +
            "\t\t<country>USA</country>\n" +
            "\t\t<company>Columbia</company>\n" +
            "\t\t<price>10.90</price>\n" +
            "\t\t<year>1985</year>\n" +
            "\t</cd>\n" +
            "\t<cd>\n" +
            "\t\t<title>Hide your heart</title>\n" +
            "\t\t<artist>Bonnie Tyler</artist>\n" +
            "\t\t<country>UK</country>\n" +
            "\t\t<company>CBS Records</company>\n" +
            "\t\t<price>9.90</price>\n" +
            "\t\t<year>1988</year>\n" +
            "\t</cd>\n" +
            "\t<cd>\n" +
            "\t\t<title>Greatest Hits</title>\n" +
            "\t\t<artist>Dolly Parton</artist>\n" +
            "\t\t<country>USA</country>\n" +
            "\t\t<company>RCA</company>\n" +
            "\t\t<price>9.90</price>\n" +
            "\t\t<year>1982</year>\n" +
            "\t</cd>\n" +
            "\t<cd>\n" +
            "\t\t<title>Still got the blues</title>\n" +
            "\t\t<artist>Gary Moore</artist>\n" +
            "\t\t<country>UK</country>\n" +
            "\t\t<company>Virgin records</company>\n" +
            "\t\t<price>10.20</price>\n" +
            "\t\t<year>1990</year>\n" +
            "\t</cd>\n" +
            "</catalog>"
            ;

    private static final String XSL_LIST =
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<xsl:stylesheet version=\"1.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\">\n" +
                    "        <xsl:template match=\"/\">\n" +
                    "    <html>\n" +
                    "    <body>\n" +
                    "    <h1>List of Items</h1>\n" +
                    "    <xsl:apply-templates/>\n" +
                    "    </body>\n" +
                    "    </html>\n" +
                    "\n" +
                    "\n" +
                    "        </xsl:template>\n" +
                    "\n" +
                    "        <xsl:template match=\"items/item\">\n" +
                    "        <br/>Name of the item:\n" +
                    "        <xsl:value-of select=\"./name\"></xsl:value-of>\n" +
                    "\n" +
                    "        </xsl:template>\n" +
                    "</xsl:stylesheet>";

    private static final String XML_LIST = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<items>\n" +
            "  <item>\n" +
            "    <id>1</id>\n" +
            "    <name>ZVHHNW73O</name>\n" +
            "  </item>\n" +
            "  <item>\n" +
            "    <id>2</id>\n" +
            "    <name>3T4HDAPOX</name>\n" +
            "  </item>\n" +
            "  <item>\n" +
            "    <id>3</id>\n" +
            "    <name>LUHQSSYMA</name>\n" +
            "  </item>\n" +
            "  <item>\n" +
            "    <id>4</id>\n" +
            "    <name>PA6H6PVJ9</name>\n" +
            "  </item>\n" +
            "</items>"
            ;
}

