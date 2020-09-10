package lesson_22;

import java.io.IOException;

public class RunnerReplace {
    public static void main(String[] args) throws IOException {
        IRead rd1 = new ReaderFile();
        IWrite wr = new WriteFile();
        Replacer rp = new Replacer(rd1, wr);
        rp.findAndReplace();
    }
}
