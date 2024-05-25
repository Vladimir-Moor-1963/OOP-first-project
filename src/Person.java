import java.time.LocalDate;
import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private double height;
    private int namberOfChildren;

    double minPay = 2000;
    double maxPay = 2500;
    final double ADDITIONL = 2000;


    public double getMinPay() {
        return minPay;
    }

    public void setMinPay(double minPay) {
        this.minPay = minPay;
    }

    public double getMaxPay() {
        return maxPay = maxPay;
    }

    public void setMaxPay(double maxPay) {
        this.maxPay = maxPay;
    }


    public LocalDate getDobdate() {
        return dobdate;
    }

    public void setDobdate(LocalDate dobdate) {
        this.dobdate = dobdate;
    }

    private final static int ADULTHOOD = 18;
    LocalDate dobdate;

    Person(String name, int age, double height, int namberOfChildren) {

        this.name = name;
        this.age = age;
        this.height = height;
        this.namberOfChildren = namberOfChildren;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public void Info() {
        System.out.println(name + "--" + age);
        System.out.println(name + "---" + namberOfChildren);
        System.out.println(name + "----" + dobdate);
    }

    public int experince() {

        int experinc = age - ADULTHOOD;
        return experinc;
    }

    public void saiute() {
        System.out.println(name + "--" + " Рад приветствовать вас жители планеты земля");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNamberOfChildren() {
        return namberOfChildren;
    }

    public void setNamberOfChildren(int namberOfChildren) {
        this.namberOfChildren = namberOfChildren;
    }


    public abstract double calculator();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (Double.compare(height, person.height) != 0) return false;
        if (namberOfChildren != person.namberOfChildren) return false;
        if (Double.compare(minPay, person.minPay) != 0) return false;
        if (Double.compare(maxPay, person.maxPay) != 0) return false;
        if (Double.compare(ADDITIONL, person.ADDITIONL) != 0) return false;
        if (!name.equals(person.name)) return false;
        return dobdate.equals(person.dobdate);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + age;
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + namberOfChildren;
        temp = Double.doubleToLongBits(minPay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(maxPay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(ADDITIONL);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + dobdate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}




