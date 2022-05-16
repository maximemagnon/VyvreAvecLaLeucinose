/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_impression
 * Date : 17/04/2022 00:05:51
 * Version de wdjava64.dll  : 26.0.407.3
 */


package VYV.leucinose.wdgen;


import VYV.leucinose.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.pdf.*;
import fr.pcsoft.wdjava.action.*;
import fr.pcsoft.wdjava.email.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_impression extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des groupes de champs de FEN_impression
////////////////////////////////////////////////////////////////////////////
 public WDGroupe mWD_GR_imprimeVisu;

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_impression
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_Flottant
 */
class GWDBTN_Flottant extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_impression.BTN_Flottant
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2475501656312279833l);

super.setChecksum("599603677");

super.setNom("BTN_Flottant");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(-374, 409);

super.setTailleInitiale(54, 54);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(5);

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
public void clicSurBoutonGauche_Ancestor_1()
{
// 


// OuvreFenêtreMobile(FEN_Menu)
WDAPIFenetre.ouvreFille(GWDPleucinose.getInstance().mWD_FEN_Menu);

}





/**
 * Traitement: Clic sur BTN_Flottant
 */
public void clicSurBoutonGauche()
// Exécute le traitement défini dans le modèle
{
super.clicSurBoutonGauche();

// //Exécute le traitement défini dans le modèle


// ExécuteAncêtre
clicSurBoutonGauche_Ancestor_1();

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
// Déclaration des champs du fils n°2 de FEN_impression.BTN_Flottant1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2475501656312345369l);

super.setChecksum("599669213");

super.setNom("BTN_Flottant1");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(-315, 409);

super.setTailleInitiale(54, 54);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(6);

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
public void clicSurBoutonGauche_Ancestor_1()
{
// OuvreFenêtreMobile(FEN_echanges)


// OuvreFenêtreMobile(FEN_echanges)
WDAPIFenetre.ouvreFille(GWDPleucinose.getInstance().mWD_FEN_echanges);

}





/**
 * Traitement: Clic sur BTN_Flottant1
 */
public void clicSurBoutonGauche()
// Exécute le traitement défini dans le modèle
{
super.clicSurBoutonGauche();

// //Exécute le traitement défini dans le modèle


// ExécuteAncêtre
clicSurBoutonGauche_Ancestor_1();

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
// Déclaration des champs du fils n°3 de FEN_impression.BTN_Flottant2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2475501656312410905l);

super.setChecksum("599734749");

super.setNom("BTN_Flottant2");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(-256, 409);

super.setTailleInitiale(54, 54);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

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

super.setImageFond("C:\\Mes Projets Mobile\\leucinose\\bouton bas 3.png?_3NP_8_8_10_10", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}


/**
 * Traitement: Clic sur BTN_Flottant2 (modèle Modèle_FEN_dup)
 */
public void clicSurBoutonGauche_Ancestor_1()
{
// 


// OuvreFenêtreMobile(FEN_constantes)
WDAPIFenetre.ouvreFille(GWDPleucinose.getInstance().mWD_FEN_constantes);

}





/**
 * Traitement: Clic sur BTN_Flottant2
 */
public void clicSurBoutonGauche()
// Exécute le traitement défini dans le modèle
{
super.clicSurBoutonGauche();

// //Exécute le traitement défini dans le modèle


// ExécuteAncêtre
clicSurBoutonGauche_Ancestor_1();

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
// Déclaration des champs du fils n°4 de FEN_impression.BTN_Flottant3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2475501656312476441l);

super.setChecksum("599800285");

super.setNom("BTN_Flottant3");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(-197, 409);

super.setTailleInitiale(54, 54);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(4);

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

super.setImageFond("C:\\Mes Projets Mobile\\leucinose\\bouton bas 4.png?_3NP_8_8_10_10", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}


/**
 * Traitement: Clic sur BTN_Flottant3 (modèle Modèle_FEN_dup)
 */
public void clicSurBoutonGauche_Ancestor_1()
{
// 


// OuvreFenêtreMobile(FEN_impression)
WDAPIFenetre.ouvreFille(GWDPleucinose.getInstance().mWD_FEN_impression);

}





/**
 * Traitement: Clic sur BTN_Flottant3
 */
public void clicSurBoutonGauche()
// Exécute le traitement défini dans le modèle
{
super.clicSurBoutonGauche();

// //Exécute le traitement défini dans le modèle


// ExécuteAncêtre
clicSurBoutonGauche_Ancestor_1();

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
// Déclaration des champs du fils n°5 de FEN_impression.BTN_Flottant4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2475501656312541977l);

super.setChecksum("599865821");

super.setNom("BTN_Flottant4");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(-138, 409);

super.setTailleInitiale(54, 54);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(5);

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

super.setImageFond("C:\\Mes Projets Mobile\\leucinose\\bouton bas 5.png?_3NP_8_8_10_10", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}


/**
 * Traitement: Clic sur BTN_Flottant4 (modèle Modèle_FEN_dup)
 */
public void clicSurBoutonGauche_Ancestor_1()
{
// 


// OuvreFenêtreMobile(FEN_params)
WDAPIFenetre.ouvreFille(GWDPleucinose.getInstance().mWD_FEN_params);

}





/**
 * Traitement: Clic sur BTN_Flottant4
 */
public void clicSurBoutonGauche()
// Exécute le traitement défini dans le modèle
{
super.clicSurBoutonGauche();

// //Exécute le traitement défini dans le modèle


// ExécuteAncêtre
clicSurBoutonGauche_Ancestor_1();

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
// Déclaration des champs du fils n°6 de FEN_impression.BTN_Flottant5
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2475501656312607513l);

super.setChecksum("599931357");

super.setNom("BTN_Flottant5");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(-79, 409);

super.setTailleInitiale(54, 54);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(6);

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

super.setImageFond("C:\\Mes Projets Mobile\\leucinose\\bouton bas 6.png?_3NP_8_8_10_10", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}


/**
 * Traitement: Clic sur BTN_Flottant5 (modèle Modèle_FEN_dup)
 */
public void clicSurBoutonGauche_Ancestor_1()
{
// 


// OuvreFenêtreMobile(FEN_docs)
WDAPIFenetre.ouvreFille(GWDPleucinose.getInstance().mWD_FEN_docs);

}





/**
 * Traitement: Clic sur BTN_Flottant5
 */
public void clicSurBoutonGauche()
// Exécute le traitement défini dans le modèle
{
super.clicSurBoutonGauche();

// //Exécute le traitement défini dans le modèle


// ExécuteAncêtre
clicSurBoutonGauche_Ancestor_1();

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
 * SAI_Date
 */
class GWDSAI_Date extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_impression.SAI_Date
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectLibelle(1,3,2,27);
super.setRectCompPrincipal(3,3,104,27);
super.setQuid(2475501798113210878l);

super.setChecksum("666705997");

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

super.setPositionInitiale(8, 50);

super.setTailleInitiale(110, 33);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(2);

super.setMotDePasse(false);

super.setTypeSaisie(2);

super.setFormatMemorise("AAAAMMJJ");

super.setMasqueSaisie(new WDChaineU("UseDatePickerDateMask"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("");

super.setNumTab(2);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(6);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFF000001, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0xFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(27, 0x893344, 0x90000, 0xFFFFFFFF, 20.000000, 20.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0x893344, 0x90000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1));

super.setStyleSaisie(0x262626, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0xBABABA, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(27, 0xF48542, 0x740500, 0xFFFFFF, 16.000000, 16.000000, 1, 1), 0xF48542, 0xFF000001, "", 1);

super.setParamSaisieObligatoire(false, true);

super.setParamErreurSaisieInvalide("", true, false, false);

super.setParamErreurSaisieObligatoire("", true, false, false);

super.setParamIndicationSaisieObligatoire(true, false, false);

super.setStyleChampErreurSaisieInvalide(null, null, 0xFF, 0xFF);

super.setStyleLibelleErreurSaisieInvalide(0x262626, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStylePictoErreurSaisieInvalide(21, 141);

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
 * Traitement: Initialisation de SAI_Date
 */
public void init()
//  Version 1
//  Description 
//  Saisie de date et heure
{
super.init();

// // Version 1


// MoiMême = DateSys()
WDContexte.getMoiMeme().setValeur(WDAPIDate.dateSys());

}




/**
 * Traitement: Entrée dans SAI_Date
 */
public void entreeChamp()
{
super.entreeChamp();

// 



////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_s = new WDChaineU();



// <COMPILE SI TypeConfiguration=Android>	
{
// 	s est une chaine = DateSélecteur(MoiMême,MoiMême..Libellé)

vWD_s.setValeur(WDAPIDate.dateSelecteur(WDContexte.getMoiMeme(),WDContexte.getMoiMeme().getProp(EWDPropriete.PROP_LIBELLE).getString()));


// 	SI s<>"" ALORS
if(vWD_s.opDiff(""))
{
// 		MoiMême = s
WDContexte.getMoiMeme().setValeur(vWD_s);

}

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurFocus();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Date mWD_SAI_Date;

/**
 * LIB_Saisissez_une_date_et
 */
class GWDLIB_Saisissez_une_date_et extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_impression.LIB_Saisissez_une_date_et
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2475501798113341950l);

super.setChecksum("666744603");

super.setNom("LIB_Saisissez_une_date_et");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Saisissez une date et valider :");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(9, 9);

super.setTailleInitiale(279, 33);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0x893344, creerPolice_GEN("MS Shell Dlg", -9.000000, 0), 3, 0, 0x0, 0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(0x893344, new int[] {0x893344, 0, 1, 0x893344, 0, 1, 0x893344, 0, 1, 0x893344, 0, 1}, new int[] {10, 10, 10, 10, 10, 10, 10, 10}), 0, 0, 0, 0);

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
public GWDLIB_Saisissez_une_date_et mWD_LIB_Saisissez_une_date_et;

/**
 * BTN_SansNom2
 */
class GWDBTN_SansNom2 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_impression.BTN_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2475503425980185768l);

super.setChecksum("740984072");

super.setNom("BTN_SansNom2");

super.setType(4);

super.setBulle("");

super.setLibelle("Imprimer");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(145, 50);

super.setTailleInitiale(143, 33);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(3);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0), 0, 0x0);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0), 0, 0x0);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0), 0, 0x0);

