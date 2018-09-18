package de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.interfaces;

import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.AssignableSubInterfaces;
import de.uni.bielefeld.sc.hterhors.psink.obie.core.ontology.annotations.ImplementationClass;
import de.uni.bielefeld.sc.hterhors.psink.obie.projects.soccerplayer.ontology.classes.Place;

/**
 *
 * @author hterhors
 *
 *
 *         Sep 6, 2018
 */

@AssignableSubInterfaces(get = { IMalta.class, IHorsens.class, ICrediton.class, IStaffordshire.class,
		IEllesmereShropshire.class, IFrimley.class, ISkelmanthorpe.class, ITorquay.class, ITruro.class, ISofia.class,
		ILondonBoroughOfCamden.class, IBasildon.class, IKatowice.class, IKrugersdorp.class, IWestBengal.class,
		IBristol.class, IOklahoma.class, IFulham.class, IMaltaNationalFootballTeam.class, IGhana.class, ILeeds.class,
		IHighgate.class, IChile.class, ISalzwedel.class, IGlasgow.class, IClydebank.class, ITurnhout.class,
		IIsrael.class, IBirmingham.class, ITiraspol.class, ICarlisleCumbria.class, IGirvan.class, ILunglei.class,
		IWarrington.class, IIndonesia.class, ISaltoUruguay.class, ISunderlandTyneAndWear.class, IGuernsey.class,
		IRutherglen.class, ILisbon.class, IGrimsby.class, IMiltonKeynes.class, IUruguay.class, IParamaribo.class,
		ITunis.class, ILiverpool.class, IAlgeria.class, IFrance.class, IEnglandNationalFootballTeam.class,
		IChester.class, ISenegal.class, IBirthPlace.class, IAmsterdam.class, IBradford.class, IAshtonUnderLyne.class,
		IMeasham.class, IBoulogneSurMer.class, ISovietUnion.class, IOman.class, IMealhada.class, IFarnham.class,
		ISliema.class, IMarketDrayton.class, INorthernIreland.class, IMontpellier.class, ITunisia.class,
		ISingapore.class, IManganIndia.class, IJamaica.class, ITeignmouth.class, ILondon.class, INorthKorea.class,
		IPoland.class, INigeria.class, IBulgaria.class, IKiryatMotzkin.class, IPietRetiefMpumalanga.class, IOtley.class,
		IUlcebyNorthLincolnshire.class, IWigan.class, IHamsterleyConsett.class, IBudapest.class, IColchester.class,
		IZambia.class, IWuchuanGuangdong.class, IStocktonOnTees.class, IHendon.class, IEastGermany.class,
		IBenoniGauteng.class, IUrmston.class, IHaiti.class, IMexico.class, IAntwerp.class, IBahrain.class,
		IBitterne.class, ICudworthSouthYorkshire.class, ITianjin.class, INewcastleUponTyne.class,
		ISremskaMitrovica.class, IHornsey.class, IBolivia.class, ICookIslands.class, IIndia.class, IMizoram.class,
		IMarlowBuckinghamshire.class, IBataEquatorialGuinea.class, IPadua.class, ILeiden.class, IWestBromwich.class,
		IMilan.class, IHeanor.class, ILebanon.class, INorthampton.class, ICostaRica.class, ISouthKorea.class,
		IBloxwich.class, IEastbourne.class, ISikkim.class, ILagos.class, IDundee.class, IEdinburgh.class, ILaPaz.class,
		ISaudiArabia.class, ITunisiaNationalFootballTeam.class, IKwaggafontein.class, IGermany.class, IPeru.class,
		ISuriname.class, INetherlands.class, IBelfast.class, IGrenoble.class, ISanMarino.class, IEaling.class,
		IEllonAberdeenshire.class, INottingham.class, IKolhapur.class, IIran.class, IDijon.class, IAlexandria.class,
		IYugoslavia.class, IIpswich.class, IMaharashtra.class, IBathSomerset.class, IBreda.class, IBrighton.class,
		ISherborne.class, ISwansea.class, IShropshire.class, IDublin.class, INorwayNationalFootballTeam.class,
		IDarlington.class, ITegelen.class, IBritishVirginIslands.class, ILuxembourgCity.class, ISilksworth.class,
		ICapeTown.class, IKenema.class, INijmegen.class, IArgentinaNationalFootballTeam.class, IChelmsford.class,
		IIrvineNorthAyrshire.class, IJarrow.class, ICasablanca.class, IRouen.class, INewcastleUnderLyme.class,
		IPakistan.class, IPelsall.class, IParalimni.class, IBrussels.class, IEgersund.class, IChina.class,
		IWejherowo.class, IWallsend.class, IZeist.class, IBootle.class, IAmericanSamoa.class, IGreenock.class,
		IHolborn.class, INorthumberland.class, IPernisNetherlands.class, ISanJoseCalifornia.class, IHoorn.class,
		IDakar.class, ISwitzerland.class, IAustria.class, IClowne.class, ILuxembourgNationalFootballTeam.class,
		IKamptee.class, IItaly.class, IKimberworth.class, IDupnitsa.class, IEgypt.class, IDerby.class,
		IFredrikstad.class, IEstonia.class, IIraq.class, IDenmark.class, ICambridge.class, ITunstallStaffordshire.class,
		IDalian.class, IMalabo.class, ISouthampton.class, IRepublicOfIreland.class, IMykolaiv.class, INorway.class,
		IBarbados.class, IWylam.class, IAustralia.class, IFranceWomenSNationalFootballTeam.class, IUkraine.class,
		IHungary.class, IAzazga.class, ITartu.class, IInverness.class, IEquatorialGuinea.class, ITurin.class,
		ISalfordGreaterManchester.class, IArgentina.class, ISmethwick.class, ILeith.class, IRosarioSantaFe.class,
		IGoa.class, IGreece.class, IKirklandWashington.class, IRennebu.class, IRecife.class, IOklahomaCity.class,
		IQuetta.class, IRioDeJaneiro.class, ILeicestershire.class, IStepney.class, IOswaldtwistle.class,
		ICoatbridge.class, IAngola.class, IGuinea.class, IHaarlem.class, IWakefield.class, IHonduras.class,
		IPortoVecchio.class, IConsett.class, IIrkutsk.class, IPortugal.class, IAshtonInMakerfield.class, IOuakam.class,
		IHeide.class, IRamatHasharon.class, ILincolnEngland.class, IKolkata.class, IFerryhill.class, IBelgium.class,
		ISpondon.class, IUpminster.class, IDagenham.class, IWestonSuperMare.class, IScotland.class, IChesterfield.class,
		INijkerk.class, IAnkara.class, IBlackpool.class, IWestHam.class, IDominica.class, ISweden.class, IDevon.class,
		IWolverhampton.class, IRotterdam.class, IYork.class, IEngland.class, IGrenada.class, IMexicoCity.class,
		IStokeUponTrent.class, IMeaux.class, IMorocco.class, IBurkinaFaso.class, ILichfield.class, IHoofddorp.class,
		ISouthAfrica.class, ILiaoning.class, IDjiboutiNationalFootballTeam.class, ICoronelOviedo.class, IBrazil.class,
		ITrikala.class, ILIsleAdamValDOise.class, IDouala.class, IZambiaNationalFootballTeam.class, ICuritiba.class,
		IVolendam.class, IAnambraState.class, INeath.class, IStokeOnTrent.class, IAltofts.class, IManchester.class,
		IMoseley.class, IRomania.class, IParaguay.class, IKuwait.class, IIslington.class, IZaandam.class,
		IGuangdong.class, ICameroon.class, IKirkby.class, ICalifornia.class, ISileby.class, IWales.class,
		IWilford.class, IEastTimor.class, IAlmada.class, ICroydon.class, IBlackburn.class, IPrestonLancashire.class,
		IRussia.class, IBasfordNottinghamshire.class, IMamelodi.class, IKasamaZambia.class, IEnschede.class,
		ICowlairs.class, IPanamaNationalFootballTeam.class, ICyprus.class, IBuenosAires.class, ILuanda.class,
		ISierraLeone.class, IManipur.class, ICzechoslovakia.class, IEdmontonLondon.class, IAccra.class, ITurkey.class,
		ISheffield.class, IPyrgosElis.class, IMoldova.class, IMaastricht.class, IWillingtonCheshire.class, IHove.class,
		IEastPaloAltoCalifornia.class, IQatar.class, IAryanah.class, IPortsmouth.class, IRabat.class, })

@ImplementationClass(get = Place.class)
public interface IPlace extends ISoccerPlayerThing {

}
