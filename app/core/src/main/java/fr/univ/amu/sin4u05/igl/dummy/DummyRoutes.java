package fr.univ.amu.sin4u05.igl.dummy;

import fr.univ.amu.sin4u05.igl.routes.*;
import fr.univ.amu.sin4u05.igl.util.Coordinates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

/**
 * Some dummy precomputed routes to ease the development of the frontend of the application.
 */
@SuppressWarnings("WeakerAccess")
public class DummyRoutes {

    private static Station station_STE_TRINITE = new Station("STE TRINITE");
    private static Station station_SAINT_CHARLES = new Station("SAINT CHARLES");
    private static Station station_BELLE_DE_MAI_LA_FRICHE = new Station("BELLE DE MAI LA FRICHE");
    private static Station station_CANEBIERE_REFORMES = new Station("CANEBIERE REFORMES");
    private static Station station_CASTELLANE = new Station("CASTELLANE");
    private static Station station_HOPITAL_SAINTE_MARGUERITE = new Station("HOPITAL SAINTE MARGUERITE");
    private static Station station_LOUBON_BELLEVUE = new Station("LOUBON BELLEVUE");
    private static Station station_LUMINY_KEDGE_BS = new Station("LUMINY KEDGE BS");
    private static Station station_LES_GATONS_PLAGE = new Station("LES GATONS PLAGE");
    private static Station station_HOPITAL_SALVATOR_PAOLI_CALMETTES = new Station("HOPITAL SALVATOR PAOLI CALMETTES");
    private static Station station_LE_CABOT = new Station("LE CABOT");
    private static Station station_LAVERAN_DIDEROT = new Station("LAVERAN DIDEROT");
    private static Station station_SAINT_JEROME_FACULTE = new Station("SAINT JEROME FACULTE");
    private static Station station_JULES__GUESDE = new Station("JULES  GUESDE");
    private static Station station_GRAND_PRE = new Station("GRAND PRE");
    private static Station station_METRO_ROND_POINT_DU_PRADO = new Station("METRO ROND POINT DU PRADO");
    private static Station station_MICHELET_LUCE = new Station("MICHELET LUCE");
    private static Station station_PLACE_CAFFO = new Station("PLACE CAFFO");
    private static Station station_METRO_JULES_GUESDE = new Station("METRO JULES GUESDE");
    private static Station station_PRADO_PERIER = new Station("PRADO PERIER");
    private static Station station_MICHELET_GANAY = new Station("MICHELET GANAY");
    private static Station station_PLACE_DE_STRASBOURG = new Station("PLACE DE STRASBOURG");
    private static Station station_CINQ_AVENUES_LONGCHAMP = new Station("CINQ AVENUES LONGCHAMP");
    private static Station station_MONET_FLORIDA = new Station("MONET FLORIDA");
    private static Station station_PRADO_LOUVAIN = new Station("PRADO LOUVAIN");
    private static Station station_VILLECROZE_BOUGIE = new Station("VILLECROZE BOUGIE");
    private static Station station_MICHELET_HUVEAUNE = new Station("MICHELET HUVEAUNE");
    private static Station station_LOUBON_BARBINI = new Station("LOUBON BARBINI");
    private static Station station_PRADO_RODOCANACHI = new Station("PRADO RODOCANACHI");
    private static Station station_MUSEE_DE_LA_MOTO = new Station("MUSEE DE LA MOTO");
    private static Station station_LA_GOUFFONNE = new Station("LA GOUFFONNE");
    private static Station station_LUMINY_PN_DES_CALANQUES = new Station("LUMINY PN DES CALANQUES");
    private static Station station_ALLEE_DES_PINS = new Station("ALLEE DES PINS");
    private static Station station_PRADO_BORDE = new Station("PRADO BORDE");
    private static Station station_PARC_BORELY = new Station("PARC BORELY");
    private static Station station_VIEILLE_CHAPELLE = new Station("VIEILLE CHAPELLE");
    private static Station station_VOLTAIRE_ST_CHARLES = new Station("VOLTAIRE ST CHARLES");
    private static Station station_PRADO_TUNIS = new Station("PRADO TUNIS");
    private static Station station_FLAMMARION_ISOARD = new Station("FLAMMARION ISOARD");
    private static Station station_LUMINY_COMPLEXE_SPORTIF = new Station("LUMINY COMPLEXE SPORTIF");
    private static Station station_LACHAMP_LE_CLOS_DES_IRIS = new Station("LACHAMP LE CLOS DES IRIS");
    private static Station station_PARIS_FORBIN = new Station("PARIS FORBIN");
    private static Station station_STADE_DE_MALPASSE = new Station("STADE DE MALPASSE");
    private static Station station_MICHELET_RAMON = new Station("MICHELET RAMON");
    private static Station station_RESIDENCE_VALMONT_REDON = new Station("RESIDENCE VALMONT REDON");
    private static Station station_LUMINY_LACHAMP = new Station("LUMINY LACHAMP");
    private static Station station_LE_CORBUSIER = new Station("LE CORBUSIER");
    private static Station station_MALPASSE = new Station("MALPASSE");
    private static Station station_METRO_STE_MARGUERITE_DROMEL = new Station("METRO STE MARGUERITE DROMEL");
    private static Station station_LA_PLAGE = new Station("LA PLAGE");
    private static Station station_PROSPER_MERIMEE_SAINT_PAUL = new Station("PROSPER MERIMEE SAINT PAUL");
    private static Station station_LACHAMP_LUMINY = new Station("LACHAMP LUMINY");
    private static Station station_LES_CEDRES = new Station("LES CEDRES");
    private static Station station_VILLECROZE_LES_OLIVIERS = new Station("VILLECROZE LES OLIVIERS");
    private static Station station_MICHELET_BONNEAUDE = new Station("MICHELET BONNEAUDE");
    private static Station station_CC_VALMANTE = new Station("CC VALMANTE");
    private static Station station_COLLEGE_ROSTAND = new Station("COLLEGE ROSTAND");
    private static Station station_PRADO_SAINT_EXUPERY = new Station("PRADO SAINT EXUPERY");
    private static Station station_PLACE_LEVERRIER = new Station("PLACE LEVERRIER");
    private static Station station_LA_ROUVIERE = new Station("LA ROUVIERE");
    private static Station station_LE_FANGAS = new Station("LE FANGAS");
    private static Station station_MARATHON_LAVERAN = new Station("MARATHON LAVERAN");
    private static Station station_ROND_POINT_DU_PRADO = new Station("ROND POINT DU PRADO");
    private static Station station_LYCEE_ST_CHARLES = new Station("LYCEE ST CHARLES");
    private static Station station_MERIMEE_COROT = new Station("MERIMEE COROT");
    private static Station station_NATIONAL_LOUBON = new Station("NATIONAL LOUBON");
    private static Station station_TIBOULEN = new Station("TIBOULEN");
    private static Station station_SAINTE_MARGUERITE_DROMEL = new Station("SAINTE MARGUERITE DROMEL");
    private static Station station_BENEDIT = new Station("BENEDIT");
    private static Station station_NOTRE_DAME_DU_MONT = new Station("NOTRE DAME DU MONT");
    private static Station station_CHARTREUX = new Station("CHARTREUX");
    private static Station station_PRADO_SAINT_GINIEZ = new Station("PRADO SAINT GINIEZ");
    private static Station station_COLBERT_HOTEL_DE_REGION = new Station("COLBERT HOTEL DE REGION");
    private static Station station_LUMINY_FACULTE = new Station("LUMINY FACULTE");
    private static Station station_PLOMBIERES_ARNAL = new Station("PLOMBIERES ARNAL");
    private static Station station_MICHELET_TAINE = new Station("MICHELET TAINE");
    private static Station station_BELLE_DE_MAI = new Station("BELLE DE MAI");
    private static Station station_CENTRE_CIAL_DU_MERLAN = new Station("CENTRE CIAL DU MERLAN");
    private static Station station_MICHELET_BLANC = new Station("MICHELET BLANC");
    private static Station station_BUREL_PLOMBIERES = new Station("BUREL PLOMBIERES");
    private static Station station_PRADO_DUPRE = new Station("PRADO DUPRE");
    private static Station station_LES_OLIVIERS = new Station("LES OLIVIERS");
    private static Station station_STRASBOURG_DESAIX = new Station("STRASBOURG DESAIX");
    private static Station station_VIEUX_PORT = new Station("VIEUX PORT");
    private static Station station_5_AVENUES_BUREL = new Station("5 AVENUES BUREL");
    private static Station station_LE_REDON_LA_PANOUSE = new Station("LE REDON LA PANOUSE");
    private static Station station_MONET_SAINT_BARTHELEMY = new Station("MONET SAINT BARTHELEMY");
    private static Station station_MICHELET_BOUSQUET = new Station("MICHELET BOUSQUET");
    private static Station station_SAINTE_MARGUERITE = new Station("SAINTE MARGUERITE");
    private static Station station_POINTE_ROUGE = new Station("POINTE ROUGE");
    private static Station station_VILLECROZE_MARRONNIERS = new Station("VILLECROZE MARRONNIERS");
    private static Station station_HLM_DE_LUMINY = new Station("HLM DE LUMINY");
    private static Station station_SAINT_JUST = new Station("SAINT JUST");
    private static Station station_LES_LILAS = new Station("LES LILAS");
    private static Station station_OBELISQUE = new Station("OBELISQUE");
    private static Station station_NOAILLES = new Station("NOAILLES");
    private static Station station_PERIER = new Station("PERIER");
    private static Station station_HOPITAL_LAVERAN = new Station("HOPITAL LAVERAN");
    private static Station station_TOMASI = new Station("TOMASI");
    private static Station station_ANTIDE_BOYER = new Station("ANTIDE BOYER");
    private static Station station_LA_PUGETTE = new Station("LA PUGETTE");
    private static Station station_LE_REDON = new Station("LE REDON");
    private static Station station_HIPPODROME_PLAGE = new Station("HIPPODROME PLAGE");
    private static Station station_MONET_LAVANDINS = new Station("MONET LAVANDINS");
    private static Station station_ESTRANGIN = new Station("ESTRANGIN");

