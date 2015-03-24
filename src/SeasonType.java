import javax.swing.JOptionPane;
public class SeasonType {
	enum Season {December, January, Febuary, March, April, May, June, July, August, September, October, November }
	public static void main(String[] args) {	
		
		Season [] choices = {Season.December, Season.January, Season.Febuary, Season.March, Season.April, Season.May, Season.June, Season.July, Season.August, Season.September, Season.October, Season.November};
		Season select = (Season)JOptionPane.showInputDialog(null, "Select a month", "Season", JOptionPane.QUESTION_MESSAGE, null, choices, choices[3]);
		while(select!=null){
		switch(select){
		case December:
			JOptionPane.showMessageDialog(null, "Do you want to build a snowmen? ");
			break;
		case January:
			JOptionPane.showMessageDialog(null, "Do you want to build a snowmen? ");
			break;
		case Febuary:
			JOptionPane.showMessageDialog(null, "Do you want to build a snowmen? ");
			break;
		case March:
			JOptionPane.showMessageDialog(null, "Happy Spring days! ");
			break;
		case April:
			JOptionPane.showMessageDialog(null, "Happy Spring days! ");
			break;
		case May:
			JOptionPane.showMessageDialog(null, "Happy Spring days! ");
			break;
		case June:
			JOptionPane.showMessageDialog(null, "It's a summer time. ");
			break;
		case July:
			JOptionPane.showMessageDialog(null, "Happy Spring days? ");
			break;
		case August:
			JOptionPane.showMessageDialog(null, "Happy Spring days? ");
			break;
		case September:
			JOptionPane.showMessageDialog(null, "Welcome to the foilage season! ");
			break;
		case October:
			JOptionPane.showMessageDialog(null, "Welcome to the foilage season! ");
			break;
		case November:
			JOptionPane.showMessageDialog(null, "Welcome to the foilage season! ");
			break;
			
		
}
		select = (Season)JOptionPane.showInputDialog(null, "Select a month", "Season", JOptionPane.QUESTION_MESSAGE, null, choices, choices[3]);	
}}}
	
	
	
	
	
	
	
	
	
	
	