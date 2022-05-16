/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_ajouteRepasHypo
 * Date : 16/04/2022 18:41:19
 * Version de wdjava64.dll  : 26.0.407.3
 */


package VYV.leucinose.wdgen;


import VYV.leucinose.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.combo.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_ajouteRepasHypo extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_ajouteRepasHypo
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_Flottant
 */
class GWDBTN_Flottant extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_ajouteRepasHypo.BTN_Flottant
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2473973799004672308l);

super.setChecksum("597781092");

super.setNom("BTN_Flottant");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(4, 588);

super.setTailleInitiale(54, 54);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(7);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("", 0, 1, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0xF48542, 0x740500, 0x893344, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0xF48542, 0x740500, 0x893344, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0xF59358, 0x751300, 0x893344, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("C:\\Mes Projets Mobile\\leucinose\\bouton bas 1.png?_3NP_8_8_10_10", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Flottant (modèle Modèle_FEN_dup)
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 


// OuvreFenêtreMobile(FEN_Menu)
WDAPIFenetre.ouvreFille(GWDPleucinose.getInstance().mWD_FEN_Menu);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Flottant mWD_BTN_Flottant;

/**
 * BTN_Flottant1
 */
class GWDBTN_Flottant1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_ajouteRepasHypo.BTN_Flottant1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2473973799004737844l);

super.setChecksum("597846628");

super.setNom("BTN_Flottant1");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(63, 588);

super.setTailleInitiale(54, 54);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(8);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("", 0, 1, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0xF48542, 0x740500, 0x893344, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0xF48542, 0x740500, 0x893344, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0xF59358, 0x751300, 0x893344, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("C:\\Mes Projets Mobile\\leucinose\\bouton bas 2.png?_3NP_8_8_10_10", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Flottant1 (modèle Modèle_FEN_dup)
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(FEN_echanges)


// OuvreFenêtreMobile(FEN_echanges)
WDAPIFenetre.ouvreFille(GWDPleucinose.getInstance().mWD_FEN_echanges);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Flottant1 mWD_BTN_Flottant1;

/**
 * BTN_Flottant2
 */
class GWDBTN_Flottant2 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_ajouteRepasHypo.BTN_Flottant2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2473973799004803380l);

super.setChecksum("597912164");

super.setNom("BTN_Flottant2");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(122, 588);

super.setTailleInitiale(54, 54);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(9);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("", 0, 1, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0xF48542, 0x740500, 0x893344, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0xF48542, 0x740500, 0x893344, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0xF59358, 0x751300, 0x893344, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("C:\\Mes Projets Mobile\\leucinose\\bouton bas 3.png?_3NP_8_8_10_10", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Flottant2 (modèle Modèle_FEN_dup)
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 


// OuvreFenêtreMobile(FEN_constantes)
WDAPIFenetre.ouvreFille(GWDPleucinose.getInstance().mWD_FEN_constantes);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Flottant2 mWD_BTN_Flottant2;

/**
 * BTN_Flottant3
 */
class GWDBTN_Flottant3 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_ajouteRepasHypo.BTN_Flottant3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2473973799004868916l);

super.setChecksum("597977700");

super.setNom("BTN_Flottant3");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(181, 588);

super.setTailleInitiale(54, 54);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(10);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("", 0, 1, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0xF48542, 0x740500, 0x893344, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0xF48542, 0x740500, 0x893344, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0xF59358, 0x751300, 0x893344, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("C:\\Mes Projets Mobile\\leucinose\\bouton bas 4.png?_3NP_8_8_10_10", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Flottant3 (modèle Modèle_FEN_dup)
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 


// OuvreFenêtreMobile(FEN_impression)
WDAPIFenetre.ouvreFille(GWDPleucinose.getInstance().mWD_FEN_impression);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Flottant3 mWD_BTN_Flottant3;

/**
 * BTN_Flottant4
 */
class GWDBTN_Flottant4 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_ajouteRepasHypo.BTN_Flottant4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2473973799004934452l);

super.setChecksum("598043236");

super.setNom("BTN_Flottant4");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(240, 588);

super.setTailleInitiale(54, 54);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(11);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("", 0, 1, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0xF48542, 0x740500, 0x893344, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0xF48542, 0x740500, 0x893344, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0xF59358, 0x751300, 0x893344, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("C:\\Mes Projets Mobile\\leucinose\\bouton bas 5.png?_3NP_8_8_10_10", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Flottant4 (modèle Modèle_FEN_dup)
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 


// OuvreFenêtreMobile(FEN_params)
WDAPIFenetre.ouvreFille(GWDPleucinose.getInstance().mWD_FEN_params);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Flottant4 mWD_BTN_Flottant4;

/**
 * BTN_Flottant5
 */
class GWDBTN_Flottant5 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_ajouteRepasHypo.BTN_Flottant5
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2473973799004999988l);

super.setChecksum("598108772");

super.setNom("BTN_Flottant5");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(299, 588);

super.setTailleInitiale(54, 54);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(12);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("", 0, 1, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0xF48542, 0x740500, 0x893344, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0xF48542, 0x740500, 0x893344, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0xF59358, 0x751300, 0x893344, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("C:\\Mes Projets Mobile\\leucinose\\bouton bas 6.png?_3NP_8_8_10_10", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Flottant5 (modèle Modèle_FEN_dup)
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 


// OuvreFenêtreMobile(FEN_docs)
WDAPIFenetre.ouvreFille(GWDPleucinose.getInstance().mWD_FEN_docs);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Flottant5 mWD_BTN_Flottant5;

/**
 * COMBO_moment
 */
class GWDCOMBO_moment extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_ajouteRepasHypo.COMBO_moment
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(1,3,35,47);
super.setRectCompPrincipal(36,3,226,47);
super.setQuid(2473973859135604036l);

super.setChecksum("602919289");

super.setNom("COMBO_moment");

super.setType(10002);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(39, 117);

super.setTailleInitiale(282, 53);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("Petit déjeuner\r\nDéjeuner\r\nGouter\r\nDiner");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(2);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(27, 0xFFFFFFFF, 0xFFFFFFFF, 0x893443, 20.000000, 20.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0x893344, 0x90000, 0x893443, 2.000000, 2.000000, 1, 1));

super.setStyleElement(0xFFFFFF, 0x893443, creerPolice_GEN("Roboto", -8.000000, 0), 60);

super.setStyleSelection(0xFFFFFF, 0x893443, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleBouton(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0xFFFFFFFF);

super.setParamSaisieObligatoire(false);

super.setParamErreurSaisieObligatoire("", true, false, false);

super.setParamIndicationSaisieObligatoire(true, false, false);

super.setStyleChampErreurSaisieObligatoire(null, null, 0xFF, 0xFF);

super.setStyleLibelleErreurSaisieObligatoire(0x262626, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieObligatoire(21, 141);

super.setStyleChampIndicationSaisieObligatoire(null, null, 0xFF, 0xFF);

super.setStyleLibelleIndicationSaisieObligatoire(0x262626, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoIndicationSaisieObligatoire(21, 141);

super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOMBO_moment mWD_COMBO_moment;

/**
 * LIB_Quantité_de_parts
 */
class GWDLIB_Quantite_de_parts extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_ajouteRepasHypo.LIB_Quantité_de_parts
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2473973859135735123l);

super.setChecksum("599301321");

super.setNom("LIB_Quantité_de_parts");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Quantité de parts : 10/15");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(0, 70);

super.setTailleInitiale(360, 47);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x893344, 0xFFFFFFFF, creerPolice_GEN("Roboto", -9.000000, 1), 3, 0, 0x0, 0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);

super.setParamAnimationChamp(42, 1, 200);

super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Quantite_de_parts mWD_LIB_Quantite_de_parts;

/**
 * SAI_Date
 */
class GWDSAI_Date extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_ajouteRepasHypo.SAI_Date
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,204,46);
super.setQuid(2473973859135931731l);

super.setChecksum("599590395");

super.setNom("SAI_Date");

super.setType(20002);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(77, 8);

super.setTailleInitiale(206, 50);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setMotDePasse(false);

super.setTypeSaisie(2);

super.setFormatMemorise("AAAAMMJJ");

super.setMasqueSaisie(new WDChaineU("UseDatePickerDateMask"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(1);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x893443, creerPolice_GEN("Roboto", -9.000000, 1), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0x893443, 0x90000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(27, 0x893443, 0x90000, 0xFFFFFFFF, 20.000000, 20.000000, 1, 1));

super.setStyleSaisie(0x893443, creerPolice_GEN("Roboto", -9.000000, 1));

super.setStyleTexteIndication(0x8B8680, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(27, 0xF48542, 0x740500, 0xFFFFFF, 16.000000, 16.000000, 1, 1), 0xF48542, 0xFF000001, "", 1);

super.setParamSaisieObligatoire(false, true);

super.setParamErreurSaisieInvalide("", true, false, false);

super.setParamErreurSaisieObligatoire("", true, false, false);

super.setParamIndicationSaisieObligatoire(true, false, false);

super.setStyleChampErreurSaisieInvalide(null, null, 0xFF, 0xFF);

super.setStyleLibelleErreurSaisieInvalide(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieInvalide(21, 141);

super.setStyleChampErreurSaisieObligatoire(null, null, 0xFF, 0xFF);

super.setStyleLibelleErreurSaisieObligatoire(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieObligatoire(21, 141);

super.setStyleChampIndicationSaisieObligatoire(null, null, 0xFF, 0xFF);

super.setStyleLibelleIndicationSaisieObligatoire(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoIndicationSaisieObligatoire(21, 141);

super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Date mWD_SAI_Date;

/**
 * BTN_SansNom1
 */
class GWDBTN_SansNom1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de FEN_ajouteRepasHypo.BTN_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2473974198438690009l);

super.setChecksum("599840358");

super.setNom("BTN_SansNom1");

super.setType(4);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(147, 466);

super.setTailleInitiale(211, 92);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(10);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(6);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("C:\\Mes Projets Mobile\\leucinose\\suite enregistrer.png", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("", 5, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_SansNom1
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 


// REPAS_ALIMENTS.IDALIMENTS=COMBO_ALIMENTSH
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("idaliments").setValeur(mWD_COMBO_ALIMENTSH);

// HLitRecherche(REPAS,datej,gdMaDate,hIdentique)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("repas"),WDAPIHF.getRubriqueSansCasseNiAccent("datej"),GWDPleucinose.getInstance().vWD_gdMaDate,(long)524288);

// si HTrouve(REPAS) ALORS
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("repas")).getBoolean())
{
// 	SI COMBO_ALIMENTSH=113 ALORS
if(mWD_COMBO_ALIMENTSH.opEgal(113, 0))
{
// 		REPAS.totalLeucine=REPAS.totalLeucine+SAI_Quantite*0.5
WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("totalleucine").setValeur(WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("totalleucine").opPlus(mWD_SAI_Quantite.opMult(0.5)));

// 		HModifie(REpas)
WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("repas"));

}

// 	REPAS_ALIMENTS.IDREPAS=REPAS.IDREPAS
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("idrepas").setValeur(WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("idrepas"));

}
else
{
// 	REPAS.datej=0
WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("datej").setValeur(0);

// 	si COMBO_ALIMENTSH=113 ALORS
if(mWD_COMBO_ALIMENTSH.opEgal(113, 0))
{
// 		REPAS.totalLeucine=SAI_Quantite*0.5
WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("totalleucine").setValeur(mWD_SAI_Quantite.opMult(0.5));

}
else
{
// 		REPAS.totalLeucine=0
WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("totalleucine").setValeur(0);

}

// 	HAjoute(REPAS)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("repas"));

// 	REPAS_ALIMENTS.IDREPAS=REPAS.IDREPAS
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("idrepas").setValeur(WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("idrepas"));

}

// REPAS_ALIMENTS.qteAliment=SAI_Grammage
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("qtealiment").setValeur(mWD_SAI_Grammage);

// REPAS_ALIMENTS.cuisson=""
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("cuisson").setValeur("");

// SI COMBO_ALIMENTSH=113 ALORS
if(mWD_COMBO_ALIMENTSH.opEgal(113, 0))
{
// 	REPAS_ALIMENTS.Parttotal=SAI_Quantite*0.5
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("parttotal").setValeur(mWD_SAI_Quantite.opMult(0.5));

}
else
{
// 	REPAS_ALIMENTS.Parttotal=0
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("parttotal").setValeur(0);

}

// REPAS_ALIMENTS.momentRepas=COMBO_moment.ValeurAffichée
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("momentrepas").setValeur(mWD_COMBO_moment.getProp(EWDPropriete.PROP_VALEURAFFICHEE));

// HAjoute(REPAS_ALIMENTS)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("repas_aliments"));

// OuvreFenêtreMobile(FEN_Repas)
WDAPIFenetre.ouvreFille(GWDPleucinose.getInstance().mWD_FEN_Repas);

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_SansNom1 mWD_BTN_SansNom1;

/**
 * COMBO_ALIMENTSH
 */
class GWDCOMBO_ALIMENTSH extends WDComboFichierAccesDirect
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de FEN_ajouteRepasHypo.COMBO_ALIMENTSH
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,282,3);
super.setRectCompPrincipal(36,3,226,38);
super.setQuid(2474057177209718615l);

super.setChecksum("608590163");

super.setNom("COMBO_ALIMENTSH");

super.setType(10002);

super.setBulle("");

super.setLibelle("Aliment : ");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(39, 183);

super.setTailleInitiale(282, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setSourceRemplissage("req_listealimenthypo", "libelle", "libelle", "idaliments", true, "");

super.setContenuInitial("");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(11);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(3);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFF000001, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0, 0xFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(27, 0x893344, 0x90000, 0xFFFFFFFF, 20.000000, 20.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0x893344, 0x90000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1));

super.setStyleElement(0x893344, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 60);

super.setStyleSelection(0x0, 0xBABABA, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleBouton(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0xFFFFFFFF);

super.setParamSaisieObligatoire(false);

super.setParamErreurSaisieObligatoire("", true, false, false);

super.setParamIndicationSaisieObligatoire(true, false, false);

super.setStyleChampErreurSaisieObligatoire(null, null, 0xFF, 0xFF);

super.setStyleLibelleErreurSaisieObligatoire(0x262626, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieObligatoire(21, 141);

super.setStyleChampIndicationSaisieObligatoire(null, null, 0xFF, 0xFF);

super.setStyleLibelleIndicationSaisieObligatoire(0x262626, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoIndicationSaisieObligatoire(21, 141);

super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection d'une ligne de COMBO_ALIMENTSH
 */
public void selectionLigne()
{
super.selectionLigne();

// 


// HLitRecherche(ALIMENTS,IDALIMENTS,MoiMême,hIdentique)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("aliments"),WDAPIHF.getRubriqueSansCasseNiAccent("idaliments"),WDContexte.getMoiMeme(),(long)524288);

// si htrouve ALORS
if(WDAPIHF.hTrouve().getBoolean())
{
// 	FichierVersEcran()
WDAPIFenetre.fichierVersEcran();

// 	SAI_Grammage=ALIMENTS.QtepourUnepartCRU
mWD_SAI_Grammage.setValeur(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcru"));

// 	SAI_Quantite=ALIMENTS.QtepourUnepartCUIT
mWD_SAI_Quantite.setValeur(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcuit"));

// 	si MoiMême=113 ALORS
if(WDContexte.getMoiMeme().opEgal(113, 0))
{
// 		REQ_qteRepasJour.Paramdatej	= gdMaDate
WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("paramdatej").setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// 		SI HExécuteRequête(REQ_qteRepasJour) ALORS
if(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour")).getBoolean())
{
// 			HLitPremier(REQ_qteRepasJour)
WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour"));

// 			LIB_Quantité_de_parts="Quantité de parts distribuée : "+Arrondi(REQ_qteRepasJour.totalLeucine+0.5,2)+"/"+grObjectifPart
mWD_LIB_Quantite_de_parts.setValeur(new WDChaineU("Quantité de parts distribuée : ").opPlus(WDAPIMath.arrondi(WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("totalleucine").opPlus(0.5),2)).opPlus("/").opPlus(GWDPleucinose.getInstance().vWD_grObjectifPart));

}
else
{
// 			LIB_Quantité_de_parts="problème liaisons données"
mWD_LIB_Quantite_de_parts.setValeur("problème liaisons données");

}

}
else
{
// 		REQ_qteRepasJour.Paramdatej	= gdMaDate
WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("paramdatej").setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// 		SI HExécuteRequête(REQ_qteRepasJour) ALORS
if(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour")).getBoolean())
{
// 			HLitPremier(REQ_qteRepasJour)
WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour"));

// 			LIB_Quantité_de_parts="Quantité de parts distribuée : "+Arrondi(REQ_qteRepasJour.totalLeucine,2)+"/"+grObjectifPart
mWD_LIB_Quantite_de_parts.setValeur(new WDChaineU("Quantité de parts distribuée : ").opPlus(WDAPIMath.arrondi(WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("totalleucine"),2)).opPlus("/").opPlus(GWDPleucinose.getInstance().vWD_grObjectifPart));

}
else
{
// 			LIB_Quantité_de_parts="problème liaisons données"
mWD_LIB_Quantite_de_parts.setValeur("problème liaisons données");

}

}

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOMBO_ALIMENTSH mWD_COMBO_ALIMENTSH;

/**
 * SAI_Grammage
 */
class GWDSAI_Grammage extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°12 de FEN_ajouteRepasHypo.SAI_Grammage
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(36,3,226,38);
super.setQuid(2474057336123872622l);

super.setChecksum("603139205");

super.setNom("SAI_Grammage");

super.setType(20004);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(39, 342);

super.setTailleInitiale(282, 44);

super.setValeurInitiale("Gr");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("999"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(12);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(5);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU("9999 +Gr"));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(27, 0x893443, 0x90000, 0xFFFFFFFF, 20.000000, 20.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1));

super.setStyleSaisie(0x893443, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8B8680, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(27, 0xF48542, 0x740500, 0xFFFFFF, 16.000000, 16.000000, 1, 1), 0xF48542, 0xFF000001, "", 1);

super.setParamSaisieObligatoire(false, true);

super.setParamErreurSaisieInvalide("", true, false, false);

super.setParamErreurSaisieObligatoire("", true, false, false);

super.setParamIndicationSaisieObligatoire(true, false, false);

super.setStyleChampErreurSaisieInvalide(null, null, 0xFF, 0xFF);

super.setStyleLibelleErreurSaisieInvalide(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieInvalide(21, 141);

super.setStyleChampErreurSaisieObligatoire(null, null, 0xFF, 0xFF);

super.setStyleLibelleErreurSaisieObligatoire(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieObligatoire(21, 141);

super.setStyleChampIndicationSaisieObligatoire(null, null, 0xFF, 0xFF);

super.setStyleLibelleIndicationSaisieObligatoire(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoIndicationSaisieObligatoire(21, 141);

super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Validation par le clavier de SAI_Grammage
 */
public WDObjet clicBtnActionClavier()
{
super.clicBtnActionClavier();

// 


// HLitRecherche(ALIMENTS,IDALIMENTS,COMBO_ALIMENTSH,hIdentique)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("aliments"),WDAPIHF.getRubriqueSansCasseNiAccent("idaliments"),mWD_COMBO_ALIMENTSH,(long)524288);

// SI HTrouve ALORS
if(WDAPIHF.hTrouve().getBoolean())
{
// 	SAI_Quantite=MoiMême/ALIMENTS.QtepourUnepartCRU
mWD_SAI_Quantite.setValeur(WDContexte.getMoiMeme().opDiv(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcru")));

// 	SI COMBO_ALIMENTSH=113 ALORS
if(mWD_COMBO_ALIMENTSH.opEgal(113, 0))
{
// 		REQ_qteRepasJour.Paramdatej	= gdMaDate
WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("paramdatej").setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// 		SI HExécuteRequête(REQ_qteRepasJour) ALORS
if(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour")).getBoolean())
{
// 			HLitPremier(REQ_qteRepasJour)
WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour"));

// 			LIB_Quantité_de_parts="Quantité de parts distribuée : "+Arrondi(REQ_qteRepasJour.totalLeucine+0.5*SAI_Quantite,2)+"/"+grObjectifPart
mWD_LIB_Quantite_de_parts.setValeur(new WDChaineU("Quantité de parts distribuée : ").opPlus(WDAPIMath.arrondi(WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("totalleucine").opPlus(new WDReel(0.5).opMult(mWD_SAI_Quantite)),2)).opPlus("/").opPlus(GWDPleucinose.getInstance().vWD_grObjectifPart));

}
else
{
// 			LIB_Quantité_de_parts="problème liaisons données"
mWD_LIB_Quantite_de_parts.setValeur("problème liaisons données");

}

}
else
{
// 		REQ_qteRepasJour.Paramdatej	= gdMaDate
WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("paramdatej").setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// 		SI HExécuteRequête(REQ_qteRepasJour) ALORS
if(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour")).getBoolean())
{
// 			HLitPremier(REQ_qteRepasJour)
WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour"));

// 			LIB_Quantité_de_parts="Quantité de parts distribuée : "+Arrondi(REQ_qteRepasJour.totalLeucine,2)+"/"+grObjectifPart
mWD_LIB_Quantite_de_parts.setValeur(new WDChaineU("Quantité de parts distribuée : ").opPlus(WDAPIMath.arrondi(WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("totalleucine"),2)).opPlus("/").opPlus(GWDPleucinose.getInstance().vWD_grObjectifPart));

}
else
{
// 			LIB_Quantité_de_parts="problème liaisons données"
mWD_LIB_Quantite_de_parts.setValeur("problème liaisons données");

}

}

}

return new WDVoid("clicBtnActionClavier");
}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Grammage mWD_SAI_Grammage;

/**
 * SAI_Quantite
 */
class GWDSAI_Quantite extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°13 de FEN_ajouteRepasHypo.SAI_Quantite
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(36,3,226,38);
super.setQuid(2474057374778915951l);

super.setChecksum("603476879");

super.setNom("SAI_Quantite");

super.setType(20004);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(39, 256);

super.setTailleInitiale(282, 44);

super.setValeurInitiale("Gr");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("999,99"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(13);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(4);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU("9,99U"));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(27, 0x893443, 0x90000, 0xFFFFFFFF, 20.000000, 20.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1));

super.setStyleSaisie(0x893443, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8B8680, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(27, 0xF48542, 0x740500, 0xFFFFFF, 16.000000, 16.000000, 1, 1), 0xF48542, 0xFF000001, "", 1);

super.setParamSaisieObligatoire(false, true);

super.setParamErreurSaisieInvalide("", true, false, false);

super.setParamErreurSaisieObligatoire("", true, false, false);

super.setParamIndicationSaisieObligatoire(true, false, false);

super.setStyleChampErreurSaisieInvalide(null, null, 0xFF, 0xFF);

super.setStyleLibelleErreurSaisieInvalide(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieInvalide(21, 141);

super.setStyleChampErreurSaisieObligatoire(null, null, 0xFF, 0xFF);

super.setStyleLibelleErreurSaisieObligatoire(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieObligatoire(21, 141);

super.setStyleChampIndicationSaisieObligatoire(null, null, 0xFF, 0xFF);

super.setStyleLibelleIndicationSaisieObligatoire(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoIndicationSaisieObligatoire(21, 141);

super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Validation par le clavier de SAI_Quantite
 */
public WDObjet clicBtnActionClavier()
{
super.clicBtnActionClavier();

// 


// HLitRecherche(ALIMENTS,IDALIMENTS,COMBO_ALIMENTSH,hIdentique)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("aliments"),WDAPIHF.getRubriqueSansCasseNiAccent("idaliments"),mWD_COMBO_ALIMENTSH,(long)524288);

// SI HTrouve ALORS
if(WDAPIHF.hTrouve().getBoolean())
{
// 	SAI_Grammage	= ALIMENTS.QtepourUnepartCRU*MoiMême
mWD_SAI_Grammage.setValeur(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcru").opMult(WDContexte.getMoiMeme()));

// 	SI COMBO_ALIMENTSH=113 ALORS
if(mWD_COMBO_ALIMENTSH.opEgal(113, 0))
{
// 		REQ_qteRepasJour.Paramdatej	= gdMaDate
WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("paramdatej").setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// 		SI HExécuteRequête(REQ_qteRepasJour) ALORS
if(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour")).getBoolean())
{
// 			HLitPremier(REQ_qteRepasJour)
WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour"));

// 			LIB_Quantité_de_parts="Quantité de parts distribuée : "+Arrondi(REQ_qteRepasJour.totalLeucine+0.5*MoiMême,2)+"/"+grObjectifPart
mWD_LIB_Quantite_de_parts.setValeur(new WDChaineU("Quantité de parts distribuée : ").opPlus(WDAPIMath.arrondi(WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("totalleucine").opPlus(new WDReel(0.5).opMult(WDContexte.getMoiMeme())),2)).opPlus("/").opPlus(GWDPleucinose.getInstance().vWD_grObjectifPart));

}
else
{
// 			LIB_Quantité_de_parts="problème liaisons données"
mWD_LIB_Quantite_de_parts.setValeur("problème liaisons données");

}

}
else
{
// 		REQ_qteRepasJour.Paramdatej	= gdMaDate
WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("paramdatej").setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// 		SI HExécuteRequête(REQ_qteRepasJour) ALORS
if(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour")).getBoolean())
{
// 			HLitPremier(REQ_qteRepasJour)
WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour"));

// 			LIB_Quantité_de_parts="Quantité de parts distribuée : "+Arrondi(REQ_qteRepasJour.totalLeucine,2)+"/"+grObjectifPart
mWD_LIB_Quantite_de_parts.setValeur(new WDChaineU("Quantité de parts distribuée : ").opPlus(WDAPIMath.arrondi(WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("totalleucine"),2)).opPlus("/").opPlus(GWDPleucinose.getInstance().vWD_grObjectifPart));

}
else
{
// 			LIB_Quantité_de_parts="problème liaisons données"
mWD_LIB_Quantite_de_parts.setValeur("problème liaisons données");

}

}

}

return new WDVoid("clicBtnActionClavier");
}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Quantite mWD_SAI_Quantite;

/**
 * LIB_Ou
 */
class GWDLIB_Ou extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°14 de FEN_ajouteRepasHypo.LIB_Ou
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2474058749170671168l);

super.setChecksum("605651691");

super.setNom("LIB_Ou");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("OU");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(165, 306);

super.setTailleInitiale(31, 30);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(14);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x893344, 0xFFFFFFFF, creerPolice_GEN("Roboto", -9.000000, 1), 3, 0, 0x0, 0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE0DCDA, 0x605C5A, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);

super.setParamAnimationChamp(42, 1, 200);

super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Ou mWD_LIB_Ou;

/**
 * IMG_aliment
 */
class GWDIMG_aliment extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°15 de FEN_ajouteRepasHypo.IMG_aliment
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2474414681893723346l);

super.setChecksum("799034909");

super.setNom("IMG_aliment");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(10, 409);

super.setTailleInitiale(130, 130);

super.setValeurInitiale("");

super.setPlan(0);

super.setLiaisonFichier("aliments", "photo");

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(15);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);

super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_aliment mWD_IMG_aliment;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FEN_ajouteRepasHypo
////////////////////////////////////////////////////////////////////////////
// PROCEDURE ExecuteBouton(pChampZML)
// // recherche le premier bouton et execute son action
// i est un entier = 1
// BOUCLE
// 	sResChamp est une chaine  = EnumèreChamp(pChampZML..nomcomplet, i)
// 	si sResChamp="" alors sortir
// 	si {sResChamp, indChamp}..type=typBouton alors
// 		ExécuteTraitement(sResChamp, trtclic)
// 		retour
// 	FIN
// FIN
public void fWD_executeBouton()
{
// //PROCEDURE ExecuteBouton(pChampZML)
initExecProcLocale("ExecuteBouton");


try
{
}
finally
{
finExecProcLocale();
}

}




/**
 * Traitement: Déclarations globales de FEN_ajouteRepasHypo
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre()
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;






}





/**
 * Traitement: Fin d'initialisation de FEN_ajouteRepasHypo
 */
public void init()
{
super.init();

// 



////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_hMonHeure = new WDHeure();

WDObjet vWD_nEntierTMP = new WDEntier4();



// SAI_Date=gdMaDate
mWD_SAI_Date.setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// hMonHeure	est une heure


// nEntierTMP	est un entier


// hMonHeure	= HeureSys()
vWD_hMonHeure.setValeur(WDAPIDate.heureSys());

// nEntierTMP	= hMonHeure.Heure
vWD_nEntierTMP.setValeur(vWD_hMonHeure.getProp(EWDPropriete.PROP_HEURE));

// SI nEntierTMP<=23 ALORS
if(vWD_nEntierTMP.opInfEgal(23))
{
// 	COMBO_moment=4
mWD_COMBO_moment.setValeur(4);

}

// SI nEntierTMP<=17 ALORS
if(vWD_nEntierTMP.opInfEgal(17))
{
// 	COMBO_moment=3
mWD_COMBO_moment.setValeur(3);

}

// SI nEntierTMP<=14 ALORS
if(vWD_nEntierTMP.opInfEgal(14))
{
// 	COMBO_moment=2
mWD_COMBO_moment.setValeur(2);

}

// SI nEntierTMP<11 ALORS
if(vWD_nEntierTMP.opInf(11))
{
// 	COMBO_moment=1
mWD_COMBO_moment.setValeur(1);

}

// REQ_qteRepasJour.Paramdatej	= gdMaDate
WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("paramdatej").setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// SI HExécuteRequête(REQ_qteRepasJour) ALORS
if(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour")).getBoolean())
{
// 	HLitPremier(REQ_qteRepasJour)
WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour"));

// 	LIB_Quantité_de_parts="Quantité de parts distribuée : "+Arrondi(REQ_qteRepasJour.totalLeucine,2)+"/"+grObjectifPart
mWD_LIB_Quantite_de_parts.setValeur(new WDChaineU("Quantité de parts distribuée : ").opPlus(WDAPIMath.arrondi(WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("totalleucine"),2)).opPlus("/").opPlus(GWDPleucinose.getInstance().vWD_grObjectifPart));

}
else
{
// 	LIB_Quantité_de_parts="problème liaisons données"
mWD_LIB_Quantite_de_parts.setValeur("problème liaisons données");

}

}









/**
 * Traitement: Fermeture de FEN_ajouteRepasHypo
 */
public void fermetureFenetre()
{
super.fermetureFenetre();

// 


try
{
}
finally
{
// Générer les appels aux ancêtres
}

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_ajouteRepasHypo
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_BTN_Flottant = new GWDBTN_Flottant();
mWD_BTN_Flottant1 = new GWDBTN_Flottant1();
mWD_BTN_Flottant2 = new GWDBTN_Flottant2();
mWD_BTN_Flottant3 = new GWDBTN_Flottant3();
mWD_BTN_Flottant4 = new GWDBTN_Flottant4();
mWD_BTN_Flottant5 = new GWDBTN_Flottant5();
mWD_COMBO_moment = new GWDCOMBO_moment();
mWD_LIB_Quantite_de_parts = new GWDLIB_Quantite_de_parts();
mWD_SAI_Date = new GWDSAI_Date();
mWD_BTN_SansNom1 = new GWDBTN_SansNom1();
mWD_COMBO_ALIMENTSH = new GWDCOMBO_ALIMENTSH();
mWD_SAI_Grammage = new GWDSAI_Grammage();
mWD_SAI_Quantite = new GWDSAI_Quantite();
mWD_LIB_Ou = new GWDLIB_Ou();
mWD_IMG_aliment = new GWDIMG_aliment();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_ajouteRepasHypo
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2473973799004606772l);

super.setChecksum("604573741");

super.setNom("FEN_ajouteRepasHypo");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(360, 650);

super.setTitre("dup");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(3);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("C:\\Mes Projets Mobile\\leucinose\\fondfond.png", 3, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);

super.setCouleurBarreSysteme(0xFF000001);

super.setCopieEcranAutorisee(true);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_ajouteRepasHypo
////////////////////////////////////////////////////////////////////////////
mWD_BTN_Flottant.initialiserObjet();
super.ajouter("BTN_Flottant", mWD_BTN_Flottant);
mWD_BTN_Flottant1.initialiserObjet();
super.ajouter("BTN_Flottant1", mWD_BTN_Flottant1);
mWD_BTN_Flottant2.initialiserObjet();
super.ajouter("BTN_Flottant2", mWD_BTN_Flottant2);
mWD_BTN_Flottant3.initialiserObjet();
super.ajouter("BTN_Flottant3", mWD_BTN_Flottant3);
mWD_BTN_Flottant4.initialiserObjet();
super.ajouter("BTN_Flottant4", mWD_BTN_Flottant4);
mWD_BTN_Flottant5.initialiserObjet();
super.ajouter("BTN_Flottant5", mWD_BTN_Flottant5);
mWD_COMBO_moment.initialiserObjet();
super.ajouter("COMBO_moment", mWD_COMBO_moment);
mWD_LIB_Quantite_de_parts.initialiserObjet();
super.ajouter("LIB_Quantité_de_parts", mWD_LIB_Quantite_de_parts);
mWD_SAI_Date.initialiserObjet();
super.ajouter("SAI_Date", mWD_SAI_Date);
mWD_BTN_SansNom1.initialiserObjet();
super.ajouter("BTN_SansNom1", mWD_BTN_SansNom1);
mWD_COMBO_ALIMENTSH.initialiserObjet();
super.ajouter("COMBO_ALIMENTSH", mWD_COMBO_ALIMENTSH);
mWD_SAI_Grammage.initialiserObjet();
super.ajouter("SAI_Grammage", mWD_SAI_Grammage);
mWD_SAI_Quantite.initialiserObjet();
super.ajouter("SAI_Quantite", mWD_SAI_Quantite);
mWD_LIB_Ou.initialiserObjet();
super.ajouter("LIB_Ou", mWD_LIB_Ou);
mWD_IMG_aliment.initialiserObjet();
super.ajouter("IMG_aliment", mWD_IMG_aliment);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}

public WDProjet getProjet()
{
return GWDPleucinose.getInstance();
}

public IWDEnsembleElement getEnsemble()
{
return GWDPleucinose.getInstance();
}
public int getModeContexteHF()
{
return 1;
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 0;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return true;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return false;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 0;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return false;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isGabaritSombre()
{
return false;
}
public boolean isIgnoreModeNuit()
{
return false;
}
/**
* Retourne vrai si l'option de masquage automatique de l'ActionBar lorsqu'on scrolle dans un champ de la fenêtre a été activée.
*/
public boolean isMasquageAutomatiqueActionBar()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPleucinose.getInstance().mWD_FEN_ajouteRepasHypo;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "250 PHOENIX#WM";
}
}
