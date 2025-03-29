package Simple_Example;

public class Director extends Employee{

    public Director(String name, Approver approver, LeaveApprover nextApprover) {
        super(name, approver, nextApprover);
    }
    @Override
    public Boolean processCurrentRequest(Application application) {
            this.approveMessage(application.getType().toString(), this.getApproverType().toString(), true);
            return true;
    }
}
