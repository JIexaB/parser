import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;


public class FishText {
	private static Path path;
	private static Iterator<Path> fileSequence;
	private static StringBuilder sb;
	private static StringTokenizer st;
	//хеш мап для текста
	//на входе стринг с файла
	//
	//прсит его в хеш мап с нулевым значением забитым шапкой файла
	//и выдаёт хэш мап
	



	
	private static boolean exists(Path path) throws FileNotFoundException {
			
		if (!path.isAbsolute()){
			throw new FileNotFoundException(path.toString()+" not exist");
			//return false;
		}
		else {
			return true;
		}
	}
	
	public static void loadFishText(String workspace)  throws FileNotFoundException {	
		sb = new StringBuilder();
		path = Paths.get(workspace);
		if(exists(path)){		
		//Это итератор, используется для перебора файлов в папке
			fileSequence = path.iterator();
		
	    		while(fileSequence.hasNext()){
	    	//массив строк словаря
	    			System.out.println(fileSequence.toString());
	    			sb.append(Read.readElement(fileSequence.next()));
	        
	    			//System.out.println(fileSequence.toString());
	    		}
		}
	}

	public static void setDictionary (String dictionary) {
		elementArray = new ArrayList<String>();
		
		Scanner stringLineSequence = new Scanner(dictionary);
		
		
		
		while(stringLineSequence.hasNextLine()){
			elementArray.add(stringLineSequence.nextLine());
	    }
		arraysDictionary.add(index, elementArray);
		index++;
		stringLineSequence.close();
				
	}
	
	
	
}
