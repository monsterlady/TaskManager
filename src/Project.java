import java.util.ArrayList;

public class Project {
    private ArrayList<Task> listoftasks;
    private String TitleofProject;
    private String NoteofProject;


    public Project(String TitleofProject,String NoteofProject,boolean statusofProject){
        this.listoftasks = new ArrayList<Task>();
        this.TitleofProject = TitleofProject;
        this.NoteofProject = NoteofProject;
    }

    public String getTitleofProject(){
        return  TitleofProject;
    }

    public void setTitleofProject(String str){
        this.TitleofProject = str;
    }

    public String getNoteofProject(){
        return NoteofProject;
    }

    public void setNoteofProject(String str){
        this.NoteofProject = str;
    }

    public void addTask(Task task){
        listoftasks.add(task);
    }

    public ArrayList<Task> getListoftasks(){
        return listoftasks;
    }

    public String toString(){
        return "Project Title: " + TitleofProject + "\n" + "Note: " + NoteofProject;
    }


}
