
import java.util.*;

/**
 * 
 */
public class SSG extends Observer {
	private subject vocabulary;

    /**
     * Default constructor
     */
    public SSG(subject subject) {
    	this.vocabulary = subject;
		vocabulary.registerObserver(this);
		vocabSSG = new ArrayList<String>();
    	strategy = new SSGStrategt(vocabSSG);
    }

    /**
     * 
     */
    public ArrayList<String> vocabSSG;

    /**
     * 
     */

	@Override
	public void updateVocab(String word) {
		word = word.toLowerCase();
		vocabSSG.add(word);
		
	}

}