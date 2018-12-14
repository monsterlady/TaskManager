import java.util.ArrayList;

public class Folder {
    private ArrayList<Project> listofProjects;
    private  String nameofFolders;

    public Folder (String nameofFolders){
        this.listofProjects = new ArrayList<Project>();
        this.nameofFolders = nameofFolders;
    }


    public void addProject(Project project){
        listofProjects.add(project);
    }

    public ArrayList<Project> getListofProjects(){
        return listofProjects;
    }
}
