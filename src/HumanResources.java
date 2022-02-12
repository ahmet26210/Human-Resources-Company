package src;

import java.util.*;
import src.book_implementation.HeapSort;

public class HumanResources extends Users implements Comparable<HumanResources>{
	private HRC hrc=null;
	
	public HumanResources(int userID, String name, String password, HRC hrc){
		super(userID, name, password, Users.HUMAN_SOURCES);
        this.hrc = hrc;
        System.out.println("Your user id is " + userID);
	}

    /**
     * Removes candidate with userID
     * @param userID id of candidate to remove
     * @return true if successful
     */
	public boolean DeleteCandidate(Candidate candidate) {
        hrc.getCandidate().remove(candidate.getUserID());
		return true;
	}

    /**
     * Gets company requests.
     * @param companyID id of company
     * @return advertises from company in hrc
     */
	public ArrayList<AdvertiseClass> SeeCompanyRequest(Company company){
        return hrc.getCompanyID(company.getUserID()).getAdvertises();
	}
    
    /**
     * Compares advertise objects titles
     * @param as  first advertise object.
     * @param as2 second advertise object.
     * @return which title is bigger in form of comparing.
     */
	public int CompareRequests(AdvertiseClass as, AdvertiseClass as2){
        return as.compareTo(as2);
	}
    
    /**
     * Gives offer to candidate with meeting information.
     * @param candidate candidate to give offer
     * @param meeting hold meeting info and company info giving offer.
     * @param offer Offer to give.
     * @return candidate's evaluating offer info.
     */
	public boolean GiveOfferToCandidate(Candidate candidate, Meetings meeting,int offer){
         meeting.updateOffer(offer);
		return true;
	}

    /**
     * 
     * @param date date of meeting
     * @param candidate candidate
     * @param company company in meeting
     * @param time time of meeting
     * @param offer offer info in arrange.
     * @return true if meeting info adds to candidate
     */
	public boolean ArrangeMeeting(String date, Candidate candidate, Company company, String time, int offer){
        Meetings meeting = new Meetings(date, candidate, company, time, offer);
        hrc.getMeetings().add(meeting);
		candidate.addMeeting(meeting);
		return true;
	}

    /**
     * Suggests the candidate to compnay
     * @param candidate candidate to offered
     * @param as advertise object to be given as suggest
     */
	public void SuggestCandidateToCompany(Candidate candidate, AdvertiseClass as){
		as.getSuggested().add(candidate);
	}

    /**
     * @return user id and name info of human resources.
     */
	public String toString(){
		StringBuilder sb =new StringBuilder();
        sb.append(  "UserID: " + getUserID() );
        sb.append( " | Name: " + getName() );
        
		return sb.toString();
	}
    
    /**
     * @param humanRes human resources to compare.
     * @return which human resources has bigger 
     */
	public int compareTo(HumanResources humanRes) {
        if(getUserID() > humanRes.getUserID() )
            return 1;
        else if(getUserID() < humanRes.getUserID())
            return -1;
        else
            return 0;    
	}

    /**
     * Seeing meeting info.
     * @param hrc hrc to get meetings.
     * @return meetings.
     */
    public ArrayList<Meetings> seeMeetings(HRC hrc){
		return hrc.getMeetings();
	}

    /**
     * If to human reusources are same.
     * @param humanRes human resources
     * @return if comparing is equals to 0.
     */
    public boolean equals(HumanResources humanRes){
        return (compareTo(humanRes) == 0);
    }
    
	/**
	 * Sorts Meetings
	 * @param ArrayList<Meetings>
	 */
    @SuppressWarnings("unchecked")
	public ArrayList<Meetings> sortMeetings(ArrayList<Meetings> arr){
		
		if(arr!=null) 
		{
			ArrayList<Meetings> temp=(ArrayList<Meetings>)arr.clone();
			HeapSort.heapSort(temp);
			return temp;
		}
		return null;
	}
    
}
