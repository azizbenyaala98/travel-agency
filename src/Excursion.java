public class Excursion {
    private String nom ;
    private float prix ;

    public Excursion(String nom, float prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public float getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "Excursion{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }
}
