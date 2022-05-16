/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_CameraLectureCodeBarres
 * Date : 16/04/2022 18:41:19
 * Version de wdjava64.dll  : 26.0.407.3
 */


package VYV.leucinose.wdgen;


import VYV.leucinose.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.camera.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.media.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.menu.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_CameraLectureCodeBarres extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_CameraLectureCodeBarres
////////////////////////////////////////////////////////////////////////////

/**
 * CAM_CodeBarres
 */
class GWDCAM_CodeBarres extends WDChampCamera
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_CameraLectureCodeBarres.CAM_CodeBarres
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3277437142028413386l);

super.setChecksum("2109890625");

super.setNom("CAM_CodeBarres");

super.setType(24);

super.setBulle("");

super.setLibelle("");

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleurFond(0xF5F5F5);

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(310, 333);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000, 0);

super.setParamDecodageCodeBarres(2, 0, 60);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x68635F, creerPolice_GEN("Roboto", -11.000000, 0), -1, 0, 0x0);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(2, 0xE0DCDA, 0x605C5A, 0xF5F5F5, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Décodage d'un code-barres depuis CAM_CodeBarres
 */
public WDObjet decodageCodeBarres(){ setCallbackPCodeDecodage("fWD_decodageCodeBarres"); return new WDVoid("fWD_decodageCodeBarres"); }
public WDObjet fWD_decodageCodeBarres( WDObjet vWD_cb )
{
// PROCEDURE DécodeCodeBarre(cb est un CodeBarres)


vWD_cb = WDParametre.traiterParametreClasse(vWD_cb, 1, false, WDCodeBarres.class, 111);


// si cb.ValeurBrute ~= "" alors retour
if(vWD_cb.getProp(EWDPropriete.PROP_VALEURBRUTE).opEgal("", 1))
{
// si cb.ValeurBrute ~= "" alors retour
return new WDVoid("fWD_decodageCodeBarres");

}

// gProcédureCallBack(cb)
vWD_gProcedureCallBack.executer(vWD_cb);

// ferme()
WDAPIFenetre.ferme();

return new WDVoid("fWD_decodageCodeBarres");
}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCAM_CodeBarres mWD_CAM_CodeBarres;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_CameraLectureCodeBarres.ACTB_ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ACTB_ActionBar");

super.setNote("", "");

super.setParamBoutonGauche(true, 1, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xFFFFFF, 0x8B3344, true);

super.setImageFond("");

super.setStyleBarreNavigation(0xFF000001, 0x808080);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDACTB_ActionBar mWD_ACTB_ActionBar;

class GWDM_Menu extends WDMenuPrincipal
{

class GWDMOPT_Flash extends WDOptionMenu
{
public GWDMOPT_Flash(boolean b)
{
super(b, true);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDM_Menu.this);
super.setQuid(3277438340340427963l);

super.setNom("OPT_Flash");

super.setType(40001);

super.setLibelle("Flash");

super.setEtat(0);

super.setImage("");

super.setVisible(true);

super.setCochee(false);

super.setNumero(1);

super.setAffichageDansActionBar(true);

super.setIconePredefinie(-1);

activerEcoute();
}

public void selectionOptionMenu()
{
super.selectionOptionMenu();
// <COMPILE SI TypeConfiguration = iOS OU TypeConfiguration = Android>


// <COMPILE SI TypeConfiguration = iOS OU TypeConfiguration = Android>
{
// 	SI VidéoParamètre(vipFlash) = vipFlashTorche ALORS
if(WDAPICamera.videoParametre("flash-mode").opEgal("torch", 0))
{
// 		VidéoParamètre(vipFlash, vipFlashOff)
WDAPICamera.videoParametre("flash-mode",new WDChaineU("off"));

}
else
{
// 		VidéoParamètre(vipFlash, vipFlashTorche)
WDAPICamera.videoParametre("flash-mode",new WDChaineU("torch"));

}

}

}




public void activerEcoute()
{
activerEcouteurSelectionMenu();
}
}
public GWDMOPT_Flash mWD_OPT_Flash = new GWDMOPT_Flash(true);

public void initialiserSousObjets()
{
mWD_OPT_Flash.initialiserObjet();
super.ajouterMenu(mWD_OPT_Flash);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(3024189436375393722l);

super.setNom("_Menu");

super.setType(40001);

super.setStyleOptionRepos(0xF7000000, 0xFF000001, creerPolice_GEN("Tahoma", -11.000000, 0));

super.setStyleOptionSurvol(0xF7000000, 0xFF000001, creerPolice_GEN("Tahoma", -11.000000, 0));

activerEcoute();
initialiserSousObjets();
}
}
public GWDM_Menu mWD__Menu;



/**
 * Traitement: Déclarations globales de FEN_CameraLectureCodeBarres
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre(gProcédureCallBack est une procedure)
super.declarerGlobale(WD_tabParam, 1, 1);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;

// Traitement du paramètre n°0
if(0<WD_ntabParamLen) 
{
vWD_gProcedureCallBack = WD_tabParam[0];
}
else { vWD_gProcedureCallBack = null; }
super.ajouterVariableGlobale("gProcédureCallBack",vWD_gProcedureCallBack);



vWD_gProcedureCallBack = WDParametre.traiterParametre(vWD_gProcedureCallBack, 1, false, 61);


}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_gProcedureCallBack = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_CameraLectureCodeBarres
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_CAM_CodeBarres = new GWDCAM_CodeBarres();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();
mWD__Menu = new GWDM_Menu();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_CameraLectureCodeBarres
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(3277437030333154643l);

super.setChecksum("2088008617");

super.setNom("FEN_CameraLectureCodeBarres");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(328, 391);

super.setTitre("Lecture d'un code-barres");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(1);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);

super.setCouleurBarreSysteme(0x8B3344);

super.setCopieEcranAutorisee(true);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_CameraLectureCodeBarres
////////////////////////////////////////////////////////////////////////////
mWD_CAM_CodeBarres.initialiserObjet();
super.ajouter("CAM_CodeBarres", mWD_CAM_CodeBarres);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);
mWD__Menu.initialiserObjet();
ajouterMenuPrincipal(mWD__Menu);

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
return 2;
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
return true;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 2;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return true;
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
return GWDPleucinose.getInstance().mWD_FEN_CameraLectureCodeBarres;
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
