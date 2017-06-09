
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dictionary {
	private static List<List<String>> arraysDictionary;
	private static List<String> elementArray;
	private static int index, indexOfDictionary;
	private static String line;
	private static String sizeOfDict;
	//груз€тс€ все словари и выдаетс€ по слову из случайного словар€ по индексу, 
	//если в словаре нет данного индекса - ищетс€ словарь где есть слово под запрашеваемым индексом,
	//если нигде нет, выводитс€ сообщение об ощибке - нет слова под запрашиваемым индексом
	//здесь должно быть понимание того, какие слова уже были выданы, дабы не повтор€тьс€ 
	
	/*Dictionary(){
		
	}
	*/
	Dictionary(){
		arraysDictionary = new ArrayList<List<String>>();		
		index = 0;
		//словарь получает на вход текст считаный из файла и прасит его в массив словар€ разбива€ на строки ---?????
		//словарь получает на вход путь, вызывает loadDictionary, отдает ему путь, он(loadDictionary) в свою очередь вызывает 
		//read по итераттору и забивает словарь
				
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
	
	//на вход только индекс линии, индекс словар€ местный
	//public static String getLineOfDictionary(int indexOfDictionary, int indexOfLine){
	public static String getLineOfDictionary(int indexOfLine){
		line = arraysDictionary.get(indexOfDictionary).get(indexOfLine);
		return line;
	}
	
	//ƒл€ чего это?
	private static int getSizeOfDictionary(){
		int sizeOfDict = arraysDictionary.size();
		return sizeOfDict;
	}
	
	
	//ƒл€ чего это?
	private static int getSizeOfElement(int indexOfElement){
		int sizeOfElement = arraysDictionary.get(indexOfElement).size();
		return sizeOfElement;
	}
	
	//arraysDictionary = new ArrayList<List<String>>();

}
