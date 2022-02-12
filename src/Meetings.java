package src;

public class Meetings implements Comparable<Meetings>{

	private	String date;
	private Candidate candidate;
	private Company company;
	private String time;
	private int offer;

	/**
	 * Meetings class constructor.
	 * @param date of meeting
	 * @param candidate who will attened the meeting
	 * @param company who will attened the meeting
	 * @param time of meeting
	 * @param offer of meeting
	 */
	public Meetings(String date, Candidate candidate, Company company, String time, int offer) {
		this.date = date;
		this.candidate = candidate;
		this.company = company;
		this.time = time;
		this.offer=offer;
	}

	/**
	 * Returns data of meeting.
	 * @return data of meeting.
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Sets meeting date
	 * @param date of meeting
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Returns candidate who will attened the meeting
	 * @return candidate who will attened the meeting
	 */
	public Candidate getCandidate() {
		return candidate;
	}

	/**
	 * Sets candidate who will attened the meeting
	 * @param candidate who will attened the meeting
	 */
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	/**
	 * Returns company who will attened the meeting
	 * @return company who will attened the meeting
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * Sets company who will attened the meeting
	 * @param company who will attened the meeting
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * Returns time of meeting
	 * @return time of meeting
	 */
	public String getTime() {
		return time;
	}

	/**
	 * Sets time of meeting
	 * @param time of meeting
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**Returns Meeting Offer
	 * @return int
	*/
	public int getOffer() {
		return offer;
	}
	/** Updates Offer*/
	public void updateOffer(int offer) {
		this.offer = offer;
	}
	/**Equals Method */
	public boolean equals(Object o){	
		if(o instanceof Meetings){
			Meetings meet=(Meetings) o;
			return (getDate().equals(meet.getDate()) 
				&& getTime().equals(meet.getTime()) 
				&& getCompany().equals(meet.getCompany()) 
				&& getCandidate().equals(meet.getCandidate()) 
				&& getOffer()==meet.getOffer());
		}
		
		return super.equals(o);
	}
	/**CompareTo */
    @Override
    public int compareTo(Meetings meet) {
        return (getOffer() - meet.getOffer());
    }
	/**ToString */
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("Date:");
		sb.append(date.toString());
		sb.append("\nCandidate:");
		sb.append(candidate.toString());
		sb.append("\nCompany:");
		sb.append(company.toString());
		sb.append("\nTime:");
		sb.append(time.toString());
		sb.append("\nOffer:");
		sb.append(offer);
		sb.append("\n");
		return sb.toString();
	}
	
}