super.setImageFond9Images();

super.setImageFond("C:\\Mes Projets Mobile\\leucinose\\Phoenix_Btn_Menu@dpi1_5x_Edit001.png?E5_2NP", 1, 0, 1, 1);

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



////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sMonFichier = new WDChaineU();



// gdMaDate=SAI_Date
GWDPleucinose.getInstance().vWD_gdMaDate.setValeur(mWD_SAI_Date);

// sMonFichier est une chaîne = fRepEnCours()+gdMaDate+".PDF"

vWD_sMonFichier.setValeur(WDAPIFichier.fRepEnCours().opPlus(GWDPleucinose.getInstance().vWD_gdMaDate).opPlus(".PDF"));


// sMonFichier = SysRepStockageExterne(1, ssePublicDocument) + [fSep] + gdMaDate+".PDF"
vWD_sMonFichier.setValeur(WDAPIStorage.sysRepStockageExterne(1,12).opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus(GWDPleucinose.getInstance().vWD_gdMaDate).opPlus(".PDF"));

// REQ_listedesrepasparamdate.ParamDate=gdMaDate
WDAPIHF.getFichierSansCasseNiAccent("req_listedesrepasparamdate").getRubriqueSansCasseNiAccent("paramdate").setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// HExécuteRequête(REQ_listedesrepasparamdate)
WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_listedesrepasparamdate"));

