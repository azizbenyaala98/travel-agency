
public class Test {
    public static void main(String[] args) {
    Excursion c1=new Excursion("entree musee",25);
    Excursion c2=new Excursion("tOUR DE VILLE" ,60 );


    Crosiere crosiere=new Crosiere(8,"Mediteranee",07/01/2019,4200,"Premium","Balcon");
    VoyageIndiv voyageIndiv=new VoyageIndiv(8,"Turquie",15/02/2019,1103.5F,268,120);
    VoyageOrganisee voyageOrganisee =new VoyageOrganisee(
            6,"Turquie",12/01/2019,1850);

    AgenceDeVoyage agence =new AgenceDeVoyage("Ibn Batouta",100);
    agence.ajouterVoyage(crosiere);
    agence.ajouterVoyage(voyageIndiv);
    agence.ajouterVoyage(voyageOrganisee);

    agence.toString();
    int nbturquie = agence.nbVoyOrganises("Turquie");
    System.out.println(nbturquie);

    }

}
