package interfacedemo;

//Our Employee

public class Worker implements IWorkeable, IEatable, IPayable {

    private IWorkeable workable;

    public void Worker(IWorkeable workable) {
        this.workable = workable;
    }

    @Override
    public void work() {
        System.out.println("9.00-10.00");
    }

    @Override
    public void eat() {
    }

    @Override
    public void pay() {
    }

}
