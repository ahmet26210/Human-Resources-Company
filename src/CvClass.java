package src;

import java.util.ArrayList;

public class CvClass {
	private	String Address;
	private String Name;
	private String Surname;
	private String TelNo;
	private String Email;
	private String Gender;
	private String BirthDay;
	private String Nationality;
	private String CoverLetter;
 	private ArrayList<SchoolClass> SchoolInformation;
	private ArrayList<Experience> Experiences;
	private ArrayList<Certificate> Certficates;
	private ArrayList<String> Capabilities;
	private ArrayList<Referance> Referances;
	private boolean DriversLicense;

	/**
	 * CvClass class constructor.
	 *
	 * @param address of candidate
	 * @param name of candidate
	 * @param surname of candidate
	 * @param telNo of candidate
	 * @param email of candidate
	 * @param gender of candidate
	 * @param birthDay of candidate
	 * @param nationality of candidate
	 * @param coverLetter of candidate
	 * @param schoolInformation of candidate
	 * @param experiences of candidate
	 * @param certficates of candidate
	 * @param capabilities of candidate
	 * @param referances of candidate
	 * @param driversLicense of candidate
	 */
	public CvClass(String address, String name, String surname, String telNo, String email, String gender,
			String birthDay, String nationality, String coverLetter, ArrayList<SchoolClass> schoolInformation,
			ArrayList<Experience> experiences, ArrayList<Certificate> certficates,ArrayList<String> capabilities,
			 ArrayList<Referance> referances, boolean driversLicense) {
		super();
		Address = address;
		Name = name;
		Surname = surname;
		TelNo = telNo;
		Email = email;
		Gender = gender;
		BirthDay = birthDay;
		Nationality = nationality;
        CoverLetter = coverLetter;
		Capabilities = capabilities;
		if(Capabilities==null)
			Capabilities = new ArrayList<>();
		Experiences = experiences;
        if(Experiences == null)
            Experiences = new ArrayList<>();
		Certficates = certficates;
		if(Certficates == null)
			Certficates = new ArrayList<>();
        Referances = referances;
        if(referances == null)
            Referances = new ArrayList<>();
		SchoolInformation = schoolInformation;
        if(SchoolInformation == null)
            SchoolInformation = new ArrayList<>();
		DriversLicense = driversLicense;
	}

	/**
	 * Returns cadidate email.
	 * @return email of candidate.
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * Sets candidate email.
	 * @param email of candidate.
	 */

	public void setEmail(String email) {
		Email = email;
	}

	/**
	 * Returns candidate gender.
	 * @return gender of candidate.
	 */

	public String getGender() {
		return Gender;
	}

	/**
	 * Sets candidate gender.
	 * @param gender of candidate.
	 */
	public void setGender(String gender) {
		Gender = gender;
	}

	/**
	 * Returns birthday of candidate.
	 * @return birthday of candidate.
	 */

	public String getBirthDay() {
		return BirthDay;
	}

	/**
	 * Sets birthday of candidate.
	 * @param birthDay of candidate.
	 */

	public void setBirthDay(String birthDay) {
		BirthDay = birthDay;
	}

	/**
	 * Returns nationality of candidate.
	 * @return nationality of candidate.
	 */

	public String getNationality() {
		return Nationality;
	}
	
	/**
	 * Adds New School Information
	 * 
	 * @param CvClass.SchoolClass
	 * @return boolean
	 */
	public boolean addSchoolInfo(CvClass.SchoolClass info){
		if (SchoolInformation == null)
			SchoolInformation = new ArrayList<SchoolClass>();
		if(info==null) 
		{
			return false;
		}
		SchoolInformation.add(info);
		return true;
	}
	/**
	 * Adds New Experience
	 * 
	 * @param Experience
	 * @return boolean
	 */
	public boolean addExperience(Experience exp){
		if (Experiences == null)
			Experiences = new ArrayList<Experience>();
		if(exp== null)
		{	
			return false;
		} 
		Experiences.add(exp);
		return true;
	}
	
	/**
	 * Adds New Certificate
	 * 
	 * @param CvClass.Certificate
	 * @return boolean
	 */
	public boolean addCertificate(CvClass.Certificate cer){
		if(cer== null) 
		{
			System.out.println("Certificate Patladi");
			return false;
		}
		Certficates.add(cer);
		return true;
	}
	
