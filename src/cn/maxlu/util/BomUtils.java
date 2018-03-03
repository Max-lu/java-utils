package cn.maxlu.util;

import java.io.File;
import java.io.IOException;

/**
 * remove bom from file
 */
public class BomUtils {
    public static void removeBom(File file) throws IOException {
        byte[] bs = FileUtils.readFileToByteArray(file);
        if (bs[0] == -17 && bs[1] == -69 && bs[2] == -65) {
            byte[] nbs = new byte[bs.length - 3];
            System.arraycopy(bs, 3, nbs, 0, nbs.length);
            FileUtils.writeByteArrayToFile(file, nbs, false);
        }
    }
}
