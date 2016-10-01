package fileInput;
import java.io.*;

public class fileInput {
	
	public String readFile(String s)throws IOException{
		File f=null;
		FileReader fr=null;
		BufferedReader br=null;
		String r=null;	
		try{
			f=new File(s);
			fr=new FileReader(f);
			br=new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				if(r==null){
					r=line;
				}else{
					 r=r+"\n"+line;
				}
			}			
			br.close();			
		}catch(Exception e){
			e.printStackTrace();		
		}
		return r;	
	}
}
