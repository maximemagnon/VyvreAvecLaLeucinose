/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Projet
 * Classe Android : leucinose
 * Date : 17/04/2022 00:05:51
 * Version de wdjava64.dll  : 26.0.407.3
 */


package VYV.leucinose.wdgen;


import VYV.leucinose.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.api.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/





public class GWDPleucinose extends WDProjet
{
private static GWDPleucinose ms_instance = null;
/**
 * Accès au projet: leucinose
 * Pour accéder au projet à partir de n'importe où: 
 * GWDPleucinose.getInstance()
 */
public static GWDPleucinose getInstance()
{
return (GWDPleucinose) ms_instance;
}

 // FEN_Paramètres
public GWDFFEN_Parametres mWD_FEN_Parametres = new GWDFFEN_Parametres();
 // accesseur de FEN_Paramètres
public GWDFFEN_Parametres getFEN_Parametres()
{
mWD_FEN_Parametres.checkOuverture();
return mWD_FEN_Parametres;
}

 // FEN_echanges
public GWDFFEN_echanges mWD_FEN_echanges = new GWDFFEN_echanges();
 // accesseur de FEN_echanges
public GWDFFEN_echanges getFEN_echanges()
{
mWD_FEN_echanges.checkOuverture();
return mWD_FEN_echanges;
}

 // FEN_Menu
public GWDFFEN_Menu mWD_FEN_Menu = new GWDFFEN_Menu();
 // accesseur de FEN_Menu
public GWDFFEN_Menu getFEN_Menu()
{
mWD_FEN_Menu.checkOuverture();
return mWD_FEN_Menu;
}

 // FEN_dup
public GWDFFEN_dup mWD_FEN_dup = new GWDFFEN_dup();
 // accesseur de FEN_dup
public GWDFFEN_dup getFEN_dup()
{
mWD_FEN_dup.checkOuverture();
return mWD_FEN_dup;
}

 // FEN_Repas
public GWDFFEN_Repas mWD_FEN_Repas = new GWDFFEN_Repas();
 // accesseur de FEN_Repas
public GWDFFEN_Repas getFEN_Repas()
{
mWD_FEN_Repas.checkOuverture();
return mWD_FEN_Repas;
}

 // FEN_ajouteRepas
public GWDFFEN_ajouteRepas mWD_FEN_ajouteRepas = new GWDFFEN_ajouteRepas();
 // accesseur de FEN_ajouteRepas
public GWDFFEN_ajouteRepas getFEN_ajouteRepas()
{
mWD_FEN_ajouteRepas.checkOuverture();
return mWD_FEN_ajouteRepas;
}

 // FEN_CameraLectureCodeBarres
public GWDFFEN_CameraLectureCodeBarres mWD_FEN_CameraLectureCodeBarres = new GWDFFEN_CameraLectureCodeBarres();
 // accesseur de FEN_CameraLectureCodeBarres
public GWDFFEN_CameraLectureCodeBarres getFEN_CameraLectureCodeBarres()
{
mWD_FEN_CameraLectureCodeBarres.checkOuverture();
return mWD_FEN_CameraLectureCodeBarres;
}

 // FEN_constantes
public GWDFFEN_constantes mWD_FEN_constantes = new GWDFFEN_constantes();
 // accesseur de FEN_constantes
public GWDFFEN_constantes getFEN_constantes()
{
mWD_FEN_constantes.checkOuverture();
return mWD_FEN_constantes;
}

 // FEN_docs
public GWDFFEN_docs mWD_FEN_docs = new GWDFFEN_docs();
 // accesseur de FEN_docs
public GWDFFEN_docs getFEN_docs()
{
mWD_FEN_docs.checkOuverture();
return mWD_FEN_docs;
}

 // FEN_params
public GWDFFEN_params mWD_FEN_params = new GWDFFEN_params();
 // accesseur de FEN_params
public GWDFFEN_params getFEN_params()
{
mWD_FEN_params.checkOuverture();
return mWD_FEN_params;
}

