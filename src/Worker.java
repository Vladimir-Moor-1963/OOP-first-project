import java.util.Objects;

public class Worker extends Person {


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

  // @Override
  // public boolean equals(Object o) {
  //     if (this == o) return true;
  //     if (o == null || getClass() != o.getClass()) return false;

  //     Worker worker = (Worker) o;

  //     if (age != worker.age) return false;
  //     if (eheight != worker.eheight) return false;
  //     return Objects.equals(mame, worker.mame);
  // }

   // @Override
   // public int hashCode() {
   //     int result = mame != null ? mame.hashCode() : 0;
   //     result = 31 * result + age;
   //     result = 31 * result + eheight;
   //     return result;
   // }

  // public Worker(String name, int age, String mame, int age1, int eheight) {
  //     super(name, age);
  //     this.mame = mame;
  //     this.age = age1;
  //     this.eheight = eheight;
  // }
}










