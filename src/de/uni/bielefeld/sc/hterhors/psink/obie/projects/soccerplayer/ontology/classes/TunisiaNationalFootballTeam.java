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
@AssignableSubClasses(get={})

@DirectSiblings(get={FcDordrecht.class, JamaicaNationalFootballTeam.class, England.class, PanamaNationalFootballTeam.class, BirminghamCityFC.class, Vitesse.class, BayelsaUnitedFC.class, Czechoslovakia.class, Staffordshire.class, EdmontonLondon.class, CrookTownAFC.class, StokeOnTrent.class, PeruNationalFootballTeam.class, GreeceWomenSNationalFootballTeam.class, FcGirondinsDeBordeaux.class, HeartlandFC.class, Lisbon.class, BirkirkaraFC.class, SwanseaCityAFC.class, Farnham.class, ScTavriyaSimferopol.class, Hendon.class, Mamelodi.class, Chester.class, WienerSportClub.class, PlymouthArgyleFC.class, ClubAfricain.class, Leith.class, HamiltonAcademicalFC.class, IrvineNorthAyrshire.class, Warrington.class, Wakefield.class, WillingtonCheshire.class, BataEquatorialGuinea.class, QatarSc.class, Heide.class, Basildon.class, BristolRoversFC.class, PortugalNationalFootballTeam.class, Goa.class, AlArabiScQatar.class, SanMarinoNationalFootballTeam.class, TianjinTedaFC.class, EllonAberdeenshire.class, Torquay.class, KuwaitSc.class, SCBeiraMar.class, BoltonWanderersFC.class, HungaryWomenSNationalFootballTeam.class, ArmthorpeWelfareFC.class, Zeist.class, NottinghamForestFC.class, ZambiaNationalFootballTeam.class, ShillongLajongFC.class, Cyprus.class, Wolverhampton.class, KDiegemSport.class, Aryanah.class, Glasgow.class, ChileNationalFootballTeam.class, AlQuwaAlJawiya.class, Brazil.class, BathCityFC.class, SouthernSamity.class, Inverness.class, Liaoning.class, Holborn.class, VeteransBviFootball.class, TheStrongest.class, Dagenham.class, GermanyNationalFootballTeam.class, FCPorto.class, Sheffield.class, Leicestershire.class, MexicoNationalFootballTeam.class, Haiti.class, CFOsBelenenses.class, PowerDynamosFC.class, FarRabat.class, UslDunkerque.class, RDaringClubMolenbeek.class, PortsAuthorityFC.class, ManchesterUnitedFC.class, BrightonHoveAlbionFC.class, ShrewsburyTownFC.class, Malabo.class, Nijkerk.class, MarketDrayton.class, NacBreda.class, HalifaxTownAFC.class, AjaxCapeTownFC.class, PfcLokomotivSofia.class, SouthChinaAa.class, TauroFC.class, Kamptee.class, CookIslands.class, Wilford.class, FcOss.class, Eastbourne.class, IsraelNationalUnder21FootballTeam.class, EnglandNationalUnder17FootballTeam.class, DoverAthleticFC.class, UnitedStatesMenSNationalSoccerTeam.class, Casablanca.class, GraysAthleticFC.class, Grenada.class, Dalian.class, Morocco.class, JsKabylie.class, WolverhamptonWanderersFC.class, GrimsbyTownFC.class, Haarlem.class, WestBromwich.class, KBeerschotVAC.class, CoventryCityFC.class, Islington.class, Neath.class, SunderlandAFC.class, WrexhamFC.class, GrenobleFoot38.class, Ghana.class, MasFez.class, Coatbridge.class, BoliviaNationalFootballTeam.class, KikwanchaPyongyang.class, HangzhouGreentownFC.class, Sherborne.class, AmericanSamoa.class, Guinea.class, UnitedSikkimFC.class, VancouverRoyals.class, Measham.class, BorussiaDortmund.class, HungaryNationalFootballTeam.class, SingaporeNationalFootballTeam.class, SaltoUruguay.class, JuanAurich.class, IttihadFc.class, IndonesiaNationalFootballTeam.class, Nigeria.class, Zaandam.class, NottsCountyFC.class, FcUtrecht.class, MoroccoNationalFootballTeam.class, AnambraState.class, FcSheriffTiraspol.class, BoulogneSurMer.class, Otley.class, Northampton.class, Estonia.class, ADBaucau.class, MarlowBuckinghamshire.class, DanubioFC.class, XerezCd.class, FcMetz.class, Fredrikstad.class, Accra.class, TamworthFC.class, GefleIf.class, BurnleyFC.class, DundeeUnitedFC.class, SportingCristal.class, MontpellierHscLadies.class, AccraHeartsOfOakSc.class, BritishVirginIslands.class, Ouakam.class, OwlertonFC.class, SunderlandTyneAndWear.class, Portsmouth.class, AlgeriaNationalFootballTeam.class, FcPuumaTallinn.class, HaringeyBoroughFC.class, CarlisleUnitedFC.class, WestBengal.class, Dupnitsa.class, Malta.class, Recife.class, TokushimaVortis.class, KiryatMotzkin.class, CorinthianFC.class, AcHorsens.class, France.class, NetherlandsNationalFootballTeam.class, WimbledonFC.class, RealGarcilaso.class, NigeriaNationalFootballTeam.class, Mykolaiv.class, SremskaMitrovica.class, HamsterleyConsett.class, FulhamFC.class, SantaCruzFutebolClube.class, OldForestersFC.class, HeiderSv.class, GuangdongSunrayCaveFC.class, RomaniaNationalFootballTeam.class, Ealing.class, ClaphamRoversFC.class, ExeterCityFC.class, _1FcMagdeburg.class, SaudiArabiaNationalFootballTeam.class, Mexico.class, WiganAthleticFC.class, Turin.class, BlackburnRoversFC.class, Fulham.class, SouthendUnitedFC.class, Bradford.class, BuenosAires.class, Wales.class, Tianjin.class, DagenhamRedbridgeFC.class, KhaitanSportingClub.class, Skelmanthorpe.class, StJohnstoneFC.class, WuchuanGuangdong.class, Colchester.class, SheffieldWednesdayFC.class, Jarrow.class, Egersund.class, StokeCityFC.class, Budapest.class, Nijmegen.class, Shropshire.class, Milan.class, Hove.class, MarlowFC.class, Crediton.class, YorkCityFC.class, MumbaiFC.class, PfcSlaviaSofia.class, PortoVecchio.class, MacclesfieldTownFC.class, GooleAFC.class, NewcastleUponTyne.class, Sweden.class, Wylam.class, HednesfordTownFC.class, AjAuxerre.class, Poland.class, Wigan.class, SogndalFotball.class, Tunisia.class, DeportivoTolucaFC.class, Meaux.class, CostaRica.class, Sikkim.class, Frimley.class, GrenadaNationalFootballTeam.class, Sliema.class, Birmingham.class, ClydebankFC.class, TeamSoccerooFC.class, RosarioSantaFe.class, GuineaNationalFootballTeam.class, PfcKaliakraKavarna.class, BlythFC.class, ClubTijuana.class, FcAarau.class, WaBoufarik.class, SouthamptonFC.class, Curitiba.class, Bristol.class, OudHeverleeLeuven.class, Algeria.class, BelgiumNationalFootballTeam.class, RamatHasharon.class, LincolnEngland.class, PortValeFC.class, KazmaSportingClub.class, FredrikstadFk.class, BuxtonFC.class, Kolkata.class, Moldova.class, Padua.class, EastTimor.class, SouthportFC.class, SierraLeoneNationalFootballTeam.class, AsNancy.class, PullmanFC.class, UruguayNationalFootballTeam.class, Honduras.class, DjiboutiNationalFootballTeam.class, ArsenalFC.class, ItalyNationalFootballTeam.class, Truro.class, ClubLitoral.class, Altofts.class, SanJoseCalifornia.class, Darlington.class, AberdeenFC.class, PfcCskaSofia.class, Netherlands.class, Almada.class, EquatorialGuineaNationalFootballTeam.class, Highgate.class, EastFifeFC.class, EvertonFC.class, Horsens.class, Breda.class, SkBrann.class, SliemaWanderersFC.class, Volendam.class, Ankara.class, ChelmsfordCityFC.class, Tunis.class, TeignmouthFC.class, JuventusFC.class, BahrainNationalFootballTeam.class, OgcNice.class, Greece.class, ClubNacionalDeFootball.class, SouthAfrica.class, FreemantleFC.class, FcDynamoMoscow.class, Sarpsborg08Ff.class, SalgaocarFC.class, Wejherowo.class, Ukraine.class, PaykanFC.class, SandvikensIf.class, AmericanSamoaNationalAssociationFootballTeam.class, Manipur.class, DeportivoSaprissa.class, Jamaica.class, LIsleAdamValDOise.class, FcVolendam.class, DarlingtonFC.class, EgersundsIk.class, ParaguayNationalFootballTeam.class, DunfermlineAthleticFC.class, DalianShideFC.class, StocktonOnTees.class, UlcebyNorthLincolnshire.class, LevadiakosFC.class, Amsterdam.class, SaudiArabia.class, Consett.class, Kuwait.class, Maharashtra.class, NorthamptonTownFC.class, TorquayUnitedFC.class, BurkinaFaso.class, NewcastleUnderLyme.class, FkAustriaWien.class, WestHam.class, BasingstokeTownFC.class, VvvVenlo.class, Leiden.class, SherwoodForesters.class, EstoniaNationalFootballTeam.class, CelticBoysClub.class, AlAnsarSc.class, Quetta.class, Devon.class, SouthKoreaNationalUnder17FootballTeam.class, PuneFC.class, GombakUnitedFc.class, AlianzaLima.class, KorinthosFC.class, Austria.class, Ipswich.class, WestBromwichAlbionFC.class, CDTrofense.class, VagonulArad.class, AshtonInMakerfield.class, AkademiskBoldklub.class, Maastricht.class, MansfieldTownFC.class, PacificLutheranUniversity.class, SierraLeone.class, MexicoWomenSNationalFootballTeam.class, SpartaRotterdam.class, CowdenbeathFC.class, FcMidtjylland.class, Kenema.class, Swansea.class, CzechoslovakiaNationalFootballTeam.class, York.class, ZamalekSc.class, IkSleipner.class, ArkaGdynia.class, Smethwick.class, ScotlandNationalFootballTeam.class, Pakistan.class, Qatar.class, HarwichParkestonFC.class, FranceNationalFootballTeam.class, FcDesnaChernihiv.class, BenoniGauteng.class, Derby.class, FranceWomenSNationalFootballTeam.class, BlackpoolFC.class, PietRetiefMpumalanga.class, Barbados.class, PsmMakassar.class, Manchester.class, CharlestonBattery.class, Denmark.class, IndiaNationalUnder19FootballTeam.class, Tartu.class, BradfordCityAFC.class, Paraguay.class, ScTelstar.class, PelsallVillaFC.class, OngcFC.class, FkHaugesund.class, HartlepoolUnitedFC.class, SwedenNationalFootballTeam.class, VsiTampaBayFc.class, CapeTown.class, FcDenBosch.class, EllesmereShropshire.class, California.class, Bahrain.class, BostonUnitedFC.class, IranNationalUnder20FootballTeam.class, ShenzhenRubyFC.class, FCEtar.class, AsMonacoFc.class, IpswichTownFC.class, EastGermany.class, NorwayNationalFootballTeam.class, GreenockMortonFC.class, Oklahoma.class, Ferryhill.class, Hoorn.class, FcGroningen.class, _1FcFemina.class, QatarNationalFootballTeam.class, Bulgaria.class, Urmston.class, Bloxwich.class, GuizhouRenheFC.class, RbcRoosendaal.class, ArbroathFC.class, DeportivoMongomo.class, DerbyCountyFC.class, BotafogoDeFutebolERegatas.class, Southampton.class, RangdajiedUnitedFC.class, ArgentinaNationalFootballTeam.class, NasarawaUnitedFC.class, Israel.class, LincolnCityFC.class, Rutherglen.class, Lichfield.class, KuwaitNationalFootballTeam.class, BarnsleyFC.class, PrestonLancashire.class, LouthUnitedFC.class, AFCBournemouth.class, MaccabiTelAvivFC.class, EastGermanyNationalFootballTeam.class, SheffieldUnitedFC.class, NewportCountyAFC.class, BarkingsideFC.class, Sileby.class, Alexandria.class, Mealhada.class, UnitedSC.class, SunHeiSc.class, Silksworth.class, WillingtonAFC.class, MoorGreenFC.class, MiltonKeynesDonsFC.class, Cowlairs.class, Italy.class, AtalantaBC.class, RcKouba.class, LebanonNationalFootballTeam.class, LondonBoroughOfCamden.class, Sofia.class, CreditonUnitedAFC.class, Scotland.class, IfElfsborg.class, Blackburn.class, Rotterdam.class, Rouen.class, AlSalmiyaSc.class, CentroDeFutebolZicoSociedadeEsportiva.class, SovietUnion.class, WisbechTownFC.class, UsBoulogne.class, UnionDouala.class, TulsaGoldenHurricaneMenSSoccer.class, MontroseFC.class, SouthAfricaNationalFootballTeam.class, LuxembourgCity.class, CalcioPadova.class, BathSomerset.class, OlympiqueDeMarseille.class, NotreDameSc.class, Dominica.class, Nottingham.class, SeoulArmyClub.class, Portugal.class, Salzwedel.class, IslandersFc.class, SportingClubeDeGoa.class, WestonSuperMare.class, HuddersfieldTownFC.class, FirstViennaFc.class, BradfordParkAvenueAFC.class, DeportivoCoopsol.class, India.class, MumbaiTigersFC.class, PfcSpartakPleven.class, EastPaloAltoCalifornia.class, PuaikuraFc.class, ManganIndia.class, ChesterCityFC.class, Tegelen.class, QueenSParkFC.class, GatesheadFC.class, Germany.class, TunisiaNationalFootballTeam.class, PersijaJakarta.class, ArnettGardensFC.class, CDMotagua.class, Clydebank.class, MsvDuisburg.class, Trikala.class, DonBoscoFc.class, ClubLibertad.class, LeytonOrientFC.class, GloucesterCityAFC.class, WeymouthFC.class, StranraerFC.class, SportingClubeDePortugal.class, FortLauderdaleStrikers.class, ClydeFC.class, Switzerland.class, Stepney.class, BedminsterFC.class, SouthKoreaNationalFootballTeam.class, BoldklubbenFrem.class, MiddlesbroughFC.class, AnkaraDemirspor.class, ChesterfieldFC.class, RosarioCentral.class, CookIslandsNationalFootballTeam.class, EnuguRangers.class, Dublin.class, ConsettAFC.class, OceanBoysFC.class, AugustFootballClub.class, SfaxRailwaysSports.class, Belfast.class, GuiseleyAFC.class, PfcBotevPlovdiv.class, PersiramRajaAmpat.class, NorthernIrelandNationalUnder21FootballTeam.class, NorwichCityFC.class, PyrgosElis.class, NorthernIreland.class, Hamborn07.class, MillwallFC.class, Paramaribo.class, Upminster.class, ClubSocialYDeportivoFlandria.class, Teignmouth.class, EnglandNationalFootballTeam.class, VancouverWhitecapsFc.class, BurtonTownFC.class, FcAk.class, AshtonUnderLyne.class, LutonTownFC.class, Oswaldtwistle.class, DempoSC.class, Feyenoord.class, MontpellierHsc.class, Clowne.class, KasamaZambia.class, Edinburgh.class, AACEagles.class, Brighton.class, LDAlajuelense.class, RajaCasablanca.class, ArisThessalonikiFCWomen.class, VeriaFC.class, Kolhapur.class, Heanor.class, MvvMaastricht.class, Norway.class, PecZwolle.class, Suriname.class, MerthyrTownFC.class, WalesNationalFootballTeam.class, StockportCountyFC.class, PofcBotevVratsa.class, AustriaNationalFootballTeam.class, Cambridge.class, Northumberland.class, CercleBruggeKSV.class, CarlisleCumbria.class, FcGueugnon.class, Tiraspol.class, ColchesterUnitedFC.class, Guangdong.class, Argentina.class, DominicaNationalFootballTeam.class, MohunBaganAC.class, Zambia.class, BritishVirginIslandsNationalFootballTeam.class, RepublicOfIreland.class, Irkutsk.class, DalianAerbinFC.class, London.class, PernisNetherlands.class, DenmarkNationalFootballTeam.class, IfkEskilstuna.class, TottenhamHotspurFC.class, Girvan.class, BraintreeTownFC.class, AlArabiScKuwait.class, Kwaggafontein.class, BulgariaNationalFootballTeam.class, QadsiaSc.class, OmanNationalFootballTeam.class, WiganBoroughFC.class, Grimsby.class, ToulouseFc.class, FrickleyAthleticFC.class, DundeeFC.class, LivingstonFC.class, MiltonKeynes.class, Lebanon.class, Douala.class, Guernsey.class, Australia.class, RioDeJaneiro.class, BarbadosNationalFootballTeam.class, Cameroon.class, BangorCityFC.class, CoronelOviedo.class, LaPaz.class, Lagos.class, Oman.class, ClubUniversidadDeChile.class, Yugoslavia.class, Blackpool.class, PfcLevskiSofia.class, ClubNacional.class, Hoofddorp.class, Liverpool.class, TimorLesteNationalFootballTeam.class, AsfaYennenga.class, TranmereRoversFC.class, TunstallStaffordshire.class, Spondon.class, NorthKorea.class, FalkenbergsFf.class, AstonVillaFC.class, Singapore.class, AdDiliOeste.class, SkKladno.class, WillemIiFootballClub.class, Chelmsford.class, Russia.class, AnchorQueensParkRangersFc.class, SloughTownFC.class, China.class, HapoelIroniKiryatShmonaFC.class, Luanda.class, Katowice.class, Romania.class, ParefSouthridgeSchool.class, CudworthSouthYorkshire.class, JomoCosmosFC.class, Enschede.class, Dijon.class, KigwanchaSportsClub.class, Croydon.class, LuxembourgNationalFootballTeam.class, Bootle.class, AtlantaChiefs.class, Indonesia.class, HaitiNationalFootballTeam.class, MaltaNationalFootballTeam.class, EnosisNeonParalimniFc.class, Angola.class, PfcChernoMoreVarna.class, AsDouanesDakar.class, _1SimmeringerSc.class, Iran.class, Grenoble.class, Antwerp.class, MamelodiSundownsFC.class, Iraq.class, EquatorialGuinea.class, Chile.class, CameroonNationalFootballTeam.class, Rennebu.class, BoNessUnitedFC.class, Moseley.class, KirklandWashington.class, TechnoAryanFC.class, PaokFC.class, Leeds.class, NewcastleUnitedFC.class, Montpellier.class, Turkey.class, Belgium.class, Kirkby.class, AlumniAthleticClub.class, Peru.class, Chesterfield.class, SalfordGreaterManchester.class, Hornsey.class, OklahomaCity.class, Greenock.class, NorthKoreaNationalFootballTeam.class, Wallsend.class, ChurchillBrothersSC.class, FcVolynLutsk.class, CircoloSportivoItaliano.class, LiverpoolFC.class, Uruguay.class, RcLens.class, FcKharkiv.class, ThackleyFC.class, StokeUponTrent.class, BristolCityFC.class, SouthKorea.class, HarlandAndWolff.class, Azazga.class, Krugersdorp.class, Gais.class, UsOuakam.class, IraqNationalFootballTeam.class, BasfordNottinghamshire.class, FleetwoodTownFC.class, Lunglei.class, NkanaFC.class, PohangSteelers.class, ChicagoSting.class, KBocholterVV.class, Kimberworth.class, Brussels.class, PooleTownFC.class, Hungary.class, Dundee.class, ACMonzaBrianza1912.class, Paralimni.class, LandskronaBois.class, FcAkademiyaTolyatti.class, IsHalmia.class, FcTwente.class, PyongyangCitySportsClub.class, Senegal.class, Pelsall.class, RhylFC.class, RCharleroiSC.class, ScBastia.class, CostaRicaNationalFootballTeam.class, ThandaRoyalZuluFC.class, Egypt.class, Bitterne.class, SanMarino.class, Bolivia.class, HondurasNationalFootballTeam.class, Mizoram.class, KSintTruidenseVV.class, Rabat.class, QatarNationalUnder23FootballTeam.class, EgyptNationalFootballTeam.class, DefensoresDeBelgrano.class, CasualsFC.class, MexicoCity.class, Turnhout.class, ChelseaFC.class, VikingFk.class, JeonnamDragons.class, TruroCityFC.class, AikFotboll.class, CrusadersFC.class, Dakar.class, HfcHaarlem.class, WydadCasablanca.class, CoritibaFootBallClub.class, })

