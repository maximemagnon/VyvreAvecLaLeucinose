/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Repas
 * Date : 16/04/2022 23:19:13
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
import fr.pcsoft.wdjava.ui.champs.zr.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.core.parcours.hf.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Repas extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Repas
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_Flottant
 */
class GWDBTN_Flottant extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Repas.BTN_Flottant
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467808095319402397l);

super.setChecksum("1637357856");

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
// Déclaration des champs du fils n°2 de FEN_Repas.BTN_Flottant1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467808095319467933l);

super.setChecksum("1637423392");

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
// Déclaration des champs du fils n°3 de FEN_Repas.BTN_Flottant2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467808095319533469l);

super.setChecksum("1637488928");

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
// Déclaration des champs du fils n°4 de FEN_Repas.BTN_Flottant3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467808095319599005l);

super.setChecksum("1637554464");

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
// Déclaration des champs du fils n°5 de FEN_Repas.BTN_Flottant4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467808095319664541l);

super.setChecksum("1637620000");

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
// Déclaration des champs du fils n°6 de FEN_Repas.BTN_Flottant5
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467815938062058074l);

super.setChecksum("1769732863");

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
 * ZR_repas
 */
class GWDZR_repas extends WDZoneRepetee
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_Repas.ZR_repas
////////////////////////////////////////////////////////////////////////////

/**
 * ATT_TypeRepas
 */
class GWDATT_TypeRepas extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Repas.ZR_repas.ATT_TypeRepas
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_TypeRepas");

super.setChampAssocie(mWD_RUPT_HautRupture1.mWD_LIB_TypeRepas);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Repas.ZR_repas.ATT_TypeRepas

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_TypeRepas mWD_ATT_TypeRepas = new GWDATT_TypeRepas();

/**
 * ATT_LibelleAliment
 */
class GWDATT_LibelleAliment extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Repas.ZR_repas.ATT_LibelleAliment
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_LibelleAliment");

super.setChampAssocie(mWD_LIB_Aliment);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Repas.ZR_repas.ATT_LibelleAliment

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_LibelleAliment mWD_ATT_LibelleAliment = new GWDATT_LibelleAliment();

/**
 * ATT_GrammageAliment
 */
class GWDATT_GrammageAliment extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Repas.ZR_repas.ATT_GrammageAliment
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_GrammageAliment");

super.setChampAssocie(mWD_LIB_156_Gr);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Repas.ZR_repas.ATT_GrammageAliment

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_GrammageAliment mWD_ATT_GrammageAliment = new GWDATT_GrammageAliment();

/**
 * ATT_partLeu
 */
class GWDATT_partLeu extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Repas.ZR_repas.ATT_partLeu
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_partLeu");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Repas.ZR_repas.ATT_partLeu

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_partLeu mWD_ATT_partLeu = new GWDATT_partLeu();

/**
 * ATT_IdRepasAliments
 */
class GWDATT_IdRepasAliments extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Repas.ZR_repas.ATT_IdRepasAliments
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_IdRepasAliments");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Repas.ZR_repas.ATT_IdRepasAliments

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_IdRepasAliments mWD_ATT_IdRepasAliments = new GWDATT_IdRepasAliments();

/**
 * ATT_Cuisson
 */
class GWDATT_Cuisson extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Repas.ZR_repas.ATT_Cuisson
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Cuisson");

super.setChampAssocie(mWD_LIB_Cuit);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Repas.ZR_repas.ATT_Cuisson

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Cuisson mWD_ATT_Cuisson = new GWDATT_Cuisson();

/**
 * RUPT_HautRupture1
 */
class GWDRUPT_HautRupture1 extends WDRuptureZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_Repas.ZR_repas.RUPT_HautRupture1
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_TypeRepas
 */
class GWDLIB_TypeRepas extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Repas.ZR_repas.RUPT_HautRupture1.LIB_TypeRepas
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467811862124563195l);

super.setChecksum("1756200483");

super.setNom("LIB_TypeRepas");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("   TypeRepas");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(5, 3);

