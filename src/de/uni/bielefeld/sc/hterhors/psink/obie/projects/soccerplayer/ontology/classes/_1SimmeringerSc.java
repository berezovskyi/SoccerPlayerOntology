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

@DirectInterface(get=I_1SimmeringerSc.class)

@NamedIndividual
@SuperRootClasses(get={Team.class, })

@AssignableSubClasses(get={})

@DirectSiblings(get={JamaicaNationalFootballTeam.class, FcDordrecht.class, IndiaNationalUnder19FootballTeam.class, BradfordCityAFC.class, ScTelstar.class, PanamaNationalFootballTeam.class, PelsallVillaFC.class, BirminghamCityFC.class, OngcFC.class, Vitesse.class, BayelsaUnitedFC.class, CrookTownAFC.class, PeruNationalFootballTeam.class, GreeceWomenSNationalFootballTeam.class, FkHaugesund.class, HartlepoolUnitedFC.class, SwedenNationalFootballTeam.class, FcGirondinsDeBordeaux.class, VsiTampaBayFc.class, BirkirkaraFC.class, HeartlandFC.class, FcDenBosch.class, SwanseaCityAFC.class, ScTavriyaSimferopol.class, BostonUnitedFC.class, WienerSportClub.class, PlymouthArgyleFC.class, IranNationalUnder20FootballTeam.class, ClubAfricain.class, ShenzhenRubyFC.class, FCEtar.class, HamiltonAcademicalFC.class, AsMonacoFc.class, IpswichTownFC.class, NorwayNationalFootballTeam.class, GreenockMortonFC.class, QatarSc.class, BristolRoversFC.class, FcGroningen.class, PortugalNationalFootballTeam.class, _1FcFemina.class, QatarNationalFootballTeam.class, AlArabiScQatar.class, SanMarinoNationalFootballTeam.class, TianjinTedaFC.class, KuwaitSc.class, SCBeiraMar.class, GuizhouRenheFC.class, RbcRoosendaal.class, BoltonWanderersFC.class, ArbroathFC.class, DeportivoMongomo.class, DerbyCountyFC.class, HungaryWomenSNationalFootballTeam.class, BotafogoDeFutebolERegatas.class, RangdajiedUnitedFC.class, ArmthorpeWelfareFC.class, ArgentinaNationalFootballTeam.class, NasarawaUnitedFC.class, NottinghamForestFC.class, LincolnCityFC.class, ZambiaNationalFootballTeam.class, ShillongLajongFC.class, KDiegemSport.class, KuwaitNationalFootballTeam.class, BarnsleyFC.class, LouthUnitedFC.class, AFCBournemouth.class, ChileNationalFootballTeam.class, MaccabiTelAvivFC.class, EastGermanyNationalFootballTeam.class, SheffieldUnitedFC.class, AlQuwaAlJawiya.class, NewportCountyAFC.class, BarkingsideFC.class, BathCityFC.class, SouthernSamity.class, UnitedSC.class, VeteransBviFootball.class, SunHeiSc.class, WillingtonAFC.class, TheStrongest.class, MoorGreenFC.class, GermanyNationalFootballTeam.class, FCPorto.class, MiltonKeynesDonsFC.class, AtalantaBC.class, RcKouba.class, MexicoNationalFootballTeam.class, LebanonNationalFootballTeam.class, CFOsBelenenses.class, PowerDynamosFC.class, FarRabat.class, CreditonUnitedAFC.class, IfElfsborg.class, UslDunkerque.class, RDaringClubMolenbeek.class, PortsAuthorityFC.class, ManchesterUnitedFC.class, AlSalmiyaSc.class, BrightonHoveAlbionFC.class, ShrewsburyTownFC.class, CentroDeFutebolZicoSociedadeEsportiva.class, WisbechTownFC.class, NacBreda.class, AjaxCapeTownFC.class, HalifaxTownAFC.class, UsBoulogne.class, PfcLokomotivSofia.class, UnionDouala.class, TulsaGoldenHurricaneMenSSoccer.class, MontroseFC.class, SouthAfricaNationalFootballTeam.class, SouthChinaAa.class, CalcioPadova.class, TauroFC.class, OlympiqueDeMarseille.class, FcOss.class, NotreDameSc.class, IsraelNationalUnder21FootballTeam.class, EnglandNationalUnder17FootballTeam.class, SeoulArmyClub.class, DoverAthleticFC.class, UnitedStatesMenSNationalSoccerTeam.class, GraysAthleticFC.class, IslandersFc.class, JsKabylie.class, WolverhamptonWanderersFC.class, GrimsbyTownFC.class, KBeerschotVAC.class, SunderlandAFC.class, CoventryCityFC.class, SportingClubeDeGoa.class, HuddersfieldTownFC.class, WrexhamFC.class, FirstViennaFc.class, BradfordParkAvenueAFC.class, GrenobleFoot38.class, MasFez.class, DeportivoCoopsol.class, MumbaiTigersFC.class, PfcSpartakPleven.class, PuaikuraFc.class, ChesterCityFC.class, BoliviaNationalFootballTeam.class, KikwanchaPyongyang.class, HangzhouGreentownFC.class, QueenSParkFC.class, GatesheadFC.class, TunisiaNationalFootballTeam.class, UnitedSikkimFC.class, VancouverRoyals.class, PersijaJakarta.class, ArnettGardensFC.class, BorussiaDortmund.class, CDMotagua.class, HungaryNationalFootballTeam.class, SingaporeNationalFootballTeam.class, MsvDuisburg.class, JuanAurich.class, IttihadFc.class, DonBoscoFc.class, IndonesiaNationalFootballTeam.class, NottsCountyFC.class, ClubLibertad.class, LeytonOrientFC.class, WeymouthFC.class, StranraerFC.class, GloucesterCityAFC.class, SportingClubeDePortugal.class, FcUtrecht.class, MoroccoNationalFootballTeam.class, FortLauderdaleStrikers.class, FcSheriffTiraspol.class, ClydeFC.class, BedminsterFC.class, SouthKoreaNationalFootballTeam.class, BoldklubbenFrem.class, MiddlesbroughFC.class, AnkaraDemirspor.class, ChesterfieldFC.class, CookIslandsNationalFootballTeam.class, RosarioCentral.class, ADBaucau.class, EnuguRangers.class, DanubioFC.class, ConsettAFC.class, XerezCd.class, OceanBoysFC.class, AugustFootballClub.class, SfaxRailwaysSports.class, FcMetz.class, GuiseleyAFC.class, PfcBotevPlovdiv.class, TamworthFC.class, PersiramRajaAmpat.class, NorthernIrelandNationalUnder21FootballTeam.class, GefleIf.class, NorwichCityFC.class, Hamborn07.class, MillwallFC.class, BurnleyFC.class, DundeeUnitedFC.class, MontpellierHscLadies.class, SportingCristal.class, AccraHeartsOfOakSc.class, OwlertonFC.class, ClubSocialYDeportivoFlandria.class, EnglandNationalFootballTeam.class, VancouverWhitecapsFc.class, BurtonTownFC.class, AlgeriaNationalFootballTeam.class, FcPuumaTallinn.class, HaringeyBoroughFC.class, CarlisleUnitedFC.class, FcAk.class, LutonTownFC.class, DempoSC.class, Feyenoord.class, MontpellierHsc.class, TokushimaVortis.class, CorinthianFC.class, AcHorsens.class, NetherlandsNationalFootballTeam.class, WimbledonFC.class, RealGarcilaso.class, AACEagles.class, NigeriaNationalFootballTeam.class, LDAlajuelense.class, FulhamFC.class, RajaCasablanca.class, SantaCruzFutebolClube.class, ArisThessalonikiFCWomen.class, OldForestersFC.class, HeiderSv.class, GuangdongSunrayCaveFC.class, VeriaFC.class, RomaniaNationalFootballTeam.class, MvvMaastricht.class, ExeterCityFC.class, PecZwolle.class, ClaphamRoversFC.class, _1FcMagdeburg.class, SaudiArabiaNationalFootballTeam.class, WiganAthleticFC.class, MerthyrTownFC.class, BlackburnRoversFC.class, WalesNationalFootballTeam.class, StockportCountyFC.class, SouthendUnitedFC.class, PofcBotevVratsa.class, AustriaNationalFootballTeam.class, CercleBruggeKSV.class, DagenhamRedbridgeFC.class, KhaitanSportingClub.class, FcGueugnon.class, ColchesterUnitedFC.class, StJohnstoneFC.class, DominicaNationalFootballTeam.class, MohunBaganAC.class, SheffieldWednesdayFC.class, BritishVirginIslandsNationalFootballTeam.class, StokeCityFC.class, MarlowFC.class, DalianAerbinFC.class, YorkCityFC.class, MumbaiFC.class, PfcSlaviaSofia.class, DenmarkNationalFootballTeam.class, MacclesfieldTownFC.class, GooleAFC.class, IfkEskilstuna.class, TottenhamHotspurFC.class, AlArabiScKuwait.class, HednesfordTownFC.class, BraintreeTownFC.class, AjAuxerre.class, SogndalFotball.class, DeportivoTolucaFC.class, QadsiaSc.class, OmanNationalFootballTeam.class, BulgariaNationalFootballTeam.class, WiganBoroughFC.class, GrenadaNationalFootballTeam.class, ToulouseFc.class, FrickleyAthleticFC.class, DundeeFC.class, LivingstonFC.class, ClydebankFC.class, TeamSoccerooFC.class, GuineaNationalFootballTeam.class, BarbadosNationalFootballTeam.class, BangorCityFC.class, PfcKaliakraKavarna.class, BlythFC.class, ClubTijuana.class, FcAarau.class, WaBoufarik.class, ClubUniversidadDeChile.class, SouthamptonFC.class, PfcLevskiSofia.class, OudHeverleeLeuven.class, ClubNacional.class, BelgiumNationalFootballTeam.class, PortValeFC.class, KazmaSportingClub.class, TimorLesteNationalFootballTeam.class, AsfaYennenga.class, FredrikstadFk.class, BuxtonFC.class, SouthportFC.class, TranmereRoversFC.class, SierraLeoneNationalFootballTeam.class, AsNancy.class, PullmanFC.class, UruguayNationalFootballTeam.class, DjiboutiNationalFootballTeam.class, ArsenalFC.class, ItalyNationalFootballTeam.class, FalkenbergsFf.class, AstonVillaFC.class, ClubLitoral.class, AdDiliOeste.class, SkKladno.class, WillemIiFootballClub.class, AberdeenFC.class, PfcCskaSofia.class, AnchorQueensParkRangersFc.class, SloughTownFC.class, HapoelIroniKiryatShmonaFC.class, EquatorialGuineaNationalFootballTeam.class, EastFifeFC.class, ParefSouthridgeSchool.class, EvertonFC.class, JomoCosmosFC.class, SkBrann.class, SliemaWanderersFC.class, KigwanchaSportsClub.class, LuxembourgNationalFootballTeam.class, ChelmsfordCityFC.class, AtlantaChiefs.class, HaitiNationalFootballTeam.class, MaltaNationalFootballTeam.class, EnosisNeonParalimniFc.class, TeignmouthFC.class, PfcChernoMoreVarna.class, AsDouanesDakar.class, JuventusFC.class, _1SimmeringerSc.class, BahrainNationalFootballTeam.class, OgcNice.class, ClubNacionalDeFootball.class, FreemantleFC.class, MamelodiSundownsFC.class, CameroonNationalFootballTeam.class, BoNessUnitedFC.class, FcDynamoMoscow.class, SalgaocarFC.class, Sarpsborg08Ff.class, TechnoAryanFC.class, PaokFC.class, NewcastleUnitedFC.class, PaykanFC.class, SandvikensIf.class, AmericanSamoaNationalAssociationFootballTeam.class, AlumniAthleticClub.class, DeportivoSaprissa.class, FcVolendam.class, NorthKoreaNationalFootballTeam.class, DarlingtonFC.class, EgersundsIk.class, ChurchillBrothersSC.class, ParaguayNationalFootballTeam.class, DunfermlineAthleticFC.class, DalianShideFC.class, FcVolynLutsk.class, CircoloSportivoItaliano.class, LevadiakosFC.class, NorthamptonTownFC.class, TorquayUnitedFC.class, FkAustriaWien.class, LiverpoolFC.class, BasingstokeTownFC.class, VvvVenlo.class, RcLens.class, SherwoodForesters.class, FcKharkiv.class, ThackleyFC.class, EstoniaNationalFootballTeam.class, CelticBoysClub.class, AlAnsarSc.class, BristolCityFC.class, HarlandAndWolff.class, SouthKoreaNationalUnder17FootballTeam.class, PuneFC.class, Gais.class, GombakUnitedFc.class, UsOuakam.class, IraqNationalFootballTeam.class, AlianzaLima.class, FleetwoodTownFC.class, NkanaFC.class, KorinthosFC.class, PohangSteelers.class, ChicagoSting.class, WestBromwichAlbionFC.class, CDTrofense.class, KBocholterVV.class, VagonulArad.class, PooleTownFC.class, AkademiskBoldklub.class, MansfieldTownFC.class, PacificLutheranUniversity.class, ACMonzaBrianza1912.class, MexicoWomenSNationalFootballTeam.class, LandskronaBois.class, FcAkademiyaTolyatti.class, SpartaRotterdam.class, FcTwente.class, IsHalmia.class, PyongyangCitySportsClub.class, CowdenbeathFC.class, RhylFC.class, FcMidtjylland.class, RCharleroiSC.class, ScBastia.class, CzechoslovakiaNationalFootballTeam.class, CostaRicaNationalFootballTeam.class, ThandaRoyalZuluFC.class, ZamalekSc.class, IkSleipner.class, ArkaGdynia.class, HondurasNationalFootballTeam.class, ScotlandNationalFootballTeam.class, Pakistan.class, KSintTruidenseVV.class, QatarNationalUnder23FootballTeam.class, EgyptNationalFootballTeam.class, HarwichParkestonFC.class, FranceNationalFootballTeam.class, DefensoresDeBelgrano.class, CasualsFC.class, FcDesnaChernihiv.class, FranceWomenSNationalFootballTeam.class, BlackpoolFC.class, ChelseaFC.class, VikingFk.class, JeonnamDragons.class, TruroCityFC.class, AikFotboll.class, CrusadersFC.class, PsmMakassar.class, HfcHaarlem.class, CharlestonBattery.class, WydadCasablanca.class, CoritibaFootBallClub.class, })
 public class _1SimmeringerSc implements I_1SimmeringerSc{

	final static public String ONTOLOGY_NAME = "http://psink.de/scio/_1SimmeringerSc";
	final public String annotationID;
	private Integer characterOffset;
	private Integer characterOnset;
	final static private Map<IOBIEThing, String> resourceFactory = new HashMap<>();
	final static private long serialVersionUID = 1L;
	@TextMention
final private String textMention;


	public _1SimmeringerSc(){
this.annotationID = null;
this.textMention = null;
}
	public _1SimmeringerSc(_1SimmeringerSc _1SimmeringerSc)throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,NoSuchMethodException, SecurityException{
this.annotationID = _1SimmeringerSc.getAnnotationID();
this.characterOffset = _1SimmeringerSc.getCharacterOffset();
this.characterOnset = _1SimmeringerSc.getCharacterOnset();
this.textMention = _1SimmeringerSc.getTextMention();
}
	public _1SimmeringerSc(String annotationID, String textMention){
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
_1SimmeringerSc other = (_1SimmeringerSc) obj;
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
return "_1SimmeringerSc [annotationID="+annotationID+",characterOffset="+characterOffset+",characterOnset="+characterOnset+",serialVersionUID="+serialVersionUID+",textMention="+textMention+"]";}


}
