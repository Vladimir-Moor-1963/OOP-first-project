import java.time.LocalDate;

public class HoumPersonOne {
    public HoumPersonOne() {
    }

    public static void main(String[] args) {
        Worker worker = new Worker("Иван",51,1.75,6);
        Worker worker1 = new Worker("Jochan",51);
        Pensioner pensioner = new Pensioner("Vladimir",61,1.80,4);
        Pensioner pensioner1 = new Pensioner("Владимир",61,1.76,3);
        Teenager teenager = new Teenager("Виктор",15);



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


        System.out.println(worker1.equals(worker));
        System.out.println(pensioner1.equals(pensioner));
        worker.work();
        pensioner.work();

        teenager.Info();
        teenager.dobdate = LocalDate.of(2019,2,1);
        System.out.println(teenager.dobdate);



        {

        }






        // Worker.setMinPay(2000);
      //  Worker.setMaxPay(2500);
      // double a = Worker.personPensionCalculator();
       // System.out.println(a);








        worker.saiute();
        pensioner.saiute();
        teenager.saiute();


    }





}