super.setTailleInitiale(230, 25);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

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
public GWDLIB_TypeRepas mWD_LIB_TypeRepas = new GWDLIB_TypeRepas();
/**
 * Initialise tous les champs de FEN_Repas.ZR_repas.RUPT_HautRupture1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Repas.ZR_repas.RUPT_HautRupture1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_TypeRepas.initialiserObjet();
super.ajouterChamp("LIB_TypeRepas",mWD_LIB_TypeRepas);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setZoneRepetee(GWDZR_repas.this);
super.setNom("RUPT_HautRupture1");

super.setHauteur(15);

super.setVisibleInitial(true);

super.setToujoursVisible(false);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(15, 0xBABABA, 0x3A3A3A, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1));

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDRUPT_HautRupture1 mWD_RUPT_HautRupture1 = new GWDRUPT_HautRupture1();

/**
 * RUPT_BasRupture1
 */
class GWDRUPT_BasRupture1 extends WDRuptureZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_Repas.ZR_repas.RUPT_BasRupture1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setZoneRepetee(GWDZR_repas.this);
super.setNom("RUPT_BasRupture1");

super.setHauteur(4);

super.setVisibleInitial(true);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(15, 0xBABABA, 0x3A3A3A, 0xFFFFFF, 2.000000, 2.000000, 1, 1));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDRUPT_BasRupture1 mWD_RUPT_BasRupture1 = new GWDRUPT_BasRupture1();

/**
 * LIB_Aliment
 */
class GWDLIB_Aliment extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_Repas.ZR_repas.LIB_Aliment
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467816474938600238l);

super.setChecksum("1775362696");

super.setNom("LIB_Aliment");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Aliment");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 3);

super.setTailleInitiale(160, 26);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x893344, 0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0, 0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(0xFFFFFF, new int[] {0x893344, 2, 1, 0x893344, 2, 1, 0x893344, 2, 1, 0x893344, 2, 1}, new int[] {10, 10, 10, 10, 10, 10, 10, 10}), 0, 0, 0, 0);

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
public GWDLIB_Aliment mWD_LIB_Aliment = new GWDLIB_Aliment();

/**
 * LIB_Cuit
 */
class GWDLIB_Cuit extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de FEN_Repas.ZR_repas.LIB_Cuit
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467818596659426417l);

super.setChecksum("1782345145");

super.setNom("LIB_Cuit");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Cuit");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(172, 3);

super.setTailleInitiale(54, 26);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x893344, 0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0, 0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(0xFFFFFF, new int[] {0x893344, 2, 1, 0x893344, 2, 1, 0x893344, 2, 1, 0x893344, 2, 1}, new int[] {10, 10, 10, 10, 10, 10, 10, 10}), 0, 0, 0, 0);

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
public GWDLIB_Cuit mWD_LIB_Cuit = new GWDLIB_Cuit();

/**
 * LIB_156_Gr
 */
class GWDLIB_156_Gr extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de FEN_Repas.ZR_repas.LIB_156_Gr
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467818755574171248l);

super.setChecksum("1783300061");

super.setNom("LIB_156_Gr");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("156 Gr");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(231, 3);

super.setTailleInitiale(73, 26);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x893344, 0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x0, 0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(0xFFFFFF, new int[] {0x893344, 2, 1, 0x893344, 2, 1, 0x893344, 2, 1, 0x893344, 2, 1}, new int[] {10, 10, 10, 10, 10, 10, 10, 10}), 0, 0, 0, 0);

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
public GWDLIB_156_Gr mWD_LIB_156_Gr = new GWDLIB_156_Gr();

/**
 * BTN_SansNom1
 */
class GWDBTN_SansNom1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°12 de FEN_Repas.ZR_repas.BTN_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467830566801865669l);

super.setChecksum("1850933688");

super.setNom("BTN_SansNom1");

super.setType(4);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(314, 7);

