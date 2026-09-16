/*******************************
 * Name: Your name
 * Class: ICS3U
 * Date:Friday Sept 18
 * Project Name: MadLibs
 * 
 * Project Description
 * You will read in multiple entries from the user and store the results in variables
 * You will then insert those variables into the following story to create a MadLib style result
 * 
 * A recent survey informs us that one out of every PLURALNOUN1 owns a/an ADJECTIVE1 phone. 
 * Fortunately, VERB_ING_1 over a mobile NOUN1 in recent years has improved ADVERB1. 
 * Today, BODY_PART1-held PLURALNOUN2 are all the rage. 
 * In restaurants, you find many PLURALNOUN3 talking ADVERB2 into their ADJECTIVE2 phones as they eat their NOUN2. 
 * NUMBER1 percent of American PLURALNOUN4 place their NOUN3 calls from their cars as they are VERB_ING_2 to and from their home, office, or NOUN4. 
 * Walking and talking are now the “in” NOUN5 to do. 
 * Over NUMBER2 percent of Americans walk our ADJECTIVE3 streets with a handheld PLURALNOUN5 pressed against their BODYPART2.
 * 
 * Ask for the capitalized words in the input. Print out the full story in the output.
 * See https://www.thewordfinder.com/wordlibs/story/41/ for an example.
 ********************************/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// YOUR CODE GOES HERE!!!!
		//This is mine
		System.out.println("give me a plural noun");
		String PLURALNOUN1 = in.nextLine();
		System.out.println("give me a adjective ");
		String ADJECTIVE1 = in.nextLine();
		System.out.println("A recent survey informs us that one out of every three "+ PLURALNOUN1 + " owns a " + ADJECTIVE1 + " phone."); 

		System.out.println("give me a ing verb");
		String VERB_ING_1 = in.nextLine();
		System.out.println("give me a noun");
		String NOUN1 = in.nextLine();
		System.out.println("give me a adverb");
		String ADVERB1 = in.nextLine();
		System.out.println("Fortunately," + VERB_ING_1 + " over a mobile "+NOUN1+ " in recent years has improved "+ ADVERB1+".");

		System.out.println("give me a body part");
		String BODY_PART1 = in.nextLine();
		System.out.println("give me another plural noun");
		String PLURALNOUN2 = in.nextLine();
		System.out.println("Today, " +BODY_PART1+" -held " +PLURALNOUN2+ " are all the rage. ");

		System.out.println("give me another plural noun");
		String PLURALNOUN3 = in.nextLine();
		System.out.println("give me another adverb");
		String ADVERB2 = in.nextLine();
		System.out.println("give me another adjective");
		String ADJECTIVE2 = in.nextLine();
		System.out.println("give me another noun");
		String NOUN2 =in.nextLine();
		System.out.println("In restaurants, you find many "  +PLURALNOUN3+ " talking " +ADVERB2+ " into their " +ADJECTIVE2+ " phones as they eat their " +NOUN2+ "."); 

		System.out.println("give me number");
		int NUMBER1 = in.nextInt();
		in.nextLine();
		System.out.println("give me another plural noun");
		String PLURALNOUN4 =in.nextLine();
		System.out.println("give me another noun");
		String NOUN3 = in.nextLine();
		System.out.println("give me another ing verb");
		String VERB_ING_2 = in.nextLine();
		System.out.println("give me another noun");
		String NOUN4 = in.nextLine();
		System.out.println(+NUMBER1+ " percent of American "+PLURALNOUN4+ " place their "+NOUN3+ " calls from their cars as they are "+VERB_ING_2+ " to and from their home, office, or "+NOUN4+"."); 

		System.out.println("give me another noun");
		String NOUN5 = in.nextLine();
		System.out.println("Walking and talking are now the “in” "+NOUN5+" to do. Over ");

		System.out.println("give me another number");
		int NUMBER2 = in.nextInt();
		in.nextLine();
		System.out.println("give me another adjective");
		String ADJECTIVE3 = in.nextLine();
		System.out.println("give me another plural noun");
		String PLURALNOUN5 =in.nextLine();
		System.out.println("give me a body part");
		String BODYPART2 = in.nextLine();
		System.out.println();
		
		System.out.println(+NUMBER2+ " percent of Americans walk our " +ADJECTIVE3+ " streets with a handheld " +PLURALNOUN5+ " pressed against their " +BODYPART2+" ." );
				           
		
		in.close();//Don't forget to clean up after yourselves!
	}

}