@SuperRootClasses(get={Team.class, Place.class, })

@DirectInterface(get=ITunisiaNationalFootballTeam.class)
 public class TunisiaNationalFootballTeam implements ITunisiaNationalFootballTeam{

	final static public String ONTOLOGY_NAME = "http://psink.de/scio/TunisiaNationalFootballTeam";
	final public String annotationID;
	private Integer characterOffset;
	private Integer characterOnset;
	final static private Map<IOBIEThing, String> resourceFactory = new HashMap<>();
	final static private long serialVersionUID = 1L;
	@TextMention
final private String textMention;


	public TunisiaNationalFootballTeam(String annotationID, String textMention){
this.annotationID = annotationID;
this.textMention = textMention;
}
	public TunisiaNationalFootballTeam(){
this.annotationID = null;
this.textMention = null;
}
	public TunisiaNationalFootballTeam(TunisiaNationalFootballTeam tunisiaNationalFootballTeam)throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,NoSuchMethodException, SecurityException{
this.annotationID = tunisiaNationalFootballTeam.getAnnotationID();
this.characterOffset = tunisiaNationalFootballTeam.getCharacterOffset();
this.characterOnset = tunisiaNationalFootballTeam.getCharacterOnset();
this.textMention = tunisiaNationalFootballTeam.getTextMention();
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
TunisiaNationalFootballTeam other = (TunisiaNationalFootballTeam) obj;
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
if (annotationID == null) {
if (other.annotationID!= null)
return false;
} else if (!annotationID.equals(other.annotationID))
return false;
if (textMention == null) {
if (other.textMention!= null)
return false;
} else if (!textMention.equals(other.textMention))
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
result = prime * result + ((this.annotationID == null) ? 0 : this.annotationID.hashCode());
result = prime * result + ((this.textMention == null) ? 0 : this.textMention.hashCode());
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
return "TunisiaNationalFootballTeam [annotationID="+annotationID+",characterOffset="+characterOffset+",characterOnset="+characterOnset+",serialVersionUID="+serialVersionUID+",textMention="+textMention+"]";}


}
