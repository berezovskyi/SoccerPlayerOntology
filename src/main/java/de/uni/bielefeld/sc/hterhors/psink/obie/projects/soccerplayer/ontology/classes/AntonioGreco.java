package de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.classes;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;

import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.AssignableSubClasses;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.DatatypeProperty;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.DirectInterface;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.DirectSiblings;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.OntologyModelContent;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.RelationTypeCollection;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.SuperRootClasses;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.TextMention;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.interfaces.IOBIEThing;
import de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.interfaces.IAntonioGreco;
import de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.interfaces.IBirthPlace;
import de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.interfaces.IBirthYear;
import de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.interfaces.IPosition;
import de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.interfaces.ISoccerPlayerThing;
import de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.interfaces.ITeam;

/**
 *
 * @author hterhors
 *
 *
 *         Sep 6, 2018
 */

@SuperRootClasses(get = { SoccerPlayer.class, })

@AssignableSubClasses(get = {})

@DirectSiblings(get = { AbdelfettahRhiati.class, DanielBentley.class, AcurcioCarrelo.class, LahcenOuadani.class,
		PatrickModeste.class, MichalisKaras.class, AdenCharmakeh.class, AndrewCantFootballer.class, AldoPoy.class,
		GeorgeHoweFootballer.class, MiguelMba.class, AdamMarjan.class, MatthewCoad.class, VetonBerisha.class,
		DumitruStajila.class, JohnBainesFootballer.class, MartinVanLeeuwen.class, ModestoDenis.class,
		SophusHansen.class, HaroldKeenan.class, LukeHyam.class, LenOliverFootballer.class, KyleBenedictus.class,
		JustinChavez.class, EmmanuelOgoli.class, NickKuipersFootballerBorn1992.class, WilliGerdau.class,
		RidhaElLouze.class, SamHignett.class, RowenMuscat.class, SouravChakraborty.class, MiguelDavis.class,
		GreigYoung.class, CarlosContrerasFootballer.class, HugoVillanueva.class, EnisMaljici.class, JimGallacher.class,
		RainVessenberg.class, LiamGray.class, MathieuDeplagne.class, RonThompsonFootballer.class, DemetrioNeyra.class,
		RedouaneDrici.class, MilenIvanov.class, PelayoEribo.class, SamirQotb.class, CarlosNvomo.class,
		EddyAntoine.class, CraigBingham.class, IanAtkinson.class, AlariLell.class, JosephKamga.class, AbladeKumah.class,
		LarbiElHadi.class, AntonioGreco.class, CiprianoSantos.class, ZhaoXuebin.class, ArthurNineham.class,
		HugoSeixas.class, ShakeelAbbasi.class, DarrenBastow.class, JakeCuenca.class, DowlynDaly.class,
		GianpieroCombi.class, JamieJonesFootballer.class, FilipeDeSouzaConceicao.class, DelroyScott.class,
		GaryHarveyFootballer.class, HerbieWilliams.class, LewisMilne.class, LennardRemy.class, HeinzVersteeg.class,
		MitchStockentree.class, KeithGriffithsFootballer.class, BramVanPolen.class, BobbyPark.class,
		DzintarKlavan.class, OfirMizrahi.class, BernhardWessel.class, EvertonSena.class, LeeChangMyung.class,
		MohamedKaciSaid.class, SimonBurman.class, MarkTorrance.class, RudyGetzinger.class, TeddyBrayshaw.class,
		JohnCoxFootballer.class, AlanBuck.class, JonathanMilesFootballer.class, SadokSassi.class,
		JimmyPageFootballer.class, GeorgeBray.class, RayWhiteFootballer.class, DavidSvensson.class,
		CharlesGeertsFootballer.class, ImreKissFootballerBorn1957.class, AlbertIremonger.class, EladioReyes.class,
		NawabZeeshan.class, NatWalton.class, MohamadAtwi.class, ValeriyBoychenko.class, ChrisPhilipps.class,
		NikolaParshanov.class, AltayKahraman.class, DavidSoames.class, GideonVWay.class, RuneCarlsson.class,
		ArneLinderholm.class, JulyMahlangu.class, OliverWhateley.class, ObiOnyeike.class, CharlesVandenWouwer.class,
		BobbyMillsFootballer.class, AleksandrOlerski.class, AdrianBirdFootballer.class, NormanHeath.class,
		LewisDunk.class, JoeAshley.class, KeSeungWoon.class, PaulGladon.class, JordensPeters.class, BobbyHassell.class,
		AndreAnis.class, LucasDawson.class, ErichHasenkopf.class, ErnestMilton.class, LeeSangYi.class,
		ArthurMorrisFootballer.class, DaveLamontFootballer.class, TarmoSaks.class, AbdelmajidLamriss.class,
		KeithHarvey.class, RolyGregoire.class, DmytroZaderetskyi.class, AdityaPutraDewa.class, JimmyCuthbertson.class,
		ParkSunYong.class, BozhidarMitrev.class, CornelChinSue.class, GyulaPrassler.class, MiguelSegura.class,
		TommyMccullochGoalkeeper.class, MahmoodAbdulla.class, HoracioSequeira.class, EvansKangwa.class,
		GregTempest.class, MohamedBenMouza.class, WilliamBerryFootballer.class, NoelTurner.class, KlausDecker.class,
		JackCallender.class, JustinManao.class, StewartBright.class, SavaligaAfu.class, BernardMiddleditch.class,
		LenStansbridge.class, FredBeardsley.class, AliCrawford.class, RenanDosSantos.class, ArchibaldBarton.class,
		VictorKros.class, ShaunMawer.class, UrmasKaljend.class, VegardSkjerve.class, DanyMaury.class, ClaudePapi.class,
		AllassaneSango.class, NikhilKadam.class, ArthurSamson.class, BuenaventuraFerreira.class, CedricBadjeck.class,
		ErikPersson.class, DarrenHoldenFootballer.class, JosephClemente.class, KennyBanks.class, JulioMaceiras.class,
		GaryRiddell.class, KarlNickerl.class, IvanIvanovFootballerBorn1942.class, MitchHarding.class,
		TrevorHarrisFootballer.class, DrissTrichard.class, MartinLepa.class, CameronLancaster.class,
		PhilThomasFootballer.class, LuisReyna.class, BiswajitBiswas.class, ArthurCowell.class, RicardoTalu.class,
		PeterRoney.class, FredBarronFootballer.class, YangSeungKook.class, SolomonMarch.class, JoePeacock.class,
		JamalAlQabendi.class, SjorsVerdellen.class, HamoudAlShemmari.class, JohnsonAkuchie.class,
		AugustinFernandes.class, AlfredDobson.class, GrahamWhittle.class, KennedyMudenda.class, DimitarKostov.class,
		VidinApostolov.class, SungNakWoon.class, TysonCaiado.class, JasemBahman.class, YangQipeng.class,
		AugustyBartillard.class, PhilGriggs.class, WilfriedLouis.class, LennyPereira.class, RoddieMackenzie.class,
		WilliamGyves.class, ReidarOlsen.class, VahidHeydarieh.class, JaredSims.class, FadelJilal.class,
		MohammedKaram.class, JuliusUbido.class, LeonardoFerrel.class, WallyHazelden.class, SonnyStevens.class,
		RayPennick.class, MalcolmDevitt.class, AndreasKittos.class, SamiAlHashash.class, AllalBenKassou.class,
		AlfredoBrown.class, TobiasBadila.class, BernardHallFootballer.class, SheldonGovier.class, WayneSobers.class,
		AdixiLenzivio.class, ErnestoBrown.class, KurtSvensson.class, JoshRowbotham.class, AntonyLecointe.class,
		HarryGoslin.class, IvanOKonnelBronin.class, MarioMedina.class, TomWade.class, AlexGilbey.class,
		CarlosMateusXimenes.class, PeterHillFootballer.class, PeterMooneyFootballer.class, MobinRai.class,
		FredPelly.class, MohamedOulhaj.class, BrimaSesay.class, FredEwer.class, JohnGrahamForward.class,
		PrasenjitGhosh.class, NormanChalk.class, MarcelTisserand.class, ValentinGalev.class, JeongGiDong.class,
		GaelMargulies.class, MarcelinoVargas.class, PascalDiTommaso.class, TomPerryFootballer.class, RobinGurung.class,
		RomanZobnin.class, UgoOkoye.class, HorstNemec.class, EnzoCrivelli.class, IvanToney.class, LeeMargerison.class,
		ZeferinoMartins.class, DenisLindsayFootballer.class, LesterLanglais.class, BrimaBangura.class, NieTao.class,
		StefanVelichkov.class, ThandokuhleMkhonza.class, ArthurMulford.class, RobertoLeopardi.class,
		HamyarNasserAlIsmaili.class, OleChristofferHeierenHansen.class, DamianKeeley.class, AlanDennis.class,
		MuayadAlHaddad.class, AbdullahMayouf.class, BoboiSingh.class, RobPenders.class, HaJungWon.class,
		RobertVanKerkhoven.class, AbhijitDas.class, DimitriosManos.class, JoBackaert.class, TomBurrowsFootballer.class,
		RaafatAttia.class, MitchellJoseph.class, JoeReader.class, GillesDewaele.class, YorickAntheunis.class,
		BilelIfa.class, WaleedAlJasem.class, BradleyBeattie.class, YussefAlSuwayed.class, DimitrisMachairas.class,
		AndyHalls.class, MiguelVanDamme.class, AboubacarBangouraFootballer.class, DavidBueso.class, ArturDyson.class,
		JohannWindisch.class, CarlosLett.class, RobbinRuiter.class, ByronLawrence.class, ChrisMorrow.class,
		IliyaDimitrov.class, BenYagan.class, NedBromley.class, JackDeakin.class, FrancoAmoroso.class,
		JulianAguirreAgudelo.class, JuanAlfonsoValle.class, DavidMacgregor.class, ArthurBellamy.class,
		LucVanHoyweghen.class, KimBongHwan.class, BillWhare.class, DanielMudau.class, SzilviaSzeitl.class,
		LeonelParris.class, PaulDennyFootballer.class, JosefMajer.class, TommyGrahamEnglishFootballer.class,
		MomarBangoura.class, VinceKenny.class, BernardSmithFootballer.class, SelwynWhalley.class,
		OliverGustafsson.class, SilvioAppiani.class, ArthurTopham.class, BlasCristaldo.class,
		RichardWilliamsFootballer.class, SalahdineHmied.class, FredWoodward.class, DanielOliveiraCosta.class,
		JamesLamontFootballer.class, JosephGryzik.class, JaanusVeensalu.class, UrbanoRivera.class,
		AlbertReadFootballer.class, DavidLetham.class, DmytroYarchuk.class, AbdelazizSouleimani.class, AlanDunne.class,
		ArieDeWinter.class, TihomirNaydenov.class, WilliamCarrFootballer.class, GerLagendijk.class, TaariqFielies.class,
		WuWeiFootballer.class, TommyMorren.class, LuisMiguelValle.class, RomellBrathwaite.class, OhYoonKyung.class,
		KimJongMinFootballer.class, GerardoRomero.class, RossMcfarlaneFootballer.class, UrmasLiivamaa.class,
		KnutHansson.class, WalterBuchananFootballer.class, AbdelhamidSadmi.class, SurjayPariyar.class, LinoNessi.class,
		AlexGardnerFootballer.class, AndyDavisBritishVirginIslandsFootballer.class, SamirSaid.class, JimmyThorpe.class,
		FredFurniss.class, CyrilHennion.class, ConstantHuysmans.class, ParwinderSingh.class, BertFenwick.class,
		JaimeHuerta.class, ThomasDanks.class, AlfCarroll.class, MauriceWebster.class, PaulFlowersFootballer.class,
		PetarVelichkov.class, ChristianDean.class, HarryMooreFootballer.class, HugoLepe.class,
		GunnarOlssonFootballer.class, AbdullahAlDosari.class, TonyWingate.class, RudolfPichler.class, JimBlacker.class,
		AshleyFernandes.class, RobbieHaw.class, IvanDeyanov.class, FranciscoAlcarazFootballer.class, SaadAlHouti.class,
		TimHofstede.class, PiotrRobakowski.class, ZhuCongFootballer.class, FabienCool.class, ArvoKraam.class,
		HussainAlRomaihi.class, TonyMillerFootballer.class, AndreaFerrariFootballer.class, OliverGill.class,
		RyooChangKil.class, DineshSinghFootballer.class, AyronVerkindere.class, HarryHaddon.class, LiaoBochao.class,
		HarryMcmenemy.class, BobbyTynan.class, RyanLloyd.class, IbraAgbo.class, ChoiYungKeun.class, IvarEriksson.class,
		FredSpeller.class, HanChangWha.class, SanjibanGhosh.class, MikaelMandron.class, DeleAlli.class,
		RazaliSaad.class, ArthurGardnerFootballer.class, QuiterioOlmedo.class, ArthurStanton.class, FikriElma.class,
		JohanSvantesson.class, SjaakTroost.class, JenniferMolina.class, HenryHealless.class, PapeLatyrNDiaye.class,
		LudivineDiguelman.class, IsaacShai.class, AllanDevanney.class, DanielPappoe.class, DavidBuckFootballer.class,
		BruceCrawfordFootballer.class, RalphODonnell.class, SalvadorVillalba.class, LuisCruzFootballer.class,
		RobertoSosaUruguayanFootballer.class, IvayloZafirov.class, NoelGeorge.class, MahboubJumaA.class,
		RomanNykytyuk.class, CLallawmzuala.class, EliseoBrown.class, DesireMontgomeryButler.class, AndyMoule.class,
		SudhakaranKumar.class, AlessandroBianchiFootballerBorn1989.class, JoeLodge.class, PeterAllenFootballer.class,
		MariaMitkou.class, TonyEmery.class, NassirAlGhanim.class, KurtElshot.class, LalrinzualaKhiangte.class,
		MasoudZeraei.class, AlexFreitas.class, ArthurHallworth.class, BertieBowler.class, SerafimNeves.class,
		ErnestoBelis.class, LucasMichelMendes.class, AnthonyWordsworth.class, AbdulJabarHashimHanoon.class,
		TomBrooksFootballer.class, CharlieDeacon.class, GiuseppeKoschier.class, KarlErikGrahn.class, BrunoAppels.class,
		BenOlney.class, PeterGideon.class, LeeJongHo.class, IoannisStefas.class, BillyExley.class, JakobHaugaard.class,
		BrianAbrey.class, AlbertEvers.class, TonnyBrochmann.class, FanaiLalrempuia.class, LeonTol.class,
		JanekKiisman.class, })