	/**
	 * Adds New Capabilities
	 * 
	 * @param ArrayList<String>
	 * @return boolean
	 */
	 public boolean addCapability(ArrayList<String> capability){
		if (capability == null)
		{
			System.out.println("capabil Patladi");
			return false;
		}
		Capabilities.addAll(capability);
		return true;
	}
	
	/**
	 * Adds New References
	 * 
	 * @param CvClass.Referance
	 * @return boolean
	 */
	public boolean addReferances(CvClass.Referance ref) {
		if (ref == null)
		{
			System.out.println("Ref Patladi");
			return false;
		}
		Referances.add(ref);
		return true;
	}

	/**
	 * Sets nationality of candidate.
	 * @param nationality of candidate.
	 */

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	/**
	 * Returns cover letter of candidate
	 * @return cover letter of candidate
	 */
	public String getCoverLetter() {
		return CoverLetter;
	}

	/**
	 * Sets cover letter of candidate
	 * @param coverLetter of candidate
	 */

	public void setCoverLetter(String coverLetter) {
		CoverLetter = coverLetter;
	}

	/**
	 * Returns driver licence of candidate.
	 * @return driver licence of candidate.
	 */
	public boolean isDriversLicense() {
		return DriversLicense;
	}

	/**
	 * Sets driver licence of candidate.
	 * @param driversLicense of candidate.
	 */

	public void setDriversLicense(boolean driversLicense) {
		DriversLicense = driversLicense;
		System.out.println("Statue of Drivers License Changed!! ");
		System.out.println("Having driver licence info: " + driversLicense);
	}

	/**
	 * Returns referances of candidate.
	 * @return referances of candidate.
	 */
	public ArrayList<Referance> getReferances() {
		return Referances;
	}

	/**
	 * Sets referances of candidate.
	 * @param referances of candidate.
	 */

	public void setReferances(ArrayList<Referance> referances) {
		Referances = referances;
	}

	/**
	 * Returns certificates of candidate.
	 * @return certificates of candidate.
	 */

	public ArrayList<Certificate> getCertficates() {
		return Certficates;
	}

	/**
	 * Sets certificates of candidate.
	 * @param certficates of candidate.
	 */
	public void setCertficates(ArrayList<Certificate> certficates) {
		Certficates = certficates;
	}

	/**
	 * Returns capabilities of candidate.
	 * @return capabilities of candidate.
	 */
	public ArrayList<String> getCapabilities() {
		return Capabilities;
	}

	/**
	 * Sets capabilities of candidate.
	 * @param capabilities of candidate.
	 */
	public void setCapabilities(ArrayList<String> capabilities) {
		Capabilities = capabilities;
	}

	/**
	 * Returns address of candidate.
	 * @return address of candidate.
	 */
	public String getAddress() {
		return Address;
	}

	/**
	 * Sets address of candidate.
	 * @param address of candidate.
	 */
	public void setAddress(String address) {
		Address = address;
	}

	/**
	 * Returns name of candidate.
	 * @return name of candidate.
	 */
	public String getName() {
		return Name;
	}

	/**
	 * Sets name of candidate.
	 * @param name of candidate.
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * Returns surname of candidate.
	 * @return surname of candidate.
	 */
	public String getSurname() {
		return Surname;
	}

	/**
	 * Sets surname of candidate.
	 * @param surname of candidate.
	 */
	public void setSurname(String surname) {
		Surname = surname;
	}

	/**
	 * Returns telephone of candidate.
	 * @return  telephone of candidate.
	 */
	public String getTelNo() {
		return TelNo;
	}

	/**
	 * Sets telephone of candidate.
	 * @param telNo of candidate.
	 */
	public void setTelNo(String telNo) {
		TelNo = telNo;
	}

	/**
	 * Returns school information of candidate.
	 * @return school information of candidate.
	 */
	public ArrayList<SchoolClass> getSchoolInformation() {
		return SchoolInformation;
	}

	/**
	 * Sets school information of candidate.
	 * @param schoolInformation of candidate.
	 */
	public void setSchoolInformation(ArrayList<SchoolClass> schoolInformation) {
		SchoolInformation = schoolInformation;
	}

	/**
	 * Returns experiences of candidate.
	 * @return experiences of candidate.
	 */
	public ArrayList<Experience> getExperiences() {
		return Experiences;
	}

