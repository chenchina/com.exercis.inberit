package inberit;

/**
 * Created by lei.chen on 3/24/2015.
 */
public class Trainer extends Employee {
    private String course;
    public Trainer(){};
    public Trainer(String name,double salary,String course){
        super(name,salary);
        this.course = course;
    }
    public String getCouse(){
        return course;
    }
    public void setCourse(String course){
        this.course = course;
    }
}
