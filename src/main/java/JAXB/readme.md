##Run Instructions
run `JasbXsl.main()` for html output or `XmlGenerator` to create an empty XML document from the objects.

##Overview
We use javax.xml.transform to create a transformer `t` that applies XSL to XML. 

Rather than transform a source directly from XML, we instead use objects and apply javax.xml.bind to convert to Source types before running `t.transform()`.

##Note
JAXB is removed from core Java (as part of EE) and the current 3.2.x version of javax.xml.bind causes a warning on compilers >Java 8. 

