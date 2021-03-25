package learn_nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SecondExample {
    public static void main(String[] args) throws IOException {
        int count;
        try (ByteChannel fChan = Files.newByteChannel(Paths.get("test.txt"))) {
            ByteBuffer mBuf = ByteBuffer.allocate(128);
            do {
                count = fChan.read(mBuf);
                if (count != -1) {
                    mBuf.rewind();
                    for (int i = 0; i < count; i++)
                        System.out.print((char) mBuf.get());
                }
            } while (count != -1);
        } catch (IOException еx) {
            System.out.println();
        }

        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("test.txt"))) {
            long fSize = fileChannel.size();
            MappedByteBuffer mBuf = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
            for (int i = 0; i < fSize; i++)
                System.out.print((char) mBuf.get());
            System.out.println();
        } catch (IOException ex) {
            System.out.println("Exception");
        }

        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test. txt"),
                StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            ByteBuffer mBuf = ByteBuffer.allocate(26);
            for (int i = 0; i < 26; i++)
                mBuf.put((byte) ('А' + i));
            mBuf.rewind();
            fChan.write(mBuf);
        } catch (InvalidPathException е) {
            System.out.println("Ошибка указания пути " + е);
        }
    }
}
