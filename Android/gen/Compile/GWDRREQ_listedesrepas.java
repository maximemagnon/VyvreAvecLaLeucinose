/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Requête
 * Classe Android : REQ_listedesrepas
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



public class GWDRREQ_listedesrepas extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_listedesrepas";
}
public String getCodeSQLOriginal()
{
return " SELECT  REPAS.datej AS datej,\t REPAS.totalLeucine AS totalLeucine,\t REPAS_ALIMENTS.momentRepas AS momentRepas,\t ALIMENTS.libelle AS libelle,\t REPAS_ALIMENTS.qteAliment AS qteAliment,\t REPAS_ALIMENTS.cuisson AS cuisson,\t REPAS_ALIMENTS.Parttotal AS Parttotal,\t 'Leucine : '+REPAS.totalLeucine+'/jour' AS libellepourcalendrier  FROM  ALIMENTS,\t REPAS_ALIMENTS,\t REPAS  WHERE   REPAS.IDREPAS = REPAS_ALIMENTS.IDREPAS AND  ALIMENTS.IDALIMENTS = REPAS_ALIMENTS.IDALIMENTS   ORDER BY  datej DESC,\t momentRepas ASC,\t libelle ASC";
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
Expression expr__ = new Expression(0, "+", "'Leucine : '+REPAS.totalLeucine+'/jour'");
Expression expr___1 = new Expression(0, "+", "'Leucine : '+REPAS.totalLeucine");
Literal varLiteral = new Literal();
varLiteral.setValeur("Leucine : ");
varLiteral.setTypeWL(16);
expr___1.ajouterElement(varLiteral);
Rubrique rub_totalLeucine_1 = new Rubrique();
rub_totalLeucine_1.setNom("REPAS.totalLeucine");
rub_totalLeucine_1.setAlias("totalLeucine");
rub_totalLeucine_1.setNomFichier("REPAS");
rub_totalLeucine_1.setAliasFichier("REPAS");
expr___1.ajouterElement(rub_totalLeucine_1);
expr__.ajouterElement(expr___1);
Literal varLiteral_1 = new Literal();
varLiteral_1.setValeur("/jour");
varLiteral_1.setTypeWL(16);
expr__.ajouterElement(varLiteral_1);
expr__.setAlias("libellepourcalendrier");
varSelect.ajouterElement(expr__);
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
Expression expr_AND = new Expression(24, "AND", "REPAS.IDREPAS = REPAS_ALIMENTS.IDREPAS\r\n\tAND\t\tALIMENTS.IDALIMENTS = REPAS_ALIMENTS.IDALIMENTS");
Expression expr___2 = new Expression(9, "=", "REPAS.IDREPAS = REPAS_ALIMENTS.IDREPAS");
Rubrique rub_IDREPAS = new Rubrique();
rub_IDREPAS.setNom("REPAS.IDREPAS");
rub_IDREPAS.setAlias("IDREPAS");
rub_IDREPAS.setNomFichier("REPAS");
rub_IDREPAS.setAliasFichier("REPAS");
expr___2.ajouterElement(rub_IDREPAS);
Rubrique rub_IDREPAS_1 = new Rubrique();
rub_IDREPAS_1.setNom("REPAS_ALIMENTS.IDREPAS");
rub_IDREPAS_1.setAlias("IDREPAS");
rub_IDREPAS_1.setNomFichier("REPAS_ALIMENTS");
rub_IDREPAS_1.setAliasFichier("REPAS_ALIMENTS");
expr___2.ajouterElement(rub_IDREPAS_1);
expr_AND.ajouterElement(expr___2);
Expression expr___3 = new Expression(9, "=", "ALIMENTS.IDALIMENTS = REPAS_ALIMENTS.IDALIMENTS");
Rubrique rub_IDALIMENTS = new Rubrique();
rub_IDALIMENTS.setNom("ALIMENTS.IDALIMENTS");
rub_IDALIMENTS.setAlias("IDALIMENTS");
rub_IDALIMENTS.setNomFichier("ALIMENTS");
rub_IDALIMENTS.setAliasFichier("ALIMENTS");
expr___3.ajouterElement(rub_IDALIMENTS);
Rubrique rub_IDALIMENTS_1 = new Rubrique();
rub_IDALIMENTS_1.setNom("REPAS_ALIMENTS.IDALIMENTS");
rub_IDALIMENTS_1.setAlias("IDALIMENTS");
rub_IDALIMENTS_1.setNomFichier("REPAS_ALIMENTS");
rub_IDALIMENTS_1.setAliasFichier("REPAS_ALIMENTS");
expr___3.ajouterElement(rub_IDALIMENTS_1);
expr_AND.ajouterElement(expr___3);
Where varWhere = new Where();
varWhere.ajouterElement(expr_AND);
varReqSelect.ajouterClause(varWhere);
OrderBy varOrderBy = new OrderBy();
Rubrique rub_datej_1 = new Rubrique();
rub_datej_1.setNom("datej");
rub_datej_1.setAlias("datej");
rub_datej_1.setNomFichier("REPAS");
rub_datej_1.setAliasFichier("REPAS");
rub_datej_1.ajouterOption(EWDOptionRequete.TRI, "1");
rub_datej_1.ajouterOption(EWDOptionRequete.INDEX_RUB, "0");
varOrderBy.ajouterElement(rub_datej_1);
Rubrique rub_momentRepas_1 = new Rubrique();
rub_momentRepas_1.setNom("momentRepas");
rub_momentRepas_1.setAlias("momentRepas");
rub_momentRepas_1.setNomFichier("REPAS_ALIMENTS");
rub_momentRepas_1.setAliasFichier("REPAS_ALIMENTS");
rub_momentRepas_1.ajouterOption(EWDOptionRequete.TRI, "0");
rub_momentRepas_1.ajouterOption(EWDOptionRequete.INDEX_RUB, "2");
varOrderBy.ajouterElement(rub_momentRepas_1);
Rubrique rub_libelle_1 = new Rubrique();
rub_libelle_1.setNom("libelle");
rub_libelle_1.setAlias("libelle");
rub_libelle_1.setNomFichier("ALIMENTS");
rub_libelle_1.setAliasFichier("ALIMENTS");
rub_libelle_1.ajouterOption(EWDOptionRequete.TRI, "0");
rub_libelle_1.ajouterOption(EWDOptionRequete.INDEX_RUB, "3");
varOrderBy.ajouterElement(rub_libelle_1);
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
return VYV.leucinose.R.raw.req_listedesrepas;
}
public String getNomFichierWDR()
{
return "req_listedesrepas";
}
}