 // FEN_infos
public GWDFFEN_infos mWD_FEN_infos = new GWDFFEN_infos();
 // accesseur de FEN_infos
public GWDFFEN_infos getFEN_infos()
{
mWD_FEN_infos.checkOuverture();
return mWD_FEN_infos;
}

 // FEN_ajouteRepasHypo
public GWDFFEN_ajouteRepasHypo mWD_FEN_ajouteRepasHypo = new GWDFFEN_ajouteRepasHypo();
 // accesseur de FEN_ajouteRepasHypo
public GWDFFEN_ajouteRepasHypo getFEN_ajouteRepasHypo()
{
mWD_FEN_ajouteRepasHypo.checkOuverture();
return mWD_FEN_ajouteRepasHypo;
}

 // FEN_impression
public GWDFFEN_impression mWD_FEN_impression = new GWDFFEN_impression();
 // accesseur de FEN_impression
public GWDFFEN_impression getFEN_impression()
{
mWD_FEN_impression.checkOuverture();
return mWD_FEN_impression;
}


 // FI_ajouteRepas
public GWDFIFI_ajouteRepas mWD_FI_ajouteRepas = new GWDFIFI_ajouteRepas();
 // accesseur de FI_ajouteRepas
public GWDFIFI_ajouteRepas getFI_ajouteRepas()
{
GWDFIFI_ajouteRepas fiCtx = (GWDFIFI_ajouteRepas)WDAppelContexte.getContexte().getFenetreInterne("FI_ajouteRepas");
return fiCtx != null ? fiCtx  : mWD_FI_ajouteRepas;
}

 // ETAT_listerepas
public GWDETETAT_listerepas mWD_ETAT_listerepas = new GWDETETAT_listerepas();
 // accesseur de ETAT_listerepas
public GWDETETAT_listerepas getETAT_listerepas()
{
mWD_ETAT_listerepas.checkImpression();
return mWD_ETAT_listerepas;
}

