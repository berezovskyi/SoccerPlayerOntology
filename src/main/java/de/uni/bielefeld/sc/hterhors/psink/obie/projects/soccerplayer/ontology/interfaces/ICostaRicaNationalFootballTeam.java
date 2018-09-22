package de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.interfaces;

import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.AssignableSubInterfaces;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.ImplementationClass;
import de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.classes.CostaRicaNationalFootballTeam;

/**
 *
 * @author hterhors
 *
 *
 *         Sep 6, 2018
 */

@ImplementationClass(get = CostaRicaNationalFootballTeam.class)

@AssignableSubInterfaces(get = {})
public interface ICostaRicaNationalFootballTeam extends ITeam {

}
