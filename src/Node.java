public class Node{
	private String word;
	private int frequency;
	private Node next;
	/* constructor */
	Node(){
		next = null;
	}
	/* getters and setters */
	public int getFrequency(){
		return this.frequency;
	}
	public void setFrequency(int frequency){
		this.frequency = frequency;
	}
	public String getWord(){
		return this.word;
	}
	public void setWord(String word){
		this.word = word;
	}
	public Node getNext(){
		return this.next;
	}
	public void setNext(Node next){
		this.next = next;
	}
}