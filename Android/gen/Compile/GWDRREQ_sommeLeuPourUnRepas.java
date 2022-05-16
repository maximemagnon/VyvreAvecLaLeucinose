/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Requête
 * Classe Android : REQ_sommeLeuPourUnRepas
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



public class GWDRREQ_sommeLeuPourUnRepas extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_sommeLeuPourUnRepas";
}
public String getCodeSQLOriginal()
{
return " SELECT  REPAS_ALIMENTS.IDREPAS AS IDREPAS,\t SUM(REPAS_ALIMENTS.Parttotal) AS la_somme_Parttotal  FROM  REPAS_ALIMENTS  WHERE   REPAS_ALIMENTS.IDREPAS = {ParamIDREPAS#0}  GROUP BY  REPAS_ALIMENTS.IDREPAS";
}
public Requete initArbre() throws WDInvalidSQLException
{
Select varSelect = new Select();
varSelect.setType(1);
Rubrique rub_IDREPAS = new Rubrique();
rub_IDREPAS.setNom("IDREPAS");
rub_IDREPAS.setAlias("IDREPAS");
rub_IDREPAS.setNomFichier("REPAS_ALIMENTS");
rub_IDREPAS.setAliasFichier("REPAS_ALIMENTS");
varSelect.ajouterElement(rub_IDREPAS);
Expression varExprAgregat = new Expression(28, "SUM", "SUM(REPAS_ALIMENTS.Parttotal)");
varExprAgregat.ajouterOption(EWDOptionRequete.SELECT, "1");
Rubrique rub_Parttotal = new Rubrique();
rub_Parttotal.setNom("REPAS_ALIMENTS.Parttotal");
rub_Parttotal.setAlias("Parttotal");
rub_Parttotal.setNomFichier("REPAS_ALIMENTS");
rub_Parttotal.setAliasFichier("REPAS_ALIMENTS");
varExprAgregat.setAlias("la_somme_Parttotal");
varExprAgregat.ajouterElement(rub_Parttotal);
varSelect.ajouterElement(varExprAgregat);
From varFrom = new From();
Fichier fic_REPAS_ALIMENTS = new Fichier();
fic_REPAS_ALIMENTS.setNom("REPAS_ALIMENTS");
fic_REPAS_ALIMENTS.setAlias("REPAS_ALIMENTS");
varFrom.ajouterElement(fic_REPAS_ALIMENTS);
Requete varReqSelect = new Requete(1);
varReqSelect.ajouterClause(varSelect);
varReqSelect.ajouterClause(varFrom);
Expression expr__ = new Expression(9, "=", "REPAS_ALIMENTS.IDREPAS = {ParamIDREPAS}");
Rubrique rub_IDREPAS_1 = new Rubrique();
rub_IDREPAS_1.setNom("REPAS_ALIMENTS.IDREPAS");
rub_IDREPAS_1.setAlias("IDREPAS");
rub_IDREPAS_1.setNomFichier("REPAS_ALIMENTS");
rub_IDREPAS_1.setAliasFichier("REPAS_ALIMENTS");
expr__.ajouterElement(rub_IDREPAS_1);
Parametre param_ParamIDREPAS = new Parametre();
param_ParamIDREPAS.setNom("ParamIDREPAS");
expr__.ajouterElement(param_ParamIDREPAS);
Where varWhere = new Where();
varWhere.ajouterElement(expr__);
varReqSelect.ajouterClause(varWhere);
GroupBy varGroupeBy = new GroupBy();
Rubrique rub_IDREPAS_2 = new Rubrique();
rub_IDREPAS_2.setNom("IDREPAS");
rub_IDREPAS_2.setAlias("IDREPAS");
rub_IDREPAS_2.setNomFichier("REPAS_ALIMENTS");
rub_IDREPAS_2.setAliasFichier("REPAS_ALIMENTS");
varGroupeBy.ajouterElement(rub_IDREPAS_2);
varReqSelect.ajouterClause(varGroupeBy);
return varReqSelect;
}
public String getNomFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "REPAS_ALIMENTS";
default: return null;
}
}
public String getAliasFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "REPAS_ALIMENTS";
default: return null;
}
}


public int getIdWDR()
{
return VYV.leucinose.R.raw.req_sommeleupourunrepas;
}
public String getNomFichierWDR()
{
return "req_sommeleupourunrepas";
}
}
