package Simple_Example;

public class HR extends Employee {


    public HR(String name, Approver approver, LeaveApprover nextApprover) {
        super(name, approver, nextApprover);
    }


    @Override
    public Boolean processCurrentRequest(Application application) {
        if(application.getType() == Application.Type.PERSONAL) {
            this.approveMessage(application.getType().toString(), this.getApproverType().toString(), true);
            return true;
        }

        this.approveMessage(application.getType().toString(), this.getApproverType().toString(), false);

        return false;
    }
}
