package DocumentFilesConverter;
import com.aspose.words.*;
public class Converter
{

	public static void main(String args[])
	{
		try {
		
			Document document = new Document("C:\\Users\\dell\\Desktop\\Java Tutorials.docx");
			document.save("C:\\Users\\dell\\Desktop\\Java Tutorials.pdf");
			System.out.println("Document Converted");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}