// iDestination(iPDFGénérique,sMonFichier)
WDAPIPrint.iDestination(10006,vWD_sMonFichier.getString());

// iImprimeEtat(ETAT_listerepas,gdMaDate)
WDAPIEtat.iImprimeEtat(GWDPleucinose.getInstance().mWD_ETAT_listerepas,new WDObjet[] {GWDPleucinose.getInstance().vWD_gdMaDate} );

// PDF_LECTEUR=sMonFichier
mWD_PDF_LECTEUR.setValeur(vWD_sMonFichier);

// FEN_impression.BTN_SansNom2..Visible=Vrai
this.setProp(EWDPropriete.PROP_VISIBLE,true);

// FEN_impression.BTN_SansNom3..Visible=Vrai
mWD_BTN_SansNom3.setProp(EWDPropriete.PROP_VISIBLE,true);

// FEN_impression.BTN_SansNom4..Visible=Vrai
mWD_BTN_SansNom4.setProp(EWDPropriete.PROP_VISIBLE,true);

// FEN_impression.PDF_LECTEUR..Visible=vrai
mWD_PDF_LECTEUR.setProp(EWDPropriete.PROP_VISIBLE,true);

// FEN_impression.BTN_SansNom5..Visible=vrai
mWD_BTN_SansNom5.setProp(EWDPropriete.PROP_VISIBLE,true);

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
 * PDF_LECTEUR
 */
