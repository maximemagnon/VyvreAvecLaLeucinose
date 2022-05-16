/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Requête
 * Classe Android : REQ_qteRepasJour
 * Date : 16/04/2022 18:41:19
 * Version de wdjava64.dll  : 26.0.407.3
 */


package VYV.leucinose.wdgen;


import VYV.leucinose.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.database.hf.requete.parsing.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDRREQ_qteRepasJour extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_qteRepasJour";
}
public String getCodeSQLOriginal()
{
return " SELECT  REPAS.datej AS datej,\t REPAS.totalLeucine AS totalLeucine  FROM  REPAS  WHERE   REPAS.datej = {Paramdatej#0}";
}
public Requete initArbre() throws WDInvalidSQLException
{
Select varSelect = new Select();
varSelect.setType(1);
Rubrique rub_datej = new Rubrique();
rub_datej.setNom("datej");
rub_datej.setAlias("datej");
rub_datej.setNomFichier("REPAS");
rub_datej.setAliasFichier("REPAS");
varSelect.ajouterElement(rub_datej);
Rubrique rub_totalLeucine = new Rubrique();
rub_totalLeucine.setNom("totalLeucine");
rub_totalLeucine.setAlias("totalLeucine");
rub_totalLeucine.setNomFichier("REPAS");
rub_totalLeucine.setAliasFichier("REPAS");
varSelect.ajouterElement(rub_totalLeucine);
From varFrom = new From();
Fichier fic_REPAS = new Fichier();
fic_REPAS.setNom("REPAS");
fic_REPAS.setAlias("REPAS");
varFrom.ajouterElement(fic_REPAS);
Requete varReqSelect = new Requete(1);
varReqSelect.ajouterClause(varSelect);
varReqSelect.ajouterClause(varFrom);
Expression expr__ = new Expression(9, "=", "REPAS.datej = {Paramdatej}");
Rubrique rub_datej_1 = new Rubrique();
rub_datej_1.setNom("REPAS.datej");
rub_datej_1.setAlias("datej");
rub_datej_1.setNomFichier("REPAS");
rub_datej_1.setAliasFichier("REPAS");
expr__.ajouterElement(rub_datej_1);
Parametre param_Paramdatej = new Parametre();
param_Paramdatej.setNom("Paramdatej");
expr__.ajouterElement(param_Paramdatej);
Where varWhere = new Where();
varWhere.ajouterElement(expr__);
varReqSelect.ajouterClause(varWhere);
return varReqSelect;
}
public String getNomFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "REPAS";
default: return null;
}
}
public String getAliasFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "REPAS";
default: return null;
}
}


public int getIdWDR()
{
return VYV.leucinose.R.raw.req_qterepasjour;
}
public String getNomFichierWDR()
{
return "req_qterepasjour";
}
}
