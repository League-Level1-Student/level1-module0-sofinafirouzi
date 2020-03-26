package _11_spinning_record;

public class SpinningRecord {
PImage recordPic;

	public void setup() {
	//	size(600,600);
		recordPic=loadImage("record.png");
	}//end setup
	
	public void draw() {
		image(recordPic, xPosition, yPosition);
	}//end
	
}//end spinning record class
