import java.time.LocalDate;

public class HoumPersonOne {
    public HoumPersonOne() {
    }

    public static void main(String[] args) {
        Worker worker = new Worker("Иван",51,1.75,6);
        Worker worker1 = new Worker("Jochan",51);
        Pensioner pensioner = new Pensioner("Vladimir",61,1.80,4);




        worker.Info();
        worker.experince();
        System.out.println(worker.experince());
        worker.dobdate = LocalDate.of(1973, 4, 15);
        worker1.dobdate = LocalDate.of(1973,4,15);
        System.out.println(worker.dobdate);
        double sumtwo = worker.calculator();
        System.out.println("Awerage solare " + worker.calculator());
        PensionFundPerson pensionFundPerson = new PensionFundPerson();
        System.out.println();
        double a = pensionFundPerson.personPensionCalculator(worker);
        System.out.println(a);


        pensioner.Info();
        pensioner.experince();
        System.out.println(pensioner.experince());
        pensioner.dobdate = LocalDate.of(1963,4,15);
        System.out.println(pensioner.dobdate);
        double sumthree = pensioner.calculator();
        System.out.println("Awerage solare " + pensioner.calculator());
        double b = pensionFundPerson.personPensionCalculator(pensioner);
        System.out.println(b);

        System.out.println(worker.hashCode());
        System.out.println(worker1.hashCode());
        if (worker1.hashCode() == worker.hashCode()){
        System.out.println("Одинаковые");
        }
        else {
            System.out.println("Разные");

        }
        {

        }






        // Worker.setMinPay(2000);
      //  Worker.setMaxPay(2500);
      // double a = Worker.personPensionCalculator();
       // System.out.println(a);








        worker.saiute();
        pensioner.saiute();


    }





}