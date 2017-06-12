
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;


public class LoadDictionary {
	//контроллер для загрузки словаря данными
	//на входе путь к словарю
	//определяет что это папка с словарями | пустая папка |фаил словаря|
	//1-й вариант - бежит по словарям и считывает их
	//2-й ошибка
	//3-й считывает файл
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
	
	
	
	public static void loadDictionary(String workspace)  throws FileNotFoundException {	
		path = Paths.get(workspace);
		if(exists(path)){		
		//Это итератор, используется для перебора файлов в папке
			fileSequence = LoadDictionary.path.iterator();
		
	    		while(fileSequence.hasNext()){
	    	//массив словарей
	    			System.out.println(fileSequence.toString());
	    			Dictionary.setDictionary(Read.readElement(fileSequence.next()));
	        
	    			//System.out.println(fileSequence.toString());
	    		}
		}
	}
	
	
}


    
    /*
    
    static String read(){
    	BufferedReader br;
    	         String name="";
    	         File f;
    	         
    	         br=new BufferedReader(new InputStreamReader(System.in));
    	         try{
    	             name=String.valueOf(br.readLine());
    	         }catch(Exception e){Write.write(e);}
    	         System.out.println(name);
    	         if(name.isEmpty()){
    	            f=new File("Р’РІРѕРґ.txt");
    	         }else{
    	            f=new File(name);
    	         }

    	    try{
    	        br=new BufferedReader(new FileReader(f));
    	        String g;
    	        while((g=br.readLine()) !=null ) { l+=g+"\n" ; }
    	        if(l.isEmpty())Write.write("\n РќР°РїРёС€РёС‚Рµ РїСЂРѕРіСЂР°РјРјСѓ "/*+g);
    	    }catch(IOException e){Write.write(e);}
    	return l;

    	}
    	}
    	*/