class GWDPDF_LECTEUR extends WDChampLecteurPDF
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de FEN_impression.PDF_LECTEUR
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2475507416081295120l);

super.setChecksum("817532913");

super.setNom("PDF_LECTEUR");

super.setType(128);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(1, 97);

super.setTailleInitiale(358, 484);

super.setValeurInitiale("C:\\Mes Projets Mobile\\leucinose\\protocole d'urgence de Maîssa.pdf");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setAltitude(10);

super.setAncrageInitial(8, 1000, 1000, 1000, 0, 0);

super.setLettreAppel(0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setStyleFond(0xE9E9E9);


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
public GWDPDF_LECTEUR mWD_PDF_LECTEUR;

/**
 * BTN_SansNom3
 */
class GWDBTN_SansNom3 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de FEN_impression.BTN_SansNom3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2475552474624293549l);

super.setChecksum("858582953");

super.setNom("BTN_SansNom3");

super.setType(4);

super.setBulle("");

super.setLibelle("Telecharger");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(187, 584);

super.setTailleInitiale(154, 40);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setAltitude(11);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(12);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0), 0, 0x0);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0), 0, 0x0);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0), 0, 0x0);

super.setImageFond9Images();

super.setImageFond("C:\\Mes Projets Mobile\\leucinose\\Phoenix_Btn_Menu@dpi1_5x_Edit001.png?E5_2NP", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_SansNom3
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 



////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sMonFichier = new WDChaineU();



// sMonFichier est une chaîne = fRepEnCours()+gdMaDate+".PDF"

vWD_sMonFichier.setValeur(WDAPIFichier.fRepEnCours().opPlus(GWDPleucinose.getInstance().vWD_gdMaDate).opPlus(".PDF"));


// sMonFichier = SysRepStockageExterne(1, ssePublicDocument) + [fSep] + gdMaDate+".PDF"
vWD_sMonFichier.setValeur(WDAPIStorage.sysRepStockageExterne(1,12).opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus(GWDPleucinose.getInstance().vWD_gdMaDate).opPlus(".PDF"));

// LanceAppliAssociée(sMonFichier)
WDAPIDiversSTD.lanceAppliAssociee(vWD_sMonFichier.getString());

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
public GWDBTN_SansNom3 mWD_BTN_SansNom3;

/**
 * BTN_Flottant6
 */
class GWDBTN_Flottant6 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°12 de FEN_impression.BTN_Flottant6
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2475552599180602685l);

super.setChecksum("860840534");

super.setNom("BTN_Flottant6");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(298, 11);

super.setTailleInitiale(54, 54);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(12);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(1);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("C:\\Mes Projets Mobile\\leucinose\\fermer@dpi1x.png?E5", 0, 1, 5, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0xF48542, 0x740500, 0x893344, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0xF48542, 0x740500, 0x893344, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0xF59358, 0x751300, 0x893344, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Flottant6
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 


// gdMaDate=DateSys()
GWDPleucinose.getInstance().vWD_gdMaDate.setValeur(WDAPIDate.dateSys());

WDActionPredefinie.executeActionPredefinie(1, null);
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
public GWDBTN_Flottant6 mWD_BTN_Flottant6;

/**
 * BTN_SansNom4
 */
class GWDBTN_SansNom4 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°13 de FEN_impression.BTN_SansNom4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setGroupe(mWD_GR_imprimeVisu);
super.setQuid(2475553733054591891l);

super.setChecksum("863463860");

super.setNom("BTN_SansNom4");

super.setType(4);

super.setBulle("");

super.setLibelle("Telecharger");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(489, 309);

super.setTailleInitiale(143, 33);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setAltitude(13);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setNumTab(4);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0), 0, 0x0);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0), 0, 0x0);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0), 0, 0x0);

