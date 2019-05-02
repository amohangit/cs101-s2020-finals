import java.util.Scanner;
public class Dictionary{
	private LinkedList ll = new LinkedList();
	public void Parser(String fileName){
		FileUtility dict = new FileUtility(fileName);
		int size = dict.size();
		for (int i = 0; i < size; i++){
			String line = dict.read();	
			System.out.println(line);
			
			/* Here iterate through the string line and split based 
			on space to get the individual words. 
			Next add the individual words to the linked list. 
			Finally you can comment the print statement above. */

		}
		dict.reset();
	}
	public void PrintDictionary(){
		ll.printAllNodes();
		
	}
	public void FrequencyFinder(){
		System.out.println("----------------------------------");
		System.out.println("Enter a word:");
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		int freq = ll.frequency(word);
		System.out.println("Frequency of word \""
							+ word + "\" is: " + freq);
		
		System.out.println("Size of the linked list is:"
							+ ll.getSize());

	}
	public static void main(String[] args){
		Dictionary obj = new Dictionary();
		obj.Parser("data/words.txt");
		obj.PrintDictionary();
		obj.FrequencyFinder();

		
	}
}