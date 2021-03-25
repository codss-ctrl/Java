package g_exception;

public class Exception_06 {
	public static void main(String[] args) {
		
		try {
			startInstall();
			copyFile();
			deleteFile();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			deleteFile();
		}
		
		
	}
	
	static void startInstall(){
		
	}

	static void startFiles(){
		
	}
	
	static void copyFile(){
		
	}
	
	static void deleteFile(){
		
	}

}





