/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Etat
 * Classe Android : ETAT_listerepas
 * Date : 16/04/2022 18:41:19
 * Version de wdjava64.dll  : 26.0.407.3
 */


package VYV.leucinose.wdgen;


import VYV.leucinose.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.etat.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.core.application.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDETETAT_listerepas extends WDEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de ETAT_listerepas
////////////////////////////////////////////////////////////////////////////

/**
 * DEBUT_DOCUMENT
 */
class GWDDEBUT_DOCUMENT extends WDBlocEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de ETAT_listerepas.DEBUT_DOCUMENT
////////////////////////////////////////////////////////////////////////////

/**
 * TITREDOC
 */
class GWDTITREDOC extends WDChampEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de ETAT_listerepas.DEBUT_DOCUMENT.TITREDOC
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934257352624447065l);

super.setNom("TITREDOC");

super.setType(25);

super.terminerInitialisation();
}

/**
 * Traitement: Avant impression de TITREDOC
 */
public void trtDebutImpression()
{
super.trtDebutImpression();

// 


// MoiMême=MoiMême+" en date du "+DateVersChaîne(gdMaDate,"Jjjj JJ Mmmm AAAA")
WDContexte.getMoiMeme().setValeur(WDContexte.getMoiMeme().opPlus(" en date du ").opPlus(WDAPIDate.dateVersChaine(GWDPleucinose.getInstance().vWD_gdMaDate,"Jjjj JJ Mmmm AAAA")));

}




//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDTITREDOC mWD_TITREDOC = new GWDTITREDOC();
/**
 * Initialise tous les champs de ETAT_listerepas.DEBUT_DOCUMENT
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de ETAT_listerepas.DEBUT_DOCUMENT
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_TITREDOC.initialiserObjet();
super.ajouter("TITREDOC", mWD_TITREDOC);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934257352624381529l);

super.setNom("DEBUT_DOCUMENT");

super.setType(1);

initialiserSousObjets();
super.terminerInitialisation();
}

//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
case 12:
case 13:
case 17:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDDEBUT_DOCUMENT mWD_DEBUT_DOCUMENT;

/**
 * HAUT_DE_PAGE
 */
class GWDHAUT_DE_PAGE extends WDBlocEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de ETAT_listerepas.HAUT_DE_PAGE
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934257352626609753l);

super.setNom("HAUT_DE_PAGE");

super.setType(1);

super.terminerInitialisation();
}

//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
case 12:
case 13:
case 17:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDHAUT_DE_PAGE mWD_HAUT_DE_PAGE;

/**
 * DEBUT_RUPTURE1
 */
class GWDDEBUT_RUPTURE1 extends WDBlocEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de ETAT_listerepas.DEBUT_RUPTURE1
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_MomentRepas1
 */
class GWDLIB_MomentRepas1 extends WDChampEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de ETAT_listerepas.DEBUT_RUPTURE1.LIB_MomentRepas1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934257352629755481l);

super.setNom("LIB_MomentRepas1");

super.setType(25);

super.terminerInitialisation();
}

//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
case 12:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_MomentRepas1 mWD_LIB_MomentRepas1 = new GWDLIB_MomentRepas1();

/**
 * LIB_ENTETE_libelle
 */
class GWDLIB_ENTETE_libelle extends WDChampEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de ETAT_listerepas.DEBUT_RUPTURE1.LIB_ENTETE_libelle
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934257352630148697l);

super.setNom("LIB_ENTETE_libelle");

super.setType(25);

super.terminerInitialisation();
}

//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
case 12:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_ENTETE_libelle mWD_LIB_ENTETE_libelle = new GWDLIB_ENTETE_libelle();

/**
 * LIB_ENTETE_qteAliment
 */
class GWDLIB_ENTETE_qteAliment extends WDChampEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de ETAT_listerepas.DEBUT_RUPTURE1.LIB_ENTETE_qteAliment
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934257352630279784l);

super.setNom("LIB_ENTETE_qteAliment");

super.setType(25);

super.terminerInitialisation();
}

