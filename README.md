# SoccerPlayerOntology
Simple example ontology for the SoccerPlayerOBIE Project (Generated with OWL2JavaBinary)

**NOTE** This project is still under heavy development!

**Dependencies**
You need the following dependent projects:

1)  OBIECore https://github.com/hterhors/OBIECore

**Related Projects, Implementations / Examples**
1) OWL2JavaBin https://github.com/hterhors/OWL2JavaBin is a tool taht can be used to convert ontologies written in OWL into java binaries which are used in the OBIE-ML-Framework.
3) SoccerPlayerOBIEProject https://github.com/hterhors/SoccerPlayerOBIEProject is a project that works with the generated SoccerPalyerOntology. It contains example source code for
  i) the information extraction task using the OBIE MachineLearningFramework (incl. template / feature generation), 
  ii) how to convert an OWL to java binaries. 
  It further, contains an examplary annotated data set that was automatically generated from Wikipedia/dbpedia data using the DBPediaDatasetExtraction project.
4)  OBIECore https://github.com/hterhors/OBIECore contains core source code for all OBIE-related projects. 

**Description**

This project contains the soccer player ontology in **OWL** and **java binary** format. 
The ontology is used in the OBIEMachineLearningFramework for information extraction (slot-filling) from the soccer player data set provided in the SoccerPlayerOBIEProject. 

**The java binaries in this project are automatically generated with the OWL2JavaBin and must not be modified!**

This ontology describes a soccer player with 4 properties. Classes and properties are (semi-manually) derived from the dbpedia-ontology / dbpedia-infobox data and wikipedia-pagelink data. 

**###
NOTE: The namespace is actually not existent and just serves as an example!
####**

The main class of this ontology is *SoccerPlayer*. 
A soccer player is described by 4 properties:

1)	1:1 DatatypeProperty hasBirthYear -- that takes "arbitrary" Strings as slot filler.
2)	1:n ObjectProperty hasTeam -- that takes *n* classes (individuals) of rdf:type / owl:subclass **Team**  as slot filler. 
3)	1:n ObjectProperty hasBirthPlace -- that takes *n* classes (individuals) of rdf:type / owl:subclass **BirthPlace** as slot filler
4)	1:1 ObjectProperty hasPosition -- that takes a classes (individuals) of rdf:type / owl:subclass **Position** as slot filler

**NOTE: This ontology serves as an example, it contains only classes / individuals that exists in the corresponding data set (cf. SoccerPlayerOBIEProject)**


**OWL-Ontology Examples**

Example *SoccerPlayer*:

	<owl:Class rdf:about="http://psink.de/dbpedia/SadokSassi"> 
		<rdfs:subClassOf rdf:resource="http://psink.de/dbpedia/SoccerPlayer"/>
	</owl:Class>
  
  
Example *BirthPlace*:

	<owl:NamedIndividual rdf:about="http://psink.de/dbpedia/Turin"><rdf:type rdf:resource="http://psink.de/dbpedia/BirthPlace"/></owl:NamedIndividual>


Example *Team*:

	<owl:NamedIndividual rdf:about="http://psink.de/dbpedia/DagenhamRedbridgeFC"><rdf:type rdf:resource="http://psink.de/dbpedia/Team"/></owl:NamedIndividual>


**Java-binary Examples**

Each class that is generated comes with a corresponding interface:

SoccerPlayer: https://github.com/hterhors/SoccerPlayerOntology/blob/master/src/de/uni/bielefeld/sc/hterhors/psink/obie/projects/soccerplayer/ontology/classes/SoccerPlayer.java

Each class contains setter adder and getter for their properties as defined by the ontology.
You can simple instantiate a *SoccerPlayer* and add properties e.g. the BirthYear "1940" to it with:

<code>
new SoccerPlayer().setBirthYear(new BirthYear("1940"));
</code>

Each class contains further information about the position in a document that can be addressed by getter and setter:

<code>
new SoccerPlayer().setBirthYear(new BirthYear("1940").setOffset(7334));
</code>

ISoccerPlayer: 
https://github.com/hterhors/SoccerPlayerOntology/blob/master/src/de/uni/bielefeld/sc/hterhors/psink/obie/projects/soccerplayer/ontology/interfaces/ISoccerPlayer.java

The interface is mainly used in the ontology based information extraction machine learning framework.


**Perks**

1)	Evaluation: 
You can simply use evaluation measurements for arbitrary complex classes that are provided in the OBIE-ML-Framework to compare two instantiations of OBIE-classes. E.g:
<code>
CartesianSearchEvaluator ev = new CartesianSearchEvaluator(false, -1, true,
				InvestigationRestriction.noRestrictionInstance, 100, false);
evv.f1(gold, prediction);
</code>

2)	Export to RDF: You can simply export filled java classes to RDF by calling the *getRDFModel()* - method.


