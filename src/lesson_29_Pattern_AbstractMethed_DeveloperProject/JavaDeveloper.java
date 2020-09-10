package lesson_29_Pattern_AbstractMethed_DeveloperProject;

public class JavaDeveloper implements Develop {


    @Override
    public void analisyTask() {
        System.out.println("Java Developer analisan task");
    }

    @Override
    public void codeTask() {
        System.out.println("Java Developer coding task");
    }

    @Override
    public void testTask() {
        System.out.println("Java Developer testing task");
    }

    @Override
    public void refectTask() {
        System.out.println("Java Developer refectoring task");
    }
}