//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
case 12:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_ENTETE_qteAliment mWD_LIB_ENTETE_qteAliment = new GWDLIB_ENTETE_qteAliment();

/**
 * LIB_ENTETE_cuisson
 */
class GWDLIB_ENTETE_cuisson extends WDChampEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de ETAT_listerepas.DEBUT_RUPTURE1.LIB_ENTETE_cuisson
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934257352630410856l);

super.setNom("LIB_ENTETE_cuisson");

super.setType(25);

super.terminerInitialisation();
}

//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
case 12:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_ENTETE_cuisson mWD_LIB_ENTETE_cuisson = new GWDLIB_ENTETE_cuisson();

/**
 * LIB_ENTETE_Parttotal
 */
class GWDLIB_ENTETE_Parttotal extends WDChampEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de ETAT_listerepas.DEBUT_RUPTURE1.LIB_ENTETE_Parttotal
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934257352630541928l);

super.setNom("LIB_ENTETE_Parttotal");

super.setType(25);

super.terminerInitialisation();
}

//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
case 12:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_ENTETE_Parttotal mWD_LIB_ENTETE_Parttotal = new GWDLIB_ENTETE_Parttotal();

/**
 * LIB_SansNom1
 */
class GWDLIB_SansNom1 extends WDChampEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de ETAT_listerepas.DEBUT_RUPTURE1.LIB_SansNom1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934260367614137325l);

super.setNom("LIB_SansNom1");

super.setType(25);

super.terminerInitialisation();
}

//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
case 12:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_SansNom1 mWD_LIB_SansNom1 = new GWDLIB_SansNom1();
/**
 * Initialise tous les champs de ETAT_listerepas.DEBUT_RUPTURE1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de ETAT_listerepas.DEBUT_RUPTURE1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_MomentRepas1.initialiserObjet();
super.ajouter("LIB_MomentRepas1", mWD_LIB_MomentRepas1);
mWD_LIB_ENTETE_libelle.initialiserObjet();
super.ajouter("LIB_ENTETE_libelle", mWD_LIB_ENTETE_libelle);
mWD_LIB_ENTETE_qteAliment.initialiserObjet();
super.ajouter("LIB_ENTETE_qteAliment", mWD_LIB_ENTETE_qteAliment);
mWD_LIB_ENTETE_cuisson.initialiserObjet();
super.ajouter("LIB_ENTETE_cuisson", mWD_LIB_ENTETE_cuisson);
mWD_LIB_ENTETE_Parttotal.initialiserObjet();
super.ajouter("LIB_ENTETE_Parttotal", mWD_LIB_ENTETE_Parttotal);
mWD_LIB_SansNom1.initialiserObjet();
super.ajouter("LIB_SansNom1", mWD_LIB_SansNom1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934257352628837977l);

super.setNom("DEBUT_RUPTURE1");

super.setType(1);

initialiserSousObjets();
super.terminerInitialisation();
}

//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
case 12:
case 13:
case 17:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDDEBUT_RUPTURE1 mWD_DEBUT_RUPTURE1;

/**
 * CORPS
 */
class GWDCORPS extends WDBlocEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de ETAT_listerepas.CORPS
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_Libelle
 */
class GWDLIB_Libelle extends WDChampEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de ETAT_listerepas.CORPS.LIB_Libelle
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934257352631328360l);

super.setNom("LIB_Libelle");

super.setType(25);

super.terminerInitialisation();
}

//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
case 12:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Libelle mWD_LIB_Libelle = new GWDLIB_Libelle();

/**
 * LIB_QteAliment
 */
class GWDLIB_QteAliment extends WDChampEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de ETAT_listerepas.CORPS.LIB_QteAliment
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934257352631459432l);

super.setNom("LIB_QteAliment");

super.setType(25);

super.terminerInitialisation();
}

//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
case 12:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_QteAliment mWD_LIB_QteAliment = new GWDLIB_QteAliment();

/**
 * LIB_Cuisson
 */
class GWDLIB_Cuisson extends WDChampEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de ETAT_listerepas.CORPS.LIB_Cuisson
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934257352631590504l);

super.setNom("LIB_Cuisson");

