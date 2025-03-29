package Simple_Example;

public class TeamLead extends Employee{


    public TeamLead(String name, Approver approver, LeaveApprover nextApprover) {
        super(name, approver, nextApprover);
    }

    @Override
    public Boolean processCurrentRequest(Application application) {
        if(application.getType() == Application.Type.UNPAID || application.getType() == Application.Type.SICK) {
            this.approveMessage(application.getType().toString(), this.getApproverType().toString(), true);
            return true;
        }

        this.approveMessage(application.getType().toString(), this.getApproverType().toString(), false);
        return false;
    }
}
