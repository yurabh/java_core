package lesson_29_Pattern_AbstractMethed_DeveloperProject;

public class JavaDeveloperHire extends DevelopProject {
    @Override
    public Develop hireDeveloper() {
        return new JavaDeveloper();
    }
}
