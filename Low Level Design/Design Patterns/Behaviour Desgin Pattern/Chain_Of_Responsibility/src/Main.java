import Simple_Example.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee leaveApprover = createLeaveApprover();
        Application application = new Application.Builder()
                .type(Application.Type.OTHER)
                .from(LocalDate.now())
                .to(LocalDate.now().plusDays(5))
                .build();

        leaveApprover.processRequest(application);
    }

    public static Employee createLeaveApprover() {

        Employee director = new Director("Director", Employee.Approver.DIRECTOR, null);
        Employee hr = new HR("HR", Employee.Approver.HR, director);
        Employee teamLead = new TeamLead("Team Lead", Employee.Approver.LEAD, hr);
        return teamLead;

    }
}