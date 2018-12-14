import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

public class Feature {

    public boolean ShowValidTasktoday(Task task) {
        if (task.getDeferUntil().isAfter(LocalDate.now()) || task.getDeferUntil() == null) {
            return false;
        } else {
            return true;
        }
    }

    public String  ListofValidTasktoady(Folder folder) {
        String result = "";
        for (Project eachproject : folder.getListofProjects()) {
            for (Task each : eachproject.getListoftasks()) {
                if (ShowValidTasktoday(each)) {
                    result += each + "\n";
                }
            }
        }
        return result;
    }

    public boolean Taskduesoon(Task task) {
        Duration duration = Duration.between(task.getDeferUntil(), LocalDate.now());
        long time = duration.toDays();
        if (time < 48) {
            return true;
        } else {
            return false;
        }
    }

    public String openProjects(Folder f, Project p) {

        for (Project each : f.getListofProjects()) {
            if (each.equals(p)) {
                String result = "";
                for (Task eachtask : p.getListoftasks()) {
                    result += eachtask.toString() + "\n";
                }
                return result;
            }
        }
        return "No result";
    }

    public String openFolder(Folder f) {
        String result = "";
        for (Project each : f.getListofProjects()) {
            result += each;
        }
        return result;
    }

    public String allfiles(Folder folder) {
        String result = "";
        result += gettitlesofprojects(folder);
        result += "-----------------------------------------" + "\n";
        result += gettitlesoftaks(folder);

        return result;
    }

    private String gettitlesofprojects(Folder folder) {
        String result = "";
        for (int i =0;i<folder.getListofProjects().size();i++) {
            result += folder.getListofProjects().get(i) + "\n";
        }
        return result;
    }

    private String gettitlesoftaks(Folder folder) {
        String result = "";
        for (Project each : folder.getListofProjects()) {
            for(Task eachtask : each.getListoftasks()){
                result += eachtask + "\n";
            }
        }
        return result;
    }
}
