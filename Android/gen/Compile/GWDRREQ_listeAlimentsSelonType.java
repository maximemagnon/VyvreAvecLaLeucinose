/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Requête
 * Classe Android : REQ_listeAlimentsSelonType
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



public class GWDRREQ_listeAlimentsSelonType extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_listeAlimentsSelonType";
}
public String getCodeSQLOriginal()
{
return " SELECT  ALIMENTS.IDALIMENTS AS IDALIMENTS,\t ALIMENTS.libelle AS libelle  FROM  ALIMENTS  WHERE   ALIMENTS.type = {Paramtype#0}  ORDER BY  libelle ASC";
}
public Requete initArbre() throws WDInvalidSQLException
{
Select varSelect = new Select();
varSelect.setType(1);
Rubrique rub_IDALIMENTS = new Rubrique();
rub_IDALIMENTS.setNom("IDALIMENTS");
rub_IDALIMENTS.setAlias("IDALIMENTS");
rub_IDALIMENTS.setNomFichier("ALIMENTS");
rub_IDALIMENTS.setAliasFichier("ALIMENTS");
varSelect.ajouterElement(rub_IDALIMENTS);
Rubrique rub_libelle = new Rubrique();
rub_libelle.setNom("libelle");
rub_libelle.setAlias("libelle");
rub_libelle.setNomFichier("ALIMENTS");
rub_libelle.setAliasFichier("ALIMENTS");
varSelect.ajouterElement(rub_libelle);
From varFrom = new From();
Fichier fic_ALIMENTS = new Fichier();
fic_ALIMENTS.setNom("ALIMENTS");
fic_ALIMENTS.setAlias("ALIMENTS");
varFrom.ajouterElement(fic_ALIMENTS);
Requete varReqSelect = new Requete(1);
varReqSelect.ajouterClause(varSelect);
varReqSelect.ajouterClause(varFrom);
Expression expr__ = new Expression(9, "=", "ALIMENTS.type = {Paramtype}");
Rubrique rub_TYPE = new Rubrique();
rub_TYPE.setNom("ALIMENTS.TYPE");
rub_TYPE.setAlias("TYPE");
rub_TYPE.setNomFichier("ALIMENTS");
rub_TYPE.setAliasFichier("ALIMENTS");
expr__.ajouterElement(rub_TYPE);
Parametre param_Paramtype = new Parametre();
param_Paramtype.setNom("Paramtype");
expr__.ajouterElement(param_Paramtype);
Where varWhere = new Where();
varWhere.ajouterElement(expr__);
varReqSelect.ajouterClause(varWhere);
OrderBy varOrderBy = new OrderBy();
Rubrique rub_libelle_1 = new Rubrique();
rub_libelle_1.setNom("libelle");
rub_libelle_1.setAlias("libelle");
rub_libelle_1.setNomFichier("ALIMENTS");
rub_libelle_1.setAliasFichier("ALIMENTS");
rub_libelle_1.ajouterOption(EWDOptionRequete.TRI, "0");
rub_libelle_1.ajouterOption(EWDOptionRequete.INDEX_RUB, "1");
varOrderBy.ajouterElement(rub_libelle_1);
varReqSelect.ajouterClause(varOrderBy);
return varReqSelect;
}
public String getNomFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "ALIMENTS";
default: return null;
}
}
public String getAliasFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "ALIMENTS";
default: return null;
}
}


public int getIdWDR()
{
return VYV.leucinose.R.raw.req_listealimentsselontype;
}
public String getNomFichierWDR()
{
return "req_listealimentsselontype";
}
}
