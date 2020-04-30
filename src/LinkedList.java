public class LinkedList{
	private Node head;
	private Node tail; // use this if you decide to implement 
					   // the doubly linked list. 
	private int size = 0;
	LinkedList(){
		head = null;
		tail = null;
	}
	public boolean checkIfWordExist(String word){
		boolean result = false;
		Node current = head;
		while (current != null){
			// set result to be true if word already exist in linked list.
			 
		}
		return result;
	}
	public void updateNode(String word){
		Node current = head;
		while (current != null){
			// update the word frequency
			
		}
	}
	public int frequency(String word){
		int result = 0;
		// here add the necessary logic to get the frequency of the word
		return result;
	}
	public void addNode(String word, int frequency){
		if (size < 1){
			/* add necessary logic to create the first node in the linked list */
			
		}
		else{
			if (checkIfWordExist(word)){
				updateNode(word);
			}
			else{
				/* add necessary logic to create a new node in the linked list */
			}

		}
	}
	public void printAllNodes(){
		Node current = head;
		int format_count = 0;
		while (current != null){
			/* add necessary logic to print the word and its frequency in the linked list */
		}
	}
	public int getSize(){
		return size;
	}
}