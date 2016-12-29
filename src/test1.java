import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class test1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("files/output.txt");
			FileInputStream input=new FileInputStream(f);
			byte b[]=new byte[(int) f.length()];
			input.read(b);
			String str=new String(b);
			str.getBytes("gbk");
			Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("files//a.txt"), "gbk"));
			out.write(str);
		//FileOutputStream out=new FileOutputStream("files//a.txt");
		//out.write(str);
		//System.out.print(System.getProperty("file.encoding"));
		System.out.print(str);
		
		
		

	}

}
