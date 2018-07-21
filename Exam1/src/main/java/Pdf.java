import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.net.URL;

public class Pdf {

    public static void main(String[] args) throws URISyntaxException, IOException {
        URL http;
        URL url = new URL("http://192.168.11.205:18080/trainning/SampleChapter1.pdf");
        File infile = new File(url.toURI());
        String fpath = Reader.class.getResource("/").getPath().toString();
        String path = fpath.substring(0,fpath.indexOf("bin"));
        File outfile = new File(path +"tmp:/");
        new File(infile, String.valueOf(outfile));
    }
}
