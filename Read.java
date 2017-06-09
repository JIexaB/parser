
import java.io.*;
import java.nio.file.Path;


public class Read{
	//���� ������������ ����� ������ ����� � ������ �������
	//��� ������ ������������ ���� ������ � ���������� ��������� ����� ����������� ����� ��������� ������ ����.
	
	
	private static StringBuilder sb;
	

	public static String readElement (Path workspace) throws FileNotFoundException { //+fileErrorException
				
		//���� ����. ������ ��� ���������� ������    
		sb = new StringBuilder();
        	
        	//������ ��� ������ ����� � �����
        	try (BufferedReader in = new BufferedReader(new FileReader(workspace.toFile()));) 
        	{
        		        		
        		//� ����� ��������� ��������� ���� � ������ �������� � ������������ ������
        		String s;
        		while ((s = in.readLine()) != null) {  // ��� �������������� ������� "s" �� ����� �� ������ ������ �����? �������� ��� sb.append(in.readline())!=null
        			sb.append(s);;
        			sb.append("\n");
        			}
        		} catch(IOException e) {
        			throw new RuntimeException(e);
        		 }
        	
        	//���������� ���������� ������ �������������� �� ������������� �������      -----����� ������������ ������ ���?
            return sb.toString();
        	}
        
        }	