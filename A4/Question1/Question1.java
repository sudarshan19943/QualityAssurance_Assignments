import java.lang.StringBuilder;

public class Question1
{
	private StringBuilder builder = new StringBuilder();
	
	public String buildBookQuoteHTML()
	{	
		appendHeader("<H1>A page of famous book quotes!</H1>\n");
		appendHeader("<H2>- Some book reviewer</H2>");
		
		appendBody("I know. I was there. I saw the great void in your soul, and you saw mine.");
		appendBody("She says nothing at all, but simply stares upward into the dark sky and watches, with sad eyes, the slow dance of the infinite stars.");
		appendBody("Clocks slay time… time is dead as long as it is being clicked off by little wheels; only when the clock stops does time come to life.");
		appendBody("None of those other things makes a difference. Love is the strongest thing in the world, you know. Nothing can touch it. Nothing comes close. If we love each other we’re safe from it all. Love is the biggest thing there is.");
		appendBody("Sometimes we get sad about things and we don’t like to tell other people that we are sad about them. We like to keep it a secret. Or sometimes, we are sad but we really don’t know why we are sad, so we say we aren’t sad but we really are.");
		appendBody("I know not all that may be coming, but be it what it will, I’ll go to it laughing.");
		appendBody("Maybe ever’body in the whole damn world is scared of each other.");
		appendBody("Life is to be lived, not controlled; and humanity is won by continuing to play in face of certain defeat.");
		appendBody("It's the possibility of having a dream come true that makes life interesting.");
		appendBody("I cannot fix on the hour, or the spot, or the look or the words, which laid the foundation. It is too long ago. I was in the middle before I knew that I had begun.");
		appendBody("There is no greater agony than bearing an untold story inside you.");
		appendBody("Still, there are times I am bewildered by each mile I have traveled, each meal I have eaten, each person I have known, each room in which I have slept. As ordinary as it all appears, there are times when it is beyond my imagination.");
		appendBody("And so we beat on, boats against the current, borne back ceaselessly into the past.");
		appendBody("Hello, babies. Welcome to Earth. It's hot in the summer and cold in the winter. It's round and wet and crowded. At the outside, babies, you've got about a hundred years here. There's only one rule that I know of, babies—God damn it, you've got to be kind.");
		appendBody("He stepped down, trying not to look long at her, as if she were the sun, yet he saw her, like the sun, even without looking.");
		appendBody("How wonderful it is that nobody need wait a single moment before starting to improve the world.");
		
		appendFooter("=\"page2.html\">Click here to go to the next page!");
		
		return builder.toString();
	}
	
	private void appendHeader(String story) {
		builder.append(story);
	}

	private void appendBody(String story) {
		builder.append("<P>");
		builder.append(story);
		builder.append("</P>\n");
	}
	
	private void appendFooter(String story) {
		builder.append("<A HREF");
		builder.append(story);
		builder.append("</A>\n");
	}
}