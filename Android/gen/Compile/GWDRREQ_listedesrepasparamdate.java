/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Requête
 * Classe Android : REQ_listedesrepasparamdate
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



public class GWDRREQ_listedesrepasparamdate extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_listedesrepasparamdate";
}
public String getCodeSQLOriginal()
{
return " SELECT  REPAS.datej AS datej,\t REPAS.totalLeucine AS totalLeucine,\t REPAS_ALIMENTS.momentRepas AS momentRepas,\t ALIMENTS.libelle AS libelle,\t REPAS_ALIMENTS.qteAliment AS qteAliment,\t REPAS_ALIMENTS.cuisson AS cuisson,\t REPAS_ALIMENTS.Parttotal AS Parttotal,\t REPAS_ALIMENTS.IDALIMENTS AS IDALIMENTS,\t REPAS_ALIMENTS.idRepasAliment AS idRepasAliment,\t CASE REPAS_ALIMENTS.momentRepas \r\nWHEN 'Petit déjeuner' THEN 1 \r\nWHEN 'Déjeuner' THEN 2\r\nWHEN 'Gouter' THEN 3\r\nWHEN 'Diner' THEN 4\r\nELSE 5 END AS CleRangement  FROM  ALIMENTS,\t REPAS_ALIMENTS,\t REPAS  WHERE   REPAS.IDREPAS = REPAS_ALIMENTS.IDREPAS AND  ALIMENTS.IDALIMENTS = REPAS_ALIMENTS.IDALIMENTS  AND  ( REPAS.datej = {ParamDate#0} )  ORDER BY  CleRangement ASC";
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
Rubrique rub_momentRepas = new Rubrique();
rub_momentRepas.setNom("momentRepas");
rub_momentRepas.setAlias("momentRepas");
rub_momentRepas.setNomFichier("REPAS_ALIMENTS");
rub_momentRepas.setAliasFichier("REPAS_ALIMENTS");
varSelect.ajouterElement(rub_momentRepas);
Rubrique rub_libelle = new Rubrique();
rub_libelle.setNom("libelle");
rub_libelle.setAlias("libelle");
rub_libelle.setNomFichier("ALIMENTS");
rub_libelle.setAliasFichier("ALIMENTS");
varSelect.ajouterElement(rub_libelle);
Rubrique rub_qteAliment = new Rubrique();
rub_qteAliment.setNom("qteAliment");
rub_qteAliment.setAlias("qteAliment");
rub_qteAliment.setNomFichier("REPAS_ALIMENTS");
rub_qteAliment.setAliasFichier("REPAS_ALIMENTS");
varSelect.ajouterElement(rub_qteAliment);
Rubrique rub_cuisson = new Rubrique();
rub_cuisson.setNom("cuisson");
rub_cuisson.setAlias("cuisson");
rub_cuisson.setNomFichier("REPAS_ALIMENTS");
rub_cuisson.setAliasFichier("REPAS_ALIMENTS");
varSelect.ajouterElement(rub_cuisson);
Rubrique rub_Parttotal = new Rubrique();
rub_Parttotal.setNom("Parttotal");
rub_Parttotal.setAlias("Parttotal");
rub_Parttotal.setNomFichier("REPAS_ALIMENTS");
rub_Parttotal.setAliasFichier("REPAS_ALIMENTS");
varSelect.ajouterElement(rub_Parttotal);
Rubrique rub_IDALIMENTS = new Rubrique();
rub_IDALIMENTS.setNom("IDALIMENTS");
rub_IDALIMENTS.setAlias("IDALIMENTS");
rub_IDALIMENTS.setNomFichier("REPAS_ALIMENTS");
rub_IDALIMENTS.setAliasFichier("REPAS_ALIMENTS");
varSelect.ajouterElement(rub_IDALIMENTS);
Rubrique rub_idRepasAliment = new Rubrique();
rub_idRepasAliment.setNom("idRepasAliment");
rub_idRepasAliment.setAlias("idRepasAliment");
rub_idRepasAliment.setNomFichier("REPAS_ALIMENTS");
rub_idRepasAliment.setAliasFichier("REPAS_ALIMENTS");
varSelect.ajouterElement(rub_idRepasAliment);
Expression expr_CASE = new Expression(106, "CASE", "CASE REPAS_ALIMENTS.momentRepas \r\nWHEN 'Petit déjeuner' THEN 1 \r\nWHEN 'Déjeuner' THEN 2\r\nWHEN 'Gouter' THEN 3\r\nWHEN 'Diner' THEN 4\r\nELSE 5 END");
Rubrique rub_momentRepas_1 = new Rubrique();
rub_momentRepas_1.setNom("REPAS_ALIMENTS.momentRepas");
rub_momentRepas_1.setAlias("momentRepas");
rub_momentRepas_1.setNomFichier("REPAS_ALIMENTS");
rub_momentRepas_1.setAliasFichier("REPAS_ALIMENTS");
expr_CASE.ajouterElement(rub_momentRepas_1);
Literal varLiteral = new Literal();
varLiteral.setValeur("Petit déjeuner");
varLiteral.setTypeWL(16);
expr_CASE.ajouterElement(varLiteral);
Literal varLiteral_1 = new Literal();
varLiteral_1.setValeur("1");
varLiteral_1.setTypeWL(8);
expr_CASE.ajouterElement(varLiteral_1);
Literal varLiteral_2 = new Literal();
varLiteral_2.setValeur("Déjeuner");
varLiteral_2.setTypeWL(16);
expr_CASE.ajouterElement(varLiteral_2);
Literal varLiteral_3 = new Literal();
varLiteral_3.setValeur("2");
varLiteral_3.setTypeWL(8);
expr_CASE.ajouterElement(varLiteral_3);
Literal varLiteral_4 = new Literal();
varLiteral_4.setValeur("Gouter");
varLiteral_4.setTypeWL(16);
expr_CASE.ajouterElement(varLiteral_4);
Literal varLiteral_5 = new Literal();
varLiteral_5.setValeur("3");
varLiteral_5.setTypeWL(8);
expr_CASE.ajouterElement(varLiteral_5);
Literal varLiteral_6 = new Literal();
varLiteral_6.setValeur("Diner");
varLiteral_6.setTypeWL(16);
expr_CASE.ajouterElement(varLiteral_6);
Literal varLiteral_7 = new Literal();
varLiteral_7.setValeur("4");
varLiteral_7.setTypeWL(8);
expr_CASE.ajouterElement(varLiteral_7);
Literal varLiteral_8 = new Literal();
varLiteral_8.setValeur("5");
varLiteral_8.setTypeWL(8);
expr_CASE.ajouterElement(varLiteral_8);
expr_CASE.setAlias("CleRangement");
varSelect.ajouterElement(expr_CASE);
From varFrom = new From();
Fichier fic_ALIMENTS = new Fichier();
fic_ALIMENTS.setNom("ALIMENTS");
fic_ALIMENTS.setAlias("ALIMENTS");
varFrom.ajouterElement(fic_ALIMENTS);
Fichier fic_REPAS_ALIMENTS = new Fichier();
fic_REPAS_ALIMENTS.setNom("REPAS_ALIMENTS");
fic_REPAS_ALIMENTS.setAlias("REPAS_ALIMENTS");
varFrom.ajouterElement(fic_REPAS_ALIMENTS);
Fichier fic_REPAS = new Fichier();
fic_REPAS.setNom("REPAS");
fic_REPAS.setAlias("REPAS");
varFrom.ajouterElement(fic_REPAS);
Requete varReqSelect = new Requete(1);
varReqSelect.ajouterClause(varSelect);
varReqSelect.ajouterClause(varFrom);
Expression expr_AND = new Expression(24, "AND", "REPAS.IDREPAS = REPAS_ALIMENTS.IDREPAS\r\n\tAND\t\tALIMENTS.IDALIMENTS = REPAS_ALIMENTS.IDALIMENTS\r\n\tAND\r\n\t(\r\n\t\tREPAS.datej = {ParamDate}\r\n\t)");
Expression expr_AND_1 = new Expression(24, "AND", "REPAS.IDREPAS = REPAS_ALIMENTS.IDREPAS\r\n\tAND\t\tALIMENTS.IDALIMENTS = REPAS_ALIMENTS.IDALIMENTS");
Expression expr__ = new Expression(9, "=", "REPAS.IDREPAS = REPAS_ALIMENTS.IDREPAS");
Rubrique rub_IDREPAS = new Rubrique();
rub_IDREPAS.setNom("REPAS.IDREPAS");
rub_IDREPAS.setAlias("IDREPAS");
rub_IDREPAS.setNomFichier("REPAS");
rub_IDREPAS.setAliasFichier("REPAS");
expr__.ajouterElement(rub_IDREPAS);
Rubrique rub_IDREPAS_1 = new Rubrique();
rub_IDREPAS_1.setNom("REPAS_ALIMENTS.IDREPAS");
rub_IDREPAS_1.setAlias("IDREPAS");
rub_IDREPAS_1.setNomFichier("REPAS_ALIMENTS");
rub_IDREPAS_1.setAliasFichier("REPAS_ALIMENTS");
expr__.ajouterElement(rub_IDREPAS_1);
expr_AND_1.ajouterElement(expr__);
Expression expr___1 = new Expression(9, "=", "ALIMENTS.IDALIMENTS = REPAS_ALIMENTS.IDALIMENTS");
Rubrique rub_IDALIMENTS_1 = new Rubrique();
rub_IDALIMENTS_1.setNom("ALIMENTS.IDALIMENTS");
rub_IDALIMENTS_1.setAlias("IDALIMENTS");
rub_IDALIMENTS_1.setNomFichier("ALIMENTS");
rub_IDALIMENTS_1.setAliasFichier("ALIMENTS");
expr___1.ajouterElement(rub_IDALIMENTS_1);
Rubrique rub_IDALIMENTS_2 = new Rubrique();
rub_IDALIMENTS_2.setNom("REPAS_ALIMENTS.IDALIMENTS");
rub_IDALIMENTS_2.setAlias("IDALIMENTS");
rub_IDALIMENTS_2.setNomFichier("REPAS_ALIMENTS");
rub_IDALIMENTS_2.setAliasFichier("REPAS_ALIMENTS");
expr___1.ajouterElement(rub_IDALIMENTS_2);
expr_AND_1.ajouterElement(expr___1);
expr_AND.ajouterElement(expr_AND_1);
Expression expr___2 = new Expression(9, "=", "REPAS.datej = {ParamDate}");
Rubrique rub_datej_1 = new Rubrique();
rub_datej_1.setNom("REPAS.datej");
rub_datej_1.setAlias("datej");
rub_datej_1.setNomFichier("REPAS");
rub_datej_1.setAliasFichier("REPAS");
expr___2.ajouterElement(rub_datej_1);
Parametre param_ParamDate = new Parametre();
param_ParamDate.setNom("ParamDate");
expr___2.ajouterElement(param_ParamDate);
expr_AND.ajouterElement(expr___2);
Where varWhere = new Where();
varWhere.ajouterElement(expr_AND);
varReqSelect.ajouterClause(varWhere);
OrderBy varOrderBy = new OrderBy();
Rubrique rub_CleRangement = new Rubrique();
rub_CleRangement.setNom("");
rub_CleRangement.setAlias("CleRangement");
rub_CleRangement.setNomFichier("");
rub_CleRangement.setAliasFichier("");
rub_CleRangement.ajouterOption(EWDOptionRequete.TRI, "0");
rub_CleRangement.ajouterOption(EWDOptionRequete.INDEX_RUB, "9");
varOrderBy.ajouterElement(rub_CleRangement);
varReqSelect.ajouterClause(varOrderBy);
return varReqSelect;
}
public String getNomFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "ALIMENTS";
case 1 : return "REPAS_ALIMENTS";
case 2 : return "REPAS";
default: return null;
}
}
public String getAliasFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "ALIMENTS";
case 1 : return "REPAS_ALIMENTS";
case 2 : return "REPAS";
default: return null;
}
}


public int getIdWDR()
{
return VYV.leucinose.R.raw.req_listedesrepasparamdate;
}
public String getNomFichierWDR()
{
return "req_listedesrepasparamdate";
}
}
