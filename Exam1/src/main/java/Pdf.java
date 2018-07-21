import java.io.*;
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
    public static void File(File infile,File outfile) throws IOException {
        if (infile.exists()){
            try{
                System.out.println("在读取文件"+infile);
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(infile),"GBK"));
                String info = null;
                StringBuffer sb = new StringBuffer();
                while((info = reader.readLine())!=null){
                    sb.append(info+"\r\n");
                }
                PrintWriter pw = new PrintWriter(outfile);
                pw.write(sb.toString());
                pw.flush();
                pw.close();
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }
        }else{
            System.out.println("路径不存在");
        }
    }
}