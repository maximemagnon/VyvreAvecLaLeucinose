/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Requête
 * Classe Android : REQ_listeAlimentHypo
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



public class GWDRREQ_listeAlimentHypo extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_listeAlimentHypo";
}
public String getCodeSQLOriginal()
{
return " SELECT  ALIMENTS.IDALIMENTS AS IDALIMENTS,\t ALIMENTS.libelle AS libelle  FROM  ALIMENTS  WHERE   ALIMENTS.type = 'HYPOPROTIDIQUES'";
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
Expression expr__ = new Expression(9, "=", "ALIMENTS.type = 'HYPOPROTIDIQUES'");
Rubrique rub_TYPE = new Rubrique();
rub_TYPE.setNom("ALIMENTS.TYPE");
rub_TYPE.setAlias("TYPE");
rub_TYPE.setNomFichier("ALIMENTS");
rub_TYPE.setAliasFichier("ALIMENTS");
expr__.ajouterElement(rub_TYPE);
Literal varLiteral = new Literal();
varLiteral.setValeur("HYPOPROTIDIQUES");
varLiteral.setTypeWL(19);
expr__.ajouterElement(varLiteral);
Where varWhere = new Where();
varWhere.ajouterElement(expr__);
varReqSelect.ajouterClause(varWhere);
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
return VYV.leucinose.R.raw.req_listealimenthypo;
}
public String getNomFichierWDR()
{
return "req_listealimenthypo";
}
}
