package Helper;

import java.io.FileInputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Properties;

public class PathHelper {
	public static String completepath="";
	public static Properties p = new Properties();
	
	public PathHelper(){
		try {
//			Path currentDirectoryPath = FileSystems.getDefault().getPath("");
//			String currentDirectoryName = currentDirectoryPath.toAbsolutePath().toString();
//			
//			completepath = currentDirectoryName+"\\src\\Resources\\DB.properties";
//			
//			System.out.println("your path is = "+completepath);
			
//			FileInputStream finf = new FileInputStream(completepath);
			
			FileInputStream finf = new FileInputStream("D:\\ProjectsWorkSpace\\Garage_Management\\src\\Resources\\DB.properties");
			
			p.load(finf);
		}
		catch(Exception ex) {
			System.out.println("Error is "+ex);
		}
	}
}
