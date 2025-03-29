package Simple_Example;

public abstract class Employee implements LeaveApprover{

    public enum Approver {LEAD, SUPERVISOR, HR, MANAGER, DIRECTOR};
    private String name;
    private Approver approver;
    private LeaveApprover nextApprover;

    public Employee(String name, Approver approver, LeaveApprover nextApprover) {
        this.name = name;
        this.approver = approver;
        this.nextApprover = nextApprover;
    }


    @Override
    public void processRequest(Application application) {
        if(!processCurrentRequest(application) && nextApprover != null) {
            nextApprover.processRequest(application);
        }
    }


    public abstract Boolean processCurrentRequest(Application application);

    public void approveMessage(String applicationType, String approverType, Boolean approved) {
        if(approved) {
            System.out.println("Application type: " + applicationType + " has been approved by " + approverType);
        }else{
            System.out.println("Application type: " + applicationType + " has been forwarded by " + approverType);
        }
    };


    @Override
    public LeaveApprover getApprover() {
        return this;
    }

    public Approver getApproverType() {
        return this.approver;
    }
}
