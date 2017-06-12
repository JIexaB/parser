import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;




public class LoadFishText {

	private static Path path;
	private static Iterator<Path> fileSequence;
	
	
	/*LoadDictionary(){
			
	
	
	//Это итератор, используется для перебора файлов в папке
    fileSequence = LoadDictionary.path.iterator();
	
    	while(fileSequence.hasNext()){
    	//массив строк словаря
        
        
    		System.out.println(fileSequence.toString());
		
    	}
	}*/
	
	private static boolean exists(Path path) throws FileNotFoundException {
		
		if (!path.isAbsolute()){
			throw new FileNotFoundException(path.toString()+" not exist");
			//return false;
		}
		else {
			return true;
		}
	}
	
	
	// будет так public static String loadDictionary(String workspace)  throws FileNotFoundException {
	

}
