package Abstraction;
// TODO: 20.01.2023

public class Foo {
    public Integer value;

    protected static Integer count;

    public static Integer getCount(){
        return count;
    }


    static {
        count = 99999;
    }

    public Foo(){
        //count++;
    }

    public void printCount(){
        System.out.println(count);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}