 // Constructeur de la classe GWDPleucinose
public GWDPleucinose()
{
ms_instance = this;
// Définition des langues du projet
setLangueProjet(new int[] {1}, new int[] {0}, 1, false);

// Palette des couleurs
setPaletteCouleurGabarit(new int[] {0xF48542, 0x313FD2, 0xA6F2, 0x4F900D, 0xA95CF8, 0xB86592, 0xB74A5E, 0xA5A595, 0x654E44, 0x383838, 0x0});
ajouterFenetre("FEN_Paramètres", mWD_FEN_Parametres);
ajouterFenetre("FEN_echanges", mWD_FEN_echanges);
ajouterFenetre("FEN_Menu", mWD_FEN_Menu);
ajouterFenetre("FEN_dup", mWD_FEN_dup);
ajouterFenetre("FEN_Repas", mWD_FEN_Repas);
ajouterFenetre("FEN_ajouteRepas", mWD_FEN_ajouteRepas);
ajouterFenetre("FEN_CameraLectureCodeBarres", mWD_FEN_CameraLectureCodeBarres);
ajouterFenetre("FEN_constantes", mWD_FEN_constantes);
ajouterFenetre("FEN_docs", mWD_FEN_docs);
ajouterFenetre("FEN_params", mWD_FEN_params);
ajouterFenetre("FEN_infos", mWD_FEN_infos);
ajouterFenetre("FEN_ajouteRepasHypo", mWD_FEN_ajouteRepasHypo);
ajouterFenetre("FEN_impression", mWD_FEN_impression);
ajouterFenetreInterne("FI_ajouteRepas");

ajouterRequeteWDR( new GWDRREQ_qteRepasJour() );
ajouterRequeteWDR( new GWDRREQ_listedesrepasparamdate() );
ajouterRequeteWDR( new GWDRREQ_listedesrepas() );
ajouterRequeteWDR( new GWDRREQ_sommeLeuPourUnRepas() );
ajouterRequeteWDR( new GWDRREQ_listeAlimentsSelonType() );
ajouterRequeteWDR( new GWDRREQ_listeAlimentHypo() );

ajouterEtat("ETAT_listerepas", mWD_ETAT_listerepas);

}

// Code de déclaration de leucinose
public void trtInitProjet()
{
// 


// gdMaDate	est une date	= DateSys()
vWD_gdMaDate = new WDDate();

vWD_gdMaDate.setValeur(WDAPIDate.dateSys());

super.ajouterVariableGlobale("gdMaDate",vWD_gdMaDate);



// ghMonHeure	est une heure	= HeureSys()
vWD_ghMonHeure = new WDHeure();

vWD_ghMonHeure.setValeur(WDAPIDate.heureSys());

super.ajouterVariableGlobale("ghMonHeure",vWD_ghMonHeure);



// gnIdRepasAliment est un entier système
vWD_gnIdRepasAliment = new WDEntier8();

super.ajouterVariableGlobale("gnIdRepasAliment",vWD_gnIdRepasAliment);



// grObjectifPart est un réel
vWD_grObjectifPart = new WDReel();

super.ajouterVariableGlobale("grObjectifPart",vWD_grObjectifPart);



// grObjectifPart=16
vWD_grObjectifPart.setValeur(16);

}





////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
static public WDObjet vWD_gdMaDate = WDVarNonAllouee.ref;
static public WDObjet vWD_ghMonHeure = WDVarNonAllouee.ref;
static public WDObjet vWD_gnIdRepasAliment = WDVarNonAllouee.ref;
static public WDObjet vWD_grObjectifPart = WDVarNonAllouee.ref;
public String getVersionApplication(){ return "0.0.22.0";}
public String getNomSociete(){ return "VYV3 It hackathon 20222";}
public String getNomAPK(){ return "Vyvre avec la Leucinose";}
public int getIdNomApplication(){return VYV.leucinose.R.string.app_name;}
public boolean isModeAnsi(){ return false;}
public boolean isAffectationTableauParCopie(){ return true;}
public boolean isAssistanceAutoHFActive(){ return true;}
public String getPackageRacine(){ return "VYV.leucinose";}
public int getIdIconeApplication(){ return VYV.leucinose.R.drawable.app_car_2;}
public int getInfoPlateforme(EWDInfoPlateforme info)
{
switch(info)
{
case DPI_ECRAN : return 160;
case HAUTEUR_BARRE_SYSTEME : return 25;
case HAUTEUR_BARRE_TITRE : return 25;
case HAUTEUR_ACTION_BAR : return 56;
case HAUTEUR_BARRE_BAS : return 0;
case HAUTEUR_ECRAN : return 650;
case LARGEUR_ECRAN : return 360;
default : return 0;
}
}
public boolean isActiveThemeMaterialDesign()
{
return true;
}
////////////////////////////////////////////////////////////////////////////
public String getAdresseEmail() 
{
return "maxime.magnon@vyv3.fr";
}
public boolean isIgnoreErreurCertificatHTTPS()
{
return false;
}
////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}
public String getNomProjet()
{
return "leucinose";
}
public String getNomConfiguration()
{
return "Application Android";
}
public String getNomAnalyse()
{
return "mon_projetleucinose";
}
public String getMotDePasseAnalyse()
{
return "";
}
public boolean isModeGestionFichierMultiUtilisateur()
{
return true;
}
public boolean isCreationAutoFichierDonnees()
{
return true;
}

////////////////////////////////////////////////////////////////////////////
// Formats des masques du projet
////////////////////////////////////////////////////////////////////////////
public String getFichierWDM()
{
return null;
}
protected void declarerRessources()
{
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\PHOENIX_BTN_MENU@DPI1_5X_EDIT.PNG?E5_3NP_10_10_10_10",VYV.leucinose.R.drawable.phoenix_btn_menu_dpi1_5x_edit_28_np3_10_10_10_10_selector, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\CM_CODEBARRES.PNG?E5",VYV.leucinose.R.drawable.cm_codebarres_27_selector, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\PHOENIX_BTN_MENU@DPI1_5X_EDIT001.PNG?E5_2NP",VYV.leucinose.R.drawable.phoenix_btn_menu_dpi1_5x_edit001_26_np2_selector, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\FERMER.PNG?E5",VYV.leucinose.R.drawable.fermer_25_selector, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\IMG-MESSAGE.SVG",VYV.leucinose.R.raw.img_message_24, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\PROTOCOLE D'URGENCE DE MAÎSSA.PDF",VYV.leucinose.R.raw.protocole_d_urgence_de_maissa_23, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\SUITE ENREGISTRER.PNG",VYV.leucinose.R.drawable.suite_enregistrer_22, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\GABARITS\\WM\\250 PHOENIX\\PHOENIX_RADIO.PNG?E12_8O",VYV.leucinose.R.drawable.phoenix_radio_21_selector, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\TEMP.BMP",VYV.leucinose.R.drawable.temp_20, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\SUPPRIMER.PNG?E5",VYV.leucinose.R.drawable.supprimer_19_selector, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\SUITE_PLUS-REMOVEBG-PREVIEWBLANC-REMOVEBG-PREVIEW.PNG",VYV.leucinose.R.drawable.suite_plus_removebg_previewblanc_removebg_preview_18, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\SUITE_PLUS-REMOVEBG-PREVIEW.PNG",VYV.leucinose.R.drawable.suite_plus_removebg_preview_17, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\PLUS.PNG?E5_3NP_0_0_0_0",VYV.leucinose.R.drawable.plus_16_np3_0_0_0_0_selector, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\GABARITS\\WM\\250 PHOENIX\\PHOENIX_BREAK_PICT.PNG?E2_4O",VYV.leucinose.R.drawable.phoenix_break_pict_15_selector, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\GABARITS\\WM\\250 PHOENIX\\PHOENIX_EDT.PNG?E5_3NP_8_8_8_8",VYV.leucinose.R.drawable.phoenix_edt_14_np3_8_8_8_8_selector, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\SANS 15 (1).PNG",VYV.leucinose.R.drawable.sans_15__1__13, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\INFOS.PNG",VYV.leucinose.R.drawable.infos_12, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\FONDFOND.PNG",VYV.leucinose.R.drawable.fondfond_11, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\BOUTON URGENCE.PNG",VYV.leucinose.R.drawable.bouton_urgence_10, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\BOUTON BAS 6.PNG?_3NP_8_8_10_10",VYV.leucinose.R.drawable.bouton_bas_6_9_np3_8_8_10_10, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\BOUTON BAS 5.PNG?_3NP_8_8_10_10",VYV.leucinose.R.drawable.bouton_bas_5_8_np3_8_8_10_10, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\BOUTON BAS 4.PNG?_3NP_8_8_10_10",VYV.leucinose.R.drawable.bouton_bas_4_7_np3_8_8_10_10, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\BOUTON BAS 3.PNG?_3NP_8_8_10_10",VYV.leucinose.R.drawable.bouton_bas_3_6_np3_8_8_10_10, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\BOUTON BAS 2.PNG?_3NP_8_8_10_10",VYV.leucinose.R.drawable.bouton_bas_2_5_np3_8_8_10_10, "");
super.ajouterFichierAssocie("C:\\MES PROJETS MOBILE\\LEUCINOSE\\BOUTON BAS 1.PNG?_3NP_8_8_10_10",VYV.leucinose.R.drawable.bouton_bas_1_4_np3_8_8_10_10, "");
}



/**
 * Lancer de l'application Android
 */
public static class WDLanceur extends WDAbstractLanceur
{
public Class<? extends WDProjet> getClasseProjet()
{
return GWDPleucinose.class;
}
}
}
