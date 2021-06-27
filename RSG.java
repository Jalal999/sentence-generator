
import java.util.*;

/**
 * 
 */
public class RSG extends Observer {
	private subject vocabulary;
	public ArrayList<String> vocabRSG;

    /**
     * Default constructor
     */
    public RSG(subject subject) {
    	this.vocabulary = subject;
		vocabulary.registerObserver(this);
		vocabRSG = new ArrayList<String>();
    	strategy = new RSGStrategy(vocabRSG);
    }

    /**
     * 
     */

    /**
     * 
     */
    public void updateVocab(String word) {
        word = word.toLowerCase();
        vocabRSG.add(word);
    }


}