package de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.interfaces;

import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.AssignableSubInterfaces;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.DatatypeProperty;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.ImplementationClass;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.interfaces.IDataType;
import de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.classes.BirthYear;

/**
 *
 * @author hterhors
 *
 *
 *         Sep 6, 2018
 */

@DatatypeProperty
@AssignableSubInterfaces(get = {})

@ImplementationClass(get = BirthYear.class)
public interface IBirthYear extends IDataType, ISoccerPlayerThing {

}