super.setImageFond9Images();

super.setImageFond("C:\\Mes Projets Mobile\\leucinose\\Phoenix_Btn_Menu@dpi1_5x_Edit001.png?E5_2NP", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_SansNom4
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 



////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sMonFichier = new WDChaineU();



// sMonFichier est une chaîne = fRepEnCours()+"repas du "+DateVersChaîne(gdMaDate,"JJ-MM-AAAA")+".pdf"

vWD_sMonFichier.setValeur(WDAPIFichier.fRepEnCours().opPlus("repas du ").opPlus(WDAPIDate.dateVersChaine(GWDPleucinose.getInstance().vWD_gdMaDate,"JJ-MM-AAAA")).opPlus(".pdf"));


// LanceAppliAssociée(sMonFichier)
WDAPIDiversSTD.lanceAppliAssociee(vWD_sMonFichier.getString());

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
public GWDBTN_SansNom4 mWD_BTN_SansNom4;

/**
 * BTN_SansNom5
 */
class GWDBTN_SansNom5 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°14 de FEN_impression.BTN_SansNom5
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2475627061089073609l);

super.setChecksum("921318043");

super.setNom("BTN_SansNom5");

super.setType(4);

super.setBulle("");

super.setLibelle("Envoyer");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(19, 584);

super.setTailleInitiale(154, 40);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setAltitude(14);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(11);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0), 0, 0x0);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0), 0, 0x0);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("MS Shell Dlg", -9.000000, 0), 0, 0x0);

super.setImageFond9Images();

super.setImageFond("C:\\Mes Projets Mobile\\leucinose\\Phoenix_Btn_Menu@dpi1_5x_Edit001.png?E5_2NP", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_SansNom5
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 



////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sMonFichier = new WDChaineU();



// sMonFichier est une chaîne = fRepEnCours()+gdMaDate+".PDF"

vWD_sMonFichier.setValeur(WDAPIFichier.fRepEnCours().opPlus(GWDPleucinose.getInstance().vWD_gdMaDate).opPlus(".PDF"));


// sMonFichier = SysRepStockageExterne(1, ssePublicDocument) + [fSep] + gdMaDate+".PDF"
vWD_sMonFichier.setValeur(WDAPIStorage.sysRepStockageExterne(1,12).opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus(GWDPleucinose.getInstance().vWD_gdMaDate).opPlus(".PDF"));

// Email.Destinataire[1]	= "maxime.magnon@vyv3.fr"
WDVariableEmail.getDestinataire().get(1).setValeur("maxime.magnon@vyv3.fr");

// Email.Destinataire[2]	= "magnon.amina@hotmail.fr"
WDVariableEmail.getDestinataire().get(2).setValeur("magnon.amina@hotmail.fr");

// Email.Destinataire[3]	= "magnon.maxime@hotmail.fr"
WDVariableEmail.getDestinataire().get(3).setValeur("magnon.maxime@hotmail.fr");

// Email.Destinataire[4]	= "supermaissamagnon@gmail.com"
WDVariableEmail.getDestinataire().get(4).setValeur("supermaissamagnon@gmail.com");

// Email.NbDestinataire	= 4
WDVariableEmail.getNbDestinataire().setValeur(4);

// Email.Sujet				= "Liste des repas au "+DateVersChaîne(gdMaDate,"JJ/MM/AAAA")
WDVariableEmail.getSujet().setValeur(new WDChaineU("Liste des repas au ").opPlus(WDAPIDate.dateVersChaine(GWDPleucinose.getInstance().vWD_gdMaDate,"JJ/MM/AAAA")));

// Email.Message			= "Liste des repas au "+DateVersChaîne(gdMaDate,"JJ/MM/AAAA")+" est en pièce jointe."
WDVariableEmail.getMessage().setValeur(new WDChaineU("Liste des repas au ").opPlus(WDAPIDate.dateVersChaine(GWDPleucinose.getInstance().vWD_gdMaDate,"JJ/MM/AAAA")).opPlus(" est en pièce jointe."));

// Email.Attache[1]		= SysRepStockageExterne(1, ssePublicDocument) + [fSep] + gdMaDate+".PDF"
WDVariableEmail.getAttache().get(1).setValeur(WDAPIStorage.sysRepStockageExterne(1,12).opPlus(new WDChaineOptionnelle(WDAPIFichier.fSep())).opPlus(GWDPleucinose.getInstance().vWD_gdMaDate).opPlus(".PDF"));

// Email.NbAttache			= 1
WDVariableEmail.getNbAttache().setValeur(1);

// EmailLanceAppli()
WDAPIEmail.emailLanceAppli();

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
public GWDBTN_SansNom5 mWD_BTN_SansNom5;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FEN_impression
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
 * Traitement: Déclarations globales de FEN_impression
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre()
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;






}










