import java.util.Objects;

public class Pensioner extends Person {

  // private String name;
  // private int age;
  // private int namberOfChildren;




    public Pensioner(String name, int age, double height, int namberOfChildren) {
        super(name, age, height, namberOfChildren);
    }



    @Override
    public double getMinPay() {
        return super.getMinPay();
    }

    @Override
    public double getMaxPay() {
        return super.getMaxPay();
    }





    //@Override
  //public double calculator() {
  //    double sumthree = calculator. sumthree(maxWage,minWage,additional);
  //    return sumthree;


    //}


    @Override
    public double calculator() {
        double sumthree = AvarageSalary.sumthree(getMinPay(),getMaxPay(),ADDITIONL);
        return sumthree;

    }


}





