package learn_interface_scaner_input_output_file.first_example;

import java.io.IOException;

public class RunnerReplace {

    public static void main(String[] args) throws IOException {

        IRead rd1 = new ReaderFile();

        IWrite wr = new WriterFile();

        Replacer rp = new Replacer(rd1, wr);

        rp.findAndReplace();
    }
}
