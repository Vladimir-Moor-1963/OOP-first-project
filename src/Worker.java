import java.util.Objects;

public class Worker extends Person implements GoToWork {


    public Worker(String name, int age, double height, int namberOfChildren) {
        super(name, age, height, namberOfChildren);
    }



    public Worker(String name, int age) {
        super(name, age);
    }



    @Override
    public double getMaxPay() {
        return super.getMaxPay();
    }

    @Override
    public double getMinPay() {
        return super.getMinPay();
    }


    @Override
    public double calculator() {
        double sumtwo = AvarageSalary.sumtwo(getMaxPay(),getMinPay());
        return sumtwo;

    }

    @Override
    public String toString() {
        return "Worker{" +
                "minPay=" + minPay +
                ", maxPay=" + maxPay +
                ", ADDITIONL=" + ADDITIONL +
                ", dobdate=" + dobdate +
                '}';
    }

    @Override
    public void work() {
        System.out.println("Я с удовольствием пошёл работать");

    }
}










