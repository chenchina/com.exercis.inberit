package inberit;

/**
 * Created by lei.chen on 3/24/2015.
 */
public class Sales extends Employee {
    private double task;
    public Sales(){};
    public Sales(String name,double salary,double task){
        super(name,salary);
        this.task = task;
    }
    public double getTask(){
        return task;
    }
    public void setTask(double task){
        this.task = task;
    }
}