    /**
     * A list of all stations used in {@link #ROUTES_1} and {@link #ROUTES_2}.
     */
    public static final List<Station> ALL_STATIONS = Arrays.asList(
            station_5_AVENUES_BUREL, station_ALLEE_DES_PINS, station_ANTIDE_BOYER, station_BELLE_DE_MAI, station_BELLE_DE_MAI_LA_FRICHE, station_BENEDIT, station_BUREL_PLOMBIERES, station_CANEBIERE_REFORMES, station_CASTELLANE, station_CC_VALMANTE, station_CENTRE_CIAL_DU_MERLAN, station_CHARTREUX, station_CINQ_AVENUES_LONGCHAMP, station_COLBERT_HOTEL_DE_REGION, station_COLLEGE_ROSTAND, station_ESTRANGIN, station_FLAMMARION_ISOARD, station_GRAND_PRE, station_HIPPODROME_PLAGE, station_HLM_DE_LUMINY, station_HOPITAL_LAVERAN, station_HOPITAL_SAINTE_MARGUERITE, station_HOPITAL_SALVATOR_PAOLI_CALMETTES, station_JULES__GUESDE, station_LA_GOUFFONNE, station_LA_PLAGE, station_LA_PUGETTE, station_LA_ROUVIERE, station_LACHAMP_LE_CLOS_DES_IRIS, station_LACHAMP_LUMINY, station_LAVERAN_DIDEROT, station_LE_CABOT, station_LE_CORBUSIER, station_LE_FANGAS, station_LE_REDON, station_LE_REDON_LA_PANOUSE, station_LES_CEDRES, station_LES_GATONS_PLAGE, station_LES_LILAS, station_LES_OLIVIERS, station_LOUBON_BARBINI, station_LOUBON_BELLEVUE, station_LUMINY_COMPLEXE_SPORTIF, station_LUMINY_FACULTE, station_LUMINY_KEDGE_BS, station_LUMINY_LACHAMP, station_LUMINY_PN_DES_CALANQUES, station_LYCEE_ST_CHARLES, station_MALPASSE, station_MARATHON_LAVERAN, station_MERIMEE_COROT, station_METRO_JULES_GUESDE, station_METRO_ROND_POINT_DU_PRADO, station_METRO_ROND_POINT_DU_PRADO, station_METRO_STE_MARGUERITE_DROMEL, station_MICHELET_BLANC, station_MICHELET_BONNEAUDE, station_MICHELET_BOUSQUET, station_MICHELET_GANAY, station_MICHELET_HUVEAUNE, station_MICHELET_LUCE, station_MICHELET_RAMON, station_MICHELET_TAINE, station_MONET_FLORIDA, station_MONET_LAVANDINS, station_MONET_SAINT_BARTHELEMY, station_MUSEE_DE_LA_MOTO, station_NATIONAL_LOUBON, station_NOAILLES, station_NOTRE_DAME_DU_MONT, station_OBELISQUE, station_PARC_BORELY, station_PARIS_FORBIN, station_PERIER, station_PLACE_CAFFO, station_PLACE_DE_STRASBOURG, station_PLACE_LEVERRIER, station_PLOMBIERES_ARNAL, station_POINTE_ROUGE, station_PRADO_BORDE, station_PRADO_DUPRE, station_PRADO_LOUVAIN, station_PRADO_PERIER, station_PRADO_RODOCANACHI, station_PRADO_SAINT_EXUPERY, station_PRADO_SAINT_GINIEZ, station_PRADO_TUNIS, station_PROSPER_MERIMEE_SAINT_PAUL, station_RESIDENCE_VALMONT_REDON, station_ROND_POINT_DU_PRADO, station_SAINT_CHARLES, station_SAINT_JEROME_FACULTE, station_SAINT_JUST, station_SAINTE_MARGUERITE, station_SAINTE_MARGUERITE_DROMEL, station_STADE_DE_MALPASSE, station_STE_TRINITE, station_STRASBOURG_DESAIX, station_TIBOULEN, station_TOMASI, station_VIEILLE_CHAPELLE, station_VIEUX_PORT, station_VILLECROZE_BOUGIE, station_VILLECROZE_LES_OLIVIERS, station_VILLECROZE_MARRONNIERS, station_VOLTAIRE_ST_CHARLES
    );

    private static final StationStop stop1761 = new StationStop(1761, station_CC_VALMANTE, new Coordinates(43.25, 5.42));
    private static final StationStop stop1763 = new StationStop(1763, station_RESIDENCE_VALMONT_REDON, new Coordinates(43.25, 5.42));
    private static final StationStop stop1764 = new StationStop(1764, station_LE_REDON, new Coordinates(43.24, 5.43));
    private static final StationStop stop1765 = new StationStop(1765, station_LACHAMP_LE_CLOS_DES_IRIS, new Coordinates(43.25, 5.43));
    private static final StationStop stop2278 = new StationStop(2278, station_MALPASSE, new Coordinates(43.32, 5.42));
    private static final StationStop stop1766 = new StationStop(1766, station_LUMINY_LACHAMP, new Coordinates(43.25, 5.44));
    private static final StationStop stop2279 = new StationStop(2279, station_SAINT_JUST, new Coordinates(43.32, 5.41));
    private static final StationStop stop1767 = new StationStop(1767, station_HLM_DE_LUMINY, new Coordinates(43.24, 5.44));
    private static final StationStop stop2280 = new StationStop(2280, station_CHARTREUX, new Coordinates(43.31, 5.40));
    private static final StationStop stop1768 = new StationStop(1768, station_LUMINY_COMPLEXE_SPORTIF, new Coordinates(43.24, 5.44));
    private static final StationStop stop2281 = new StationStop(2281, station_CINQ_AVENUES_LONGCHAMP, new Coordinates(43.30, 5.40));
    private static final StationStop stop1769 = new StationStop(1769, station_LUMINY_KEDGE_BS, new Coordinates(43.23, 5.44));
    private static final StationStop stop2282 = new StationStop(2282, station_CANEBIERE_REFORMES, new Coordinates(43.30, 5.39));
    private static final StationStop stop2283 = new StationStop(2283, station_SAINT_CHARLES, new Coordinates(43.30, 5.38));
    private static final StationStop stop2284 = new StationStop(2284, station_COLBERT_HOTEL_DE_REGION, new Coordinates(43.30, 5.37));
    private static final StationStop stop2285 = new StationStop(2285, station_VIEUX_PORT, new Coordinates(43.30, 5.37));
    private static final StationStop stop2286 = new StationStop(2286, station_ESTRANGIN, new Coordinates(43.29, 5.38));
    private static final StationStop stop2287 = new StationStop(2287, station_CASTELLANE, new Coordinates(43.29, 5.38));
    private static final StationStop stop2551 = new StationStop(2551, station_LYCEE_ST_CHARLES, new Coordinates(43.31, 5.39));
    private static final StationStop stop2808 = new StationStop(2808, station_METRO_ROND_POINT_DU_PRADO, new Coordinates(43.27, 5.39));
    private static final StationStop stop4348 = new StationStop(4348, station_LUMINY_FACULTE, new Coordinates(43.23, 5.44));
    private static final StationStop stop3070 = new StationStop(3070, station_MONET_LAVANDINS, new Coordinates(43.32, 5.39));
    private static final StationStop stop3838 = new StationStop(3838, station_BENEDIT, new Coordinates(43.31, 5.39));
    private static final StationStop stop1792 = new StationStop(1792, station_LACHAMP_LUMINY, new Coordinates(43.25, 5.44));
    private static final StationStop stop3585 = new StationStop(3585, station_METRO_ROND_POINT_DU_PRADO, new Coordinates(43.27, 5.39));
    private static final StationStop stop2308 = new StationStop(2308, station_JULES__GUESDE, new Coordinates(43.30, 5.37));
    private static final StationStop stop2309 = new StationStop(2309, station_SAINT_CHARLES, new Coordinates(43.30, 5.38));
    private static final StationStop stop2310 = new StationStop(2310, station_NOAILLES, new Coordinates(43.30, 5.38));
    private static final StationStop stop2311 = new StationStop(2311, station_NOTRE_DAME_DU_MONT, new Coordinates(43.29, 5.38));
    private static final StationStop stop2313 = new StationStop(2313, station_CASTELLANE, new Coordinates(43.29, 5.38));
    private static final StationStop stop2314 = new StationStop(2314, station_PERIER, new Coordinates(43.28, 5.39));
    private static final StationStop stop2315 = new StationStop(2315, station_ROND_POINT_DU_PRADO, new Coordinates(43.27, 5.39));
    private static final StationStop stop524 = new StationStop(524, station_PARIS_FORBIN, new Coordinates(43.31, 5.37));
    private static final StationStop stop2316 = new StationStop(2316, station_SAINTE_MARGUERITE_DROMEL, new Coordinates(43.27, 5.40));
    private static final StationStop stop525 = new StationStop(525, station_METRO_JULES_GUESDE, new Coordinates(43.30, 5.37));
    private static final StationStop stop3342 = new StationStop(3342, station_VOLTAIRE_ST_CHARLES, new Coordinates(43.30, 5.38));
    private static final StationStop stop2321 = new StationStop(2321, station_SAINT_CHARLES, new Coordinates(43.30, 5.38));
    private static final StationStop stop2322 = new StationStop(2322, station_NOAILLES, new Coordinates(43.30, 5.38));
    private static final StationStop stop2323 = new StationStop(2323, station_NOTRE_DAME_DU_MONT, new Coordinates(43.29, 5.38));
    private static final StationStop stop2324 = new StationStop(2324, station_CASTELLANE, new Coordinates(43.29, 5.38));
    private static final StationStop stop2325 = new StationStop(2325, station_PERIER, new Coordinates(43.28, 5.39));
    private static final StationStop stop2326 = new StationStop(2326, station_ROND_POINT_DU_PRADO, new Coordinates(43.27, 5.39));
    private static final StationStop stop1050 = new StationStop(1050, station_STADE_DE_MALPASSE, new Coordinates(43.33, 5.41));
    private static final StationStop stop3866 = new StationStop(3866, station_BELLE_DE_MAI_LA_FRICHE, new Coordinates(43.31, 5.39));
    private static final StationStop stop1051 = new StationStop(1051, station_MERIMEE_COROT, new Coordinates(43.33, 5.40));
    private static final StationStop stop1052 = new StationStop(1052, station_MONET_FLORIDA, new Coordinates(43.33, 5.39));
    private static final StationStop stop1053 = new StationStop(1053, station_MONET_SAINT_BARTHELEMY, new Coordinates(43.32, 5.39));
    private static final StationStop stop1054 = new StationStop(1054, station_VILLECROZE_BOUGIE, new Coordinates(43.32, 5.39));
    private static final StationStop stop1055 = new StationStop(1055, station_VILLECROZE_MARRONNIERS, new Coordinates(43.32, 5.39));
    private static final StationStop stop3872 = new StationStop(3872, station_LUMINY_PN_DES_CALANQUES, new Coordinates(43.23, 5.44));
    private static final StationStop stop1056 = new StationStop(1056, station_5_AVENUES_BUREL, new Coordinates(43.32, 5.39));
    private static final StationStop stop3388 = new StationStop(3388, station_BELLE_DE_MAI, new Coordinates(43.31, 5.39));
    private static final StationStop stop347 = new StationStop(347, station_LAVERAN_DIDEROT, new Coordinates(43.32, 5.41));
    private static final StationStop stop348 = new StationStop(348, station_MALPASSE, new Coordinates(43.32, 5.41));
    private static final StationStop stop1887 = new StationStop(1887, station_METRO_STE_MARGUERITE_DROMEL, new Coordinates(43.27, 5.40));
    private static final StationStop stop352 = new StationStop(352, station_MARATHON_LAVERAN, new Coordinates(43.33, 5.41));
    private static final StationStop stop1888 = new StationStop(1888, station_LA_PUGETTE, new Coordinates(43.27, 5.40));
    private static final StationStop stop1889 = new StationStop(1889, station_SAINTE_MARGUERITE, new Coordinates(43.27, 5.41));
    private static final StationStop stop354 = new StationStop(354, station_LES_CEDRES, new Coordinates(43.33, 5.41));
    private static final StationStop stop1890 = new StationStop(1890, station_ANTIDE_BOYER, new Coordinates(43.27, 5.41));
    private static final StationStop stop355 = new StationStop(355, station_COLLEGE_ROSTAND, new Coordinates(43.33, 5.41));
    private static final StationStop stop1891 = new StationStop(1891, station_HOPITAL_SALVATOR_PAOLI_CALMETTES, new Coordinates(43.26, 5.41));
    private static final StationStop stop356 = new StationStop(356, station_VILLECROZE_LES_OLIVIERS, new Coordinates(43.33, 5.41));
    private static final StationStop stop1892 = new StationStop(1892, station_HOPITAL_SAINTE_MARGUERITE, new Coordinates(43.26, 5.41));
    private static final StationStop stop357 = new StationStop(357, station_MUSEE_DE_LA_MOTO, new Coordinates(43.33, 5.40));
    private static final StationStop stop1893 = new StationStop(1893, station_GRAND_PRE, new Coordinates(43.26, 5.41));
    private static final StationStop stop1894 = new StationStop(1894, station_LE_CABOT, new Coordinates(43.26, 5.42));
    private static final StationStop stop1895 = new StationStop(1895, station_LE_REDON_LA_PANOUSE, new Coordinates(43.26, 5.42));
    private static final StationStop stop1896 = new StationStop(1896, station_ALLEE_DES_PINS, new Coordinates(43.25, 5.42));
    private static final StationStop stop1897 = new StationStop(1897, station_LA_ROUVIERE, new Coordinates(43.25, 5.42));
    private static final StationStop stop1898 = new StationStop(1898, station_LE_FANGAS, new Coordinates(43.25, 5.42));
    private static final StationStop stop1899 = new StationStop(1899, station_LA_GOUFFONNE, new Coordinates(43.25, 5.42));
    private static final StationStop stop1900 = new StationStop(1900, station_LE_REDON, new Coordinates(43.24, 5.43));
    private static final StationStop stop1142 = new StationStop(1142, station_PRADO_SAINT_GINIEZ, new Coordinates(43.27, 5.39));
    private static final StationStop stop4251 = new StationStop(4251, station_STE_TRINITE, new Coordinates(43.25, 5.41));
    private static final StationStop stop1696 = new StationStop(1696, station_PRADO_PERIER, new Coordinates(43.28, 5.39));
    private static final StationStop stop1697 = new StationStop(1697, station_PRADO_BORDE, new Coordinates(43.28, 5.39));
    private static final StationStop stop1698 = new StationStop(1698, station_PRADO_LOUVAIN, new Coordinates(43.28, 5.39));
    private static final StationStop stop1699 = new StationStop(1699, station_PRADO_RODOCANACHI, new Coordinates(43.27, 5.39));
    private static final StationStop stop1704 = new StationStop(1704, station_LA_PLAGE, new Coordinates(43.26, 5.38));
    private static final StationStop stop2736 = new StationStop(2736, station_ROND_POINT_DU_PRADO, new Coordinates(43.27, 5.39));
    private static final StationStop stop3773 = new StationStop(3773, station_CASTELLANE, new Coordinates(43.28, 5.38));
    private static final StationStop stop1726 = new StationStop(1726, station_POINTE_ROUGE, new Coordinates(43.24, 5.37));
    private static final StationStop stop1727 = new StationStop(1727, station_TIBOULEN, new Coordinates(43.25, 5.37));
    private static final StationStop stop1728 = new StationStop(1728, station_VIEILLE_CHAPELLE, new Coordinates(43.25, 5.38));
    private static final StationStop stop1729 = new StationStop(1729, station_LES_GATONS_PLAGE, new Coordinates(43.25, 5.38));
    private static final StationStop stop1730 = new StationStop(1730, station_HIPPODROME_PLAGE, new Coordinates(43.26, 5.38));
    private static final StationStop stop4035 = new StationStop(4035, station_SAINT_JEROME_FACULTE, new Coordinates(43.34, 5.41));
    private static final StationStop stop4036 = new StationStop(4036, station_LES_LILAS, new Coordinates(43.33, 5.41));
    private static final StationStop stop1732 = new StationStop(1732, station_LA_PLAGE, new Coordinates(43.26, 5.38));
    private static final StationStop stop4037 = new StationStop(4037, station_LES_OLIVIERS, new Coordinates(43.33, 5.41));
    private static final StationStop stop1733 = new StationStop(1733, station_PARC_BORELY, new Coordinates(43.26, 5.38));
    private static final StationStop stop1734 = new StationStop(1734, station_PRADO_TUNIS, new Coordinates(43.27, 5.38));
    private static final StationStop stop1735 = new StationStop(1735, station_PRADO_SAINT_EXUPERY, new Coordinates(43.27, 5.38));
    private static final StationStop stop459 = new StationStop(459, station_STRASBOURG_DESAIX, new Coordinates(43.31, 5.38));
    private static final StationStop stop460 = new StationStop(460, station_PLACE_DE_STRASBOURG, new Coordinates(43.31, 5.37));
    private static final StationStop stop1747 = new StationStop(1747, station_METRO_ROND_POINT_DU_PRADO, new Coordinates(43.27, 5.39));
    private static final StationStop stop2516 = new StationStop(2516, station_HOPITAL_LAVERAN, new Coordinates(43.33, 5.41));
    private static final StationStop stop980 = new StationStop(980, station_PROSPER_MERIMEE_SAINT_PAUL, new Coordinates(43.33, 5.40));
    private static final StationStop stop1748 = new StationStop(1748, station_MICHELET_HUVEAUNE, new Coordinates(43.27, 5.39));
    private static final StationStop stop981 = new StationStop(981, station_CENTRE_CIAL_DU_MERLAN, new Coordinates(43.33, 5.40));
    private static final StationStop stop1749 = new StationStop(1749, station_MICHELET_RAMON, new Coordinates(43.27, 5.39));
    private static final StationStop stop1494 = new StationStop(1494, station_PRADO_DUPRE, new Coordinates(43.28, 5.39));
    private static final StationStop stop1750 = new StationStop(1750, station_MICHELET_GANAY, new Coordinates(43.26, 5.40));
    private static final StationStop stop1751 = new StationStop(1751, station_MICHELET_BOUSQUET, new Coordinates(43.26, 5.40));
    private static final StationStop stop1752 = new StationStop(1752, station_LE_CORBUSIER, new Coordinates(43.26, 5.40));
    private static final StationStop stop472 = new StationStop(472, station_FLAMMARION_ISOARD, new Coordinates(43.30, 5.39));
    private static final StationStop stop1753 = new StationStop(1753, station_MICHELET_LUCE, new Coordinates(43.26, 5.40));
    private static final StationStop stop473 = new StationStop(473, station_PLACE_LEVERRIER, new Coordinates(43.31, 5.39));
    private static final StationStop stop218 = new StationStop(218, station_BUREL_PLOMBIERES, new Coordinates(43.32, 5.39));
    private static final StationStop stop1754 = new StationStop(1754, station_MICHELET_TAINE, new Coordinates(43.26, 5.40));
    private static final StationStop stop474 = new StationStop(474, station_BELLE_DE_MAI_LA_FRICHE, new Coordinates(43.31, 5.39));
    private static final StationStop stop219 = new StationStop(219, station_PLOMBIERES_ARNAL, new Coordinates(43.32, 5.38));
    private static final StationStop stop1755 = new StationStop(1755, station_MICHELET_BONNEAUDE, new Coordinates(43.25, 5.40));
    private static final StationStop stop4060 = new StationStop(4060, station_SAINT_JEROME_FACULTE, new Coordinates(43.34, 5.41));
    private static final StationStop stop220 = new StationStop(220, station_PLACE_CAFFO, new Coordinates(43.31, 5.38));
    private static final StationStop stop1756 = new StationStop(1756, station_MICHELET_BLANC, new Coordinates(43.25, 5.40));
    private static final StationStop stop1757 = new StationStop(1757, station_OBELISQUE, new Coordinates(43.25, 5.40));
    private static final StationStop stop4061 = new StationStop(4061, station_LES_LILAS, new Coordinates(43.33, 5.41));
    private static final StationStop stop221 = new StationStop(221, station_LOUBON_BARBINI, new Coordinates(43.31, 5.38));
    private static final StationStop stop4062 = new StationStop(4062, station_LES_OLIVIERS, new Coordinates(43.33, 5.41));
    private static final StationStop stop222 = new StationStop(222, station_LOUBON_BELLEVUE, new Coordinates(43.31, 5.38));
    private static final StationStop stop223 = new StationStop(223, station_NATIONAL_LOUBON, new Coordinates(43.31, 5.38));
    private static final StationStop stop1760 = new StationStop(1760, station_TOMASI, new Coordinates(43.25, 5.41));

