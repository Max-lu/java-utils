package cn.maxlu.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtils {
    public static byte[] readFileToByteArray(File file) throws IOException {
        if (file == null) {
            return null;
        }
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        return bytes;
    }

    public static void writeByteArrayToFile(File file, byte[] bytes, boolean create) throws IOException {
        if (file == null || bytes == null) {
            return;
        }
        if (!file.exists()) {
            if (create) {
                createFile(file, false);
            } else {
                throw new FileNotFoundException(file.getAbsolutePath());
            }
        }
        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write(bytes);
        outputStream.flush();
    }

    public static void createFile(File file, boolean override) throws IOException {
        if (file == null) {
            return;
        }
        if (file.exists()) {
            if (override) {
                file.delete();
            } else {
                return;
            }
        }

        File parentFile = file.getParentFile();
        if (!parentFile.exists() && parentFile.isDirectory()) {
            parentFile.mkdirs();
        }

        file.createNewFile();
    }
}