super.setType(25);

super.terminerInitialisation();
}

//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
case 12:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Cuisson mWD_LIB_Cuisson = new GWDLIB_Cuisson();

/**
 * LIB_Parttotal
 */
class GWDLIB_Parttotal extends WDChampEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de ETAT_listerepas.CORPS.LIB_Parttotal
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934257352631721576l);

super.setNom("LIB_Parttotal");

super.setType(25);

super.terminerInitialisation();
}

//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
case 12:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Parttotal mWD_LIB_Parttotal = new GWDLIB_Parttotal();

/**
 * LIB_SansNom
 */
class GWDLIB_SansNom extends WDChampEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de ETAT_listerepas.CORPS.LIB_SansNom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934260320369355262l);

super.setNom("LIB_SansNom");

super.setType(25);

super.terminerInitialisation();
}

//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
case 12:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_SansNom mWD_LIB_SansNom = new GWDLIB_SansNom();
/**
 * Initialise tous les champs de ETAT_listerepas.CORPS
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de ETAT_listerepas.CORPS
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_Libelle.initialiserObjet();
super.ajouter("LIB_Libelle", mWD_LIB_Libelle);
mWD_LIB_QteAliment.initialiserObjet();
super.ajouter("LIB_QteAliment", mWD_LIB_QteAliment);
mWD_LIB_Cuisson.initialiserObjet();
super.ajouter("LIB_Cuisson", mWD_LIB_Cuisson);
mWD_LIB_Parttotal.initialiserObjet();
super.ajouter("LIB_Parttotal", mWD_LIB_Parttotal);
mWD_LIB_SansNom.initialiserObjet();
super.ajouter("LIB_SansNom", mWD_LIB_SansNom);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934257352628051545l);

super.setNom("CORPS");

super.setType(1);

initialiserSousObjets();
super.terminerInitialisation();
}

//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
case 12:
case 13:
case 17:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCORPS mWD_CORPS;

/**
 * FIN_RUPTURE1
 */
class GWDFIN_RUPTURE1 extends WDBlocEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de ETAT_listerepas.FIN_RUPTURE1
////////////////////////////////////////////////////////////////////////////

/**
 * CALC_Parttotal
 */
class GWDCALC_Parttotal extends WDChampEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de ETAT_listerepas.FIN_RUPTURE1.CALC_Parttotal
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934257352632245864l);

super.setNom("CALC_Parttotal");

super.setType(3);

super.terminerInitialisation();
}

//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
case 12:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCALC_Parttotal mWD_CALC_Parttotal = new GWDCALC_Parttotal();
/**
 * Initialise tous les champs de ETAT_listerepas.FIN_RUPTURE1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de ETAT_listerepas.FIN_RUPTURE1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_CALC_Parttotal.initialiserObjet();
super.ajouter("CALC_Parttotal", mWD_CALC_Parttotal);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934257352629493337l);

super.setNom("FIN_RUPTURE1");

super.setType(1);

initialiserSousObjets();
super.terminerInitialisation();
}

//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
case 12:
case 13:
case 17:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDFIN_RUPTURE1 mWD_FIN_RUPTURE1;

/**
 * BAS_DE_PAGE
 */
class GWDBAS_DE_PAGE extends WDBlocEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de ETAT_listerepas.BAS_DE_PAGE
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934257352633163368l);

super.setNom("BAS_DE_PAGE");

super.setType(1);

super.terminerInitialisation();
}

//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
case 12:
case 13:
case 17:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBAS_DE_PAGE mWD_BAS_DE_PAGE;

/**
 * FIN_DOCUMENT
 */
class GWDFIN_DOCUMENT extends WDBlocEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de ETAT_listerepas.FIN_DOCUMENT
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_TEXTE1
 */
class GWDLIB_TEXTE1 extends WDChampEtat
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de ETAT_listerepas.FIN_DOCUMENT.LIB_TEXTE1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934263137870523831l);

super.setNom("LIB_TEXTE1");

super.setType(25);

super.terminerInitialisation();
}

/**
 * Traitement: Avant impression de LIB_TEXTE1
 */
