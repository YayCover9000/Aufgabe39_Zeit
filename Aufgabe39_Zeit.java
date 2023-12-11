
public class Aufgabe39_Zeit {
	public int sekunde;
	public int minute;
	public int stunde;
	
	public boolean setZeit(int stunde, int minute, int sekunde) {
		if(stunde<0||stunde>24||minute<0||minute>60||sekunde<0||sekunde>60) {
			System.out.println("Eingegebene Werte unzulässig");
			return false;
		} else {
			setStunde(stunde);
			setMinute(minute);
			setSekunde(sekunde);
			System.out.println(toString());
			return true;
		}
	}
	public String toString() {
		// return System.out.println(getStunde()+":"+getMinute()+":"+getSekunde());
		// return getClass().getName() + 
		return String.format("%s:%s:%s", getStunde(),getMinute(),getSekunde());
	}
	
	public long inSekunden() {
		return stunde*24+minute*60+sekunde*60;	
	}
	
	
	public int getSekunde() {
		return sekunde;
	}
	
	public void setSekunde(int sekunde) {
		if(sekunde <= 60 || sekunde > 0) {
		this.sekunde = sekunde;
		}
	}
	
	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute <= 60 || minute > 0) {
			this.minute = minute;
		}
	}
	
	public void setStunde(int stunde) {
		if(stunde <= 24 || stunde > 0) {
			this.stunde = stunde;
		}
		
	}
	
	public int getStunde() {
		return stunde;
	}
}
