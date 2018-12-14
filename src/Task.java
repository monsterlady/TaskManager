import java.nio.file.LinkOption;
import java.time.LocalDate;
import java.time.LocalTime;

public class Task {
    private final LocalDate DeferUnitl,Due;
    private String Titleoftask;
    private String NoteofTask;
    private boolean StatusofTask;


    public Task(String Titleoftask, boolean StatusofTask,int year,int months,int days,int dueyear,int duemonths,int duedays, String noteofTask){
        this.DeferUnitl = LocalDate.of(year,months,days);
        this.Titleoftask = Titleoftask;
        this.StatusofTask = StatusofTask;
        this.Due = LocalDate.of(dueyear,duemonths,duedays);
        this.NoteofTask = noteofTask;
    }

    public String getTitleoftask(){
        return Titleoftask;
    }

    public void setTitleoftask(String str){
        this.Titleoftask = str;
    }

    public String getNoteofTask(){
        return NoteofTask;
    }

    public void setNoteofTask(String str){
        this.NoteofTask = str;
    }

    public boolean getStatusofTask(){
        return StatusofTask;
    }

    public void setStatusofTask(boolean b){
        this.StatusofTask = b;
    }

    public LocalDate getDeferUntil(){
        return this.DeferUnitl;
    }


    public LocalDate getDue(){
        return  Due;
    }


    public String toString(){
        String status;
        if(StatusofTask){
            status = "Finished";
        } else {
            status = "Unfinished";
        }
        return "Task Title: " + this.Titleoftask + "\n" + "status: "+ status + "\n" + "Note: "+this.NoteofTask + "\n" + "Deter Date: " + DeferUnitl + "\n" + "Due: " + Due;
    }


}
