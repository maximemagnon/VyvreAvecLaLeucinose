/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_ajouteRepas
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
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.combo.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.champs.groupeoptions.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_ajouteRepas extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_ajouteRepas
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_Flottant
 */
class GWDBTN_Flottant extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_ajouteRepas.BTN_Flottant
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467833710745200578l);

super.setChecksum("1878208657");

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

super.setNumTab(19);

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
// Déclaration des champs du fils n°2 de FEN_ajouteRepas.BTN_Flottant1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467833710745266114l);

super.setChecksum("1878274193");

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

super.setNumTab(20);

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
// Déclaration des champs du fils n°3 de FEN_ajouteRepas.BTN_Flottant2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467833710745331650l);

super.setChecksum("1878339729");

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

super.setNumTab(21);

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
// Déclaration des champs du fils n°4 de FEN_ajouteRepas.BTN_Flottant3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467833710745397186l);

super.setChecksum("1878405265");

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

super.setNumTab(22);

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
// Déclaration des champs du fils n°5 de FEN_ajouteRepas.BTN_Flottant4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467833710745462722l);

super.setChecksum("1878470801");

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

super.setNumTab(23);

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
// Déclaration des champs du fils n°6 de FEN_ajouteRepas.BTN_Flottant5
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467833710745528258l);

super.setChecksum("1878536337");

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

super.setNumTab(24);

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
 * BTN_Enregistrer
 */
class GWDBTN_Enregistrer extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_ajouteRepas.BTN_Enregistrer
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467833753695735631l);

super.setChecksum("1879070760");

super.setNom("BTN_Enregistrer");

super.setType(4);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(137, 454);

super.setTailleInitiale(211, 92);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(18);

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
 * Traitement: Clic sur BTN_Enregistrer
 */
public void clicSurBoutonGauche()
// ajouteRepas(COMBO_ALIMENTS)
// MajAffichage()
{
super.clicSurBoutonGauche();

// 


// REPAS_ALIMENTS.IDALIMENTS=COMBO_ALIMENTS
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("idaliments").setValeur(mWD_COMBO_ALIMENTS);

// HLitRecherche(REPAS,datej,gdMaDate,hIdentique)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("repas"),WDAPIHF.getRubriqueSansCasseNiAccent("datej"),GWDPleucinose.getInstance().vWD_gdMaDate,(long)524288);

// SI HTrouve(REPAS) ALORS
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("repas")).getBoolean())
{
// 	REPAS_ALIMENTS.IDREPAS=REPAS.IDREPAS
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("idrepas").setValeur(WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("idrepas"));

// 	REPAS.totalLeucine=REPAS.totalLeucine+SAI_Quantite
WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("totalleucine").setValeur(WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("totalleucine").opPlus(mWD_SAI_Quantite));

// 	HModifie(REPAS)
WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("repas"));

}
else
{
// 	REPAS.datej			= gdMaDate
WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("datej").setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// 	REPAS.totalLeucine	= SAI_Quantite
WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("totalleucine").setValeur(mWD_SAI_Quantite);

// 	HAjoute(REPAS)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("repas"));

}

// REPAS_ALIMENTS.IDREPAS=REPAS.IDREPAS
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("idrepas").setValeur(WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("idrepas"));

// REPAS_ALIMENTS.qteAliment	= SAI_grammage
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("qtealiment").setValeur(mWD_SAI_grammage);

// REPAS_ALIMENTS.cuisson		= SEL_cuisson
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("cuisson").setValeur(mWD_SEL_cuisson);

// REPAS_ALIMENTS.Parttotal	= SAI_Quantite
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("parttotal").setValeur(mWD_SAI_Quantite);

// REPAS_ALIMENTS.momentRepas	= COMBO_moment.ValeurAffichée
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("momentrepas").setValeur(mWD_COMBO_moment.getProp(EWDPropriete.PROP_VALEURAFFICHEE));

// HAjoute(REPAS_ALIMENTS)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("repas_aliments"));

// gnIdRepasAliment=0
GWDPleucinose.getInstance().vWD_gnIdRepasAliment.setValeur(0);

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
public GWDBTN_Enregistrer mWD_BTN_Enregistrer;

/**
 * LIB_QtePartJour
 */
class GWDLIB_QtePartJour extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_ajouteRepas.LIB_QtePartJour
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467833865365698087l);

super.setChecksum("1879883090");

super.setNom("LIB_QtePartJour");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Quantité de parts : 10/15");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(0, 71);

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
public GWDLIB_QtePartJour mWD_LIB_QtePartJour;

/**
 * COMBO_ALIMENTS
 */
class GWDCOMBO_ALIMENTS extends WDComboFichierAccesDirect
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_ajouteRepas.COMBO_ALIMENTS
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(0,0,282,3);
super.setRectCompPrincipal(36,3,226,38);
super.setQuid(2467834621283722428l);

super.setChecksum("1889716566");

super.setNom("COMBO_ALIMENTS");

super.setType(10002);

super.setBulle("");

super.setLibelle("Aliment : ");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(39, 189);