@DirectInterface(get = IAntonioGreco.class)
public class AntonioGreco implements IAntonioGreco {

	final static public String ONTOLOGY_NAME = "http://psink.de/scio/AntonioGreco";
	final public String annotationID;
	@OntologyModelContent(ontologyName = "http://psink.de/dbpedia/hasBirthPlace")
	@RelationTypeCollection
	private List<IBirthPlace> birthPlaces = new ArrayList<>();
	@DatatypeProperty
	@OntologyModelContent(ontologyName = "http://psink.de/dbpedia/hasBirthYear")
	private IBirthYear birthYear;
	private Integer characterOffset;
	private Integer characterOnset;
	@OntologyModelContent(ontologyName = "http://psink.de/dbpedia/hasPosition")
	private IPosition position;
	final static private Map<IOBIEThing, String> resourceFactory = new HashMap<>();
	final static private long serialVersionUID = 1L;
	@RelationTypeCollection
	@OntologyModelContent(ontologyName = "http://psink.de/dbpedia/hasTeam")
	private List<ITeam> teams = new ArrayList<>();
	@TextMention
	final private String textMention;

	public AntonioGreco(AntonioGreco antonioGreco) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		this.annotationID = antonioGreco.getAnnotationID();
		for (int j = 0; j < antonioGreco.getBirthPlaces().size(); j++) {
			if (antonioGreco.getBirthPlaces().get(j) != null) {
				birthPlaces.add(antonioGreco.getBirthPlaces().get(j).getClass()
						.getDeclaredConstructor(antonioGreco.getBirthPlaces().get(j).getClass())
						.newInstance(antonioGreco.getBirthPlaces().get(j)));
			} else {
				birthPlaces.add(null);
			}
		}
		if (antonioGreco.getBirthYear() != null)
			this.birthYear = antonioGreco.getBirthYear().getClass()
					.getDeclaredConstructor(antonioGreco.getBirthYear().getClass())
					.newInstance(antonioGreco.getBirthYear());
		this.characterOffset = antonioGreco.getCharacterOffset();
		this.characterOnset = antonioGreco.getCharacterOnset();
		if (antonioGreco.getPosition() != null)
			this.position = antonioGreco.getPosition().getClass()
					.getDeclaredConstructor(antonioGreco.getPosition().getClass())
					.newInstance(antonioGreco.getPosition());
		for (int j = 0; j < antonioGreco.getTeams().size(); j++) {
			if (antonioGreco.getTeams().get(j) != null) {
				teams.add(antonioGreco.getTeams().get(j).getClass()
						.getDeclaredConstructor(antonioGreco.getTeams().get(j).getClass())
						.newInstance(antonioGreco.getTeams().get(j)));
			} else {
				teams.add(null);
			}
		}
		this.textMention = antonioGreco.getTextMention();
	}

	public AntonioGreco(String annotationID, String textMention) {
		this.annotationID = annotationID;
		this.textMention = textMention;
	}

	public AntonioGreco() {
		this.annotationID = null;
		this.textMention = null;
	}

	/***/
	@Override
	public AntonioGreco addBirthPlace(IBirthPlace birthPlace) {
		this.birthPlaces.add(birthPlace);
		return this;
	}

	/***/
	@Override
	public AntonioGreco addTeam(ITeam team) {
		this.teams.add(team);
		return this;
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
		AntonioGreco other = (AntonioGreco) obj;
		if (characterOffset == null) {
			if (other.characterOffset != null)
				return false;
		} else if (!characterOffset.equals(other.characterOffset))
			return false;
		if (birthYear == null) {
			if (other.birthYear != null)
				return false;
		} else if (!birthYear.equals(other.birthYear))
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
		if (birthPlaces == null) {
			if (other.birthPlaces != null)
				return false;
		} else if (!birthPlaces.equals(other.birthPlaces))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (annotationID == null) {
			if (other.annotationID != null)
				return false;
		} else if (!annotationID.equals(other.annotationID))
			return false;
		if (teams == null) {
			if (other.teams != null)
				return false;
		} else if (!teams.equals(other.teams))
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
	public List<IBirthPlace> getBirthPlaces() {
		return birthPlaces;
	}

	/***/
	@Override
	public IBirthYear getBirthYear() {
		return birthYear;
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
	public IPosition getPosition() {
		return position;
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
	public List<ITeam> getTeams() {
		return teams;
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
		result = prime * result + ((this.birthYear == null) ? 0 : this.birthYear.hashCode());
		result = prime * result + ((this.characterOnset == null) ? 0 : this.characterOnset.hashCode());
		result = prime * result + ((this.textMention == null) ? 0 : this.textMention.hashCode());
		result = prime * result + ((this.birthPlaces == null) ? 0 : this.birthPlaces.hashCode());
		result = prime * result + ((this.position == null) ? 0 : this.position.hashCode());
		result = prime * result + ((this.annotationID == null) ? 0 : this.annotationID.hashCode());
		result = prime * result + ((this.teams == null) ? 0 : this.teams.hashCode());
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
	public AntonioGreco setBirthPlaces(List<IBirthPlace> birthPlaces) {
		if (birthPlaces == null) {
			throw new IllegalArgumentException("Can not set list objects to null.");
		}
		this.birthPlaces = birthPlaces;
		return this;
	}

	/***/
	@Override
	public AntonioGreco setBirthYear(IBirthYear birthYear) {
		this.birthYear = birthYear;
		return this;
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

	/***/
	@Override
	public AntonioGreco setPosition(IPosition position) {
		this.position = position;
		return this;
	}

	/***/
	@Override
	public AntonioGreco setTeams(List<ITeam> teams) {
		if (teams == null) {
			throw new IllegalArgumentException("Can not set list objects to null.");
		}
		this.teams = teams;
		return this;
	}

	@Override
	public String toString() {
		return "AntonioGreco [annotationID=" + annotationID + ",birthPlaces=" + birthPlaces + ",birthYear=" + birthYear
				+ ",characterOffset=" + characterOffset + ",characterOnset=" + characterOnset + ",position=" + position
				+ ",serialVersionUID=" + serialVersionUID + ",teams=" + teams + ",textMention=" + textMention + "]";
	}

}
