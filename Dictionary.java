
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dictionary {
	private static List<List<String>> arraysDictionary;
	private static List<String> elementArray;
	private static int index, indexOfDictionary;
	private static String line;
	private static String sizeOfDict;
	//�������� ��� ������� � �������� �� ����� �� ���������� ������� �� �������, 
	//���� � ������� ��� ������� ������� - ������ ������� ��� ���� ����� ��� ������������� ��������,
	//���� ����� ���, ��������� ��������� �� ������ - ��� ����� ��� ������������� ��������
	//����� ������ ���� ��������� ����, ����� ����� ��� ���� ������, ���� �� ����������� 
	
	/*Dictionary(){
		
	}
	*/
	Dictionary(){
		arraysDictionary = new ArrayList<List<String>>();		
		index = 0;
		//������� �������� �� ���� ����� �������� �� ����� � ������ ��� � ������ ������� �������� �� ������ ---?????
		//������� �������� �� ���� ����, �������� loadDictionary, ������ ��� ����, ��(loadDictionary) � ���� ������� �������� 
		//read �� ���������� � �������� �������
				
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
	
	//�� ���� ������ ������ �����, ������ ������� �������
	//public static String getLineOfDictionary(int indexOfDictionary, int indexOfLine){
	public static String getLineOfDictionary(int indexOfLine){
		line = arraysDictionary.get(indexOfDictionary).get(indexOfLine);
		return line;
	}
	
	//��� ���� ���?
	private static int getSizeOfDictionary(){
		int sizeOfDict = arraysDictionary.size();
		return sizeOfDict;
	}
	
	
	//��� ���� ���?
	private static int getSizeOfElement(int indexOfElement){
		int sizeOfElement = arraysDictionary.get(indexOfElement).size();
		return sizeOfElement;
	}
	
	//arraysDictionary = new ArrayList<List<String>>();

}
