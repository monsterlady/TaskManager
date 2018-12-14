public class APl {
    public static void main(String [] args){

        new APl().run();
    }

    public static void run() {
        Feature nw1 = new Feature();
        Folder a1 = new Folder("A1");
        Project a2 = new Project("A2", "test", true);
        Project b1 = new Project("B2", "test", true);
        Task a3 = new Task("A3", false, 2018, 12, 14, 2018, 12, 15, "Test3");
        Task a4 = new Task("A4", false, 2018, 12, 15, 2018, 12, 16, "Test4");
        Task b3 = new Task("B3", false, 1999, 12, 14, 1999, 12, 15, "Test3");
        Task b4 = new Task("B4", false, 1999, 12, 15, 1999, 12, 16, "Test4");
        a1.addProject(a2);
        a2.addTask(a3);
        a2.addTask(a4);
        a1.addProject(b1);
        b1.addTask(b3);
        b1.addTask(b4);






       /**今天可以显示的task*/
        System.out.println(nw1.ListofValidTasktoady(a1));
        /**打开b1文件*/
        // System.out.println(nw1.openProjects(b1,b2));

        /**打开文件夹*/
        //System.out.println(nw1.openFolder(a1));

        /**列出所有project和tasks*/
        //System.out.println(nw1.allfiles(a1));
    }
}
