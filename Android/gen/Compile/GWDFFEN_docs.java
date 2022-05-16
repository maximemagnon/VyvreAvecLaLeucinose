/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_docs
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
import fr.pcsoft.wdjava.ui.champs.pdf.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_docs extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_docs
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_Flottant
 */
class GWDBTN_Flottant extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_docs.BTN_Flottant
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467902708207962256l);

super.setChecksum("691376160");

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

super.setNumTab(1);

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
// Déclaration des champs du fils n°2 de FEN_docs.BTN_Flottant1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467902708208027792l);

super.setChecksum("691441696");

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

super.setNumTab(2);

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
// Déclaration des champs du fils n°3 de FEN_docs.BTN_Flottant2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467902708208093328l);

super.setChecksum("691507232");

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

super.setNumTab(3);

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
// Déclaration des champs du fils n°4 de FEN_docs.BTN_Flottant3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467902708208158864l);

super.setChecksum("691572768");

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

super.setNumTab(4);

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
// Déclaration des champs du fils n°5 de FEN_docs.BTN_Flottant4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467902708208224400l);

super.setChecksum("691638304");

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
// Déclaration des champs du fils n°6 de FEN_docs.BTN_Flottant5
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467902708208289936l);

super.setChecksum("691703840");

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
 * PDF_LECTEUR
 */
class GWDPDF_LECTEUR extends WDChampLecteurPDF
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_docs.PDF_LECTEUR
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467902768338043251l);

super.setChecksum("691971569");

super.setNom("PDF_LECTEUR");

super.setType(128);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(2, 61);

super.setTailleInitiale(360, 490);

super.setValeurInitiale("C:\\Mes Projets Mobile\\leucinose\\protocole d'urgence de Maîssa.pdf");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

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
 * LIB_Protocole_d_Accueil_d_Urgence_a_présenter
 */
class GWDLIB_Protocole_d_Accueil_d_Urgence_a_presenter extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_docs.LIB_Protocole_d_Accueil_d_Urgence_a_présenter
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467906706873515899l);

super.setChecksum("742377702");

super.setNom("LIB_Protocole_d_Accueil_d_Urgence_a_présenter");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Protocole d'Accueil d'Urgence\r\n(a présenter à votre arrivée aux urgences)");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(5, 5);

super.setTailleInitiale(342, 45);

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
public GWDLIB_Protocole_d_Accueil_d_Urgence_a_presenter mWD_LIB_Protocole_d_Accueil_d_Urgence_a_presenter;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FEN_docs
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
 * Traitement: Déclarations globales de FEN_docs
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre()
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;






}










/**
 * Traitement: Fermeture de FEN_docs
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
// Création des champs de la fenêtre FEN_docs
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_BTN_Flottant = new GWDBTN_Flottant();
mWD_BTN_Flottant1 = new GWDBTN_Flottant1();
mWD_BTN_Flottant2 = new GWDBTN_Flottant2();
mWD_BTN_Flottant3 = new GWDBTN_Flottant3();
mWD_BTN_Flottant4 = new GWDBTN_Flottant4();
mWD_BTN_Flottant5 = new GWDBTN_Flottant5();
mWD_PDF_LECTEUR = new GWDPDF_LECTEUR();
mWD_LIB_Protocole_d_Accueil_d_Urgence_a_presenter = new GWDLIB_Protocole_d_Accueil_d_Urgence_a_presenter();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_docs
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2467902708207896720l);

super.setChecksum("698168809");

super.setNom("FEN_docs");

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
// Initialisation des champs de FEN_docs
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
mWD_PDF_LECTEUR.initialiserObjet();
super.ajouter("PDF_LECTEUR", mWD_PDF_LECTEUR);
mWD_LIB_Protocole_d_Accueil_d_Urgence_a_presenter.initialiserObjet();
super.ajouter("LIB_Protocole_d_Accueil_d_Urgence_a_présenter", mWD_LIB_Protocole_d_Accueil_d_Urgence_a_presenter);

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
return GWDPleucinose.getInstance().mWD_FEN_docs;
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
