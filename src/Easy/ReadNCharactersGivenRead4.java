package Easy;

/**
 * Created by Tianshan on 10/7/16.
 */
public class ReadNCharactersGivenRead4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return The number of characters read
     */
    public int read(char[] buf, int n) {
        int pos = 0;
        boolean eof = false;
        char[] buff = new char[4];
        while (!eof && pos < n) {
            int count = read4(buff);
            eof = count < 4;
            count = Math.max(count, n - pos);
            for (int i = 0; i < count; i++) {
                buf[pos++] = buff[i];
            }
        }
        return pos;
    }

    // The read4 API is defined in the parent class Reader4.
    private int read4(char[] buff) {
        return 4;
    }
}
