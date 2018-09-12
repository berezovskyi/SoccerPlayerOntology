package de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.classes;

import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.AssignableSubClasses;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.AssignableSubInterfaces;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.DatatypeProperty;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.DirectInterface;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.DirectSiblings;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.ImplementationClass;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.NamedIndividual;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.OntologyModelContent;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.RelationTypeCollection;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.SuperRootClasses;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.TextMention;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.interfaces.IDataType;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.interfaces.IOBIEThing;
import de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.interfaces.*;
import java.lang.NoSuchMethodException;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import java.util.Map;
import java.lang.InstantiationException;
import java.lang.SecurityException;
import java.lang.IllegalAccessException;
import java.lang.IllegalArgumentException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.apache.jena.rdf.model.ModelFactory;

/**
*
* @author hterhors
*
*
*Sep 6, 2018
*/

@NamedIndividual
@DirectSiblings(get={GoalkeeperAssociationFootball.class, FieldHockey.class, ForwardAssociationFootball.class, InsideForward.class, Midfielder.class, WingHalf.class, DefenderAssociationFootball.class, Midfield.class, })

@DirectInterface(get=IForwardAssociationFootball.class)

@SuperRootClasses(get={Position.class, })

@AssignableSubClasses(get={})
 public class ForwardAssociationFootball implements IForwardAssociationFootball{

	final static public String ONTOLOGY_NAME = "http://psink.de/scio/ForwardAssociationFootball";
	final public String annotationID;
	private Integer characterOffset;
	private Integer characterOnset;
	final static private Map<IOBIEThing, String> resourceFactory = new HashMap<>();
	final static private long serialVersionUID = 1L;
	@TextMention
final private String textMention;


	public ForwardAssociationFootball(String annotationID, String textMention){
this.annotationID = annotationID;
this.textMention = textMention;
}
	public ForwardAssociationFootball(ForwardAssociationFootball forwardAssociationFootball)throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,NoSuchMethodException, SecurityException{
this.annotationID = forwardAssociationFootball.getAnnotationID();
this.characterOffset = forwardAssociationFootball.getCharacterOffset();
this.characterOnset = forwardAssociationFootball.getCharacterOnset();
this.textMention = forwardAssociationFootball.getTextMention();
}
	public ForwardAssociationFootball(){
this.annotationID = null;
this.textMention = null;
}


	/***/
@Override
	public boolean equals(Object obj){
		if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
ForwardAssociationFootball other = (ForwardAssociationFootball) obj;
if (characterOffset == null) {
if (other.characterOffset!= null)
return false;
} else if (!characterOffset.equals(other.characterOffset))
return false;
if (characterOnset == null) {
if (other.characterOnset!= null)
return false;
} else if (!characterOnset.equals(other.characterOnset))
return false;
if (textMention == null) {
if (other.textMention!= null)
return false;
} else if (!textMention.equals(other.textMention))
return false;
if (annotationID == null) {
if (other.annotationID!= null)
return false;
} else if (!annotationID.equals(other.annotationID))
return false;
return true;
}
	/***/
@Override
	public String getAnnotationID(){
		return annotationID;}
	/***/
@Override
	public Integer getCharacterOffset(){
		return characterOffset;}
	/***/
@Override
	public Integer getCharacterOnset(){
		return characterOnset;}
	/***/
@Override
	public String getONTOLOGY_NAME(){
		return ONTOLOGY_NAME;}
	/***/
@Override
	public Model getRDFModel(String resourceIDPrefix){
		Model model = ModelFactory.createDefaultModel();
Resource group = model.createResource(getResourceName());
model.add(group, model.createProperty("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"),model.createResource(ONTOLOGY_NAME));
return model;
}
	/***/
@Override
	public String getResourceName(){
		return ONTOLOGY_NAME;}
	/***/
@Override
	public String getTextMention(){
		return textMention;}
	/***/
@Override
	public int hashCode(){
		final int prime = 31;
int result = 1;
result = prime * result + ((this.characterOffset == null) ? 0 : this.characterOffset.hashCode());
result = prime * result + ((this.characterOnset == null) ? 0 : this.characterOnset.hashCode());
result = prime * result + ((this.textMention == null) ? 0 : this.textMention.hashCode());
result = prime * result + ((this.annotationID == null) ? 0 : this.annotationID.hashCode());
return result;}
	/***/
@Override
	public boolean isEmpty(){
		boolean isEmpty = true;
return false;}
	/***/
@Override
	public void setCharacterOffset(Integer offset){
		this.characterOffset = offset;}
	/***/
@Override
	public void setCharacterOnset(Integer onset){
		this.characterOnset = onset;}


@Override
public String toString(){
return "ForwardAssociationFootball [annotationID="+annotationID+",characterOffset="+characterOffset+",characterOnset="+characterOnset+",serialVersionUID="+serialVersionUID+",textMention="+textMention+"]";}


}
