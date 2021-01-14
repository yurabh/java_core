package learn_inner_class.learn_inner_class_with_private_interface;

public class CaseOfThePrivateInterface {

    private interface Secret {
        public void shh();
    }

    class DonTell implements Secret {

        @Override
        public void shh() {
            System.out.println("hello hi are you");
        }
    }

    public static void main(String[] args) {
        CaseOfThePrivateInterface c = new CaseOfThePrivateInterface();

        CaseOfThePrivateInterface.Secret a = c.new DonTell();

        a.shh();
    }
}