super.setTailleInitiale(32, 20);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("C:\\Mes Projets Mobile\\leucinose\\supprimer@dpi1x.png?E5", 0, 2, 5, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_SansNom1 ( ZR_repas )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// 


// HLitRecherche(REPAS_ALIMENTS,idRepasAliment,ATT_IdRepasAliments,hIdentique)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("repas_aliments"),WDAPIHF.getRubriqueSansCasseNiAccent("idrepasaliment"),mWD_ATT_IdRepasAliments,(long)524288);

// si HTrouve() ALORS
if(WDAPIHF.hTrouve().getBoolean())
{
// 	partEnRetrait est un réel
WDObjet vWD_partEnRetrait = new WDReel();



// 	partEnRetrait=REPAS_ALIMENTS.Parttotal
vWD_partEnRetrait.setValeur(WDAPIHF.getFichierSansCasseNiAccent("repas_aliments").getRubriqueSansCasseNiAccent("parttotal"));

// 	HSupprime(REPAS_ALIMENTS)
WDAPIHF.hSupprime(WDAPIHF.getFichierSansCasseNiAccent("repas_aliments"));

// 	HLitRecherche(REPAS,datej,gdMaDate,hIdentique)
WDAPIHF.hLitRecherche(WDAPIHF.getFichierSansCasseNiAccent("repas"),WDAPIHF.getRubriqueSansCasseNiAccent("datej"),GWDPleucinose.getInstance().vWD_gdMaDate,(long)524288);

// 	si  HTrouve() ALORS
if(WDAPIHF.hTrouve().getBoolean())
{
// 		REPAS.totalLeucine=REPAS.totalLeucine-partEnRetrait
WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("totalleucine").setValeur(WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("totalleucine").opMoins(vWD_partEnRetrait));

// 		si REPAS.totalLeucine<=0 ALORS
if(WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("totalleucine").opInfEgal(0))
{
// 			REPAS.totalLeucine=0
WDAPIHF.getFichierSansCasseNiAccent("repas").getRubriqueSansCasseNiAccent("totalleucine").setValeur(0);

}

// 		HModifie(REPAS)
WDAPIHF.hModifie(WDAPIHF.getFichierSansCasseNiAccent("repas"));

}

}

// alimenteRepas()
fWD_alimenteRepas();

// REQ_qteRepasJour.Paramdatej	= gdMaDate
WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("paramdatej").setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// SI HExécuteRequête(REQ_qteRepasJour) ALORS
if(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour")).getBoolean())
{
// 	HLitPremier(REQ_qteRepasJour)
WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour"));

// 	FEN_Repas.LIB_Qtepart="Quantité de parts distribuée : "+Arrondi(REQ_qteRepasJour.totalLeucine,2)+"/"+grObjectifPart
mWD_LIB_Qtepart.setValeur(new WDChaineU("Quantité de parts distribuée : ").opPlus(WDAPIMath.arrondi(WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("totalleucine"),2)).opPlus("/").opPlus(GWDPleucinose.getInstance().vWD_grObjectifPart));

}
else
{
// 	LIB_Qtepart="problème liaisons données"
mWD_LIB_Qtepart.setValeur("problème liaisons données");

}

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
public GWDBTN_SansNom1 mWD_BTN_SansNom1 = new GWDBTN_SansNom1();
/**
 * Initialise tous les champs de FEN_Repas.ZR_repas
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Repas.ZR_repas
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ATT_TypeRepas.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_TypeRepas);
mWD_ATT_LibelleAliment.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_LibelleAliment);
mWD_ATT_GrammageAliment.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_GrammageAliment);
mWD_ATT_partLeu.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_partLeu);
mWD_ATT_IdRepasAliments.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_IdRepasAliments);
mWD_ATT_Cuisson.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Cuisson);
mWD_RUPT_HautRupture1.initialiserObjet();
mWD_RUPT_BasRupture1.initialiserObjet();
mWD_LIB_Aliment.initialiserObjet();
super.ajouterChamp("LIB_Aliment",mWD_LIB_Aliment);
mWD_LIB_Cuit.initialiserObjet();
super.ajouterChamp("LIB_Cuit",mWD_LIB_Cuit);
mWD_LIB_156_Gr.initialiserObjet();
super.ajouterChamp("LIB_156_Gr",mWD_LIB_156_Gr);
mWD_BTN_SansNom1.initialiserObjet();
super.ajouterChamp("BTN_SansNom1",mWD_BTN_SansNom1);
creerAttributAuto();
super.declarerLiaisonRupture(mWD_RUPT_HautRupture1, mWD_RUPT_BasRupture1, "ATT_TypeRepas");
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,360,32);
super.setQuid(2467809920790832022l);

super.setChecksum("1747698962");

super.setNom("ZR_repas");

super.setType(30);

super.setBulle("");

super.setLibelle("Zone répétée");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(0, 108);

super.setTailleInitiale(360, 350);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(8, 1000, 1000, 1000, 0, 0);

super.setNumTab(1);

super.setModeAscenseur(1, 1);

super.setModeSelection(99);

super.setSaisieEnCascade(false);

super.setLettreAppel(65535);

super.setEnregistrementSortieLigne(true);

super.setPersistant(false);

super.setParamAffichage(0, 0, 1, 360, 32);

super.setBtnEnrouleDeroule(true);

super.setScrollRapide(false, null);

super.setDeplacementParDnd(0);

super.setSwipe(0, "", false, false, "", false, false);

super.setRecyclageChamp(true);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x262626, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setStyleSeparateurVerticaux(false, 0xFFFFFFFF);

super.setStyleSeparateurHorizontaux(0, 0xFFFFFFFF);

super.setDessinerLigneVide(false);

super.setCouleurCellule(0xFFFFFFFF, 0xFFFFFFFF, 0x0, 0xBABABA, 0xFFFFFFFF);

super.setImagePlusMoins("C:\\Mes Projets Mobile\\leucinose\\Gabarits\\WM\\250 Phoenix\\Phoenix_Break_Pict@dpi1x.png?E2_4O");

super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
initialiserSousObjets();
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
public GWDZR_repas mWD_ZR_repas;

/**
 * LIB_Repas_12_02_2022__________________________
 */
class GWDLIB_Repas_12_02_2022__________________________ extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_Repas.LIB_Repas_12_02_2022__________________________
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467817604519653030l);

super.setChecksum("1780016903");

super.setNom("LIB_Repas_12_02_2022__________________________");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Repas 12/02/2022__________________________");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(0, 9);

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
public GWDLIB_Repas_12_02_2022__________________________ mWD_LIB_Repas_12_02_2022__________________________;

/**
 * IMG_SansNom1
 */
class GWDIMG_SansNom1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_Repas.IMG_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467826044172332083l);