/**
 * Traitement: Fermeture de FEN_impression
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
// Création des champs de la fenêtre FEN_impression
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_GR_imprimeVisu = new WDGroupe();
mWD_BTN_Flottant = new GWDBTN_Flottant();
mWD_BTN_Flottant1 = new GWDBTN_Flottant1();
mWD_BTN_Flottant2 = new GWDBTN_Flottant2();
mWD_BTN_Flottant3 = new GWDBTN_Flottant3();
mWD_BTN_Flottant4 = new GWDBTN_Flottant4();
mWD_BTN_Flottant5 = new GWDBTN_Flottant5();
mWD_SAI_Date = new GWDSAI_Date();
mWD_LIB_Saisissez_une_date_et = new GWDLIB_Saisissez_une_date_et();
mWD_BTN_SansNom2 = new GWDBTN_SansNom2();
mWD_PDF_LECTEUR = new GWDPDF_LECTEUR();
mWD_BTN_SansNom3 = new GWDBTN_SansNom3();
mWD_BTN_Flottant6 = new GWDBTN_Flottant6();
mWD_BTN_SansNom4 = new GWDBTN_SansNom4();
mWD_BTN_SansNom5 = new GWDBTN_SansNom5();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_impression
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2475501656312214297l);

super.setChecksum("606396326");

super.setNom("FEN_impression");

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
// Initialisation des groupes de champs de FEN_impression
////////////////////////////////////////////////////////////////////////////
mWD_GR_imprimeVisu.init("GR_imprimeVisu");
ajouter("GR_imprimeVisu", mWD_GR_imprimeVisu);


////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_impression
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
mWD_SAI_Date.initialiserObjet();
super.ajouter("SAI_Date", mWD_SAI_Date);
mWD_LIB_Saisissez_une_date_et.initialiserObjet();
super.ajouter("LIB_Saisissez_une_date_et", mWD_LIB_Saisissez_une_date_et);
mWD_BTN_SansNom2.initialiserObjet();
super.ajouter("BTN_SansNom2", mWD_BTN_SansNom2);
mWD_PDF_LECTEUR.initialiserObjet();
super.ajouter("PDF_LECTEUR", mWD_PDF_LECTEUR);
mWD_BTN_SansNom3.initialiserObjet();
super.ajouter("BTN_SansNom3", mWD_BTN_SansNom3);
mWD_BTN_Flottant6.initialiserObjet();
super.ajouter("BTN_Flottant6", mWD_BTN_Flottant6);
mWD_BTN_SansNom4.initialiserObjet();
super.ajouter("BTN_SansNom4", mWD_BTN_SansNom4);
mWD_BTN_SansNom5.initialiserObjet();
super.ajouter("BTN_SansNom5", mWD_BTN_SansNom5);

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
return GWDPleucinose.getInstance().mWD_FEN_impression;
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
