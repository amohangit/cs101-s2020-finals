import java.util.Scanner;
public class WordCounter{
	private LinkedList link = new LinkedList();
	public void parser(String fileName){
		FileUtility words = new FileUtility(fileName);
		int size = words.size();
		for (int i = 0; i < size; i++){
			String line = words.read();	
			System.out.println(line);
			
			/* Here iterate through the string line and split based 
			on space to get the individual words. 
			Next add the individual words to the linked list. 
			Finally you can comment the print statement above. */

		}
		words.reset();
	}
	public void printWords(){
		link.printAllNodes();
	}
	public void computeFrequency(){
		System.out.println("----------------------------------");
		System.out.println("Enter a word:");
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		int freq = link.frequency(word);
		System.out.println("Frequency of word \""
							+ word + "\" is: " + freq);
		System.out.println("Size of the linked list is:"
							+ link.getSize());
		
	}
	public static void main(String[] args){
		WordCounter obj = new WordCounter();
		obj.parser("../data/words.txt");
		obj.printWords();
		obj.computeFrequency();

		
	}
}