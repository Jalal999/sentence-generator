
import java.util.*;

/**
 * 
 */
public class OSG extends Observer {
	private subject vocabulary;
    public ArrayList<String> vocabOSG;
    /**
     * Default constructor
     */
    public OSG(subject subject) {
    	this.vocabulary = subject;
		vocabulary.registerObserver(this);
		vocabOSG = new ArrayList<String>();
    	strategy = new OSGStrategy(vocabOSG);
    }

    /**
     * 
     */


    /**
     * 
     */
    public void updateVocab(String word) {
    	word = word.toUpperCase();
    	char[] wordChar = word.toCharArray();
    	int f = 0;
		int l = word.length()-1;
		while(f<l) {
			char tmp = wordChar[f];
			wordChar[f] = wordChar[l];
			wordChar[l] = tmp;
			
			f++;
			l--;
			
			
		}
		String wordNew = String.valueOf(wordChar);
    	vocabOSG.add(wordNew);
    }



}