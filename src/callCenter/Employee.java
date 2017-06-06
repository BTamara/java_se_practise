package callCenter;

/**
 * Created by btamara on 2017.06.02..
 */
public abstract class Employee {

    enum Rank{
            RESPONDENT,
            MANAGER,
            DIRECTOR
    }

    Rank rank;

    public Employee(Rank rank) {
        this.rank = rank;
    }

    public boolean isFree() {
        return false;
    }

    public boolean handleCall(Call c) {
        return false;
    }
}