	/**
	 * Sets experiences of candidate.
	 * @param experiences of candidate.
	 */
	public void setExperiences(ArrayList<Experience> experiences) {
		Experiences = experiences;
	}

	public static class Experience{
		String companyName;
		String StartDate;
		String Position;
		String EndDate;
		String City;
		String BusinessArea;
		String JobDescription;
		String CompanySector;
		String WayOfWork;

		/**
		 * Experinece class constructor.
		 * @param companyName of experinece
		 * @param startDate of experinece
		 * @param position of experinece
		 * @param endDate of experinece
		 * @param city of experinece
		 * @param businessArea of experinece
		 * @param jobDescription of experinece
		 * @param companySector of experinece
		 * @param wayOfWork of experinece
		 */
		public Experience(String companyName, String startDate, String position, String endDate, String city,
				String businessArea, String jobDescription, String companySector, String wayOfWork) {
			super();
			this.companyName = companyName;
			StartDate = startDate;
			Position = position;
			EndDate = endDate;
			City = city;
			BusinessArea = businessArea;
			JobDescription = jobDescription;
			CompanySector = companySector;
			WayOfWork = wayOfWork;
		}
		/**ToString */
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("Company Name: " + companyName + " Position: " + Position + " City: " + City
					+ " Business Area: " + BusinessArea + " CompanySector: " + CompanySector + " Start Date: "
					+ StartDate + " End Date: " + EndDate + " Way Of Work: " + WayOfWork+" Job Description: "+ JobDescription);
			return sb.toString();
		}
		/**
		 * Returns company name of experinece.
		 * @return company name of experinece.
		 */

		public String getCompanyName() {
			return companyName;
		}

		/**
		 * Sets company name of experinece.
		 * @param companyName of experinece.
		 */
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		/**
		 * Returns start date of experinece.
		 * @return start data of experinece.
		 */
		public String getStartDate() {
			return StartDate;
		}
		
		/**
		 * Sets start date of experinece.
		 * @param startDate of experinece.
		 */
		public void setStartDate(String startDate) {
			StartDate = startDate;
		}

		/**
		 * Returns position of experinece.
		 * @return position of experinece.
		 */
		public String getPosition() {
			return Position;
		}

		/**
		 * Sets position of experinece.
		 * @param position of experinece.
		 */
		public void setPosition(String position) {
			Position = position;
		}

		/**
		 * Returns end date of experinece.
		 * @return end date of experinece.
		 */
		public String getEndDate() {
			return EndDate;
		}

		/**
		 * Sets end date of experinece.
		 * @param endDate of experinece.
		 */
		public void setEndDate(String endDate) {
			EndDate = endDate;
		}

		/**
		 * Returns city of experinece.
		 * @return city of experinece.
		 */
		public String getCity() {
			return City;
		}

		/**
		 * Sets city of experinece.
		 * @param city of experinece.
		 */
		public void setCity(String city) {
			City = city;
		}

		/**
		 * Returns business area of experinece.
		 * @return  business area of experinece.
		 */
		public String getBusinessArea() {
			return BusinessArea;
		}

		/**
		 * Sets business area of experinece.
		 * @param businessArea of experinece.
		 */
		public void setBusinessArea(String businessArea) {
			BusinessArea = businessArea;
		}

		/**
		 * Returns job description of experinece.
		 * @return job description of experinece.
		 */
		public String getJobDescription() {
			return JobDescription;
		}

		/**
		 * Sets job description of experinece.
		 * @param jobDescription of experinece.
		 */
		public void setJobDescription(String jobDescription) {
			JobDescription = jobDescription;
		}

		/**
		 * Returns company sector of experinece.
		 * @return company sector of experinece.
		 */
		public String getCompanySector() {
			return CompanySector;
		}

		/**
		 * Sets company sector of experinece.
		 * @param companySector of experinece.
		 */
		public void setCompanySector(String companySector) {
			CompanySector = companySector;
		}

		/**
		 * Returns way of work
		 * @return way of work
		 */
		public String getWayOfWork() {
			return WayOfWork;
		}

