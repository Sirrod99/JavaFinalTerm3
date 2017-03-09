/**
 * 
 */
package firstpackage;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.*;

import java.util.Scanner;
/**
 * @author CK121642
 *
 */
public class Firstclass {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

	Scanner inputDevice = new Scanner(System.in);
	int userInput;

	Scanner keyboard = new Scanner(System.in);	

	String choiceYes;
	String choiceNo;
	String Choice;
	String choiceNorth;
	String choiceSouth;
	String choiceBack;
	Scanner Input = null;

	
	
	
	
	
	//**Backstory                             
	JOptionPane.showMessageDialog(null, "You were born into the safety of Vault 8, or its more popular name Vault City."
			+ "\nCurrently you are 17 years, over the course of your short life you have gained a name for yourself."
			+ "\nYou are known as The Wanderer. It is early April of the year 2227, 150 years after the world was laid to ruin by nuclear fire. "
			+ "\nYou wish to leave due to your adventurous lifestyle, you step outside of your home, seeing the real world for the first time."
			+ "\nWhere will The Wanderer go?");

	//Player name
	 JFrame frame = new JFrame("InputDialog Example #1");

	 String name = JOptionPane.showInputDialog(frame, "What's your name?");
	
 
	
	//Weapons
	JOptionPane.showMessageDialog(null,   name + " grabs one weapon before he/she leaves. A 10mm pistol"					
	+ " \nWith 24 bullets. The player also gets 3 healing items(stimpacks), and a flashlight");
	

	
	
	//Resident tell you about a town.
	JOptionPane.showMessageDialog(null, "One of the other citizens of the vault tell you about a town called Gecko to the north."
			+ " \nHe smirks at you and wishes you luck on your travels.");
	

	
	JOptionPane.showMessageDialog(null, "What way would you like to go?"
										+ "\n To the west"
										+ "\n To the north"
										+ "\n Disregard the citizen and go south");
	
	 JFrame frame1 = new JFrame("InputDialog Example #1");

	 String name1 = JOptionPane.showInputDialog(frame, "What way do you want to go?");
	
	Input.nextLine();
	 

	
	
	
	
	//Three decisions are given(Choice)
	
	//Player chooses to give the citizen the finger(Choice one)
	

	//Player chooses to go north(Choice two)
	
	//Player  chooses to disregard the citizen and head south(Choice three)
	
	//If player chooses option one, he/she gets this message
	JOptionPane.showMessageDialog(null, "You look out into the wastes and see a giant radscorpion ripping into one of your cousin."
			+ "\nSpilling his entrails onto the ground.");
	
	//If player chooses option two, he/she gets this message
	JOptionPane.showMessageDialog(null, "You bring food and water with you, heading north, you know it will be some time before you find anything."
			+ "\nTwo days of walking later, you're walking towards a town in the distance."
			+ "\nYou hear the tick of your Geiger counter tick as you come closer, but the amount of radiation is not harmful."
			+ "\nYou enter the town, promptly called Gecko. A man with a horridly disfigured face asks you to assist him with something."
			+ "\nDo you choose to do so?");
	
	//If player chooses option three, he/she gets this message
	JOptionPane.showMessageDialog(null, "After a long day of travel you come across a destroyed gas station");   

	//Player chooses to go north

	//Player  chooses to disregard the citizen and head south
		


	
	}
	
	
	
	

}
