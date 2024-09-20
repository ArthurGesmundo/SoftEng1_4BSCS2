package adapterPatternAct;
//adapter
public class LibrarySystemAdapter implements SchoolManagementApp{
    private LibrarySystem librarySystem;

    public LibrarySystemAdapter(LibrarySystem librarySystem){
        this.librarySystem = librarySystem;
    }

    @Override
    public String integrateSystem(){
        return librarySystem.manageBooks();
    }
}