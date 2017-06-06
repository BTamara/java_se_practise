package callCenter;

/**
 * Created by btamara on 2017.06.02..
 */
public class Main {

    public static void main(String[] args) {
        CallCenter callCenter = new CallCenter();
        Call call = new Call();

        callCenter.firstAvailable(Employee.Rank.RESPONDENT);
        callCenter.dispatchCall(call);
    }
}
