package src;

import java.util.*;
import src.book_implementation.*;


public class Company extends Users implements Comparable<Company> {
    private ArrayList<AdvertiseClass> Advertises;
    private String CompanySector;
    private int NumberOfEmployees;
    private AVLTree<String> SocialRights;
    private String Address;
    private double rateTotal;
    private static double rateAverage;
    private static int numberOfVotes;

    public Company(int userID,String name, String password, String companySector,
			int numberOfEmployees, String address,HRC hrc) {
        super(userID,name,password,Users.COMPANY);
        CompanySector = companySector;
        NumberOfEmployees = numberOfEmployees;
        Address = address;
        rateTotal = 0;
        rateAverage=0;
        numberOfVotes=0;
        SocialRights = new AVLTree<String>();
        Advertises = new ArrayList<>();
        System.out.println("Your id:" + userID);
    }

    	/**
	 * Compares Name and Password
	 * @param name String
	 * @param password String
	 * @return boolean
	 */
	public boolean signUp(int id, String password) {
		if (getUserID() == id && getPassword().equals(password))
			return true;
		return false;
	}
    /**Updates Rating Average
     * @param int rate 
     */
    public void addRating(int rate) {
        this.rateTotal += rate;
        rateAverage = this.rateTotal / (++numberOfVotes);
    }
    /**Retruns Rating Average */
    public double getRatingsAvg(){
        return rateAverage;
    }
    /**Retruns Advertises */
    public ArrayList<AdvertiseClass> getAdvertises() {
        return Advertises;
    }
    
    /**
     * Sets Advertises
     * 
     * @param ArrayList<AdvertiseClass>
     */
    public void setAdvertises(ArrayList<AdvertiseClass> advertises) {
        Advertises = advertises;
    }
    /**Returns Company Sector */
    public String getCompanySector() {
        return CompanySector;
    }
    
    /**
     * Sets Company Sector
     * 
     * @param String
     */
    public void setCompanySector(String companySector) {
        CompanySector = companySector;
    }
    /**Returns Number of Employees */
    public int getNumberOfEmployees() {
        return NumberOfEmployees;
    }
     /**
     * Sets Number of Employees
     * 
     * @param int
     */
    public void setNumberOfEmployees(int numberOfEmployees) {
        NumberOfEmployees = numberOfEmployees;
    }
    /**Returns Social Rights */
    public AVLTree<String> getSocialRights() {
        return SocialRights;
    }
    
    /**
     * Sets Social Rights
     * 
     * @param AVLTree<String>
     */
    public void setSocialRights(AVLTree<String> socialRights) {
        SocialRights = socialRights;
    }
    /**Returns Adress */
    public String getAddress() {
        return Address;
    }
    
    /**
     * Sets Address
     * 
     * @param String
     */
    public void setAddress(String address) {
        Address = address;
    }
    /**
     * Prints Suggested Candidates
     * 
     * @param Candidate[]
     */
    public void SeeSuggestedCandidates(Candidate[] candidates) {
        for(int i=0;i< candidates.length;i++)
            System.out.println(candidates[0].toString());

    }
    /**
     * Adds New Social Rights
     * 
     * @param String
     */
    public void addSocialRights(String value){
       SocialRights.add(value);

   }
   
   /**
    * Adds New Addvertise
    * 
    * @param AdvertiseClass
    */
    public  void addAdvertise(AdvertiseClass newValue){
            Advertises.add(newValue);
    }
    /**ToString */
    public String toString() {
        StringBuilder sb =new StringBuilder();

        sb.append("Name: " + getName());
        sb.append("\nId: " + getUserID());
        sb.append("\nAdvertises: " + Advertises);
        sb.append("\nCompanySector: " + CompanySector);
        sb.append("\nNumber of Employees: " + NumberOfEmployees);
        sb.append("\nAddress: " + Address);
        sb.append("\nRatings avg: " + rateAverage);
        sb.append("\nSocial Rights: ");
        Iterator<String> iter = SocialRights.iterator();
        while(iter.hasNext()){
            sb.append(iter.next() + ", ");
        }
        sb.append("\n");
        return sb.toString();
    }
    /**CompareTo */
    @Override
    public int compareTo(Company o) {
       if(this.getRatingsAvg()<o.getRatingsAvg())
           return 1;
       else if(this.getRatingsAvg()>o.getRatingsAvg())
           return -1;
       else
           return 0;

    }
}
