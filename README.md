# SoccerPlayerOntology
Simple example ontology for the SoccerPlayerOBIE Project (Generated with OWL2JavaBinary)

This project contains the soccer player ontology in OWL and java binary format. 
The ontology is used in the OBIEMachineLearningFramework for information extraction from the soccer player corpus. 

The java binaries were generated with the OWL2JavaBinary-Tool.  


This ontology describes a SoccerPlayer with 4 properties. Classes and proeprties are derived from the dbpedia-ontology / dbpedia infobox data and wikipedia pagelink data. 
####
NOTE: the namespace is actually not existance and just serves as an example!
####

The main class of this ontology is SoccerPlayer. 
A SoccerPlayer is described by 4 properties:

1:1 DatatypeProperty hasBirthYear -- that takes "arbitrary" Strings as slot filler.
1:n ObjectProperty hasTeam -- that takes n classes (individuals) of rdf:type / owl:subclass **Team**  as slot filler. 
1:n ObjectProperty hasBirthPlace -- that takes n classes (individuals) of rdf:type / owl:subclass **BirthPlace** as slot filler
1:1 ObjectProperty hasPosition -- that takes a classes (individuals) of rdf:type / owl:subclass **Position** as slot filler


As this ontology serves as an example, it contains only classes / individuals that exists in the corresponding data set (See SoccerPlayerOBIEProject). 

Example SoccerPlayer:

	<owl:Class rdf:about="http://psink.de/dbpedia/SadokSassi"> 
		<rdfs:subClassOf rdf:resource="http://psink.de/dbpedia/SoccerPlayer"/>
	</owl:Class>
  
  
Example BirthPlace:

	<owl:NamedIndividual rdf:about="http://psink.de/dbpedia/Turin"><rdf:type rdf:resource="http://psink.de/dbpedia/BirthPlace"/></owl:NamedIndividual>


Example Team:

	<owl:NamedIndividual rdf:about="http://psink.de/dbpedia/DagenhamRedbridgeFC"><rdf:type rdf:resource="http://psink.de/dbpedia/Team"/></owl:NamedIndividual>


For OBIE-Ontology specifications and rules see OWLToJavaBin project on github.

  
  
