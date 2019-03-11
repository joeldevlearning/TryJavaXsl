##Run Instructions
run JaspXsl.main()

##Overview
We use javax.xml.transform to create a transformer `t` that applies XSL to XML. We convert these to Source types before running `t.transform()`.

###In-Memory Example
Both XML and XSL comes from in-memory strings (SampleData). We use StringReader to feed the stringers into StreamSource().

We push output to `System.out`.

###File Example
Both XML and XSL come from files (SampleData). 

We push output to `System.out`.