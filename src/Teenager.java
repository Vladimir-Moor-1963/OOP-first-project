public class Teenager extends  Person implements GoToWork{

    @Override
    public double calculator() {
        return 0;
    }

    public Teenager(String name, int age) {
        super(name, age);
    }

    public Teenager() {
    }

    @Override
    public void work() {

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }



}

