public class Person {
    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    };

    //getters
    public String getName(){
        return this.name;
    };
    public int getAge(){
        return this.age;
    };
    public double getHeight(){
        return this.height;
    }

    //Override the toString method

    @Override
    public String toString() {
        return "Name:"+getName()+"\nAge:"+getAge()+"\nHeight:"+getHeight();
    }
}
