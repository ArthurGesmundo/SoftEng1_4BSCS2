package adapterPatternAct
//client
public class ClientApp {

    public static void main(String[] args){

        AttendanceSystem attendanceSystem = new AttendanceSystem();
        SchoolManagementApp integrateSystem = new AttendanceSystemAdapter(attendanceSystem);

        GradingSystem gradingSystem = new GradingSystem();
        SchoolManagementApp integrateSystem = new GradingSystemAdapter(gradingSystem);

        LibrarySystem librarySystem = new LibrarySystem();
        SchoolManagementApp integrateSystem = new LibrarySystemAdapter(librarySystem);

        //activate integratesystem
    }
}