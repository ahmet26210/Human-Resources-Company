package src;
import java.util.*;

public class Candidate  extends Users implements Comparable<Candidate>{
	private String statue;
	private CvClass Mycv;
	private PriorityQueue<Meetings> meetings = null;
	private HRC hrc=null ;


	/**Constructor
    * @param userID id of user
	* @param String name
	* @param String password
	* @param CvClass mycv
 	*/
	public Candidate(int userID, String name, String password, CvClass mycv,HRC hrc) {
		super(userID, name, password, Users.CANDIDATE);
		this.Mycv = mycv;
		statue="NOT_APPLIED";
		meetings=new PriorityQueue<>();
        System.out.println("Your id:" + userID);
		this.hrc=hrc;
	}

	/**
	 * Compares Name and Password
	 * @param id id of user.
	 * @param password String
	 * @return boolean
	 */
	public boolean signUp(int id,String password) {
		if (getUserID() == id && getPassword().equals(password))
			return true;
		return false;
	}

	/** For Rating Company
	* @param Company 
	* @return rate
	*/
	public int rateCompany(Company company, int rate) {
		company.addRating(rate);
		return rate;
	}
	/**
	 *	Evaluates The Offer
	 * @param Meeting
	 * @return boolean
	 */
	public boolean evaluateTheOffer(Meetings meeting) {
		if(meeting!= null && meeting.getOffer() > 0) {
			setStatusToWorking();
			meetings.remove(meeting);
			hrc.getMeetings().remove(meeting);
			return true;
		}
		return false;
	}
	/**Returns Cv Of Candidate
	* @return CvClass
	*/
	public CvClass	getCV() {
		return Mycv;
	}
	/**
	 * Prints Rating Average
	 * @param company Company
	 */
	public void seeRatings(Company company) {
		System.out.println("Rating: "+company.getRatingsAvg());
	}
	/**
	 * Adds Candidate to Advertise
	 * @param ad AdvertiseClass
	 */
	public void applyToAdvertisement(AdvertiseClass ad) {
		if(ad==null){
			System.out.println("NULL Geldi.");
			return;
		}
		ad.getApplies().add(this);
	}
	/**
	 * Sets Statue To Open To Work
	 * @return boolen
	 */
	 
	public boolean setStatusToOpenWork() {
		this.statue="Open To Work";
		return true;
	}
	/**
	 * Sets Statue To Working
	 * @return boolen
	 */
	public boolean setStatusToWorking() {
		this.statue="Working";
		return true;
	}
	/**
	*Changes Candidates Password
	*@param String newPassword
	* @return Boolen 
	*/
	public boolean changePassword(String newPassword) {
		setPassword(newPassword);
		return true;
	}
	/**Returns Statue */
	public String getStatue() {
		return statue;
	}

	/**toString */
	public String toString() {
		StringBuilder str =new StringBuilder();
		str.append("ID: "+getUserID()+" Name: "+getName()+" Statue: "+statue);
		return str.toString();
	}
    
	/**Sets Candidates CV
	*@param CvClass mycv
	*/
	public void setMycv(CvClass mycv) {
		Mycv = mycv;
	}
    /**CompareTo */
    @Override
    public int compareTo(Candidate other) {
        if (this.getUserID()>other.getUserID()) {
			return 1;
		} if (this.getUserID()<other.getUserID()) {
			return -1;
		} else 
			return 0 ;
    }
	/**Adds Meeting
	 * @param Meeting
	 */
	public void addMeeting(Meetings meeting) {
		this.meetings.add(meeting) ;
	}
	/** Retruns Meetings*/
    public PriorityQueue<Meetings> getMeetings(){
        return meetings;
    }
    
}

