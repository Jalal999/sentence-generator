
import java.util.*;

/**
 * 
 */
public class vocabulary implements subject {
	private ArrayList<Observer> observers;
    /**
     * Default constructor
     */
    public vocabulary() {
    	observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
		observers.add(o);
	}
	
    /**
     * 
     */
    
    private String newWord;

    /**
     * @return
     */
    public String getNewWord() {
        return newWord;
    }

    /**
     * 
     */
    public void setNewWord(String newWord) {
        this.newWord = newWord;
        notifyNewWord();
    }
    
    public void notifyNewWord() {
    	for (Observer observer : observers) {
			observer.updateVocab(newWord);
	}

    /**
     * 
     */
   
    }

}