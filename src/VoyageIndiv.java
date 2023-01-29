import java.util.Date;


public class VoyageIndiv extends Voyage{
    private float prixVol;
    private float prixTransfert;
    private  float prixNuitHotel;




    public VoyageIndiv(int nbreJours, String destination, Date dateDepart , float prixVol, float prixTransfert,float prixNuitHotel ) {
        super(nbreJours, destination, dateDepart);
        this.prixNuitHotel=prixNuitHotel;
        this.prixVol=prixVol;
        this.prixTransfert=prixTransfert

    }

    @Override
    public float calculerTarif() {
        return (prixVol+prixTransfert+(prixNuitHotel*this.getNbreJours()))
                ;
    }

}
