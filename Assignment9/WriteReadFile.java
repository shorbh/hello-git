import java.io.*;
public class WriteReadFile{
    public static void main(String args[]){
        File f = new File("C:/Users/Rajender kumar/Desktop/j/def.txt");
        try{
            FileOutputStream fout = new FileOutputStream(f);
            String s = "C:/Users/Test/video.mp4\nC:/Users/Test/hi.txt\nC:/Users/desktop/project.java";
            char ch[] = s.toCharArray();
            for(int i = 0;i<s.length();i++){
                fout.write(ch[i]);
            }
            fout.close();
            FileInputStream fin = new FileInputStream(f);
            int i = fin.read();
            while(i!=-1){
                System.out.print((char)i);
                i = fin.read();
            }
            fin.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}