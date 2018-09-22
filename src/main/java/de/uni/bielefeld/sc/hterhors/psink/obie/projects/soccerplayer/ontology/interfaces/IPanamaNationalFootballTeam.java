package de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.interfaces;

import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.AssignableSubInterfaces;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.ImplementationClass;
import de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.classes.PanamaNationalFootballTeam;

/**
 *
 * @author hterhors
 *
 *
 *         Sep 6, 2018
 */

@AssignableSubInterfaces(get = {})

@ImplementationClass(get = PanamaNationalFootballTeam.class)
public interface IPanamaNationalFootballTeam extends IBirthPlace, ITeam {

}