    /**
     * A list of all stops used in {@link #ROUTES_1} and {@link #ROUTES_2}.
     */
    public static final List<StationStop> ALL_STOPS = Arrays.asList(
            stop1761, stop1763, stop1764, stop1765, stop2278, stop1766, stop2279, stop1767, stop2280, stop1768, stop2281, stop1769, stop2282, stop2283, stop2284, stop2285, stop2286, stop2287, stop2551, stop2808, stop4348, stop3070, stop3838, stop1792, stop3585, stop2308, stop2309, stop2310, stop2311, stop2313, stop2314, stop2315, stop524, stop2316, stop525, stop3342, stop2321, stop2322, stop2323, stop2324, stop2325, stop2326, stop1050, stop3866, stop1051, stop1052, stop1053, stop1054, stop1055, stop3872, stop1056, stop3388, stop347, stop348, stop1887, stop352, stop1888, stop1889, stop354, stop1890, stop355, stop1891, stop356, stop1892, stop357, stop1893, stop1894, stop1895, stop1896, stop1897, stop1898, stop1899, stop1900, stop1142, stop4251, stop1696, stop1697, stop1698, stop1699, stop1704, stop2736, stop3773, stop1726, stop1727, stop1728, stop1729, stop1730, stop4035, stop4036, stop1732, stop4037, stop1733, stop1734, stop1735, stop459, stop460, stop1747, stop2516, stop980, stop1748, stop981, stop1749, stop1494, stop1750, stop1751, stop1752, stop472, stop1753, stop473, stop218, stop1754, stop474, stop219, stop1755, stop4060, stop220, stop1756, stop1757, stop4061, stop221, stop4062, stop222, stop223, stop1760
    );

    private static final TransportLine line24T = new TransportLine("24T", "METRO STE MARGUERITE DROMEL-VAUFREGES", TransportLineType.Bus);
    private static final TransportLine line24 = new TransportLine("24", "METRO STE MARGUERITE DROMEL-CAMPUS DE LUMINY", TransportLineType.Bus);
    private static final TransportLine lineM1 = new TransportLine("M1", "METRO LA ROSE-LA FOURRAGERE", TransportLineType.Subway);
    private static final TransportLine lineM2 = new TransportLine("M2", "METRO BOUGAINVILLE-STE MARGUERITE DROMEL", TransportLineType.Subway);
    private static final TransportLine line49 = new TransportLine("49", "CANEBIERE BOURSE-REFORMES CANEBIERE", TransportLineType.Bus);
    private static final TransportLine line19 = new TransportLine("19", "CASTELLANE-MADRAGUE DE MONTREDON", TransportLineType.Bus);
    private static final TransportLine line83 = new TransportLine("83", "CANEBIERE VIEUX PORT-METRO ROND POINT DU PRADO", TransportLineType.Bus);
    private static final TransportLine line21JET = new TransportLine("21JET", "METRO ROND POINT DU PRADO-LUMINY PN DES CALANQUES", TransportLineType.Bus);
    private static final TransportLine line32 = new TransportLine("32", "CANEBIERE BOURSE-ST JEROME IUT", TransportLineType.Bus);
    private static final TransportLine lineB1 = new TransportLine("B1", "CASTELLANE-CAMPUS DE LUMINY", TransportLineType.Bus);
    private static final TransportLine lineB3A = new TransportLine("B3A", "ST JEROME PARKING RELAIS-METRO MALPASSE", TransportLineType.Tramway);

