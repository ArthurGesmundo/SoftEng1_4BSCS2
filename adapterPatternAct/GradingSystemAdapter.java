package adapterPatternAct
//adapter
public class GradingSystemAdapter implements SchoolManagementApp{
    private GradingSystem gradingSystem;

    public GradingSystemAdapter(GradingSystem gradingSystem){
        this.gradingSystem = gradingSystem;
    }

    @Override
    public String integrateSystem(){
        return gradingSystem.recordGrades();
    }

}