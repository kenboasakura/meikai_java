package enshu13_03;

abstract class Player {

	private int  handNumber = 0;
	
	public Player() {
		setHandNumber(handNumber);
	}
		
	public abstract String toString();
	
	public void printGame() {
		System.out.println(toString());
	}
	
	
	public int getHandNumber () {
		return handNumber;
	}
	
	public void setHandNumber(int handNumber) {
		this.handNumber = handNumber;
	}
	
	

}
