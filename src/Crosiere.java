import java.util.Date;

public class Crosiere extends Voyage{
    private float prixBase;
    private String categorie;
    private String balcon;

    public Crosiere(int nbreJours, String destination, Date dateDepart , float prixBase, String categorie,String balcon) {

        super(nbreJours, destination, dateDepart);
        this.balcon=balcon;
        this.categorie=categorie;
        this.prixBase=prixBase;

    }

    @Override
    public float calculerTarif() {
        float tarif=0.0F;
        if ((this.categorie.equals("Premium"))&&(this.balcon.equals("Balcon")))
        tarif= (float) (prixBase*1.07+250);
        return tarif;

    }}