super.setChecksum("1821963561");

super.setNom("IMG_SansNom1");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(-336, 437);

super.setTailleInitiale(91, 100);

super.setValeurInitiale("C:\\Mes Projets Mobile\\leucinose\\temp.bmp");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(9);

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
public GWDIMG_SansNom1 mWD_IMG_SansNom1;

/**
 * CFI_SansNom1
 */
class GWDCFI_SansNom1 extends WDChampFenetreInterne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de FEN_Repas.CFI_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2467832581158774147l);

super.setChecksum("1868193123");

super.setNom("CFI_SansNom1");

super.setType(31);

super.setLibelle("");

super.setNote("", "");

super.setPositionInitiale(-516, 226);

super.setTailleInitiale(360, 77);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setNumTab(2);

super.setAltitude(10);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setPersistant(false);

super.setFenetreInterne("FI_ajouteRepas");

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setParamAnimationChamp(25, 26, 300);
super.setParamAnimationChamp(42, 1, 200);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
protected boolean isAvecAscenseurAuto()
{
return false;
}

protected boolean isBalayageVertical()
{
return false;
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCFI_SansNom1 mWD_CFI_SansNom1;

/**
 * LIB_Qtepart
 */
class GWDLIB_Qtepart extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de FEN_Repas.LIB_Qtepart
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2470058013096444825l);

super.setChecksum("796914078");