public void trtDebutImpression()
{
super.trtDebutImpression();

// 


// REQ_qteRepasJour.Paramdatej	= gdMaDate
WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("paramdatej").setValeur(GWDPleucinose.getInstance().vWD_gdMaDate);

// SI HExécuteRequête(REQ_qteRepasJour) ALORS
if(WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour")).getBoolean())
{
// HLitPremier(REQ_qteRepasJour)
WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_qterepasjour"));

// 	MoiMême=MoiMême+Arrondi(REQ_qteRepasJour.totalLeucine,2)+" parts"
WDContexte.getMoiMeme().setValeur(WDContexte.getMoiMeme().opPlus(WDAPIMath.arrondi(WDAPIHF.getFichierSansCasseNiAccent("req_qterepasjour").getRubriqueSansCasseNiAccent("totalleucine"),2)).opPlus(" parts"));

}

}




//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_TEXTE1 mWD_LIB_TEXTE1 = new GWDLIB_TEXTE1();
/**
 * Initialise tous les champs de ETAT_listerepas.FIN_DOCUMENT
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de ETAT_listerepas.FIN_DOCUMENT
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_TEXTE1.initialiserObjet();
super.ajouter("LIB_TEXTE1", mWD_LIB_TEXTE1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setEtatParent( GWDETETAT_listerepas.this);
super.setQuid(5934257352634605160l);

super.setNom("FIN_DOCUMENT");

super.setType(1);

initialiserSousObjets();
super.terminerInitialisation();
}

//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 14:
case 12:
case 13:
case 17:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDFIN_DOCUMENT mWD_FIN_DOCUMENT;

/**
 * Traitement: Ouverture de ETAT_listerepas
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MonEtat()
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;



}




//Déclaration des PCode Vides
public boolean isTraitementVide(int nIdTraitement)
{
switch(nIdTraitement)
{
case 15:
case 16:
case 2:
return true;
default : return false;
}
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre ETAT_listerepas
////////////////////////////////////////////////////////////////////////////
protected void creerBlocs()
{
mWD_DEBUT_DOCUMENT = new GWDDEBUT_DOCUMENT();
mWD_HAUT_DE_PAGE = new GWDHAUT_DE_PAGE();
mWD_DEBUT_RUPTURE1 = new GWDDEBUT_RUPTURE1();
mWD_CORPS = new GWDCORPS();
mWD_FIN_RUPTURE1 = new GWDFIN_RUPTURE1();
mWD_BAS_DE_PAGE = new GWDBAS_DE_PAGE();
mWD_FIN_DOCUMENT = new GWDFIN_DOCUMENT();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre ETAT_listerepas
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(5934257352623464025l);

super.setNom("ETAT_listerepas");

super.setTypeSourceDonnees(1);


////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de ETAT_listerepas
////////////////////////////////////////////////////////////////////////////
mWD_DEBUT_DOCUMENT.initialiserObjet();
super.ajouter("DEBUT_DOCUMENT", mWD_DEBUT_DOCUMENT);
mWD_HAUT_DE_PAGE.initialiserObjet();
super.ajouter("HAUT_DE_PAGE", mWD_HAUT_DE_PAGE);
mWD_DEBUT_RUPTURE1.initialiserObjet();
super.ajouter("DEBUT_RUPTURE1", mWD_DEBUT_RUPTURE1);
mWD_CORPS.initialiserObjet();
super.ajouter("CORPS", mWD_CORPS);
mWD_FIN_RUPTURE1.initialiserObjet();
super.ajouter("FIN_RUPTURE1", mWD_FIN_RUPTURE1);
mWD_BAS_DE_PAGE.initialiserObjet();
super.ajouter("BAS_DE_PAGE", mWD_BAS_DE_PAGE);
mWD_FIN_DOCUMENT.initialiserObjet();
super.ajouter("FIN_DOCUMENT", mWD_FIN_DOCUMENT);

super.terminerInitialisation();
}
protected int getIdWDE()
{
return VYV.leucinose.R.raw.etat_listerepas;
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
return 3;
}
}
