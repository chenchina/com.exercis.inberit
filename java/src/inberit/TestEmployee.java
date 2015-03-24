package inberit;

/**
 * Created by lei.chen on 3/24/2015.
 */
public class TestEmployee {

    public static void main (String[] args) {

        Sales sale = new Sales("chen yu", 5000, 100000);

        System.out.println("Sale.name="+sale.getName()+
            " Sale.salary="+sale.getSalary()+
            " sale.task="+sale.getTask());
        Trainer trainer = new Trainer("liu gang",8000,"java");
        System.out.println("trainer.name=" + trainer.getName() +
                " trainer.salary=" + trainer.getSalary() +
                " trainer.task=" + trainer.getCouse());
}
}

