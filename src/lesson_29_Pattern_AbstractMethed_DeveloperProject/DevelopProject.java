package lesson_29_Pattern_AbstractMethed_DeveloperProject;

public abstract class DevelopProject {

    public abstract Develop hireDeveloper();

    public void startWork() {
        Develop developer = hireDeveloper();
        developer.analisyTask();
        developer.codeTask();
        developer.refectTask();
        developer.testTask();
    }
}
