import java.util.Objects;
import java.util.Random;

public class Pensioner extends Person implements GoToWork {

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







    @Override
    public double calculator() {
        double sumthree = AvarageSalary.sumthree(getMinPay(),getMaxPay(),ADDITIONL);
        return sumthree;

    }

    @Override
    public String toString() {
        return "Pensioner{" +
                "minPay=" + minPay +
                ", maxPay=" + maxPay +
                ", ADDITIONL=" + ADDITIONL +
                ", dobdate=" + dobdate +
                '}';
    }

    @Override
    public void work() {

        Random random = new Random();
        int namber = random.nextInt(1,3);
        if (namber ==1){
        System.out.println("Мне лень");
        }
        else{
        System.out.println("Уговорили");





}}}





