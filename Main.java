import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		vocabulary voc = new vocabulary();
		
		RSG rsg = new RSG(voc);
		SSG ssg = new SSG(voc);
		OSG osg = new OSG(voc);
		
		
		System.out.println("Enter words in vocabulary:");
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String newWord = sc.nextLine();
			voc.setNewWord(newWord);
			rsg.sentence();
			ssg.sentence();
			osg.sentence();
			if (newWord.equals("")) break;
		}
		
			
		
	
	}

}
