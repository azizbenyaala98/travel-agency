import java.util.Arrays;
import java.util.Date;

public class VoyageOrganisee extends Voyage{
    private float prixBase;
    private Excursion[] desExcursions;
    private int nbrExcursions;

    public VoyageOrganisee(int nbreJours, String destination, Date dateDepart,float PrixBase) {
        super(nbreJours, destination, dateDepart);
        desExcursions=new Excursion[20];
    }
    public boolean ajouterExcursion(Excursion ex){
        if(nbrExcursions<desExcursions.length){
            desExcursions[nbrExcursions++]=ex;
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "VoyageOrganisee{" +
                "prixBase=" + prixBase +
                ", desExcursions=" + Arrays.toString(desExcursions) +
                ", nbrExcursions=" + nbrExcursions +
                '}';
    }

    @Override
    public float calculerTarif() {
        float tarif=0.0F;
                for (int i=0;i<desExcursions.length;i++){
                    tarif+=desExcursions[i].getPrix();
                }
                return  tarif;
    }
}