    /**
     * A list of routes from SAINT JEROME FACULTE to LUMINY FACULTE.
     */
    public static final List<Route> ROUTES_1 = Arrays.asList(
            new Route(Arrays.asList(
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop4035,
                            stop4036,
                            LocalDateTime.parse("2019-03-07T17:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:07", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop4036,
                            stop4037,
                            LocalDateTime.parse("2019-03-07T17:07", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop4037,
                            stop1050,
                            LocalDateTime.parse("2019-03-07T17:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:09", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop1050,
                            stop2516,
                            LocalDateTime.parse("2019-03-07T17:09", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:10", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop2516,
                            stop347,
                            LocalDateTime.parse("2019-03-07T17:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop347,
                            stop348,
                            LocalDateTime.parse("2019-03-07T17:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            359.3355555865795,
                            stop348,
                            stop2278,
                            LocalDateTime.parse("2019-03-07T17:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:24", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2278,
                            stop2279,
                            LocalDateTime.parse("2019-03-07T17:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2279,
                            stop2280,
                            LocalDateTime.parse("2019-03-07T17:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2280,
                            stop2281,
                            LocalDateTime.parse("2019-03-07T17:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2281,
                            stop2282,
                            LocalDateTime.parse("2019-03-07T17:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2282,
                            stop2283,
                            LocalDateTime.parse("2019-03-07T17:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            0.0,
                            stop2283,
                            stop2309,
                            LocalDateTime.parse("2019-03-07T17:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2309,
                            stop2310,
                            LocalDateTime.parse("2019-03-07T17:33", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:35", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2310,
                            stop2311,
                            LocalDateTime.parse("2019-03-07T17:35", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2311,
                            stop2313,
                            LocalDateTime.parse("2019-03-07T17:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2313,
                            stop2314,
                            LocalDateTime.parse("2019-03-07T17:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2314,
                            stop2315,
                            LocalDateTime.parse("2019-03-07T17:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            82.64170586336961,
                            stop2315,
                            stop3585,
                            LocalDateTime.parse("2019-03-07T17:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line21JET,
                            "CAMPUS DE LUMINY",
                            stop3585,
                            stop1757,
                            LocalDateTime.parse("2019-03-07T17:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line21JET,
                            "CAMPUS DE LUMINY",
                            stop1757,
                            stop1761,
                            LocalDateTime.parse("2019-03-07T17:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line21JET,
                            "CAMPUS DE LUMINY",
                            stop1761,
                            stop1769,
                            LocalDateTime.parse("2019-03-07T17:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line21JET,
                            "CAMPUS DE LUMINY",
                            stop1769,
                            stop3872,
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line21JET,
                            "CAMPUS DE LUMINY",
                            stop3872,
                            stop4348,
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
            ))
            ,
            new Route(Arrays.asList(
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop4035,
                            stop4036,
                            LocalDateTime.parse("2019-03-07T17:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop4036,
                            stop4037,
                            LocalDateTime.parse("2019-03-07T17:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:15", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop4037,
                            stop1050,
                            LocalDateTime.parse("2019-03-07T17:15", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop1050,
                            stop2516,
                            LocalDateTime.parse("2019-03-07T17:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop2516,
                            stop347,
                            LocalDateTime.parse("2019-03-07T17:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop347,
                            stop348,
                            LocalDateTime.parse("2019-03-07T17:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            359.3355555865795,
                            stop348,
                            stop2278,
                            LocalDateTime.parse("2019-03-07T17:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:24", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2278,
                            stop2279,
                            LocalDateTime.parse("2019-03-07T17:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2279,
                            stop2280,
                            LocalDateTime.parse("2019-03-07T17:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2280,
                            stop2281,
                            LocalDateTime.parse("2019-03-07T17:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2281,
                            stop2282,
                            LocalDateTime.parse("2019-03-07T17:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2282,
                            stop2283,
                            LocalDateTime.parse("2019-03-07T17:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            0.0,
                            stop2283,
                            stop2309,
                            LocalDateTime.parse("2019-03-07T17:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2309,
                            stop2310,
                            LocalDateTime.parse("2019-03-07T17:33", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:35", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2310,
                            stop2311,
                            LocalDateTime.parse("2019-03-07T17:35", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2311,
                            stop2313,
                            LocalDateTime.parse("2019-03-07T17:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2313,
                            stop2314,
                            LocalDateTime.parse("2019-03-07T17:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2314,
                            stop2315,
                            LocalDateTime.parse("2019-03-07T17:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            82.64170586336961,
                            stop2315,
                            stop3585,
                            LocalDateTime.parse("2019-03-07T17:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line21JET,
                            "CAMPUS DE LUMINY",
                            stop3585,
                            stop1757,
                            LocalDateTime.parse("2019-03-07T17:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line21JET,
                            "CAMPUS DE LUMINY",
                            stop1757,
                            stop1761,
                            LocalDateTime.parse("2019-03-07T17:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line21JET,
                            "CAMPUS DE LUMINY",
                            stop1761,
                            stop1769,
                            LocalDateTime.parse("2019-03-07T17:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line21JET,
                            "CAMPUS DE LUMINY",
                            stop1769,
                            stop3872,
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line21JET,
                            "CAMPUS DE LUMINY",
                            stop3872,
                            stop4348,
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
            ))
            ,
            new Route(Arrays.asList(
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop4035,
                            stop4036,
                            LocalDateTime.parse("2019-03-07T17:20", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop4036,
                            stop4037,
                            LocalDateTime.parse("2019-03-07T17:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop4037,
                            stop1050,
                            LocalDateTime.parse("2019-03-07T17:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:24", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop1050,
                            stop2516,
                            LocalDateTime.parse("2019-03-07T17:24", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop2516,
                            stop347,
                            LocalDateTime.parse("2019-03-07T17:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop347,
                            stop348,
                            LocalDateTime.parse("2019-03-07T17:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            359.3355555865795,
                            stop348,
                            stop2278,
                            LocalDateTime.parse("2019-03-07T17:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2278,
                            stop2279,
                            LocalDateTime.parse("2019-03-07T17:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2279,
                            stop2280,
                            LocalDateTime.parse("2019-03-07T17:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2280,
                            stop2281,
                            LocalDateTime.parse("2019-03-07T17:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2281,
                            stop2282,
                            LocalDateTime.parse("2019-03-07T17:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:42", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2282,
                            stop2283,
                            LocalDateTime.parse("2019-03-07T17:42", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            0.0,
                            stop2283,
                            stop2309,
                            LocalDateTime.parse("2019-03-07T17:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2309,
                            stop2310,
                            LocalDateTime.parse("2019-03-07T17:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2310,
                            stop2311,
                            LocalDateTime.parse("2019-03-07T17:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2311,
                            stop2313,
                            LocalDateTime.parse("2019-03-07T17:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:48", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2313,
                            stop2314,
                            LocalDateTime.parse("2019-03-07T17:51", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2314,
                            stop2315,
                            LocalDateTime.parse("2019-03-07T17:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            82.64170586336961,
                            stop2315,
                            stop3585,
                            LocalDateTime.parse("2019-03-07T17:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line21JET,
                            "CAMPUS DE LUMINY",
                            stop3585,
                            stop1757,
                            LocalDateTime.parse("2019-03-07T18:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line21JET,
                            "CAMPUS DE LUMINY",
                            stop1757,
                            stop1761,
                            LocalDateTime.parse("2019-03-07T18:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:10", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line21JET,
                            "CAMPUS DE LUMINY",
                            stop1761,
                            stop1769,
                            LocalDateTime.parse("2019-03-07T18:10", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line21JET,
                            "CAMPUS DE LUMINY",
                            stop1769,
                            stop3872,
                            LocalDateTime.parse("2019-03-07T18:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line21JET,
                            "CAMPUS DE LUMINY",
                            stop3872,
                            stop4348,
                            LocalDateTime.parse("2019-03-07T18:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
            ))
            ,
            new Route(Arrays.asList(
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop4060,
                            stop4061,
                            LocalDateTime.parse("2019-03-07T17:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop4061,
                            stop4062,
                            LocalDateTime.parse("2019-03-07T17:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop4062,
                            stop1050,
                            LocalDateTime.parse("2019-03-07T17:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1050,
                            stop352,
                            LocalDateTime.parse("2019-03-07T17:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop352,
                            stop354,
                            LocalDateTime.parse("2019-03-07T17:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:34", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop354,
                            stop355,
                            LocalDateTime.parse("2019-03-07T17:34", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:35", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop355,
                            stop356,
                            LocalDateTime.parse("2019-03-07T17:35", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop356,
                            stop357,
                            LocalDateTime.parse("2019-03-07T17:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop357,
                            stop980,
                            LocalDateTime.parse("2019-03-07T17:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop980,
                            stop981,
                            LocalDateTime.parse("2019-03-07T17:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop981,
                            stop1051,
                            LocalDateTime.parse("2019-03-07T17:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1051,
                            stop1052,
                            LocalDateTime.parse("2019-03-07T17:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1052,
                            stop3070,
                            LocalDateTime.parse("2019-03-07T17:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop3070,
                            stop1053,
                            LocalDateTime.parse("2019-03-07T17:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1053,
                            stop1054,
                            LocalDateTime.parse("2019-03-07T17:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:42", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1054,
                            stop1055,
                            LocalDateTime.parse("2019-03-07T17:42", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1055,
                            stop1056,
                            LocalDateTime.parse("2019-03-07T17:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1056,
                            stop218,
                            LocalDateTime.parse("2019-03-07T17:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop218,
                            stop219,
                            LocalDateTime.parse("2019-03-07T17:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:49", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop219,
                            stop220,
                            LocalDateTime.parse("2019-03-07T17:49", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop220,
                            stop221,
                            LocalDateTime.parse("2019-03-07T18:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:02", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop221,
                            stop222,
                            LocalDateTime.parse("2019-03-07T18:02", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop222,
                            stop223,
                            LocalDateTime.parse("2019-03-07T18:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop223,
                            stop459,
                            LocalDateTime.parse("2019-03-07T18:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:07", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop459,
                            stop460,
                            LocalDateTime.parse("2019-03-07T18:07", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop460,
                            stop524,
                            LocalDateTime.parse("2019-03-07T18:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:09", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop524,
                            stop525,
                            LocalDateTime.parse("2019-03-07T18:09", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            53.53761142873174,
                            stop525,
                            stop2308,
                            LocalDateTime.parse("2019-03-07T18:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2308,
                            stop2309,
                            LocalDateTime.parse("2019-03-07T18:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2309,
                            stop2310,
                            LocalDateTime.parse("2019-03-07T18:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:20", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2310,
                            stop2311,
                            LocalDateTime.parse("2019-03-07T18:20", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2311,
                            stop2313,
                            LocalDateTime.parse("2019-03-07T18:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2313,
                            stop2314,
                            LocalDateTime.parse("2019-03-07T18:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:24", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2314,
                            stop2315,
                            LocalDateTime.parse("2019-03-07T18:24", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2315,
                            stop2316,
                            LocalDateTime.parse("2019-03-07T18:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            22.11070258612331,
                            stop2316,
                            stop1887,
                            LocalDateTime.parse("2019-03-07T18:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1887,
                            stop1888,
                            LocalDateTime.parse("2019-03-07T18:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1888,
                            stop1889,
                            LocalDateTime.parse("2019-03-07T18:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1889,
                            stop1890,
                            LocalDateTime.parse("2019-03-07T18:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:34", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1890,
                            stop1891,
                            LocalDateTime.parse("2019-03-07T18:34", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1891,
                            stop1892,
                            LocalDateTime.parse("2019-03-07T18:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1892,
                            stop1893,
                            LocalDateTime.parse("2019-03-07T18:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1893,
                            stop1894,
                            LocalDateTime.parse("2019-03-07T18:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1894,
                            stop1895,
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1895,
                            stop1896,
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1896,
                            stop1897,
                            LocalDateTime.parse("2019-03-07T18:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1897,
                            stop1898,
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1898,
                            stop1899,
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1899,
                            stop1900,
                            LocalDateTime.parse("2019-03-07T18:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1900,
                            stop1764,
                            LocalDateTime.parse("2019-03-07T18:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1764,
                            stop1766,
                            LocalDateTime.parse("2019-03-07T18:49", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1766,
                            stop1767,
                            LocalDateTime.parse("2019-03-07T18:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1767,
                            stop1768,
                            LocalDateTime.parse("2019-03-07T18:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1768,
                            stop1769,
                            LocalDateTime.parse("2019-03-07T18:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1769,
                            stop3872,
                            LocalDateTime.parse("2019-03-07T18:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop3872,
                            stop4348,
                            LocalDateTime.parse("2019-03-07T18:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
            ))
            ,
            new Route(Arrays.asList(
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop4060,
                            stop4061,
                            LocalDateTime.parse("2019-03-07T17:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop4061,
                            stop4062,
                            LocalDateTime.parse("2019-03-07T17:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop4062,
                            stop1050,
                            LocalDateTime.parse("2019-03-07T17:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1050,
                            stop352,
                            LocalDateTime.parse("2019-03-07T17:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop352,
                            stop354,
                            LocalDateTime.parse("2019-03-07T17:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop354,
                            stop355,
                            LocalDateTime.parse("2019-03-07T17:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop355,
                            stop356,
                            LocalDateTime.parse("2019-03-07T17:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop356,
                            stop357,
                            LocalDateTime.parse("2019-03-07T17:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop357,
                            stop980,
                            LocalDateTime.parse("2019-03-07T17:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:47", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop980,
                            stop981,
                            LocalDateTime.parse("2019-03-07T17:47", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:48", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop981,
                            stop1051,
                            LocalDateTime.parse("2019-03-07T17:48", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:49", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1051,
                            stop1052,
                            LocalDateTime.parse("2019-03-07T17:49", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1052,
                            stop3070,
                            LocalDateTime.parse("2019-03-07T17:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop3070,
                            stop1053,
                            LocalDateTime.parse("2019-03-07T17:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:51", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1053,
                            stop1054,
                            LocalDateTime.parse("2019-03-07T17:51", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1054,
                            stop1055,
                            LocalDateTime.parse("2019-03-07T17:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:53", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1055,
                            stop1056,
                            LocalDateTime.parse("2019-03-07T17:53", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1056,
                            stop218,
                            LocalDateTime.parse("2019-03-07T17:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop218,
                            stop219,
                            LocalDateTime.parse("2019-03-07T17:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop219,
                            stop220,
                            LocalDateTime.parse("2019-03-07T17:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop220,
                            stop221,
                            LocalDateTime.parse("2019-03-07T18:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:02", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop221,
                            stop222,
                            LocalDateTime.parse("2019-03-07T18:02", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop222,
                            stop223,
                            LocalDateTime.parse("2019-03-07T18:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop223,
                            stop459,
                            LocalDateTime.parse("2019-03-07T18:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:07", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop459,
                            stop460,
                            LocalDateTime.parse("2019-03-07T18:07", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop460,
                            stop524,
                            LocalDateTime.parse("2019-03-07T18:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:09", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop524,
                            stop525,
                            LocalDateTime.parse("2019-03-07T18:09", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            53.53761142873174,
                            stop525,
                            stop2308,
                            LocalDateTime.parse("2019-03-07T18:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2308,
                            stop2309,
                            LocalDateTime.parse("2019-03-07T18:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2309,
                            stop2310,
                            LocalDateTime.parse("2019-03-07T18:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:20", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2310,
                            stop2311,
                            LocalDateTime.parse("2019-03-07T18:20", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2311,
                            stop2313,
                            LocalDateTime.parse("2019-03-07T18:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2313,
                            stop2314,
                            LocalDateTime.parse("2019-03-07T18:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:24", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2314,
                            stop2315,
                            LocalDateTime.parse("2019-03-07T18:24", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2315,
                            stop2316,
                            LocalDateTime.parse("2019-03-07T18:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            22.11070258612331,
                            stop2316,
                            stop1887,
                            LocalDateTime.parse("2019-03-07T18:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1887,
                            stop1888,
                            LocalDateTime.parse("2019-03-07T18:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1888,
                            stop1889,
                            LocalDateTime.parse("2019-03-07T18:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1889,
                            stop1890,
                            LocalDateTime.parse("2019-03-07T18:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:34", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1890,
                            stop1891,
                            LocalDateTime.parse("2019-03-07T18:34", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1891,
                            stop1892,
                            LocalDateTime.parse("2019-03-07T18:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1892,
                            stop1893,
                            LocalDateTime.parse("2019-03-07T18:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1893,
                            stop1894,
                            LocalDateTime.parse("2019-03-07T18:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1894,
                            stop1895,
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1895,
                            stop1896,
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1896,
                            stop1897,
                            LocalDateTime.parse("2019-03-07T18:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1897,
                            stop1898,
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1898,
                            stop1899,
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1899,
                            stop1900,
                            LocalDateTime.parse("2019-03-07T18:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1900,
                            stop1764,
                            LocalDateTime.parse("2019-03-07T18:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1764,
                            stop1766,
                            LocalDateTime.parse("2019-03-07T18:49", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1766,
                            stop1767,
                            LocalDateTime.parse("2019-03-07T18:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1767,
                            stop1768,
                            LocalDateTime.parse("2019-03-07T18:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1768,
                            stop1769,
                            LocalDateTime.parse("2019-03-07T18:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1769,
                            stop3872,
                            LocalDateTime.parse("2019-03-07T18:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop3872,
                            stop4348,
                            LocalDateTime.parse("2019-03-07T18:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
            ))
            ,
            new Route(Arrays.asList(
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop4035,
                            stop4036,
                            LocalDateTime.parse("2019-03-07T17:42", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop4036,
                            stop4037,
                            LocalDateTime.parse("2019-03-07T17:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop4037,
                            stop1050,
                            LocalDateTime.parse("2019-03-07T17:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop1050,
                            stop2516,
                            LocalDateTime.parse("2019-03-07T17:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:47", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop2516,
                            stop347,
                            LocalDateTime.parse("2019-03-07T17:47", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:48", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop347,
                            stop348,
                            LocalDateTime.parse("2019-03-07T17:48", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:49", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            359.3355555865795,
                            stop348,
                            stop2278,
                            LocalDateTime.parse("2019-03-07T17:49", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2278,
                            stop2279,
                            LocalDateTime.parse("2019-03-07T17:58", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2279,
                            stop2280,
                            LocalDateTime.parse("2019-03-07T18:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2280,
                            stop2281,
                            LocalDateTime.parse("2019-03-07T18:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2281,
                            stop2282,
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2282,
                            stop2283,
                            LocalDateTime.parse("2019-03-07T18:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            0.0,
                            stop2283,
                            stop2309,
                            LocalDateTime.parse("2019-03-07T18:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2309,
                            stop2310,
                            LocalDateTime.parse("2019-03-07T18:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:10", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2310,
                            stop2311,
                            LocalDateTime.parse("2019-03-07T18:10", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2311,
                            stop2313,
                            LocalDateTime.parse("2019-03-07T18:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2313,
                            stop2314,
                            LocalDateTime.parse("2019-03-07T18:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2314,
                            stop2315,
                            LocalDateTime.parse("2019-03-07T18:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2315,
                            stop2316,
                            LocalDateTime.parse("2019-03-07T18:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:20", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            22.11070258612331,
                            stop2316,
                            stop1887,
                            LocalDateTime.parse("2019-03-07T18:20", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1887,
                            stop1888,
                            LocalDateTime.parse("2019-03-07T18:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1888,
                            stop1889,
                            LocalDateTime.parse("2019-03-07T18:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1889,
                            stop1890,
                            LocalDateTime.parse("2019-03-07T18:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:34", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1890,
                            stop1891,
                            LocalDateTime.parse("2019-03-07T18:34", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1891,
                            stop1892,
                            LocalDateTime.parse("2019-03-07T18:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1892,
                            stop1893,
                            LocalDateTime.parse("2019-03-07T18:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1893,
                            stop1894,
                            LocalDateTime.parse("2019-03-07T18:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1894,
                            stop1895,
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1895,
                            stop1896,
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1896,
                            stop1897,
                            LocalDateTime.parse("2019-03-07T18:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1897,
                            stop1898,
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1898,
                            stop1899,
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1899,
                            stop1900,
                            LocalDateTime.parse("2019-03-07T18:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1900,
                            stop1764,
                            LocalDateTime.parse("2019-03-07T18:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1764,
                            stop1765,
                            LocalDateTime.parse("2019-03-07T18:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24T,
                            "VAUFREGES",
                            stop1765,
                            stop1792,
                            LocalDateTime.parse("2019-03-07T18:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:47", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            155.167795755143,
                            stop1792,
                            stop1766,
                            LocalDateTime.parse("2019-03-07T18:47", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:49", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1766,
                            stop1767,
                            LocalDateTime.parse("2019-03-07T18:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1767,
                            stop1768,
                            LocalDateTime.parse("2019-03-07T18:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1768,
                            stop1769,
                            LocalDateTime.parse("2019-03-07T18:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1769,
                            stop3872,
                            LocalDateTime.parse("2019-03-07T18:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop3872,
                            stop4348,
                            LocalDateTime.parse("2019-03-07T18:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
            ))
            ,
            new Route(Arrays.asList(
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop4035,
                            stop4036,
                            LocalDateTime.parse("2019-03-07T17:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop4036,
                            stop4037,
                            LocalDateTime.parse("2019-03-07T17:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:53", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop4037,
                            stop1050,
                            LocalDateTime.parse("2019-03-07T17:53", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop1050,
                            stop2516,
                            LocalDateTime.parse("2019-03-07T17:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop2516,
                            stop347,
                            LocalDateTime.parse("2019-03-07T17:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop347,
                            stop348,
                            LocalDateTime.parse("2019-03-07T17:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:57", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            359.3355555865795,
                            stop348,
                            stop2278,
                            LocalDateTime.parse("2019-03-07T17:57", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:02", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2278,
                            stop2279,
                            LocalDateTime.parse("2019-03-07T18:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:07", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2279,
                            stop2280,
                            LocalDateTime.parse("2019-03-07T18:07", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:09", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2280,
                            stop2281,
                            LocalDateTime.parse("2019-03-07T18:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2281,
                            stop2282,
                            LocalDateTime.parse("2019-03-07T18:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:15", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2282,
                            stop2283,
                            LocalDateTime.parse("2019-03-07T18:15", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2283,
                            stop2284,
                            LocalDateTime.parse("2019-03-07T18:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2284,
                            stop2285,
                            LocalDateTime.parse("2019-03-07T18:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2285,
                            stop2286,
                            LocalDateTime.parse("2019-03-07T18:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2286,
                            stop2287,
                            LocalDateTime.parse("2019-03-07T18:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            103.55607584320748,
                            stop2287,
                            stop3773,
                            LocalDateTime.parse("2019-03-07T18:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop3773,
                            stop1494,
                            LocalDateTime.parse("2019-03-07T18:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1494,
                            stop1696,
                            LocalDateTime.parse("2019-03-07T18:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1696,
                            stop1697,
                            LocalDateTime.parse("2019-03-07T18:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1697,
                            stop1698,
                            LocalDateTime.parse("2019-03-07T18:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:33", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1698,
                            stop1699,
                            LocalDateTime.parse("2019-03-07T18:33", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:34", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1699,
                            stop2736,
                            LocalDateTime.parse("2019-03-07T18:34", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:35", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop2736,
                            stop1747,
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1747,
                            stop1748,
                            LocalDateTime.parse("2019-03-07T18:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1748,
                            stop1749,
                            LocalDateTime.parse("2019-03-07T18:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:47", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1749,
                            stop1750,
                            LocalDateTime.parse("2019-03-07T18:47", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:47", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1750,
                            stop1751,
                            LocalDateTime.parse("2019-03-07T18:47", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:48", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1751,
                            stop1752,
                            LocalDateTime.parse("2019-03-07T18:48", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:49", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1752,
                            stop1753,
                            LocalDateTime.parse("2019-03-07T18:49", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:51", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1753,
                            stop1754,
                            LocalDateTime.parse("2019-03-07T18:51", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1754,
                            stop1755,
                            LocalDateTime.parse("2019-03-07T18:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:53", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1755,
                            stop1756,
                            LocalDateTime.parse("2019-03-07T18:53", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1756,
                            stop1757,
                            LocalDateTime.parse("2019-03-07T18:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1757,
                            stop4251,
                            LocalDateTime.parse("2019-03-07T18:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop4251,
                            stop1760,
                            LocalDateTime.parse("2019-03-07T18:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:58", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1760,
                            stop1761,
                            LocalDateTime.parse("2019-03-07T18:58", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1761,
                            stop1763,
                            LocalDateTime.parse("2019-03-07T19:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1763,
                            stop1764,
                            LocalDateTime.parse("2019-03-07T19:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1764,
                            stop1766,
                            LocalDateTime.parse("2019-03-07T19:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1766,
                            stop1767,
                            LocalDateTime.parse("2019-03-07T19:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1767,
                            stop1768,
                            LocalDateTime.parse("2019-03-07T19:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1768,
                            stop1769,
                            LocalDateTime.parse("2019-03-07T19:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1769,
                            stop3872,
                            LocalDateTime.parse("2019-03-07T19:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop3872,
                            stop4348,
                            LocalDateTime.parse("2019-03-07T19:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:07", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
            ))
            ,
            new Route(Arrays.asList(
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop4060,
                            stop4061,
                            LocalDateTime.parse("2019-03-07T17:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:58", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop4061,
                            stop4062,
                            LocalDateTime.parse("2019-03-07T17:58", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop4062,
                            stop1050,
                            LocalDateTime.parse("2019-03-07T18:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1050,
                            stop352,
                            LocalDateTime.parse("2019-03-07T18:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop352,
                            stop354,
                            LocalDateTime.parse("2019-03-07T18:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop354,
                            stop355,
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop355,
                            stop356,
                            LocalDateTime.parse("2019-03-07T18:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop356,
                            stop357,
                            LocalDateTime.parse("2019-03-07T18:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop357,
                            stop980,
                            LocalDateTime.parse("2019-03-07T18:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:07", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop980,
                            stop981,
                            LocalDateTime.parse("2019-03-07T18:07", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop981,
                            stop1051,
                            LocalDateTime.parse("2019-03-07T18:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:09", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1051,
                            stop1052,
                            LocalDateTime.parse("2019-03-07T18:09", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:09", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1052,
                            stop3070,
                            LocalDateTime.parse("2019-03-07T18:09", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:10", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop3070,
                            stop1053,
                            LocalDateTime.parse("2019-03-07T18:10", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1053,
                            stop1054,
                            LocalDateTime.parse("2019-03-07T18:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1054,
                            stop1055,
                            LocalDateTime.parse("2019-03-07T18:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1055,
                            stop1056,
                            LocalDateTime.parse("2019-03-07T18:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1056,
                            stop218,
                            LocalDateTime.parse("2019-03-07T18:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:15", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop218,
                            stop219,
                            LocalDateTime.parse("2019-03-07T18:15", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop219,
                            stop220,
                            LocalDateTime.parse("2019-03-07T18:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:20", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop220,
                            stop221,
                            LocalDateTime.parse("2019-03-07T18:20", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop221,
                            stop222,
                            LocalDateTime.parse("2019-03-07T18:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop222,
                            stop223,
                            LocalDateTime.parse("2019-03-07T18:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop223,
                            stop459,
                            LocalDateTime.parse("2019-03-07T18:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop459,
                            stop460,
                            LocalDateTime.parse("2019-03-07T18:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop460,
                            stop524,
                            LocalDateTime.parse("2019-03-07T18:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop524,
                            stop525,
                            LocalDateTime.parse("2019-03-07T18:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            53.53761142873174,
                            stop525,
                            stop2308,
                            LocalDateTime.parse("2019-03-07T18:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2308,
                            stop2309,
                            LocalDateTime.parse("2019-03-07T18:35", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2309,
                            stop2310,
                            LocalDateTime.parse("2019-03-07T18:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2310,
                            stop2311,
                            LocalDateTime.parse("2019-03-07T18:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2311,
                            stop2313,
                            LocalDateTime.parse("2019-03-07T18:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2313,
                            stop2314,
                            LocalDateTime.parse("2019-03-07T18:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:42", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2314,
                            stop2315,
                            LocalDateTime.parse("2019-03-07T18:42", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            175.77245512132353,
                            stop2315,
                            stop1747,
                            LocalDateTime.parse("2019-03-07T18:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:47", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1747,
                            stop1748,
                            LocalDateTime.parse("2019-03-07T18:53", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1748,
                            stop1749,
                            LocalDateTime.parse("2019-03-07T18:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1749,
                            stop1750,
                            LocalDateTime.parse("2019-03-07T18:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1750,
                            stop1751,
                            LocalDateTime.parse("2019-03-07T19:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1751,
                            stop1752,
                            LocalDateTime.parse("2019-03-07T19:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1752,
                            stop1753,
                            LocalDateTime.parse("2019-03-07T19:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:07", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1753,
                            stop1754,
                            LocalDateTime.parse("2019-03-07T19:07", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1754,
                            stop1755,
                            LocalDateTime.parse("2019-03-07T19:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:09", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1755,
                            stop1756,
                            LocalDateTime.parse("2019-03-07T19:09", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:10", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1756,
                            stop1757,
                            LocalDateTime.parse("2019-03-07T19:10", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1757,
                            stop4251,
                            LocalDateTime.parse("2019-03-07T19:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop4251,
                            stop1760,
                            LocalDateTime.parse("2019-03-07T19:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1760,
                            stop1761,
                            LocalDateTime.parse("2019-03-07T19:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1761,
                            stop1763,
                            LocalDateTime.parse("2019-03-07T19:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1763,
                            stop1764,
                            LocalDateTime.parse("2019-03-07T19:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1764,
                            stop1766,
                            LocalDateTime.parse("2019-03-07T19:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1766,
                            stop1767,
                            LocalDateTime.parse("2019-03-07T19:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:20", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1767,
                            stop1768,
                            LocalDateTime.parse("2019-03-07T19:20", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1768,
                            stop1769,
                            LocalDateTime.parse("2019-03-07T19:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1769,
                            stop3872,
                            LocalDateTime.parse("2019-03-07T19:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop3872,
                            stop4348,
                            LocalDateTime.parse("2019-03-07T19:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
            ))
            ,
            new Route(Arrays.asList(
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop4060,
                            stop4061,
                            LocalDateTime.parse("2019-03-07T18:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop4061,
                            stop4062,
                            LocalDateTime.parse("2019-03-07T18:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:10", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop4062,
                            stop1050,
                            LocalDateTime.parse("2019-03-07T18:10", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1050,
                            stop352,
                            LocalDateTime.parse("2019-03-07T18:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop352,
                            stop354,
                            LocalDateTime.parse("2019-03-07T18:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:13", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop354,
                            stop355,
                            LocalDateTime.parse("2019-03-07T18:13", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop355,
                            stop356,
                            LocalDateTime.parse("2019-03-07T18:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:15", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop356,
                            stop357,
                            LocalDateTime.parse("2019-03-07T18:15", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop357,
                            stop980,
                            LocalDateTime.parse("2019-03-07T18:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop980,
                            stop981,
                            LocalDateTime.parse("2019-03-07T18:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop981,
                            stop1051,
                            LocalDateTime.parse("2019-03-07T18:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1051,
                            stop1052,
                            LocalDateTime.parse("2019-03-07T18:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1052,
                            stop3070,
                            LocalDateTime.parse("2019-03-07T18:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:20", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop3070,
                            stop1053,
                            LocalDateTime.parse("2019-03-07T18:20", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1053,
                            stop1054,
                            LocalDateTime.parse("2019-03-07T18:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1054,
                            stop1055,
                            LocalDateTime.parse("2019-03-07T18:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1055,
                            stop1056,
                            LocalDateTime.parse("2019-03-07T18:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:24", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop1056,
                            stop218,
                            LocalDateTime.parse("2019-03-07T18:24", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop218,
                            stop219,
                            LocalDateTime.parse("2019-03-07T18:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop219,
                            stop220,
                            LocalDateTime.parse("2019-03-07T18:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop220,
                            stop221,
                            LocalDateTime.parse("2019-03-07T18:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop221,
                            stop222,
                            LocalDateTime.parse("2019-03-07T18:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:33", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop222,
                            stop223,
                            LocalDateTime.parse("2019-03-07T18:33", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:35", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop223,
                            stop459,
                            LocalDateTime.parse("2019-03-07T18:35", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop459,
                            stop460,
                            LocalDateTime.parse("2019-03-07T18:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop460,
                            stop524,
                            LocalDateTime.parse("2019-03-07T18:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line32,
                            "CANEBIERE BOURSE",
                            stop524,
                            stop525,
                            LocalDateTime.parse("2019-03-07T18:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            53.53761142873174,
                            stop525,
                            stop2308,
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2308,
                            stop2309,
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2309,
                            stop2310,
                            LocalDateTime.parse("2019-03-07T18:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:51", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2310,
                            stop2311,
                            LocalDateTime.parse("2019-03-07T18:51", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2311,
                            stop2313,
                            LocalDateTime.parse("2019-03-07T18:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2313,
                            stop2314,
                            LocalDateTime.parse("2019-03-07T18:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2314,
                            stop2315,
                            LocalDateTime.parse("2019-03-07T18:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:57", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "SAINTE MARGUERITE DROMEL",
                            stop2315,
                            stop2316,
                            LocalDateTime.parse("2019-03-07T18:57", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:58", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            22.11070258612331,
                            stop2316,
                            stop1887,
                            LocalDateTime.parse("2019-03-07T18:58", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop1887,
                            stop1888,
                            LocalDateTime.parse("2019-03-07T19:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop1888,
                            stop1889,
                            LocalDateTime.parse("2019-03-07T19:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop1889,
                            stop1890,
                            LocalDateTime.parse("2019-03-07T19:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop1890,
                            stop1891,
                            LocalDateTime.parse("2019-03-07T19:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop1891,
                            stop1892,
                            LocalDateTime.parse("2019-03-07T19:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop1892,
                            stop1893,
                            LocalDateTime.parse("2019-03-07T19:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop1893,
                            stop1894,
                            LocalDateTime.parse("2019-03-07T19:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop1894,
                            stop1895,
                            LocalDateTime.parse("2019-03-07T19:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop1895,
                            stop1896,
                            LocalDateTime.parse("2019-03-07T19:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:09", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop1896,
                            stop1897,
                            LocalDateTime.parse("2019-03-07T19:09", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop1897,
                            stop1898,
                            LocalDateTime.parse("2019-03-07T19:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop1898,
                            stop1899,
                            LocalDateTime.parse("2019-03-07T19:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop1899,
                            stop1900,
                            LocalDateTime.parse("2019-03-07T19:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop1900,
                            stop1764,
                            LocalDateTime.parse("2019-03-07T19:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop1764,
                            stop1765,
                            LocalDateTime.parse("2019-03-07T19:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop1765,
                            stop1766,
                            LocalDateTime.parse("2019-03-07T19:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop1766,
                            stop1767,
                            LocalDateTime.parse("2019-03-07T19:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop1767,
                            stop1768,
                            LocalDateTime.parse("2019-03-07T19:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop1768,
                            stop1769,
                            LocalDateTime.parse("2019-03-07T19:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop1769,
                            stop3872,
                            LocalDateTime.parse("2019-03-07T19:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line24,
                            "CAMPUS DE LUMINY",
                            stop3872,
                            stop4348,
                            LocalDateTime.parse("2019-03-07T19:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
            ))
            ,
            new Route(Arrays.asList(
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop4035,
                            stop4036,
                            LocalDateTime.parse("2019-03-07T18:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop4036,
                            stop4037,
                            LocalDateTime.parse("2019-03-07T18:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:15", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop4037,
                            stop1050,
                            LocalDateTime.parse("2019-03-07T18:15", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop1050,
                            stop2516,
                            LocalDateTime.parse("2019-03-07T18:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop2516,
                            stop347,
                            LocalDateTime.parse("2019-03-07T18:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB3A,
                            "METRO MALPASSE",
                            stop347,
                            stop348,
                            LocalDateTime.parse("2019-03-07T18:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            359.3355555865795,
                            stop348,
                            stop2278,
                            LocalDateTime.parse("2019-03-07T18:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:24", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2278,
                            stop2279,
                            LocalDateTime.parse("2019-03-07T18:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2279,
                            stop2280,
                            LocalDateTime.parse("2019-03-07T18:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2280,
                            stop2281,
                            LocalDateTime.parse("2019-03-07T18:31", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2281,
                            stop2282,
                            LocalDateTime.parse("2019-03-07T18:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:34", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2282,
                            stop2283,
                            LocalDateTime.parse("2019-03-07T18:34", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:35", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2283,
                            stop2284,
                            LocalDateTime.parse("2019-03-07T18:35", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2284,
                            stop2285,
                            LocalDateTime.parse("2019-03-07T18:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2285,
                            stop2286,
                            LocalDateTime.parse("2019-03-07T18:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM1,
                            "LA FOURRAGERE",
                            stop2286,
                            stop2287,
                            LocalDateTime.parse("2019-03-07T18:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            103.55607584320748,
                            stop2287,
                            stop3773,
                            LocalDateTime.parse("2019-03-07T18:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop3773,
                            stop1494,
                            LocalDateTime.parse("2019-03-07T18:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1494,
                            stop1696,
                            LocalDateTime.parse("2019-03-07T18:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:47", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1696,
                            stop1697,
                            LocalDateTime.parse("2019-03-07T18:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1697,
                            stop1698,
                            LocalDateTime.parse("2019-03-07T18:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:57", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1698,
                            stop1699,
                            LocalDateTime.parse("2019-03-07T18:57", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:58", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1699,
                            stop2736,
                            LocalDateTime.parse("2019-03-07T18:58", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop2736,
                            stop1747,
                            LocalDateTime.parse("2019-03-07T18:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1747,
                            stop1748,
                            LocalDateTime.parse("2019-03-07T18:53", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1748,
                            stop1749,
                            LocalDateTime.parse("2019-03-07T18:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1749,
                            stop1750,
                            LocalDateTime.parse("2019-03-07T18:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:55", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1750,
                            stop1751,
                            LocalDateTime.parse("2019-03-07T19:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1751,
                            stop1752,
                            LocalDateTime.parse("2019-03-07T19:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1752,
                            stop1753,
                            LocalDateTime.parse("2019-03-07T19:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:07", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1753,
                            stop1754,
                            LocalDateTime.parse("2019-03-07T19:07", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1754,
                            stop1755,
                            LocalDateTime.parse("2019-03-07T19:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:09", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1755,
                            stop1756,
                            LocalDateTime.parse("2019-03-07T19:09", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:10", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1756,
                            stop1757,
                            LocalDateTime.parse("2019-03-07T19:10", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1757,
                            stop4251,
                            LocalDateTime.parse("2019-03-07T19:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop4251,
                            stop1760,
                            LocalDateTime.parse("2019-03-07T19:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1760,
                            stop1761,
                            LocalDateTime.parse("2019-03-07T19:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1761,
                            stop1763,
                            LocalDateTime.parse("2019-03-07T19:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1763,
                            stop1764,
                            LocalDateTime.parse("2019-03-07T19:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1764,
                            stop1766,
                            LocalDateTime.parse("2019-03-07T19:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1766,
                            stop1767,
                            LocalDateTime.parse("2019-03-07T19:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:20", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1767,
                            stop1768,
                            LocalDateTime.parse("2019-03-07T19:20", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1768,
                            stop1769,
                            LocalDateTime.parse("2019-03-07T19:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop1769,
                            stop3872,
                            LocalDateTime.parse("2019-03-07T19:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineB1,
                            "CAMPUS DE LUMINY",
                            stop3872,
                            stop4348,
                            LocalDateTime.parse("2019-03-07T19:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
            ))
    );

    /**
     * A list of routes from POINTE ROUGE to BELLE DE MAI LA FRICHE.
     */
    public static final List<Route> ROUTES_2 = Arrays.asList(
            new Route(Arrays.asList(
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1726,
                            stop1727,
                            LocalDateTime.parse("2019-03-07T17:02", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1727,
                            stop1728,
                            LocalDateTime.parse("2019-03-07T17:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1728,
                            stop1729,
                            LocalDateTime.parse("2019-03-07T17:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1729,
                            stop1730,
                            LocalDateTime.parse("2019-03-07T17:13", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1730,
                            stop1732,
                            LocalDateTime.parse("2019-03-07T17:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1732,
                            stop1733,
                            LocalDateTime.parse("2019-03-07T17:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1733,
                            stop1734,
                            LocalDateTime.parse("2019-03-07T17:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1734,
                            stop1735,
                            LocalDateTime.parse("2019-03-07T17:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1735,
                            stop1142,
                            LocalDateTime.parse("2019-03-07T17:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1142,
                            stop2808,
                            LocalDateTime.parse("2019-03-07T17:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            132.10437431443148,
                            stop2808,
                            stop2326,
                            LocalDateTime.parse("2019-03-07T17:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2326,
                            stop2325,
                            LocalDateTime.parse("2019-03-07T17:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2325,
                            stop2324,
                            LocalDateTime.parse("2019-03-07T17:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:47", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2324,
                            stop2323,
                            LocalDateTime.parse("2019-03-07T17:47", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:49", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2323,
                            stop2322,
                            LocalDateTime.parse("2019-03-07T17:49", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2322,
                            stop2321,
                            LocalDateTime.parse("2019-03-07T17:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            386.8934890150708,
                            stop2321,
                            stop3342,
                            LocalDateTime.parse("2019-03-07T17:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:57", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop3342,
                            stop472,
                            LocalDateTime.parse("2019-03-07T17:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:02", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop472,
                            stop2551,
                            LocalDateTime.parse("2019-03-07T18:02", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop2551,
                            stop473,
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop473,
                            stop3838,
                            LocalDateTime.parse("2019-03-07T18:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop3838,
                            stop474,
                            LocalDateTime.parse("2019-03-07T18:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
            ))
            ,
            new Route(Arrays.asList(
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1726,
                            stop1727,
                            LocalDateTime.parse("2019-03-07T17:10", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1727,
                            stop1728,
                            LocalDateTime.parse("2019-03-07T17:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1728,
                            stop1729,
                            LocalDateTime.parse("2019-03-07T17:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:13", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1729,
                            stop1730,
                            LocalDateTime.parse("2019-03-07T17:13", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1730,
                            stop1732,
                            LocalDateTime.parse("2019-03-07T17:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1732,
                            stop1733,
                            LocalDateTime.parse("2019-03-07T17:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1733,
                            stop1734,
                            LocalDateTime.parse("2019-03-07T17:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1734,
                            stop1735,
                            LocalDateTime.parse("2019-03-07T17:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1735,
                            stop1142,
                            LocalDateTime.parse("2019-03-07T17:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1142,
                            stop2808,
                            LocalDateTime.parse("2019-03-07T17:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            132.10437431443148,
                            stop2808,
                            stop2326,
                            LocalDateTime.parse("2019-03-07T17:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2326,
                            stop2325,
                            LocalDateTime.parse("2019-03-07T17:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2325,
                            stop2324,
                            LocalDateTime.parse("2019-03-07T17:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:47", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2324,
                            stop2323,
                            LocalDateTime.parse("2019-03-07T17:47", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:49", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2323,
                            stop2322,
                            LocalDateTime.parse("2019-03-07T17:49", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2322,
                            stop2321,
                            LocalDateTime.parse("2019-03-07T17:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            386.8934890150708,
                            stop2321,
                            stop3342,
                            LocalDateTime.parse("2019-03-07T17:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:57", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop3342,
                            stop472,
                            LocalDateTime.parse("2019-03-07T17:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:02", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop472,
                            stop2551,
                            LocalDateTime.parse("2019-03-07T18:02", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop2551,
                            stop473,
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop473,
                            stop3838,
                            LocalDateTime.parse("2019-03-07T18:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop3838,
                            stop474,
                            LocalDateTime.parse("2019-03-07T18:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
            ))
            ,
            new Route(Arrays.asList(
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1726,
                            stop1727,
                            LocalDateTime.parse("2019-03-07T17:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1727,
                            stop1728,
                            LocalDateTime.parse("2019-03-07T17:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:20", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1728,
                            stop1729,
                            LocalDateTime.parse("2019-03-07T17:20", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1729,
                            stop1730,
                            LocalDateTime.parse("2019-03-07T17:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1730,
                            stop1732,
                            LocalDateTime.parse("2019-03-07T17:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1732,
                            stop1733,
                            LocalDateTime.parse("2019-03-07T17:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1733,
                            stop1734,
                            LocalDateTime.parse("2019-03-07T17:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1734,
                            stop1735,
                            LocalDateTime.parse("2019-03-07T17:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1735,
                            stop1142,
                            LocalDateTime.parse("2019-03-07T17:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1142,
                            stop2808,
                            LocalDateTime.parse("2019-03-07T17:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            132.10437431443148,
                            stop2808,
                            stop2326,
                            LocalDateTime.parse("2019-03-07T17:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2326,
                            stop2325,
                            LocalDateTime.parse("2019-03-07T17:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2325,
                            stop2324,
                            LocalDateTime.parse("2019-03-07T17:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:47", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2324,
                            stop2323,
                            LocalDateTime.parse("2019-03-07T17:47", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:49", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2323,
                            stop2322,
                            LocalDateTime.parse("2019-03-07T17:49", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2322,
                            stop2321,
                            LocalDateTime.parse("2019-03-07T17:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            386.8934890150708,
                            stop2321,
                            stop3342,
                            LocalDateTime.parse("2019-03-07T17:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:57", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop3342,
                            stop472,
                            LocalDateTime.parse("2019-03-07T17:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:02", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop472,
                            stop2551,
                            LocalDateTime.parse("2019-03-07T18:02", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop2551,
                            stop473,
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop473,
                            stop3838,
                            LocalDateTime.parse("2019-03-07T18:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop3838,
                            stop474,
                            LocalDateTime.parse("2019-03-07T18:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
            ))
            ,
            new Route(Arrays.asList(
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1726,
                            stop1727,
                            LocalDateTime.parse("2019-03-07T17:34", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:35", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1727,
                            stop1728,
                            LocalDateTime.parse("2019-03-07T17:35", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1728,
                            stop1729,
                            LocalDateTime.parse("2019-03-07T17:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:37", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1729,
                            stop1730,
                            LocalDateTime.parse("2019-03-07T17:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1730,
                            stop1732,
                            LocalDateTime.parse("2019-03-07T17:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1732,
                            stop1733,
                            LocalDateTime.parse("2019-03-07T17:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1733,
                            stop1734,
                            LocalDateTime.parse("2019-03-07T17:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:58", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1734,
                            stop1735,
                            LocalDateTime.parse("2019-03-07T17:58", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line83,
                            "METRO ROND POINT DU PRADO",
                            stop1735,
                            stop1142,
                            LocalDateTime.parse("2019-03-07T18:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line83,
                            "METRO ROND POINT DU PRADO",
                            stop1142,
                            stop2808,
                            LocalDateTime.parse("2019-03-07T18:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            132.10437431443148,
                            stop2808,
                            stop2326,
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2326,
                            stop2325,
                            LocalDateTime.parse("2019-03-07T18:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2325,
                            stop2324,
                            LocalDateTime.parse("2019-03-07T18:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2324,
                            stop2323,
                            LocalDateTime.parse("2019-03-07T18:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2323,
                            stop2322,
                            LocalDateTime.parse("2019-03-07T18:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2322,
                            stop2321,
                            LocalDateTime.parse("2019-03-07T18:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            386.8934890150708,
                            stop2321,
                            stop3342,
                            LocalDateTime.parse("2019-03-07T18:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:35", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop3342,
                            stop472,
                            LocalDateTime.parse("2019-03-07T18:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop472,
                            stop2551,
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop2551,
                            stop473,
                            LocalDateTime.parse("2019-03-07T18:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:42", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop473,
                            stop3838,
                            LocalDateTime.parse("2019-03-07T18:42", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop3838,
                            stop474,
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
            ))
            ,
            new Route(Arrays.asList(
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1726,
                            stop1727,
                            LocalDateTime.parse("2019-03-07T17:42", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1727,
                            stop1728,
                            LocalDateTime.parse("2019-03-07T17:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1728,
                            stop1729,
                            LocalDateTime.parse("2019-03-07T17:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1729,
                            stop1730,
                            LocalDateTime.parse("2019-03-07T17:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1730,
                            stop1732,
                            LocalDateTime.parse("2019-03-07T17:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1732,
                            stop1733,
                            LocalDateTime.parse("2019-03-07T17:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1733,
                            stop1734,
                            LocalDateTime.parse("2019-03-07T17:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:58", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1734,
                            stop1735,
                            LocalDateTime.parse("2019-03-07T17:58", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line83,
                            "METRO ROND POINT DU PRADO",
                            stop1735,
                            stop1142,
                            LocalDateTime.parse("2019-03-07T18:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line83,
                            "METRO ROND POINT DU PRADO",
                            stop1142,
                            stop2808,
                            LocalDateTime.parse("2019-03-07T18:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            132.10437431443148,
                            stop2808,
                            stop2326,
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2326,
                            stop2325,
                            LocalDateTime.parse("2019-03-07T18:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2325,
                            stop2324,
                            LocalDateTime.parse("2019-03-07T18:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2324,
                            stop2323,
                            LocalDateTime.parse("2019-03-07T18:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2323,
                            stop2322,
                            LocalDateTime.parse("2019-03-07T18:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2322,
                            stop2321,
                            LocalDateTime.parse("2019-03-07T18:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            386.8934890150708,
                            stop2321,
                            stop3342,
                            LocalDateTime.parse("2019-03-07T18:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:35", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop3342,
                            stop472,
                            LocalDateTime.parse("2019-03-07T18:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop472,
                            stop2551,
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop2551,
                            stop473,
                            LocalDateTime.parse("2019-03-07T18:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:42", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop473,
                            stop3838,
                            LocalDateTime.parse("2019-03-07T18:42", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop3838,
                            stop474,
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
            ))
            ,
            new Route(Arrays.asList(
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1726,
                            stop1727,
                            LocalDateTime.parse("2019-03-07T17:49", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1727,
                            stop1728,
                            LocalDateTime.parse("2019-03-07T17:50", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:51", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1728,
                            stop1729,
                            LocalDateTime.parse("2019-03-07T17:51", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1729,
                            stop1730,
                            LocalDateTime.parse("2019-03-07T17:52", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1730,
                            stop1732,
                            LocalDateTime.parse("2019-03-07T17:54", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1732,
                            stop1733,
                            LocalDateTime.parse("2019-03-07T17:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1733,
                            stop1734,
                            LocalDateTime.parse("2019-03-07T17:56", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:58", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1734,
                            stop1735,
                            LocalDateTime.parse("2019-03-07T17:58", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line83,
                            "METRO ROND POINT DU PRADO",
                            stop1735,
                            stop1142,
                            LocalDateTime.parse("2019-03-07T18:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line83,
                            "METRO ROND POINT DU PRADO",
                            stop1142,
                            stop2808,
                            LocalDateTime.parse("2019-03-07T18:01", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            132.10437431443148,
                            stop2808,
                            stop2326,
                            LocalDateTime.parse("2019-03-07T18:03", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2326,
                            stop2325,
                            LocalDateTime.parse("2019-03-07T18:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2325,
                            stop2324,
                            LocalDateTime.parse("2019-03-07T18:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2324,
                            stop2323,
                            LocalDateTime.parse("2019-03-07T18:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2323,
                            stop2322,
                            LocalDateTime.parse("2019-03-07T18:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2322,
                            stop2321,
                            LocalDateTime.parse("2019-03-07T18:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            386.8934890150708,
                            stop2321,
                            stop3342,
                            LocalDateTime.parse("2019-03-07T18:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:35", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop3342,
                            stop472,
                            LocalDateTime.parse("2019-03-07T18:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop472,
                            stop2551,
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop2551,
                            stop473,
                            LocalDateTime.parse("2019-03-07T18:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:42", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop473,
                            stop3838,
                            LocalDateTime.parse("2019-03-07T18:42", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop3838,
                            stop474,
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
            ))
            ,
            new Route(Arrays.asList(
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1726,
                            stop1727,
                            LocalDateTime.parse("2019-03-07T17:57", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:58", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1727,
                            stop1728,
                            LocalDateTime.parse("2019-03-07T17:58", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T17:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1728,
                            stop1729,
                            LocalDateTime.parse("2019-03-07T17:59", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1729,
                            stop1730,
                            LocalDateTime.parse("2019-03-07T18:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:02", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1730,
                            stop1732,
                            LocalDateTime.parse("2019-03-07T18:02", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            31.015968372713008,
                            stop1732,
                            stop1704,
                            LocalDateTime.parse("2019-03-07T18:04", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            247.8477427305311,
                            stop1704,
                            stop1733,
                            LocalDateTime.parse("2019-03-07T18:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:08", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1733,
                            stop1734,
                            LocalDateTime.parse("2019-03-07T18:11", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:13", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1734,
                            stop1735,
                            LocalDateTime.parse("2019-03-07T18:13", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1735,
                            stop1142,
                            LocalDateTime.parse("2019-03-07T18:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1142,
                            stop2808,
                            LocalDateTime.parse("2019-03-07T18:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            132.10437431443148,
                            stop2808,
                            stop2326,
                            LocalDateTime.parse("2019-03-07T18:17", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2326,
                            stop2325,
                            LocalDateTime.parse("2019-03-07T18:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2325,
                            stop2324,
                            LocalDateTime.parse("2019-03-07T18:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2324,
                            stop2323,
                            LocalDateTime.parse("2019-03-07T18:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2323,
                            stop2322,
                            LocalDateTime.parse("2019-03-07T18:28", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2322,
                            stop2321,
                            LocalDateTime.parse("2019-03-07T18:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            386.8934890150708,
                            stop2321,
                            stop3342,
                            LocalDateTime.parse("2019-03-07T18:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:35", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop3342,
                            stop472,
                            LocalDateTime.parse("2019-03-07T18:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop472,
                            stop2551,
                            LocalDateTime.parse("2019-03-07T18:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop2551,
                            stop473,
                            LocalDateTime.parse("2019-03-07T18:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:42", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop473,
                            stop3838,
                            LocalDateTime.parse("2019-03-07T18:42", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop3838,
                            stop474,
                            LocalDateTime.parse("2019-03-07T18:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:45", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
            ))
            ,
            new Route(Arrays.asList(
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1726,
                            stop1727,
                            LocalDateTime.parse("2019-03-07T18:05", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1727,
                            stop1728,
                            LocalDateTime.parse("2019-03-07T18:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:06", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1728,
                            stop1729,
                            LocalDateTime.parse("2019-03-07T18:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:24", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1729,
                            stop1730,
                            LocalDateTime.parse("2019-03-07T18:24", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1730,
                            stop1732,
                            LocalDateTime.parse("2019-03-07T19:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1732,
                            stop1733,
                            LocalDateTime.parse("2019-03-07T19:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1733,
                            stop1734,
                            LocalDateTime.parse("2019-03-07T19:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1734,
                            stop1735,
                            LocalDateTime.parse("2019-03-07T19:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1735,
                            stop1142,
                            LocalDateTime.parse("2019-03-07T19:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1142,
                            stop2808,
                            LocalDateTime.parse("2019-03-07T19:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            132.10437431443148,
                            stop2808,
                            stop2326,
                            LocalDateTime.parse("2019-03-07T19:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2326,
                            stop2325,
                            LocalDateTime.parse("2019-03-07T19:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2325,
                            stop2324,
                            LocalDateTime.parse("2019-03-07T19:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2324,
                            stop2323,
                            LocalDateTime.parse("2019-03-07T19:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2323,
                            stop2322,
                            LocalDateTime.parse("2019-03-07T19:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2322,
                            stop2321,
                            LocalDateTime.parse("2019-03-07T19:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            386.8934890150708,
                            stop2321,
                            stop3342,
                            LocalDateTime.parse("2019-03-07T19:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:34", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop3342,
                            stop472,
                            LocalDateTime.parse("2019-03-07T19:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop472,
                            stop2551,
                            LocalDateTime.parse("2019-03-07T19:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop2551,
                            stop473,
                            LocalDateTime.parse("2019-03-07T19:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop473,
                            stop3838,
                            LocalDateTime.parse("2019-03-07T19:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop3838,
                            stop474,
                            LocalDateTime.parse("2019-03-07T19:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop474,
                            stop3388,
                            LocalDateTime.parse("2019-03-07T19:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            102.17794039003361,
                            stop3388,
                            stop3866,
                            LocalDateTime.parse("2019-03-07T19:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
            ))
            ,
            new Route(Arrays.asList(
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1726,
                            stop1727,
                            LocalDateTime.parse("2019-03-07T18:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1727,
                            stop1728,
                            LocalDateTime.parse("2019-03-07T18:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1728,
                            stop1729,
                            LocalDateTime.parse("2019-03-07T18:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:24", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1729,
                            stop1730,
                            LocalDateTime.parse("2019-03-07T18:24", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1730,
                            stop1732,
                            LocalDateTime.parse("2019-03-07T19:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1732,
                            stop1733,
                            LocalDateTime.parse("2019-03-07T19:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1733,
                            stop1734,
                            LocalDateTime.parse("2019-03-07T19:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1734,
                            stop1735,
                            LocalDateTime.parse("2019-03-07T19:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1735,
                            stop1142,
                            LocalDateTime.parse("2019-03-07T19:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1142,
                            stop2808,
                            LocalDateTime.parse("2019-03-07T19:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            132.10437431443148,
                            stop2808,
                            stop2326,
                            LocalDateTime.parse("2019-03-07T19:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2326,
                            stop2325,
                            LocalDateTime.parse("2019-03-07T19:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2325,
                            stop2324,
                            LocalDateTime.parse("2019-03-07T19:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2324,
                            stop2323,
                            LocalDateTime.parse("2019-03-07T19:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2323,
                            stop2322,
                            LocalDateTime.parse("2019-03-07T19:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2322,
                            stop2321,
                            LocalDateTime.parse("2019-03-07T19:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            386.8934890150708,
                            stop2321,
                            stop3342,
                            LocalDateTime.parse("2019-03-07T19:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:34", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop3342,
                            stop472,
                            LocalDateTime.parse("2019-03-07T19:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop472,
                            stop2551,
                            LocalDateTime.parse("2019-03-07T19:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop2551,
                            stop473,
                            LocalDateTime.parse("2019-03-07T19:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop473,
                            stop3838,
                            LocalDateTime.parse("2019-03-07T19:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop3838,
                            stop474,
                            LocalDateTime.parse("2019-03-07T19:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop474,
                            stop3388,
                            LocalDateTime.parse("2019-03-07T19:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            102.17794039003361,
                            stop3388,
                            stop3866,
                            LocalDateTime.parse("2019-03-07T19:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
            ))
            ,
            new Route(Arrays.asList(
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1726,
                            stop1727,
                            LocalDateTime.parse("2019-03-07T18:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1727,
                            stop1728,
                            LocalDateTime.parse("2019-03-07T18:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1728,
                            stop1729,
                            LocalDateTime.parse("2019-03-07T18:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1729,
                            stop1730,
                            LocalDateTime.parse("2019-03-07T18:32", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T18:33", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1730,
                            stop1732,
                            LocalDateTime.parse("2019-03-07T19:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1732,
                            stop1733,
                            LocalDateTime.parse("2019-03-07T19:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1733,
                            stop1734,
                            LocalDateTime.parse("2019-03-07T19:14", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1734,
                            stop1735,
                            LocalDateTime.parse("2019-03-07T19:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1735,
                            stop1142,
                            LocalDateTime.parse("2019-03-07T19:16", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line19,
                            "CASTELLANE",
                            stop1142,
                            stop2808,
                            LocalDateTime.parse("2019-03-07T19:18", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            132.10437431443148,
                            stop2808,
                            stop2326,
                            LocalDateTime.parse("2019-03-07T19:19", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:21", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2326,
                            stop2325,
                            LocalDateTime.parse("2019-03-07T19:22", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2325,
                            stop2324,
                            LocalDateTime.parse("2019-03-07T19:23", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2324,
                            stop2323,
                            LocalDateTime.parse("2019-03-07T19:25", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2323,
                            stop2322,
                            LocalDateTime.parse("2019-03-07T19:26", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            lineM2,
                            "BOUGAINVILLE",
                            stop2322,
                            stop2321,
                            LocalDateTime.parse("2019-03-07T19:27", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            386.8934890150708,
                            stop2321,
                            stop3342,
                            LocalDateTime.parse("2019-03-07T19:29", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:34", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop3342,
                            stop472,
                            LocalDateTime.parse("2019-03-07T19:36", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop472,
                            stop2551,
                            LocalDateTime.parse("2019-03-07T19:38", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop2551,
                            stop473,
                            LocalDateTime.parse("2019-03-07T19:39", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop473,
                            stop3838,
                            LocalDateTime.parse("2019-03-07T19:40", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop3838,
                            stop474,
                            LocalDateTime.parse("2019-03-07T19:41", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new TransportStep(
                            line49,
                            "CANEBIERE BOURSE",
                            stop474,
                            stop3388,
                            LocalDateTime.parse("2019-03-07T19:43", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
                    ,
                    new ConnectionStep(
                            102.17794039003361,
                            stop3388,
                            stop3866,
                            LocalDateTime.parse("2019-03-07T19:44", DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                            LocalDateTime.parse("2019-03-07T19:46", DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                    )
            ))
    );

}
