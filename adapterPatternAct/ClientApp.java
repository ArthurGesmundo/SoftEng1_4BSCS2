package adapterPatternAct;
//client
public class ClientApp {

    public static void main(String[] args){

        AttendanceSystem attendanceSystem = new AttendanceSystem();
        SchoolManagementApp SMAAS = new AttendanceSystemAdapter(attendanceSystem);

        GradingSystem gradingSystem = new GradingSystem();
        SchoolManagementApp SMAGS = new GradingSystemAdapter(gradingSystem);

        LibrarySystem librarySystem = new LibrarySystem();
        SchoolManagementApp SMALS = new LibrarySystemAdapter(librarySystem);

        //activate integratesystem
        System.out.println(SMAAS.integrateSystem());
        System.out.println(SMAGS.integrateSystem());
        System.out.println(SMALS.integrateSystem());

    }
}