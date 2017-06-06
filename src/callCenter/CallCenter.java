package callCenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by btamara on 2017.06.02..
 */
public class CallCenter {

    public ArrayList<Respondent> respondents = new ArrayList<>();
    public List<Manager> managers;
    public List<Director> directors;


    public boolean dispatchCall(Call call) {
        for (Employee.Rank rank : Employee.Rank.values()) {
            Employee employee = firstAvailable(rank);
            if (employee != null) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }



    protected Employee firstAvailable(Employee.Rank rank){
        List<Respondent> employees;
        respondents.add(new Respondent());


//        if(rank == Employee.Rank.DIRECTOR){
//            employees = directors;
//        }
//        if(rank == Employee.Rank.MANAGER){
//            employees = managers;
//        }else{
            employees = respondents;
//        }
        for (Employee employee : employees) {
            //if (employee.isFree()) {
                return employee;
            //}
        }
        System.out.println(rank.toString());
        return null;
    }


}
