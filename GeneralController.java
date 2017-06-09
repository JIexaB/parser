import java.nio.file.*;
import java.nio.file.attribute.*;
//import java.nio.file.Paths;
//import java.util.Iterator;
import static java.nio.file.FileVisitResult.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import static java.nio.file.FileVisitOption.*;
import java.util.*;


public class GeneralController extends SimpleFileVisitor<Path> {
	//��������� ����� ���������� ������� �� �� ������� � �������� �� ����� � ����� � ����� ������
	//��� ���� � �������
	//��������� ���� �������(������ ���� = ��� ����)
	//��� ���� � ������ - �������� �������� �� ���� ---------- ��� ***
	//1:) ���� ���� �������� �� ���� � ������ ��������{ ---- � ��� ���� � ��������� ***
	//���� �����(�������� ���� � ������.�����)
	//������������������(���������.���, �����������.���){
	//��������� �������� ����� �� ������� ������ � ������� �������� �������� ��������
	//������ �����
	//������� � ����� 1: ---- ��� ���?????
	private static Dictionary dictionary;
	private static StringBuilder sb;
	
	
	
	
	GeneralController(){
		
	}
	
	@Override
    public FileVisitResult visitFileFailed(Path path,
                                       IOException exc) {
		System.out.println("file name:" + path.getFileName());
        System.err.println(exc);
        return CONTINUE;
    }
	
		 public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes) throws FileNotFoundException {
			 if(!path.toFile().canRead()){
				 System.out.println(path.toFile().canRead()+"visitFileIsFalse");
				 
				 
			 }
			 			 
			 System.out.println("file name:" + path.getFileName()+"visitFileIsTrue"); 
			 if(!path.toFile().isDirectory()){
				 dictionary.setDictionary(Read.readElement(path));
			 }
		        return FileVisitResult.SKIP_SUBTREE; 
		    } 
		 
		 public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes attrs) 
		 {				 
			 if(!path.endsWith("E:\\Test") & path.toFile().isDirectory() | !path.toFile().canRead()) 
			 {
				 System.out.println(path.toAbsolutePath().toString()+"preVisitDirectoryIf");
				 return  FileVisitResult.SKIP_SUBTREE;
			 }
			 
			 System.out.println(path.toAbsolutePath().toString()+"preVisitDirectory");
	         return FileVisitResult.CONTINUE;
	         }
	    	
		 
		
	public static void main(String[] args) throws IOException, AccessDeniedException {
		// TODO Auto-generated method stub
		
		
		 GeneralController finder = new GeneralController();
		 
		 Path startingDir = Paths.get("E:\\Test");
	     
		 sb = new StringBuilder();
	 
	        dictionary = new Dictionary();
	        Files.walkFileTree(startingDir,finder);
	        int dictionarySize = dictionary.getSizeOfDictionary();
	        for(int i = 0; i < dictionarySize; i++){
	        	int indexOfLine = (int) (Math.random()*dictionary.getSizeOfElement(i));
	        	
	        	sb.append(dictionary.getLineOfDictionary(i, indexOfLine));
	        }
	        System.out.println(sb);

	}

}