super.setTailleInitiale(282, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setSourceRemplissage("req_listealimentsselontype", "libelle", "libelle", "idaliments", true, "");

super.setContenuInitial("");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(12);

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
 * Traitement: Initialisation de COMBO_ALIMENTS
 */
public void init()
{
super.init();

// 


// MaSource.Paramtype="LEUCINOSE"
WDContexte.getMaSource().get("Paramtype").setValeur("LEUCINOSE");

}




/**
 * Traitement: Sélection d'une ligne de COMBO_ALIMENTS
 */
public void selectionLigne()
// ajouteRepas(MoiMême)
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

// 	si ALIMENTS.QtepourUnepartCUIT<>0 alors
if(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcuit").opDiff(0))
{
// 		SAI_grammage=ALIMENTS.QtepourUnepartCUIT
mWD_SAI_grammage.setValeur(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcuit"));

// 		SEL_cuisson="Cuit"
mWD_SEL_cuisson.setValeur("Cuit");

}

// 	si ALIMENTS.QtepourUnepartCRU<>0 alors
if(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcru").opDiff(0))
{
// 		SAI_grammage=ALIMENTS.QtepourUnepartCRU
mWD_SAI_grammage.setValeur(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcru"));

// 		SEL_cuisson="Cru"
mWD_SEL_cuisson.setValeur("Cru");

}

// 	SAI_Quantite=1	
mWD_SAI_Quantite.setValeur(1);

// 	gnIdRepasAliment=ALIMENTS.IDALIMENTS
GWDPleucinose.getInstance().vWD_gnIdRepasAliment.setValeur(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("idaliments"));

}

// REQ_qteRepasJour.Paramdatej	= gdMaDate
WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("paramdatej").setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// SI HExécuteRequête(REQ_qteRepasJour) ALORS
if(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour")).getBoolean())
{
// 	HLitPremier(REQ_qteRepasJour)
WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour"));

// 	FEN_ajouteRepas.LIB_QtePartJour="Quantité de parts distribuée : "+Arrondi(REQ_qteRepasJour.totalLeucine+1,2)+"/"+grObjectifPart
mWD_LIB_QtePartJour.setValeur(new WDChaineU("Quantité de parts distribuée : ").opPlus(WDAPIMath.arrondi(WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("totalleucine").opPlus(1),2)).opPlus("/").opPlus(GWDPleucinose.getInstance().vWD_grObjectifPart));

}
else
{
// 	FEN_ajouteRepas.LIB_QtePartJour="problème liaisons données"
mWD_LIB_QtePartJour.setValeur("problème liaisons données");

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
public GWDCOMBO_ALIMENTS mWD_COMBO_ALIMENTS;

/**
 * COMBO_cuit
 */
class GWDCOMBO_cuit extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de FEN_ajouteRepas.COMBO_cuit
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(1,3,35,38);
super.setRectCompPrincipal(36,3,226,38);
super.setQuid(2467836446654685553l);

super.setChecksum("1900634785");

super.setNom("COMBO_cuit");

super.setType(10002);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(-492, 222);

super.setTailleInitiale(282, 44);

super.setValeurInitiale("Cuit");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("Cuit\r\nCru");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(10);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(13);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x808080);

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
 * Traitement: Sélection d'une ligne de COMBO_cuit
 */
public void selectionLigne()
{
super.selectionLigne();

// 


// si MoiMême=1 et COMBO_ALIMENTS<>0 ALORS
if((WDContexte.getMoiMeme().opEgal(1, 0) & mWD_COMBO_ALIMENTS.opDiff(0)))
{
// 	HLitRecherche(REPAS_ALIMENTS,idRepasAliment,gnIdRepasAliment,hIdentique)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("repas_aliments"),WDAPIHF.getRubriqueSansCasseNiAccent("idrepasaliment"),GWDPleucinose.getInstance().vWD_gnIdRepasAliment,(long)524288);

// 	si HTrouve(REPAS_ALIMENTS) ALORS
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("repas_aliments")).getBoolean())
{
// 		REPAS_ALIMENTS.cuisson=MoiMême..ValeurAffichée
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("cuisson").setValeur(WDContexte.getMoiMeme().getProp(EWDPropriete.PROP_VALEURAFFICHEE));

// 		HLitRecherche(ALIMENTS,IDALIMENTS,REPAS_ALIMENTS.IDALIMENTS,hIdentique)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("aliments"),WDAPIHF.getRubriqueSansCasseNiAccent("idaliments"),WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("idaliments"),(long)524288);

// 		si HTrouve(ALIMENTS) ALORS
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("aliments")).getBoolean())
{
// 			si ALIMENTS.QtepourUnepartCUIT<>0 ALORS
if(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcuit").opDiff(0))
{
// 				REPAS_ALIMENTS.Parttotal=REPAS_ALIMENTS.qteAliment/ALIMENTS.QtepourUnepartCUIT
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("parttotal").setValeur(WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("qtealiment").opDiv(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcuit")));

// 				HModifie(REPAS_ALIMENTS)
WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("repas_aliments"));

// 				MajAffichage()			
fWD_majAffichage();

}

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
public GWDCOMBO_cuit mWD_COMBO_cuit;

/**
 * SAI_grammage
 */
class GWDSAI_grammage extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de FEN_ajouteRepas.SAI_grammage
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(36,3,226,38);
super.setQuid(2467836631342123525l);

super.setChecksum("1897416553");

super.setNom("SAI_grammage");

super.setType(20004);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(39, 248);

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

super.setAltitude(11);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(14);

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
 * Traitement: Validation par le clavier de SAI_grammage
 */
public WDObjet clicBtnActionClavier()
{
super.clicBtnActionClavier();

// 


// HLitRecherche(ALIMENTS,IDALIMENTS,COMBO_ALIMENTS,hIdentique)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("aliments"),WDAPIHF.getRubriqueSansCasseNiAccent("idaliments"),mWD_COMBO_ALIMENTS,(long)524288);

// SI HTrouve ALORS
if(WDAPIHF.hTrouve().getBoolean())
{
// 	SELON SEL_cuisson
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// 	SELON SEL_cuisson
WDObjet _WDExpSelon0 = mWD_SEL_cuisson;
if(_WDExpSelon0.opEgal("Cru", 0))
{
// 			SAI_Quantite=	SAI_grammage /ALIMENTS.QtepourUnepartCRU
mWD_SAI_Quantite.setValeur(this.opDiv(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcru")));

}
else if(_WDExpSelon0.opEgal("Cuit", 0))
{
// 			SAI_Quantite=   SAI_grammage /ALIMENTS.QtepourUnepartCUIT
mWD_SAI_Quantite.setValeur(this.opDiv(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcuit")));

}
else {
}

}

}

// REQ_qteRepasJour.Paramdatej	= gdMaDate
WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("paramdatej").setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// SI HExécuteRequête(REQ_qteRepasJour) ALORS
if(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour")).getBoolean())
{
// 	HLitPremier(REQ_qteRepasJour)
WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour"));

// 	FEN_ajouteRepas.LIB_QtePartJour="Quantité de parts distribuée : "+Arrondi(REQ_qteRepasJour.totalLeucine+SAI_Quantite,2)+"/"+grObjectifPart
mWD_LIB_QtePartJour.setValeur(new WDChaineU("Quantité de parts distribuée : ").opPlus(WDAPIMath.arrondi(WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("totalleucine").opPlus(mWD_SAI_Quantite),2)).opPlus("/").opPlus(GWDPleucinose.getInstance().vWD_grObjectifPart));

}
else
{
// 	FEN_ajouteRepas.LIB_QtePartJour="problème liaisons données"
mWD_LIB_QtePartJour.setValeur("problème liaisons données");

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
public GWDSAI_grammage mWD_SAI_grammage;

/**
 * SAI_Quantite
 */
class GWDSAI_Quantite extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°12 de FEN_ajouteRepas.SAI_Quantite
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(36,3,226,38);
super.setQuid(2467839881355891868l);

super.setChecksum("620942581");

super.setNom("SAI_Quantite");

super.setType(20004);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(1);

super.setPositionInitiale(39, 366);

super.setTailleInitiale(282, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("999,99"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(12);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(17);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU("99,99 Parts"));

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
 * Traitement: Double Tap / Bouton gauche double-clic sur SAI_Quantite
 */
public void doubleClicSurBoutonGauche()
{
super.doubleClicSurBoutonGauche();

// REQ_qteRepasJour.Paramdatej	= gdMaDate


// REQ_qteRepasJour.Paramdatej	= gdMaDate
WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("paramdatej").setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// SI HExécuteRequête(REQ_qteRepasJour) ALORS
if(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour")).getBoolean())
{
// 	rQtePartDejaDonne, rEsteAcompleter sont des réels
WDObjet vWD_rQtePartDejaDonne = new WDReel();


WDObjet vWD_rEsteAcompleter = new WDReel();



// 	rQtePartDejaDonne=REQ_qteRepasJour.totalLeucine
vWD_rQtePartDejaDonne.setValeur(WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("totalleucine"));

// 	rEsteAcompleter=grObjectifPart-rQtePartDejaDonne
vWD_rEsteAcompleter.setValeur(GWDPleucinose.getInstance().vWD_grObjectifPart.opMoins(vWD_rQtePartDejaDonne));

// 	Si rEsteAcompleter>=0 ALORS
if(vWD_rEsteAcompleter.opSupEgal(0))
{
// 		HLitRecherche(ALIMENTS,IDALIMENTS,COMBO_ALIMENTS,hIdentique)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("aliments"),WDAPIHF.getRubriqueSansCasseNiAccent("idaliments"),mWD_COMBO_ALIMENTS,(long)524288);

// 		si HTrouve() ALORS
if(WDAPIHF.hTrouve().getBoolean())
{
// 			Si SEL_cuisson="Cuit" ALORS
if(mWD_SEL_cuisson.opEgal("Cuit", 0))
{
// 				SAI_grammage=rEsteAcompleter*ALIMENTS.QtepourUnepartCuit
mWD_SAI_grammage.setValeur(vWD_rEsteAcompleter.opMult(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcuit")));

}
else
{
// 				SAI_grammage=rEsteAcompleter*ALIMENTS.QtepourUnepartCRU
mWD_SAI_grammage.setValeur(vWD_rEsteAcompleter.opMult(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcru")));

}

// 			SAI_Quantite=rEsteAcompleter
this.setValeur(vWD_rEsteAcompleter);

}

}
else
{
// 		ToastAffiche("L'objectif de part est déjà atteint")
WDAPIToast.toastAffiche(new WDChaineU("L'objectif de part est déjà atteint"));

}

}

// REQ_qteRepasJour.Paramdatej	= gdMaDate
WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("paramdatej").setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// SI HExécuteRequête(REQ_qteRepasJour) ALORS
if(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour")).getBoolean())
{
// 	HLitPremier(REQ_qteRepasJour)
WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour"));

// 	FEN_ajouteRepas.LIB_QtePartJour="Quantité de parts distribuée : "+Arrondi(REQ_qteRepasJour.totalLeucine+SAI_Quantite,2)+"/"+grObjectifPart
mWD_LIB_QtePartJour.setValeur(new WDChaineU("Quantité de parts distribuée : ").opPlus(WDAPIMath.arrondi(WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("totalleucine").opPlus(this),2)).opPlus("/").opPlus(GWDPleucinose.getInstance().vWD_grObjectifPart));

}
else
{
// 	FEN_ajouteRepas.LIB_QtePartJour="problème liaisons données"
mWD_LIB_QtePartJour.setValeur("problème liaisons données");

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurDoubleTape();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Quantite mWD_SAI_Quantite;

/**
 * COMBO_ALIMENTS1
 */
class GWDCOMBO_ALIMENTS1 extends WDComboFichierAccesDirect
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°13 de FEN_ajouteRepas.COMBO_ALIMENTS1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(1,3,3,20);
super.setRectCompPrincipal(4,3,143,20);
super.setQuid(2467840027387238655l);

super.setChecksum("627775879");

super.setNom("COMBO_ALIMENTS1");

super.setType(10002);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(-470, 138);

super.setTailleInitiale(150, 26);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setSourceRemplissage("aliments", "idaliments", "libelle", "", true, "");

super.setContenuInitial("");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setAltitude(13);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(5);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x808080);

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

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOMBO_ALIMENTS1 mWD_COMBO_ALIMENTS1;

/**
 * SAI_Entier3
 */
class GWDSAI_Entier3 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°14 de FEN_ajouteRepas.SAI_Entier3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,3,51,22);
super.setQuid(2467840027387632168l);

super.setChecksum("623794851");

super.setNom("SAI_Entier3");

super.setType(20004);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(-249, 137);

super.setTailleInitiale(60, 28);

super.setValeurInitiale("Gr");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("999"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(false);

super.setAltitude(14);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(3);

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

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Entier3 mWD_SAI_Entier3;

/**
 * SAI_Entier4
 */
class GWDSAI_Entier4 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°15 de FEN_ajouteRepas.SAI_Entier4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,3,51,22);
super.setQuid(2467840027387763255l);

super.setChecksum("623925938");

super.setNom("SAI_Entier4");

super.setType(20004);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(-186, 137);

super.setTailleInitiale(60, 28);

super.setValeurInitiale("Gr");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("999"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(false);

super.setAltitude(15);

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

super.setMasqueAffichage(new WDChaineU(""));

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

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Entier4 mWD_SAI_Entier4;

/**
 * SAI_Entier5
 */
class GWDSAI_Entier5 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°16 de FEN_ajouteRepas.SAI_Entier5
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,3,51,22);
super.setQuid(2467842423980727627l);

super.setChecksum("625139700");

super.setNom("SAI_Entier5");

super.setType(20004);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(-186, 172);

super.setTailleInitiale(60, 28);

super.setValeurInitiale("Gr");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("999"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(false);

super.setAltitude(16);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(8);

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

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Entier5 mWD_SAI_Entier5;

/**
 * SAI_Entier6
 */
class GWDSAI_Entier6 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°17 de FEN_ajouteRepas.SAI_Entier6
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,3,51,22);
super.setQuid(2467842423980858715l);

super.setChecksum("625270788");

super.setNom("SAI_Entier6");

super.setType(20004);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(-249, 172);

super.setTailleInitiale(60, 28);

super.setValeurInitiale("Gr");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("999"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(false);

super.setAltitude(17);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(7);

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

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Entier6 mWD_SAI_Entier6;

/**
 * COMBO_cuit2
 */
class GWDCOMBO_cuit2 extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°18 de FEN_ajouteRepas.COMBO_cuit2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(1,3,3,20);
super.setRectCompPrincipal(4,3,58,20);
super.setQuid(2467842423981120859l);

super.setChecksum("631027626");

super.setNom("COMBO_cuit2");

super.setType(10002);

super.setBulle("");

super.setLibelle("Cuit");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(-317, 173);

super.setTailleInitiale(65, 26);

super.setValeurInitiale("Cuit");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("Cuit\r\nCru");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setAltitude(18);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(10);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x808080);

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

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOMBO_cuit2 mWD_COMBO_cuit2;

/**
 * COMBO_ALIMENTS2
 */
class GWDCOMBO_ALIMENTS2 extends WDComboFichierAccesDirect
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°19 de FEN_ajouteRepas.COMBO_ALIMENTS2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(1,3,3,20);
super.setRectCompPrincipal(4,3,143,20);
super.setQuid(2467842423981383050l);

super.setChecksum("631289664");

super.setNom("COMBO_ALIMENTS2");

super.setType(10002);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(-470, 173);

super.setTailleInitiale(150, 26);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setSourceRemplissage("aliments", "idaliments", "libelle", "", true, "");

super.setContenuInitial("");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setAltitude(19);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(9);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x808080);

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

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOMBO_ALIMENTS2 mWD_COMBO_ALIMENTS2;

/**
 * COMBO_moment
 */
class GWDCOMBO_moment extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°20 de FEN_ajouteRepas.COMBO_moment
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(1,3,35,47);
super.setRectCompPrincipal(36,3,226,47);
super.setQuid(2467844777640000151l);

super.setChecksum("646069614");

super.setNom("COMBO_moment");

super.setType(10002);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(39, 118);

super.setTailleInitiale(282, 53);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("Petit déjeuner\r\nDéjeuner\r\nGouter\r\nDiner");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(20);

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
 * COMBO_cuit1
 */
class GWDCOMBO_cuit1 extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°21 de FEN_ajouteRepas.COMBO_cuit1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(1,3,3,20);
super.setRectCompPrincipal(4,3,58,20);
super.setQuid(2467845769782722783l);

super.setChecksum("651986745");

super.setNom("COMBO_cuit1");

super.setType(10002);

super.setBulle("");

super.setLibelle("Cuit");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(-317, 138);

super.setTailleInitiale(65, 26);

super.setValeurInitiale("Cuit");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("Cuit\r\nCru");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setAltitude(21);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(6);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x808080);

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

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOMBO_cuit1 mWD_COMBO_cuit1;

/**
 * SAI_Date
 */
class GWDSAI_Date extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°22 de FEN_ajouteRepas.SAI_Date
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,204,46);
super.setQuid(2467900208523175712l);

super.setChecksum("677647316");

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

super.setPositionInitiale(77, 9);

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

super.setAltitude(22);

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
 * SEL_cuisson
 */
class GWDSEL_cuisson extends WDSelecteur
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°23 de FEN_ajouteRepas.SEL_cuisson
////////////////////////////////////////////////////////////////////////////

/**
 * Cru
 */
class GWDCru extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_ajouteRepas.SEL_cuisson.Cru
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Cru");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("Cru")));

super.setNom("Cru");

super.setStyleLibelleOption(0x893443, creerPolice_GEN("Roboto", -8.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCru mWD_Cru = new GWDCru();

/**
 * Cuit
 */
class GWDCuit extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_ajouteRepas.SEL_cuisson.Cuit
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Cuit");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("Cuit")));

super.setNom("Cuit");

super.setStyleLibelleOption(0x893443, creerPolice_GEN("Roboto", -8.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCuit mWD_Cuit = new GWDCuit();
/**
 * Initialise tous les champs de FEN_ajouteRepas.SEL_cuisson
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_ajouteRepas.SEL_cuisson
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterOption(mWD_Cru);
super.ajouterOption(mWD_Cuit);
positionnerOptions();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,1,280,42);
super.setQuid(2474348217096617249l);

super.setChecksum("620818025");

super.setNom("SEL_cuisson");

super.setType(6);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(39, 307);

super.setTailleInitiale(282, 44);

super.setValeurInitiale("1");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(23);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(16);

super.setLettreAppel(65535);

super.setPersistant(false);

super.setParamOptions(false, 2, false, true, false);

super.setValeurRenvoyeeParProgrammation(true);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(27, 0x893443, 0x90000, 0xFFFFFFFF, 20.000000, 20.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1));

super.setParamAnimationChamp(42, 1, 200);

super.setImageCoche("C:\\Mes Projets Mobile\\leucinose\\Gabarits\\WM\\250 Phoenix\\Phoenix_Radio@dpi1x.png?E12_8O", 1);

super.setParamSaisieObligatoire(false);

super.setParamErreurSaisieObligatoire("", true, false, false);

super.setStyleChampErreurSaisieObligatoire(null, 0xFF, 0xFF);

super.setStyleLibelleErreurSaisieObligatoire(0x68635F, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieObligatoire(21, 141);

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: A chaque modification de SEL_cuisson
 */
public void modification()
{
super.modification();

// 


// HLitRecherche(ALIMENTS,IDALIMENTS,COMBO_ALIMENTS,hIdentique)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("aliments"),WDAPIHF.getRubriqueSansCasseNiAccent("idaliments"),mWD_COMBO_ALIMENTS,(long)524288);

// SI HTrouve ALORS
if(WDAPIHF.hTrouve().getBoolean())
{
// 	SELON MoiMême
// Délimiteur de visibilité pour ne pas étendre la visibilité de la variable temporaire _WDExpSelon
{
// 	SELON MoiMême
WDObjet _WDExpSelon0 = WDContexte.getMoiMeme();
if(_WDExpSelon0.opEgal("Cru", 0))
{
// 			SI ALIMENTS.QtepourUnepartCRU<>0 ALORS
if(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcru").opDiff(0))
{
// 				SAI_Quantite=	SAI_grammage / ALIMENTS.QtepourUnepartCRU
mWD_SAI_Quantite.setValeur(mWD_SAI_grammage.opDiv(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcru")));

}
else
{
// 				ToastAffiche("Cet aliment ne peut être pesé que Cuit")
WDAPIToast.toastAffiche(new WDChaineU("Cet aliment ne peut être pesé que Cuit"));

// 				MoiMême="Cuit"
WDContexte.getMoiMeme().setValeur("Cuit");

// 				SAI_Quantite=	SAI_grammage / ALIMENTS.QtepourUnepartCUIT
mWD_SAI_Quantite.setValeur(mWD_SAI_grammage.opDiv(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcuit")));

}

}
else if(_WDExpSelon0.opEgal("Cuit", 0))
{
// 			si ALIMENTS.QtepourUnepartCUIT<>0 alors
if(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcuit").opDiff(0))
{
// 				SAI_Quantite=	SAI_grammage / ALIMENTS.QtepourUnepartCUIT
mWD_SAI_Quantite.setValeur(mWD_SAI_grammage.opDiv(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcuit")));

}
else
{
// 				ToastAffiche("Cet aliment ne peut être pesé que Cru")
WDAPIToast.toastAffiche(new WDChaineU("Cet aliment ne peut être pesé que Cru"));

// 				MoiMême="Cru"
WDContexte.getMoiMeme().setValeur("Cru");

// 				SAI_Quantite=	SAI_grammage / ALIMENTS.QtepourUnepartCRU
mWD_SAI_Quantite.setValeur(mWD_SAI_grammage.opDiv(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcru")));

}

}
else {
}

}

}

// REQ_qteRepasJour.Paramdatej	= gdMaDate
WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("paramdatej").setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// SI HExécuteRequête(REQ_qteRepasJour) ALORS
if(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour")).getBoolean())
{
// 	HLitPremier(REQ_qteRepasJour)
WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour"));

// 	FEN_ajouteRepas.LIB_QtePartJour="Quantité de parts distribuée : "+Arrondi(REQ_qteRepasJour.totalLeucine+SAI_Quantite,2)+"/"+grObjectifPart
mWD_LIB_QtePartJour.setValeur(new WDChaineU("Quantité de parts distribuée : ").opPlus(WDAPIMath.arrondi(WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("totalleucine").opPlus(mWD_SAI_Quantite),2)).opPlus("/").opPlus(GWDPleucinose.getInstance().vWD_grObjectifPart));

}
else
{
// 	FEN_ajouteRepas.LIB_QtePartJour="problème liaisons données"
mWD_LIB_QtePartJour.setValeur("problème liaisons données");

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurModification();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_cuisson mWD_SEL_cuisson;

/**
 * BTN_SansNom2
 */
class GWDBTN_SansNom2 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°24 de FEN_ajouteRepas.BTN_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2474373334079535766l);

super.setChecksum("634994470");

super.setNom("BTN_SansNom2");

super.setType(4);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(409, 254);

super.setTailleInitiale(211, 92);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(24);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(15);

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
 * Traitement: Clic sur BTN_SansNom2
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 


// ajouteRepas(COMBO_ALIMENTS)
fWD_ajouteRepas(mWD_COMBO_ALIMENTS);

// MajAffichage()
fWD_majAffichage();

// gnIdRepasAliment=0
GWDPleucinose.getInstance().vWD_gnIdRepasAliment.setValeur(0);

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
public GWDBTN_SansNom2 mWD_BTN_SansNom2;

/**
 * SAI_Quantite1
 */
class GWDSAI_Quantite1 extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°25 de FEN_ajouteRepas.SAI_Quantite1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(36,3,226,38);
super.setQuid(2474373334079666854l);

super.setChecksum("635171107");

super.setNom("SAI_Quantite1");

super.setType(20004);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(1);

super.setPositionInitiale(363, 179);

super.setTailleInitiale(282, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(1);

super.setMasqueSaisie(new WDChaineU("999,99"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(25);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(11);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU("99,99 Parts"));

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

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Quantite1 mWD_SAI_Quantite1;

/**
 * IMG_aliment
 */
class GWDIMG_aliment extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°26 de FEN_ajouteRepas.IMG_aliment
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2474418199492942764l);

super.setChecksum("820039722");

super.setNom("IMG_aliment");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(12, 425);

super.setTailleInitiale(130, 130);

super.setValeurInitiale("");

super.setPlan(0);

super.setLiaisonFichier("aliments", "photo");

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(26);

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
// Procédures utilisateur de FEN_ajouteRepas
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



//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
// ajouteRepas (<nIdAliment>)
// 
//  Paramètres :
// 	nIdAliment : <indiquez ici le rôle de idAliment>
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
// 	nUmLigne (entier) : <indiquez ici le rôle de numLigne>
public void fWD_ajouteRepas( WDObjet vWD_nIdAliment )
{
// procédure ajouteRepas(nIdAliment)
initExecProcLocale("ajouteRepas");


try
{
// REPAS_ALIMENTS.IDALIMENTS=nIdAliment
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("idaliments").setValeur(vWD_nIdAliment);

// HLitRecherche(ALIMENTS,IDALIMENTS,nIdAliment,hIdentique)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("aliments"),WDAPIHF.getRubriqueSansCasseNiAccent("idaliments"),vWD_nIdAliment,(long)524288);

// si HTrouve(ALIMENTS) ALORS
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("aliments")).getBoolean())
{
// 	HLitRecherche(REPAS,datej,gdMaDate,hIdentique)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("repas"),WDAPIHF.getRubriqueSansCasseNiAccent("datej"),GWDPleucinose.getInstance().vWD_gdMaDate,(long)524288);

// 	si htrouve=Faux ALORS
if(WDAPIHF.hTrouve().opEgal(false, 0))
{
// 		REPAS.datej=gdMaDate
WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("datej").setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// 		REPAS.totalLeucine=1
WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("totalleucine").setValeur(1);

// 		hajoute(REPAS)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("repas"));

}
else
{
// 		REPAS.totalLeucine=REPAS.totalLeucine+1
WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("totalleucine").setValeur(WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("totalleucine").opPlus(1));

// 		HModifie(REPAS)
WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("repas"));

}

// 	REPAS_ALIMENTS.IDREPAS=REPAS.IDREPAS
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("idrepas").setValeur(WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("idrepas"));

// 	si ALIMENTS.QtepourUnepartCRU<>0 ALORS
if(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcru").opDiff(0))
{
// 		REPAS_ALIMENTS.qteAliment=ALIMENTS.QtepourUnepartCRU
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("qtealiment").setValeur(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcru"));

// 		REPAS_ALIMENTS.cuisson="Cru"
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("cuisson").setValeur("Cru");

}
else
{
// 		REPAS_ALIMENTS.qteAliment=ALIMENTS.QtepourUnepartCUIT
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("qtealiment").setValeur(WDAPIHF.getFichierSansCasseNiAccent("aliments").getRubriqueSansCasseNiAccent("qtepourunepartcuit"));

// 		REPAS_ALIMENTS.cuisson="Cuit"
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("cuisson").setValeur("Cuit");

}

// 	REPAS_ALIMENTS.Parttotal=1
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("parttotal").setValeur(1);

// 	REPAS_ALIMENTS.momentRepas =COMBO_moment..ValeurAffichée
WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("momentrepas").setValeur(mWD_COMBO_moment.getProp(EWDPropriete.PROP_VALEURAFFICHEE));

// 	SI gnIdRepasAliment<>0 ALORS
if(GWDPleucinose.getInstance().vWD_gnIdRepasAliment.opDiff(0))
{
// 		HModifie(REPAS_ALIMENTS)
WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("repas_aliments"));

}
else
{
// 		hajoute(REPAS_ALIMENTS)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("repas_aliments"));

// 		gnIdRepasAliment=REPAS_ALIMENTS.idRepasAliment
GWDPleucinose.getInstance().vWD_gnIdRepasAliment.setValeur(WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("idrepasaliment"));

}

}

}
finally
{
finExecProcLocale();
}

}



//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
//  MajAffichage ()
// 
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_majAffichage()
{
// procédure MajAffichage()
initExecProcLocale("MajAffichage");


try
{
// 	HLitRecherche(REPAS_ALIMENTS,idRepasAliment,gnIdRepasAliment,hIdentique)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("repas_aliments"),WDAPIHF.getRubriqueSansCasseNiAccent("idrepasaliment"),GWDPleucinose.getInstance().vWD_gnIdRepasAliment,(long)524288);

// 	si htrouve ALORS
if(WDAPIHF.hTrouve().getBoolean())
{
// 		COMBO_ALIMENTS=REPAS_ALIMENTS.IDALIMENTS
mWD_COMBO_ALIMENTS.setValeur(WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("idaliments"));

// 		si REPAS_ALIMENTS.cuisson="Cru" ALORS
if(WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("cuisson").opEgal("Cru", 0))
{
// 			COMBO_cuit=2
mWD_COMBO_cuit.setValeur(2);

}
else
{
// 			COMBO_cuit=1
mWD_COMBO_cuit.setValeur(1);

}

// 		SAI_grammage=REPAS_ALIMENTS.qteAliment
mWD_SAI_grammage.setValeur(WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("qtealiment"));

// 		SAI_Quantite=REPAS_ALIMENTS.Parttotal
mWD_SAI_Quantite.setValeur(WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("parttotal"));

}

// 	MajRepas()
fWD_majRepas();

}
finally
{
finExecProcLocale();
}

}



//  Résumé : <indiquez ici ce que fait la procédure>
//  Syntaxe :
//  MajRepas ()
// 
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public WDObjet fWD_majRepas()
{
// procédure MajRepas()
initExecProcLocale("MajRepas");


try
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_rQuteLeucineJour = new WDReel();

WDObjet vWD_sChaineTMP = new WDChaineU();



// 	rQuteLeucineJour est un reel


// 	sChaineTMP est une chaine


// 	sChaineTMP = ""
vWD_sChaineTMP.setValeur("");

// 	REQ_qteRepasJour.Paramdatej	= gdMaDate
WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("paramdatej").setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// 	SI HExécuteRequête(REQ_qteRepasJour) ALORS
if(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour")).getBoolean())
{
// 		HLitPremier(REQ_qteRepasJour)
WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour"));

// 		rQuteLeucineJour=Arrondi(REQ_qteRepasJour.totalLeucine,2)+Arrondi(FEN_ajouteRepas.SAI_Quantite,2)
vWD_rQuteLeucineJour.setValeur(WDAPIMath.arrondi(WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("totalleucine"),2).opPlus(WDAPIMath.arrondi(mWD_SAI_Quantite,2)));

// 		sChaineTMP = "Quantité de parts distribuée : "+Arrondi(REQ_qteRepasJour.totalLeucine,2)+"/"+grObjectifPart
vWD_sChaineTMP.setValeur(new WDChaineU("Quantité de parts distribuée : ").opPlus(WDAPIMath.arrondi(WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("totalleucine"),2)).opPlus("/").opPlus(GWDPleucinose.getInstance().vWD_grObjectifPart));

}
else
{
// 		sChaineTMP="problème liaisons données"
vWD_sChaineTMP.setValeur("problème liaisons données");

}

// renvoyer sChaineTMP
return vWD_sChaineTMP;

}
finally
{
finExecProcLocale();
}

}




/**
 * Traitement: Déclarations globales de FEN_ajouteRepas
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre()
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;






}





/**
 * Traitement: Fin d'initialisation de FEN_ajouteRepas
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

// hMonHeure est une heure


// nEntierTMP est un entier


// hMonHeure=HeureSys()
vWD_hMonHeure.setValeur(WDAPIDate.heureSys());

// nEntierTMP=hMonHeure.Heure
vWD_nEntierTMP.setValeur(vWD_hMonHeure.getProp(EWDPropriete.PROP_HEURE));

// si nEntierTMP<=23 ALORS
if(vWD_nEntierTMP.opInfEgal(23))
{
// 	COMBO_moment=4
mWD_COMBO_moment.setValeur(4);

}

// si nEntierTMP<=17 ALORS
if(vWD_nEntierTMP.opInfEgal(17))
{
// 	COMBO_moment=3
mWD_COMBO_moment.setValeur(3);

}

// si nEntierTMP<=14 ALORS
if(vWD_nEntierTMP.opInfEgal(14))
{
// 	COMBO_moment=2
mWD_COMBO_moment.setValeur(2);

}

// si nEntierTMP<11 ALORS
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

// 	FEN_ajouteRepas.LIB_QtePartJour="Quantité de parts distribuée : "+Arrondi(REQ_qteRepasJour.totalLeucine,2)+"/"+grObjectifPart
mWD_LIB_QtePartJour.setValeur(new WDChaineU("Quantité de parts distribuée : ").opPlus(WDAPIMath.arrondi(WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("totalleucine"),2)).opPlus("/").opPlus(GWDPleucinose.getInstance().vWD_grObjectifPart));

}
else
{
// 	FEN_ajouteRepas.LIB_QtePartJour="problème liaisons données"
mWD_LIB_QtePartJour.setValeur("problème liaisons données");

}

}









/**
 * Traitement: Fermeture de FEN_ajouteRepas
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
// Création des champs de la fenêtre FEN_ajouteRepas
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_BTN_Flottant = new GWDBTN_Flottant();
mWD_BTN_Flottant1 = new GWDBTN_Flottant1();
mWD_BTN_Flottant2 = new GWDBTN_Flottant2();
mWD_BTN_Flottant3 = new GWDBTN_Flottant3();
mWD_BTN_Flottant4 = new GWDBTN_Flottant4();
mWD_BTN_Flottant5 = new GWDBTN_Flottant5();
mWD_BTN_Enregistrer = new GWDBTN_Enregistrer();
mWD_LIB_QtePartJour = new GWDLIB_QtePartJour();
mWD_COMBO_ALIMENTS = new GWDCOMBO_ALIMENTS();
mWD_COMBO_cuit = new GWDCOMBO_cuit();
mWD_SAI_grammage = new GWDSAI_grammage();
mWD_SAI_Quantite = new GWDSAI_Quantite();
mWD_COMBO_ALIMENTS1 = new GWDCOMBO_ALIMENTS1();
mWD_SAI_Entier3 = new GWDSAI_Entier3();
mWD_SAI_Entier4 = new GWDSAI_Entier4();
mWD_SAI_Entier5 = new GWDSAI_Entier5();
mWD_SAI_Entier6 = new GWDSAI_Entier6();
mWD_COMBO_cuit2 = new GWDCOMBO_cuit2();
mWD_COMBO_ALIMENTS2 = new GWDCOMBO_ALIMENTS2();
mWD_COMBO_moment = new GWDCOMBO_moment();
mWD_COMBO_cuit1 = new GWDCOMBO_cuit1();
mWD_SAI_Date = new GWDSAI_Date();
mWD_SEL_cuisson = new GWDSEL_cuisson();
mWD_BTN_SansNom2 = new GWDBTN_SansNom2();
mWD_SAI_Quantite1 = new GWDSAI_Quantite1();
mWD_IMG_aliment = new GWDIMG_aliment();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_ajouteRepas
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2467833710745135042l);

super.setChecksum("1885001306");

super.setNom("FEN_ajouteRepas");

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
// Initialisation des champs de FEN_ajouteRepas
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
mWD_BTN_Enregistrer.initialiserObjet();
super.ajouter("BTN_Enregistrer", mWD_BTN_Enregistrer);
mWD_LIB_QtePartJour.initialiserObjet();
super.ajouter("LIB_QtePartJour", mWD_LIB_QtePartJour);
mWD_COMBO_ALIMENTS.initialiserObjet();
super.ajouter("COMBO_ALIMENTS", mWD_COMBO_ALIMENTS);
mWD_COMBO_cuit.initialiserObjet();
super.ajouter("COMBO_cuit", mWD_COMBO_cuit);
mWD_SAI_grammage.initialiserObjet();
super.ajouter("SAI_grammage", mWD_SAI_grammage);
mWD_SAI_Quantite.initialiserObjet();
super.ajouter("SAI_Quantite", mWD_SAI_Quantite);
mWD_COMBO_ALIMENTS1.initialiserObjet();
super.ajouter("COMBO_ALIMENTS1", mWD_COMBO_ALIMENTS1);
mWD_SAI_Entier3.initialiserObjet();
super.ajouter("SAI_Entier3", mWD_SAI_Entier3);
mWD_SAI_Entier4.initialiserObjet();
super.ajouter("SAI_Entier4", mWD_SAI_Entier4);
mWD_SAI_Entier5.initialiserObjet();
super.ajouter("SAI_Entier5", mWD_SAI_Entier5);
mWD_SAI_Entier6.initialiserObjet();
super.ajouter("SAI_Entier6", mWD_SAI_Entier6);
mWD_COMBO_cuit2.initialiserObjet();
super.ajouter("COMBO_cuit2", mWD_COMBO_cuit2);
mWD_COMBO_ALIMENTS2.initialiserObjet();
super.ajouter("COMBO_ALIMENTS2", mWD_COMBO_ALIMENTS2);
mWD_COMBO_moment.initialiserObjet();
super.ajouter("COMBO_moment", mWD_COMBO_moment);
mWD_COMBO_cuit1.initialiserObjet();
super.ajouter("COMBO_cuit1", mWD_COMBO_cuit1);
mWD_SAI_Date.initialiserObjet();
super.ajouter("SAI_Date", mWD_SAI_Date);
mWD_SEL_cuisson.initialiserObjet();
super.ajouter("SEL_cuisson", mWD_SEL_cuisson);
mWD_BTN_SansNom2.initialiserObjet();
super.ajouter("BTN_SansNom2", mWD_BTN_SansNom2);
mWD_SAI_Quantite1.initialiserObjet();
super.ajouter("SAI_Quantite1", mWD_SAI_Quantite1);
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
return GWDPleucinose.getInstance().mWD_FEN_ajouteRepas;
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
