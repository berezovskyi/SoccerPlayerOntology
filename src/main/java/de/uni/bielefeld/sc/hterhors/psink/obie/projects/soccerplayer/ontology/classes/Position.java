package de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.classes;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;

import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.AssignableSubClasses;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.DirectInterface;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.DirectSiblings;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.SuperRootClasses;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.TextMention;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.interfaces.IOBIEThing;
import de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.interfaces.IPosition;
import de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.interfaces.ISoccerPlayerThing;

/**
 *
 * @author hterhors
 *
 *
 *         Sep 6, 2018
 */

@SuperRootClasses(get = { Position.class, })

@DirectInterface(get = IPosition.class)

@DirectSiblings(get = {})

@AssignableSubClasses(get = { GoalkeeperAssociationFootball.class, FieldHockey.class, ForwardAssociationFootball.class,
		InsideForward.class, Midfielder.class, WingHalf.class, DefenderAssociationFootball.class, Midfield.class, })
public class Position implements IPosition {

	final static public String ONTOLOGY_NAME = "http://psink.de/dbpedia/Position";
	final public String annotationID;
	private Integer characterOffset;
	private Integer characterOnset;
	final static private Map<IOBIEThing, String> resourceFactory = new HashMap<>();
	final static private long serialVersionUID = 1L;
	@TextMention
	final private String textMention;

	public Position() {
		this.annotationID = null;
		this.textMention = null;
	}

	public Position(String annotationID, String textMention) {
		this.annotationID = annotationID;
		this.textMention = textMention;
	}

	public Position(Position position) throws InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		this.annotationID = position.getAnnotationID();
		this.characterOffset = position.getCharacterOffset();
		this.characterOnset = position.getCharacterOnset();
		this.textMention = position.getTextMention();
	}

	/***/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (characterOffset == null) {
			if (other.characterOffset != null)
				return false;
		} else if (!characterOffset.equals(other.characterOffset))
			return false;
		if (characterOnset == null) {
			if (other.characterOnset != null)
				return false;
		} else if (!characterOnset.equals(other.characterOnset))
			return false;
		if (textMention == null) {
			if (other.textMention != null)
				return false;
		} else if (!textMention.equals(other.textMention))
			return false;
		if (annotationID == null) {
			if (other.annotationID != null)
				return false;
		} else if (!annotationID.equals(other.annotationID))
			return false;
		return true;
	}

	/***/
	@Override
	public String getAnnotationID() {
		return annotationID;
	}

	/***/
	@Override
	public Integer getCharacterOffset() {
		return characterOffset;
	}

	/***/
	@Override
	public Integer getCharacterOnset() {
		return characterOnset;
	}

	/***/
	@Override
	public String getONTOLOGY_NAME() {
		return ONTOLOGY_NAME;
	}

	/***/
	@Override
	public Model getRDFModel(String resourceIDPrefix) {
		Model model = ModelFactory.createDefaultModel();
		Resource group = model.createResource(getResourceName());
		model.add(group, model.createProperty("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"),
				model.createResource(ONTOLOGY_NAME));
		return model;
	}

	/***/
	@Override
	public String getResourceName() {
		if (resourceFactory.containsKey(this)) {
			return ISoccerPlayerThing.RDF_MODEL_NAMESPACE + resourceFactory.get(this);
		} else {
			final String resourceName = getClass().getSimpleName() + "_" + resourceFactory.size();
			resourceFactory.put(this, resourceName);
			return ISoccerPlayerThing.RDF_MODEL_NAMESPACE + resourceName;
		}
	}

	/***/
	@Override
	public String getTextMention() {
		return textMention;
	}

	/***/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.characterOffset == null) ? 0 : this.characterOffset.hashCode());
		result = prime * result + ((this.characterOnset == null) ? 0 : this.characterOnset.hashCode());
		result = prime * result + ((this.textMention == null) ? 0 : this.textMention.hashCode());
		result = prime * result + ((this.annotationID == null) ? 0 : this.annotationID.hashCode());
		return result;
	}

	/***/
	@Override
	public boolean isEmpty() {
		boolean isEmpty = true;
		return false;
	}

	/***/
	@Override
	public void setCharacterOffset(Integer offset) {
		this.characterOffset = offset;
	}

	/***/
	@Override
	public void setCharacterOnset(Integer onset) {
		this.characterOnset = onset;
	}

	@Override
	public String toString() {
		return "Position [annotationID=" + annotationID + ",characterOffset=" + characterOffset + ",characterOnset="
				+ characterOnset + ",serialVersionUID=" + serialVersionUID + ",textMention=" + textMention + "]";
	}

}