super.setNom("LIB_Qtepart");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Quantité de parts : 10/15");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(0, 56);

super.setTailleInitiale(360, 47);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(11);

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
public GWDLIB_Qtepart mWD_LIB_Qtepart;

/**
 * BTN_SansNom1
 */
class GWDBTN_SansNom1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°12 de FEN_Repas.BTN_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2473976449017805316l);

super.setChecksum("616093085");

super.setNom("BTN_SansNom1");

super.setType(4);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(-349, 348);

super.setTailleInitiale(80, 80);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(12);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(3);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 5, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0xFFFFFF);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1));

super.setImageFond9Images(new int[] {1,2,1,2,4,2,1,2,1}, 0, 0, 0, 0);

super.setImageFond("C:\\Mes Projets Mobile\\leucinose\\PLus@dpi1x.png?E5_3NP_0_0_0_0", 1, 0, 1, 1);

super.setParamAnimationChamp(41, 32, 300);
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
public GWDBTN_SansNom1 mWD_BTN_SansNom1;

/**
 * IMG_SansNom2
 */
class GWDIMG_SansNom2 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°13 de FEN_Repas.IMG_SansNom2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2474107084745118895l);

super.setChecksum("618163768");

super.setNom("IMG_SansNom2");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(237, 463);

super.setTailleInitiale(85, 88);

