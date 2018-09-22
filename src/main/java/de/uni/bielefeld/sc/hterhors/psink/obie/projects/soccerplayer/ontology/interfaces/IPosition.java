package de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.interfaces;

import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.AssignableSubInterfaces;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.ImplementationClass;
import de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.classes.Position;

/**
 *
 * @author hterhors
 *
 *
 *         Sep 6, 2018
 */

@AssignableSubInterfaces(get = { IFieldHockey.class, IDefenderAssociationFootball.class, IMidfield.class,
		IGoalkeeperAssociationFootball.class, IMidfielder.class, IInsideForward.class,
		IForwardAssociationFootball.class, IWingHalf.class, })

@ImplementationClass(get = Position.class)
public interface IPosition extends ISoccerPlayerThing {

}
