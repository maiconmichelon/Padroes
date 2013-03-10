package decorator2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream{

	public LowerCaseInputStream(InputStream in){
		super(in);
	}
	
	public int read(){
		try {
			int c = super.read();
			return c == -1 ? c: Character.toLowerCase(c);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public int read(byte[] b, int offset, int len) throws IOException{
		int result = super.read(b, offset, len);
		for(int i = offset; i < offset + result; i++)
			b[i] = (byte) Character.toLowerCase((char) b[i]);
		
		return result;
	}
	
	public static void main(String[] args) {
		int c;
		try{
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("text.txt")));
			while ((c = in.read()) >= 0 ){
				System.out.println(c);
			}
			
			in.close();
		}catch(Exception ex){
			
		}
	}
	
}
