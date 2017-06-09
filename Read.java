
import java.io.*;
import java.nio.file.Path;


public class Read{
	//один единственный медот чтения файла и выдача стринга
	//сам должен обрабатывать свои ошибки и отправлять сообщение через стандвртный метод обработки ошибок выше.
	
	
	private static StringBuilder sb;
	

	public static String readElement (Path workspace) throws FileNotFoundException { //+fileErrorException
				
		//Этот спец. объект для построения строки    
		sb = new StringBuilder();
        	
        	//Объект для чтения файла в буфер
        	try (BufferedReader in = new BufferedReader(new FileReader(workspace.toFile()));) 
        	{
        		        		
        		//В цикле построчно считываем файл и строки помещаем в динамический стринг
        		String s;
        		while ((s = in.readLine()) != null) {  // без промежуточного объекта "s" не будет ли меньше памяти жрать? например так sb.append(in.readline())!=null
        			sb.append(s);;
        			sb.append("\n");
        			}
        		} catch(IOException e) {
        			throw new RuntimeException(e);
        		 }
        	
        	//Возвращаем полученный стринг преобразованый из динамического стринга      -----какой динамический массив тут?
            return sb.toString();
        	}
        
        }	