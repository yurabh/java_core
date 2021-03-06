package learn_interface_scaner_input_output_file.first_example;

import java.io.IOException;

public class Replacer {

    private IRead reader;
    private IWrite writer;

    public Replacer(IRead reader, IWrite writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void findAndReplace() throws IOException {
        String readLine = reader.readInformation();
        String repLine = readLine.replace("w", "X");
        writer.writeInformation(repLine);
    }
}
