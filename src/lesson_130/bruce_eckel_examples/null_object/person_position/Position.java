package lesson_130.bruce_eckel_examples.null_object.person_position;

public class Position {

    private String title;
    private Person person;

    public Position(String title, Person employee) {
        this.title = title;
        this.person = employee;
        if (person == null) {
            person = Person.NULL;
        }
    }

    public Position(String jobTitle) {
        this.title = jobTitle;
        this.person = Person.NULL;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
        if (person == null) {
            person = Person.NULL;
        }
    }

    @Override
    public String toString() {
        return "Position{" +
                "title='" + title + '\'' +
                ", person=" + person +
                '}';
    }
}