super.setValeurInitiale("C:\\Mes Projets Mobile\\leucinose\\suite_plus-removebg-preview.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(13);

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

/**
 * Traitement: Clic sur IMG_SansNom2
 */
public void clicSurBoutonGauche()
// CFI_SansNom1..Visible=vrai
{
super.clicSurBoutonGauche();

// 


// OuvreFenêtreMobile(FEN_ajouteRepas)
WDAPIFenetre.ouvreFille(GWDPleucinose.getInstance().mWD_FEN_ajouteRepas);

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
public GWDIMG_SansNom2 mWD_IMG_SansNom2;

/**
 * IMG_SansNom3
 */
class GWDIMG_SansNom3 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°14 de FEN_Repas.IMG_SansNom3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2474333828925693713l);

super.setChecksum("590333651");

super.setNom("IMG_SansNom3");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(38, 463);

super.setTailleInitiale(85, 88);

super.setValeurInitiale("C:\\Mes Projets Mobile\\leucinose\\suite_plus-removebg-previewblanc-removebg-preview.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(14);

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

/**
 * Traitement: Clic sur IMG_SansNom3
 */
public void clicSurBoutonGauche()
// CFI_SansNom1..Visible=vrai
{
super.clicSurBoutonGauche();

// 


// OuvreFenêtreMobile(FEN_ajouteRepasHypo)
WDAPIFenetre.ouvreFille(GWDPleucinose.getInstance().mWD_FEN_ajouteRepasHypo);

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
public GWDIMG_SansNom3 mWD_IMG_SansNom3;


////////////////////////////////////////////////////////////////////////////
// Procédures utilisateur de FEN_Repas
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
//  alimenteRepas ()
// 
//  Paramètres :
// 	Aucun
//  Valeur de retour :
//  	Aucune
// 
//  Exemple :
//  Indiquez ici un exemple d'utilisation.
// 
public void fWD_alimenteRepas()
{
// procédure alimenteRepas()
initExecProcLocale("alimenteRepas");


try
{
// ZoneRépétéeSupprimeTout(ZR_repas)
WDAPIZoneRepetee.zoneRepeteeSupprimeTout(mWD_ZR_repas);

// REQ_listedesrepasparamdate.ParamDate=gdMaDate
WDAPIHF.getFichierSansCasseNiAccent("req_listedesrepasparamdate").getRubriqueSansCasseNiAccent("paramdate").setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// SI HExécuteRequête(REQ_listedesrepasparamdate) ALORS
if(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_listedesrepasparamdate")).getBoolean())
{
// 	SI HNbEnr(REQ_listedesrepasparamdate)<>0 ALORS
if(WDAPIHF.hNbEnr(WDAPIHF.getRequeteSansCasseNiAccent("req_listedesrepasparamdate")).opDiff(0))
{
// 		POUR TOUT REQ_listedesrepasparamdate
IWDParcours parcours1 = null;
try
{
parcours1 = WDParcoursFichier.pourTout(WDAPIHF.getRequeteSansCasseNiAccent("req_listedesrepasparamdate"), null, true);
while(parcours1.testParcours())
{
// 			sTypeRepas,sLibelleAliment,sGrammageAliment,sLeucinePart,sCuisson sont des chaînes
WDObjet vWD_sTypeRepas = new WDChaineU();


WDObjet vWD_sLibelleAliment = new WDChaineU();


WDObjet vWD_sGrammageAliment = new WDChaineU();


WDObjet vWD_sLeucinePart = new WDChaineU();


WDObjet vWD_sCuisson = new WDChaineU();



// 			nIdRepasAliment est un entiers système
WDObjet vWD_nIdRepasAliment = new WDEntier8();



// 			sCuisson			= REQ_listedesrepasparamdate.cuisson
vWD_sCuisson.setValeur(WDAPIHF.getFichierSansCasseNiAccent("req_listedesrepasparamdate").getRubriqueSansCasseNiAccent("cuisson"));

// 			sTypeRepas			= REQ_listedesrepasparamdate.momentRepas
vWD_sTypeRepas.setValeur(WDAPIHF.getFichierSansCasseNiAccent("req_listedesrepasparamdate").getRubriqueSansCasseNiAccent("momentrepas"));

// 			sLibelleAliment		= REQ_listedesrepasparamdate.libelle
vWD_sLibelleAliment.setValeur(WDAPIHF.getFichierSansCasseNiAccent("req_listedesrepasparamdate").getRubriqueSansCasseNiAccent("libelle"));

// 			sGrammageAliment	= REQ_listedesrepasparamdate.qteAliment+" Gr"
vWD_sGrammageAliment.setValeur(WDAPIHF.getFichierSansCasseNiAccent("req_listedesrepasparamdate").getRubriqueSansCasseNiAccent("qtealiment").opPlus(" Gr"));

// 			sLeucinePart		= Arrondi(REQ_listedesrepasparamdate.Parttotal,2)+ " Parts"
vWD_sLeucinePart.setValeur(WDAPIMath.arrondi(WDAPIHF.getFichierSansCasseNiAccent("req_listedesrepasparamdate").getRubriqueSansCasseNiAccent("parttotal"),2).opPlus(" Parts"));

// 			nIdRepasAliment 	= REQ_listedesrepasparamdate.idRepasAliment
vWD_nIdRepasAliment.setValeur(WDAPIHF.getFichierSansCasseNiAccent("req_listedesrepasparamdate").getRubriqueSansCasseNiAccent("idrepasaliment"));

// 			ZoneRépétéeAjouteLigne(ZR_repas,sTypeRepas,sLibelleAliment,sGrammageAliment,sLeucinePart,nIdRepasAliment,sCuisson)	
WDAPIZoneRepetee.zoneRepeteeAjouteLigne(mWD_ZR_repas,new WDObjet[] {vWD_sTypeRepas,vWD_sLibelleAliment,vWD_sGrammageAliment,vWD_sLeucinePart,vWD_nIdRepasAliment,vWD_sCuisson} );

}
}
finally
{
if(parcours1 != null)
{
parcours1.finParcours();
}
}


}

}
else
{
// 	ToastAffiche("problème liaisons données")
WDAPIToast.toastAffiche(new WDChaineU("problème liaisons données"));

}

}
finally
{
finExecProcLocale();
}

}




/**
 * Traitement: Déclarations globales de FEN_Repas
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCÉDURE MaFenêtre()
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;






}





/**
 * Traitement: Fin d'initialisation de FEN_Repas
 */
public void init()
{
super.init();

// 


// LIB_Repas_12_02_2022__________________________="Repas "+DateVersChaîne(DateDuJour(),"JJ/MM/AAAA")+"__________________________"
mWD_LIB_Repas_12_02_2022__________________________.setValeur(new WDChaineU("Repas ").opPlus(WDAPIDate.dateVersChaine(WDAPIDate.dateDuJour(),"JJ/MM/AAAA")).opPlus("__________________________"));

// REQ_qteRepasJour.Paramdatej	= gdMaDate
WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("paramdatej").setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// SI HExécuteRequête(REQ_qteRepasJour) ALORS
if(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour")).getBoolean())
{
// 	HLitPremier(REQ_qteRepasJour)
WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour"));

// 	LIB_Qtepart="Quantité de parts distribuée : "+Arrondi(REQ_qteRepasJour.totalLeucine,2)+"/"+grObjectifPart
mWD_LIB_Qtepart.setValeur(new WDChaineU("Quantité de parts distribuée : ").opPlus(WDAPIMath.arrondi(WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("totalleucine"),2)).opPlus("/").opPlus(GWDPleucinose.getInstance().vWD_grObjectifPart));

}
else
{
// 	LIB_Qtepart="problème liaisons données"
mWD_LIB_Qtepart.setValeur("problème liaisons données");

}

// alimenteRepas()
fWD_alimenteRepas();

}





/**
 * Traitement: Demande de mise à jour de l'affichage de FEN_Repas
 */
public void demandeMAJAffichage()
{
super.demandeMAJAffichage();

// 


// alimenteRepas()
fWD_alimenteRepas();

}








/**
 * Traitement: Fermeture de FEN_Repas
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
// Création des champs de la fenêtre FEN_Repas
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_BTN_Flottant = new GWDBTN_Flottant();
mWD_BTN_Flottant1 = new GWDBTN_Flottant1();
mWD_BTN_Flottant2 = new GWDBTN_Flottant2();
mWD_BTN_Flottant3 = new GWDBTN_Flottant3();
mWD_BTN_Flottant4 = new GWDBTN_Flottant4();
mWD_BTN_Flottant5 = new GWDBTN_Flottant5();
mWD_ZR_repas = new GWDZR_repas();
mWD_LIB_Repas_12_02_2022__________________________ = new GWDLIB_Repas_12_02_2022__________________________();
mWD_IMG_SansNom1 = new GWDIMG_SansNom1();
mWD_CFI_SansNom1 = new GWDCFI_SansNom1();
mWD_LIB_Qtepart = new GWDLIB_Qtepart();
mWD_BTN_SansNom1 = new GWDBTN_SansNom1();
mWD_IMG_SansNom2 = new GWDIMG_SansNom2();
mWD_IMG_SansNom3 = new GWDIMG_SansNom3();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Repas
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2467808095319336861l);

super.setChecksum("1644150505");

super.setNom("FEN_Repas");

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
// Initialisation des champs de FEN_Repas
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
mWD_ZR_repas.initialiserObjet();
super.ajouter("ZR_repas", mWD_ZR_repas);
mWD_LIB_Repas_12_02_2022__________________________.initialiserObjet();
super.ajouter("LIB_Repas_12_02_2022__________________________", mWD_LIB_Repas_12_02_2022__________________________);
mWD_IMG_SansNom1.initialiserObjet();
super.ajouter("IMG_SansNom1", mWD_IMG_SansNom1);
mWD_CFI_SansNom1.initialiserObjet();
super.ajouter("CFI_SansNom1", mWD_CFI_SansNom1);
mWD_LIB_Qtepart.initialiserObjet();
super.ajouter("LIB_Qtepart", mWD_LIB_Qtepart);
mWD_BTN_SansNom1.initialiserObjet();
super.ajouter("BTN_SansNom1", mWD_BTN_SansNom1);
mWD_IMG_SansNom2.initialiserObjet();
super.ajouter("IMG_SansNom2", mWD_IMG_SansNom2);
mWD_IMG_SansNom3.initialiserObjet();
super.ajouter("IMG_SansNom3", mWD_IMG_SansNom3);

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
return GWDPleucinose.getInstance().mWD_FEN_Repas;
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
