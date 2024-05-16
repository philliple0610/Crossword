import java.util.ArrayList;

public class Word {

    private String wordName;

    private String wordDescription;
    
    private int xPos;
    
	private int yPos;
	
	private boolean isVertical;

    private ArrayList<String> wordList = new ArrayList<String>();
    private ArrayList<String> descriptionList = new ArrayList<String>();
    private ArrayList<String> fullList = new ArrayList<String>();
    
    private ArrayList<Word> wordBank = new ArrayList<Word>();


    public Word(String w, int xP, int yP, boolean isVert) {
		wordName = w;
		xPos = xP;
		yPos = yP;
		isVertical = isVert;
	}

	public Word() {
		// TODO Auto-generated constructor stub
	}
	
	/**
     * Returns x position of word
     * @return xPos
     */
	public int getXPos() {
		return xPos;
	}
	
	/**
     * Returns y position of word
     * @return yPos
     */
	public int getYPos() {
		return yPos;
	}
	
	 /**
     * Returns whether or not the word entered is vertical
     * @return xPos
     */
	public boolean getIsVert() {
		return isVertical;
	}
    
    /**
     * Returns word name
     * @return
     */
    public String getWordName() {
    	return wordName;
    }

    /**
     * Sets the name of the word
     * @param name
     */
    public void setName(String name) {
    	this.wordName = name;
    }

    /**
     * Returns word description
     * @return
     */
    public String getWordDescription() {
    	return wordDescription;
    }

    /**
     * Sets word description
     * @param description
     */
    public void setDescription(String description) {
    	this.wordDescription = description;
    }

    /**
    * adds a word to the word bank
    * @param word
    */
    public void addToWordBank (Word word) {
        wordBank.add(word);
    }
    
    /**
     * adds a word to the word list
     * @param word
     */
    public void addToWordList (String word) {
        wordList.add(word);
    }
    
    /**
     * adds a description to the description list
     * @param description
     */
    public void addToDescriptionList (String description) {
        descriptionList.add(description);
    }
    
    /**
     * adds a full word to the full word list
     * @param description
     */
    public void addToFullList(String word, String description) {
        String s = "";
        s+= word + ":" + description;
        fullList.add(s);
    }

    /**
     *
     * @return
     */
    public String getWordBankToString() {
        String a = "[";
        for (Word w : wordBank ) {
            a+= w.getWordName() + ":" + w.getWordDescription() + ", ";
        }
        return (a.substring(0,a.length()-2) + "]");

    }
    public ArrayList<String> getWordList() {
        return wordList;
    }
    public ArrayList<String> getDescriptionList() {
        return descriptionList;
    }
    public ArrayList<String> getFullList() {
        return fullList;
    }
    public ArrayList<Word> getWordBankList(){
    	return wordBank;
    }

}