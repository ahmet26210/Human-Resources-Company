package src;

import java.util.PriorityQueue;

import src.book_implementation.ArrayQueue;

public class AdvertiseClass implements Comparable<AdvertiseClass>{
	private String AdvertisementTitle;
	private String WayOfWork;
	private String JobRole;
	private String JobType;
	private String JobLocation;
	private int NumberOfVacancies; //kac kisilik ilan
	private String CompanyIndustry;
	private ArrayQueue<String> Capabilities; // Queue
	private PriorityQueue<Candidate> applied  = new PriorityQueue<Candidate>(); // Priority Queue
	private PriorityQueue<Candidate> suggested = new PriorityQueue<Candidate>(); // Priority Queue
	
	private String LevelOfEducation;
	private int ExperienceYear;
	private String Description;
	
	/**
	 * CvClass class constructor.
	 *
	 * @param Title of advertisement
	 * @param Way of Work
	 * @param Job role 
	 * @param Type of job
	 * @param Location of Job
	 * @param NumberOfVacancies
	 * @param Company Industry
	 */
	public AdvertiseClass(String advertisementTitle, String wayOfWork, String jobRole, String jobType,
			String jobLocation, int numberOfVacancies2, String companyIndustry, ArrayQueue<String> capabilities,
			String levelOfEducation, int experienceYear, String description) {
		super();
		AdvertisementTitle = advertisementTitle;
		WayOfWork = wayOfWork;
		JobRole = jobRole;
		JobType = jobType;
		JobLocation = jobLocation;
		NumberOfVacancies = numberOfVacancies2;
		CompanyIndustry = companyIndustry;
		Capabilities = capabilities;
		LevelOfEducation = levelOfEducation;
		ExperienceYear = experienceYear;
		Description = description;
	}
	/**
	 * Returns Name of Advertisement
	 * @return Advertisement Title
	 */
	public String getAdvertisementTitle() {
		return AdvertisementTitle;
	}
	/**Returns Applied Candidates*/
	public PriorityQueue<Candidate> getApplies(){
		return applied;
	}
	/**
	 * Sets Name of Advertisement
	 * @param Name of Advertisement
	 */
	public void setAdvertisementTitle(String advertisementTitle) {
		AdvertisementTitle = advertisementTitle;
	}
	/**
	 * Returns way of work
	 * @return Way of work for advertisement
	 */
	public String getWayOfWork() {
		return WayOfWork;
	}
	/**
	 * Sets way of work
	 * @param way of work
	 */
	public void setWayOfWork(String wayOfWork) {
		WayOfWork = wayOfWork;
	}
	/**
	 * Returns Job Role
	 * @return Role of job for advertisement
	 */
	public String getJobRole() {
		return JobRole;
	}
	/**
	 * Sets Job Role
	 * @param Job Role
	 */
	public void setJobRole(String jobRole) {
		JobRole = jobRole;
	}
	/**
	 * Returns type of job
	 * @return Job type for advertisement
	 */
	public String getJobType() {
		return JobType;
	}
	/**
	 * Sets type of job
	 * @param type of job
	 */
	public void setJobType(String jobType) {
		JobType = jobType;
	}
	/**
	* Returns location of job
	* @return Job location for advertisement
	*/
	public String getJobLocation() {
		return JobLocation;
	}
	/**
	 * Sets location of job
	 * @param location of job
	 */
	public void setJobLocation(String jobLocation) {
		JobLocation = jobLocation;
	}
	/**
	 * Returns NumberOfVacancies
	 * @return NumberOfVacancies for advertisement
	 */
	public int getNumberOfVacancies() {
		return NumberOfVacancies;
	}
	/**
	 * Sets NumberOfVacancies
	 * @param NumberOfVacancies
	 */
	public void setNumberOfVacancies(int numberOfVacancies) {
		NumberOfVacancies = numberOfVacancies;
	}
	/**
	 * Returns Company Industry
	 * @return Industry of company
	 */
	public String getCompanyIndustry() {
		return CompanyIndustry;
	}
	/**
	 * Sets Company Industry
	 * @param Company Industry
	 */
	public void setCompanyIndustry(String companyIndustry) {
		CompanyIndustry = companyIndustry;
	}
	/**
	 * Returns Capabilities
	 * @return Capabilities 
	 */
	public ArrayQueue<String> getCapabilities() {
		return Capabilities;
	}
	/**
	 * Sets Capabilities
	 * @param Capabilities
	 */
	public void setCapabilities(ArrayQueue<String> capabilities) {
		Capabilities = capabilities;
	}
	/**
	 * Returns Level of education
	 * @return Level of education for advertisement.
	 */
	public String getLevelOfEducation(){
		return LevelOfEducation;
	}
	/**
	 * Sets Level of education
	 * @param Level of education
	 */
	public void setLevelOfEducation(String levelOfEducation) {
		LevelOfEducation = levelOfEducation;
	}
	/**
	 * Returns year of experience
	 * @return years of experince for advertisement
	 */
	public int getExperienceYear() {
		return ExperienceYear;
	}
	/**
	 * Sets year of experience
	 * @param year of experience
	 */
	public void setExperienceYear(int experienceYear) {
		ExperienceYear = experienceYear;
	}
	/**
	 * Returns Description
	 * @return Description
	 */
	public String getDescription() {
		return Description;
	}
	/**
	 * Sets Description
	 * @param Description
	 */
	public void setDescription(String description) {
		Description = description;
	}
	/**
	 * To string method of AdvertiseClass
	 * @return string AdvertiseClass
	 */
	@Override
	public String toString() {
		return "Info: [Title =" + AdvertisementTitle + ", WayOfWork=" + WayOfWork + ", Role ="
				+ JobRole + ", Job Type=" + JobType + ", Location=" + JobLocation + ", Vacancies ="
				+ NumberOfVacancies + ", Industry=" + CompanyIndustry + ", Capabilities =" + Capabilities
				+ ", Education Level =" + LevelOfEducation + ", Experience Year =" + ExperienceYear + ", Description ="
				+ Description + "]\n";
	}
	
	/**
	 * @return suggested persons priority queue.
	 */
	public PriorityQueue<Candidate> getSuggested() {
		return suggested;
	}
	/**
	 * Sets Suggested Candidates
	 * @param suggested priority queue to be set
	*/
	public void setSuggested(PriorityQueue<Candidate> suggested) {
		this.suggested = suggested;
	}
	/**CompareTo */	
	@Override
	public int compareTo(AdvertiseClass arg0) {
		return AdvertisementTitle.compareTo(arg0.getAdvertisementTitle());
	}
	
}