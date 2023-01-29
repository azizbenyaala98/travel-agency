import java.util.Arrays;

public class AgenceDeVoyage {
    private String nomAgence;
    private Voyage[] desVoyages;
    private int nbreVoyage;

    public AgenceDeVoyage(String nomAgence, int max) {
        this.nomAgence = nomAgence;
        desVoyages=new Voyage[max];
    }
    public boolean ajouterVoyage(Voyage v){

            desVoyages[nbreVoyage]=v;
            return true;


    }
    public int nbVoyOrganises(String des){
        int nbres=0;
        for (int i=0;i<nbreVoyage;i++){
            if (desVoyages[i].getDestination().equals(des))
                nbres++;
        }


        return nbres;
    }

    @Override
    public String toString() {
        return "AgenceDeVoyage{" +
                "nomAgence='" + nomAgence + '\'' +
                ", desVoyages=" + Arrays.toString(desVoyages) +
                '}';
    }
}

