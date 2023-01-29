import java.util.Date;

abstract class Voyage {
        private int nbreJours;
        private String destination;
        private Date dateDepart;

    public String getDestination() {
        return destination;
    }

    public Voyage(int nbreJours, String destination, Date dateDepart) {
            this.nbreJours = nbreJours;
            this.destination = destination;
            this.dateDepart = dateDepart;
        }

    public int getNbreJours() {
        return nbreJours;
    }

    public abstract float calculerTarif();

        @Override
        public String toString() {
            return "Voyage{" +
                    "nbreJours=" + nbreJours +
                    ", destination='" + destination + '\'' +
                    ", dateDepart=" + dateDepart +
                    '}';
        }
    }


