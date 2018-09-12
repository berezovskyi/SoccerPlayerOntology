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

@SuperRootClasses(get={Place.class, })

@DirectInterface(get=IKamptee.class)

@NamedIndividual
@AssignableSubClasses(get={})

@DirectSiblings(get={Turin.class, Fulham.class, Bradford.class, BuenosAires.class, Wales.class, England.class, Tartu.class, Cambridge.class, Northumberland.class, Paraguay.class, PanamaNationalFootballTeam.class, Tianjin.class, CarlisleCumbria.class, Skelmanthorpe.class, Tiraspol.class, Czechoslovakia.class, EdmontonLondon.class, Staffordshire.class, StokeOnTrent.class, Guangdong.class, WuchuanGuangdong.class, Argentina.class, CapeTown.class, Lisbon.class, Colchester.class, EllesmereShropshire.class, Farnham.class, Zambia.class, California.class, Jarrow.class, Bahrain.class, Hendon.class, Mamelodi.class, Egersund.class, Budapest.class, Chester.class, Nijmegen.class, RepublicOfIreland.class, Shropshire.class, Irkutsk.class, Milan.class, Hove.class, London.class, Crediton.class, Leith.class, EastGermany.class, NorwayNationalFootballTeam.class, IrvineNorthAyrshire.class, Warrington.class, Wakefield.class, WillingtonCheshire.class, PernisNetherlands.class, Oklahoma.class, BataEquatorialGuinea.class, PortoVecchio.class, Heide.class, Basildon.class, Hoorn.class, Ferryhill.class, NewcastleUponTyne.class, Sweden.class, Wylam.class, Girvan.class, Goa.class, Poland.class, Wigan.class, Bulgaria.class, Tunisia.class, Urmston.class, Kwaggafontein.class, EllonAberdeenshire.class, Meaux.class, Bloxwich.class, CostaRica.class, Torquay.class, Sikkim.class, Grimsby.class, Frimley.class, Sliema.class, MiltonKeynes.class, Birmingham.class, Lebanon.class, Douala.class, Southampton.class, Guernsey.class, RosarioSantaFe.class, ArgentinaNationalFootballTeam.class, Israel.class, Australia.class, Zeist.class, RioDeJaneiro.class, Rutherglen.class, ZambiaNationalFootballTeam.class, Cameroon.class, Lichfield.class, Cyprus.class, Wolverhampton.class, CoronelOviedo.class, LaPaz.class, Aryanah.class, Lagos.class, Glasgow.class, PrestonLancashire.class, Oman.class, Yugoslavia.class, Blackpool.class, Curitiba.class, Bristol.class, Brazil.class, Sileby.class, Algeria.class, Alexandria.class, Hoofddorp.class, RamatHasharon.class, LincolnEngland.class, Mealhada.class, Liaoning.class, Inverness.class, Liverpool.class, Holborn.class, Silksworth.class, Kolkata.class, Moldova.class, Padua.class, EastTimor.class, TunstallStaffordshire.class, Dagenham.class, Spondon.class, NorthKorea.class, Sheffield.class, Cowlairs.class, Italy.class, Honduras.class, DjiboutiNationalFootballTeam.class, Leicestershire.class, Truro.class, Haiti.class, Singapore.class, LondonBoroughOfCamden.class, Sofia.class, SanJoseCalifornia.class, Altofts.class, Scotland.class, Darlington.class, Chelmsford.class, Russia.class, Blackburn.class, Rotterdam.class, Netherlands.class, Almada.class, Rouen.class, China.class, Nijkerk.class, Malabo.class, MarketDrayton.class, SovietUnion.class, Luanda.class, Katowice.class, Highgate.class, Romania.class, Horsens.class, CudworthSouthYorkshire.class, Breda.class, Enschede.class, Dijon.class, LuxembourgCity.class, Volendam.class, BathSomerset.class, Croydon.class, Kamptee.class, CookIslands.class, LuxembourgNationalFootballTeam.class, Wilford.class, Ankara.class, Bootle.class, Eastbourne.class, Dominica.class, Indonesia.class, Nottingham.class, MaltaNationalFootballTeam.class, Tunis.class, Angola.class, Casablanca.class, Portugal.class, Salzwedel.class, Grenada.class, Greece.class, Dalian.class, Morocco.class, Iran.class, SouthAfrica.class, Grenoble.class, Antwerp.class, Haarlem.class, WestBromwich.class, Iraq.class, EquatorialGuinea.class, Chile.class, Rennebu.class, KirklandWashington.class, Moseley.class, Neath.class, Islington.class, Leeds.class, Wejherowo.class, Ukraine.class, WestonSuperMare.class, Ghana.class, India.class, Montpellier.class, Turkey.class, EastPaloAltoCalifornia.class, Belgium.class, Coatbridge.class, ManganIndia.class, Kirkby.class, Tegelen.class, Sherborne.class, Manipur.class, AmericanSamoa.class, Jamaica.class, Peru.class, Germany.class, LIsleAdamValDOise.class, Chesterfield.class, OklahomaCity.class, SalfordGreaterManchester.class, Hornsey.class, Greenock.class, TunisiaNationalFootballTeam.class, Guinea.class, Wallsend.class, Measham.class, StocktonOnTees.class, UlcebyNorthLincolnshire.class, Amsterdam.class, SaudiArabia.class, Clydebank.class, SaltoUruguay.class, Consett.class, Trikala.class, Maharashtra.class, Nigeria.class, Kuwait.class, Zaandam.class, BurkinaFaso.class, NewcastleUnderLyme.class, WestHam.class, Uruguay.class, AnambraState.class, Switzerland.class, Stepney.class, Leiden.class, StokeUponTrent.class, BoulogneSurMer.class, Otley.class, Quetta.class, SouthKorea.class, Devon.class, Azazga.class, Estonia.class, Northampton.class, Krugersdorp.class, Dublin.class, MarlowBuckinghamshire.class, BasfordNottinghamshire.class, Lunglei.class, Austria.class, Fredrikstad.class, Ipswich.class, Accra.class, Belfast.class, Kimberworth.class, PyrgosElis.class, NorthernIreland.class, Brussels.class, AshtonInMakerfield.class, Hungary.class, Maastricht.class, Paramaribo.class, Dundee.class, SierraLeone.class, Paralimni.class, BritishVirginIslands.class, Upminster.class, Ouakam.class, SunderlandTyneAndWear.class, Senegal.class, Pelsall.class, Teignmouth.class, Kenema.class, Portsmouth.class, Swansea.class, EnglandNationalFootballTeam.class, York.class, WestBengal.class, Egypt.class, AshtonUnderLyne.class, Bitterne.class, SanMarino.class, Bolivia.class, Oswaldtwistle.class, Dupnitsa.class, Malta.class, Smethwick.class, Clowne.class, Recife.class, Pakistan.class, KasamaZambia.class, Mizoram.class, Qatar.class, Rabat.class, KiryatMotzkin.class, Edinburgh.class, France.class, MexicoCity.class, Turnhout.class, BenoniGauteng.class, Mykolaiv.class, Brighton.class, SremskaMitrovica.class, Derby.class, FranceWomenSNationalFootballTeam.class, PietRetiefMpumalanga.class, HamsterleyConsett.class, Kolhapur.class, Barbados.class, Dakar.class, Heanor.class, Ealing.class, Norway.class, Denmark.class, Manchester.class, Mexico.class, Suriname.class, })
 public class Kamptee implements IKamptee{

	final static public String ONTOLOGY_NAME = "http://psink.de/scio/Kamptee";
	final public String annotationID;
	private Integer characterOffset;
	private Integer characterOnset;
	final static private Map<IOBIEThing, String> resourceFactory = new HashMap<>();
	final static private long serialVersionUID = 1L;
	@TextMention
final private String textMention;


	public Kamptee(){
this.annotationID = null;
this.textMention = null;
}
	public Kamptee(Kamptee kamptee)throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,NoSuchMethodException, SecurityException{
this.annotationID = kamptee.getAnnotationID();
this.characterOffset = kamptee.getCharacterOffset();
this.characterOnset = kamptee.getCharacterOnset();
this.textMention = kamptee.getTextMention();
}
	public Kamptee(String annotationID, String textMention){
this.annotationID = annotationID;
this.textMention = textMention;
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
Kamptee other = (Kamptee) obj;
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
return "Kamptee [annotationID="+annotationID+",characterOffset="+characterOffset+",characterOnset="+characterOnset+",serialVersionUID="+serialVersionUID+",textMention="+textMention+"]";}


}
