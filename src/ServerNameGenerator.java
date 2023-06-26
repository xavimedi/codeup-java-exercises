import java.util.Random;

public class ServerNameGenerator {

	public static void main(String[] args) {

		String[] adjectives;
		adjectives = new String[10];

		adjectives[0] = "radiant";
		adjectives[1] = "shimmering";
		adjectives[2] = "opaque";
		adjectives[3] = "furious";
		adjectives[4] = "glowing";
		adjectives[5] = "abysmal";
		adjectives[6] = "bright";
		adjectives[7] = "clean";
		adjectives[8] = "charming";
		adjectives[9] = "exuberant";

		String[] nouns;
		nouns = new String[10];

		nouns[0] = "city";
		nouns[1] = "fortress";
		nouns[2] = "cove";
		nouns[3] = "guidance";
		nouns[4] = "spear";
		nouns[5] = "piano";
		nouns[6] = "knife";
		nouns[7] = "grass";
		nouns[8] = "shield";
		nouns[9] = "sword";

		Random name = new Random();
		int adjectiveIndex = name.nextInt(adjectives.length);
		int nounIndex = name.nextInt(nouns.length);

		String randomAdjective = adjectives[adjectiveIndex];
		String randomNoun = nouns[nounIndex];

		System.out.printf("Here is your server name: \n%s-%s", randomAdjective, randomNoun);

	}
}
