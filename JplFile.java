import java.util.*;
import java.io.*;

public class JplFile {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("test.txt");
        DataOutputStream data = new DataOutputStream(file);
        for(int i=1;i<=5;i++){
            data.writeBytes("CSK 14 11 03 00\n" +
                    "MI0 14 10 04 00\n" +
                    "RCB 14 09 05 00\n" +
                    "DC0 14 07 07 00\n" +
                    "KKR 14 07 07 00\n" +
                    "PK0 14 06 08 00\n" +
                    "RR0 14 05 09 00\n" +
                    "SH0 14 03 11 00\n");
        }
    }
}