		/**
		 * Sets way of work
		 * @param wayOfWork way of work
		 */
		public void setWayOfWork(String wayOfWork) {
			WayOfWork = wayOfWork;
		}
		
	}
	public static class SchoolClass{
		private String SchoolsName;
		private String FacultyName;
		private String Department;
		private String endDate;
		private String StartDate;
		private String EducationType;
		private String EducationLanguage;
		private double SchoolAvarage;

		/**
		 * SchoolClass class constructor.
		 * @param schoolsName school name
		 * @param facultyName faculty name
		 * @param department departmen name
		 * @param endDate school graduation date
		 * @param startDate school start date
		 * @param educationType education type
		 * @param educationLanguage education language
		 * @param schoolAvarage GPA
		 */
		
		public SchoolClass(String schoolsName, String facultyName, String department, String endDate, String startDate,
				String educationType, String educationLanguage, double schoolAvarage) {
			super();
			SchoolsName = schoolsName;
			FacultyName = facultyName;
			Department = department;
			this.endDate = endDate;
			StartDate = startDate;
			EducationType = educationType;
			EducationLanguage = educationLanguage;
			SchoolAvarage = schoolAvarage;
		}
		/**ToString */
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("Schools Name: " + SchoolsName + " Faculty Name: " + FacultyName
					+ " Department: " + Department + " Education Type: " + EducationType
					+ "Education Language: " + EducationLanguage + " Start Date: " + StartDate
					+ " End Date: " + endDate + " School Avarage: " + SchoolAvarage);
			return sb.toString();
		}
		/**
		 * Returns school name
		 * @return school name
		 */
		public String getSchoolsName() {
			return SchoolsName;
		}

		/**
		 * Sets school name
		 * @param schoolsName school name
		 */
		public void setSchoolsName(String schoolsName) {
			SchoolsName = schoolsName;
		}

		/**
		 * Returns faculty name
		 * @return faculty name
		 */
		public String getFacultyName() {
			return FacultyName;
		}

		/**
		 * Sets faculty name
		 * @param facultyName faculty name
		 */
		public void setFacultyName(String facultyName) {
			FacultyName = facultyName;
		}

		/**
		 * Returns department
		 * @return department
		 */
		public String getDepartment() {
			return Department;
		}

		/**
		 * Sets department
		 * @param department
		 */
		public void setDepartment(String department) {
			Department = department;
		}

		/**
		 * Returns graduation date
		 * @return graduation date
		 */
		public String getEndDate() {
			return endDate;
		}

		/**
		 * Sets graduation date
		 * @param endDate graduation date
		 */
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		/**
		 * Returns school start date
		 * @return start date
		 */
		public String getStartDate() {
			return StartDate;
		}

		/**
		 * Sets school start date
		 * @param startDate
		 */
		public void setStartDate(String startDate) {
			StartDate = startDate;
		}

		/**
		 * Returns education type
		 * @return education type
		 */
		public String getEducationType() {
			return EducationType;
		}

		/**
		 * Sets education type
		 * @param educationType education type
		 */
		public void setEducationType(String educationType) {
			EducationType = educationType;
		}

		/**
		 * Returns education language
		 * @return education language
		 */
		public String getEducationLanguage() {
			return EducationLanguage;
		}

		/**
		 * Sets education language
		 * @param educationLanguage education language
		 */
		public void setEducationLanguage(String educationLanguage) {
			EducationLanguage = educationLanguage;
		}

		/**
		 * Returns GPA
		 * @return GPA
		 */
		public double getSchoolAvarage() {
			return SchoolAvarage;
		}

		/**
		 * Sets GPA
		 * @param schoolAvarage GPA
		 */
		public void setSchoolAvarage(double schoolAvarage) {
			SchoolAvarage = schoolAvarage;
		}
		
	}
	public static class Certificate{
		String CertificateName;
		String InstitutionName;
		String CertificateDate;
		String Explanation;

		/**
		 * Certificate class constructor.
		 * @param certificateName name of certificate
		 * @param institutionName name of institution
		 * @param certificateDate date of certificate
		 * @param explanation  explanation
		 */
		public Certificate(String certificateName, String institutionName, String certificateDate, String explanation) {
			super();
			CertificateName = certificateName;
			InstitutionName = institutionName;
			CertificateDate = certificateDate;
			Explanation = explanation;
		}
		/**ToString */
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("Certificate Name: " + CertificateName + " Institution Name: " + InstitutionName + " Certificate Date: " + CertificateDate+ " Explanation: " + Explanation );
			return sb.toString();
		}
		/**
		 * Returns name of certificate
		 * @return name of certificate
		 */
		public String getCertificateName() {
			return CertificateName;
		}

		/**
		 * Sets name of certificate
		 * @param certificateName name of certificate
		 */
		public void setCertificateName(String certificateName) {
			CertificateName = certificateName;
		}

		/**
		 * Returns institution name
		 * @return institution name
		 */
		public String getInstitutionName() {
			return InstitutionName;
		}

		/**
		 * Sets institution name
		 * @param institutionName institution name
		 */
		public void setInstitutionName(String institutionName) {
			InstitutionName = institutionName;
		}

		/**
		 * Returns certificate date
		 * @return certificate date
		 */
		public String getCertificateDate() {
			return CertificateDate;
		}

		/**
		 * Sets certificate date
		 * @param certificateDate certificate date
		 */
		public void setCertificateDate(String certificateDate) {
			CertificateDate = certificateDate;
		}

		/**
		 * Returns explanation
		 * @return explanation
		 */
		public String getExplanation() {
			return Explanation;
		}

		/**
		 * Sets explanation
		 * @param explanation
		 */
		public void setExplanation(String explanation) {
			Explanation = explanation;
		}
	}
	public static class Referance{
		String referanceName;
		String telNo;
		String Email;
		String CompanyName;
		String Job;

		/**
		 * Referance class constructor.
		 * @param referanceName name of referances.
		 * @param telNo telephone of referances.
		 * @param email email of referances
		 * @param companyName company name of referances
		 * @param job job of referances
		 */
		public Referance(String referanceName, String telNo, String email, String companyName, String job) {
			super();
			this.referanceName = referanceName;
			this.telNo = telNo;
			Email = email;
			CompanyName = companyName;
			Job = job;
		}
		/**ToString */
		public String toString(){
			StringBuilder sb= new StringBuilder();
			sb.append("Company Name: "+CompanyName+" Reference Name: "+referanceName+" Job: "+Job+" E-Mail: "+Email+" Phone Number: "+telNo);
			return sb.toString();
		}
		/**
		 * Returns name of referance.
		 * @return name of referance.
		 */
		public String getReferanceName() {
			return referanceName;
		}

		/**
		 * Sets name of referance.
		 * @param referanceName name of referance.
		 */
		public void setReferanceName(String referanceName) {
			this.referanceName = referanceName;
		}

		/**
		 * Returns telephone of referance.
		 * @return telephone of referance.
		 */
		public String getTelNo() {
			return telNo;
		}

		/**
		 * Sets telephone of referance.
		 * @param telNo telephone of referance.
		 */
		public void setTelNo(String telNo) {
			this.telNo = telNo;
		}

		/**
		 * Returns email of referance.
		 * @return email of referance.
		 */
		public String getEmail() {
			return Email;
		}

		/**
		 * Sets email of referance.
		 * @param email email of referance.
		 */
		public void setEmail(String email) {
			Email = email;
		}

		/**
		 * Returns company name of referance.
		 * @return company name of referance.
		 */
		public String getCompanyName() {
			return CompanyName;
		}

		/**
		 * Sets company name of referance.
		 * @param companyName
		 */
		public void setCompanyName(String companyName) {
			CompanyName = companyName;
		}

		/**
		 * Gets job of referance.
		 * @return job of referance.
		 */
		public String getJob() {
			return Job;
		}

		/**
		 * Sets  job of referance.
		 * @param job  job of referance.
		 */
		public void setJob(String job) {
			Job = job;
		}
	}

	/**
	 * To string method of CvClass
	 * @return string CvClass
	 */
	@Override
	public String toString() {
		return "CvClass [Address=" + Address + ", Name=" + Name + ", Surname=" + Surname + ", TelNo=" + TelNo
				+ ", Email=" + Email + ", Gender=" + Gender + ", BirthDay=" + BirthDay + ", Nationality=" + Nationality
				+ ", CoverLetter=" + CoverLetter + ", SchoolInformation=" + SchoolInformation + ", Experiences="
				+ Experiences + ", Certficates=" + Certficates + ", Capabilities="
				+ Capabilities + ", Referances=" + Referances + ", DriversLicense=" + DriversLicense + "]";
	}
	
}
