public class ExcursionGuidee extends Excursion {
    private float tarifGuide;


    public ExcursionGuidee(String nom, float prix ,float tarifGuide)  {
        super(nom, prix);
        this.tarifGuide=tarifGuide;
    }

    @Override
    public String toString() {
        return  ( super.toString()+"ExcursionGuidee{" +
                "tarifGuide=" + tarifGuide +
                '}')
                ;
    }
}
