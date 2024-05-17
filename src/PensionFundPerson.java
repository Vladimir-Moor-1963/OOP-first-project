public class  PensionFundPerson  {


    private final static double constantPension = 0.70;



    public  double personPensionCalculator(Person person) {
        return person.calculator() * constantPension;

    }
}


