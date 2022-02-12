package src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.TreeMap;

import src.book_implementation.AVLTree;
import src.book_implementation.SkipList;


@SuppressWarnings("unused")
public class HRC{
		public static int  USERS_ID=0;
		private AVLTree<HumanResources> humanResources=null;
		private ArrayList<Users> users=null;
		private SkipList<Company> company=null;
		private NavigableMap<Integer,Candidate> candidate=null;
		private ArrayList<Meetings> meetings;
		private Admin admin=null;
		private HumanResources hmOne;
		
		public HRC(){
			humanResources=new AVLTree<>();
			company=new SkipList<>();
			candidate=new TreeMap<>();
			meetings=new ArrayList<>();
			users=new ArrayList<>();
			admin=new Admin(USERS_ID++, "admin","123", this);
			getUsers().add((Users)admin);

			hmOne=createHumanResources("human", "123");
			System.out.println("Human- ID:"+hmOne.getUserID()+" Password:"+hmOne.getPassword());

			
			System.out.println("Information of Admin \n ID:"+admin.getUserID()+" Password:123");
		}

		public SkipList<Company> getCompany() { return company; }

		public Company getCompanyID(int ID){
			Company com=null;
			Iterator<Company> itr=getCompany().iterator();
			while (itr.hasNext()){
				com=itr.next();
				if (com.getUserID()==ID){
					return com;
				}
			}
			return null;
		}
		

		public AVLTree<HumanResources> getHumanResources() { return humanResources; }

		public HumanResources getHumanResourcesID(int id){
			return getHumanResources().find(new HumanResources(id, null, null, null));
		}

		public ArrayList<Meetings> getMeetings() { return meetings; }

		public Admin getAdmin(){	return admin;	}

		public Candidate getCandidateID(int id){	return candidate.get(id);	}
		
		public NavigableMap<Integer,Candidate> getCandidate(){	return candidate;	}
		
        
		private Company createCompany(int ID,String name, String password ,String companySector,
						int numberOfEmployees, String address){
			Company comp=new Company(ID,name,password,companySector,numberOfEmployees,address,this);
			company.add(comp);
            users.add(comp);
			return comp;
		}

		public Company createCompany(String name, String password,String companySector,
								int numberOfEmployees,String address){
			return createCompany(USERS_ID++,name,password,companySector,numberOfEmployees,address);
		}

		private HumanResources createHumanResources(int ID,String name, String password){
            HumanResources hr = new HumanResources(ID,name,password,this);
            users.add(hr);
			getHumanResources().add(hr);
			return hr;
		}

		public HumanResources createHumanResources(String name, String password){
			return createHumanResources(USERS_ID++,name,password);
		}

        public Candidate createCandidate(String name,String password,CvClass cv){
			return createCandidate(USERS_ID++,name,password,cv);
		}

		private Candidate createCandidate(int ID,String name,String password,CvClass cv){
			Candidate temp=new Candidate(ID,name,password,cv,this);
			getUsers().add((Users)temp);
			candidate.put(ID, temp);
			return temp;
		 }
		public ArrayList<Users> getUsers(){
			return users;
		}

		public Users getUserID(int ID){
			Users user=null;
			Iterator<Users> itr=getUsers().iterator();
			while (itr.hasNext()){
				user=itr.next();
				if (user.getUserID()==ID){
					return user;
				}
			}
			return null;
		}

		public HumanResources getDefaultHumanResources(){
				return hmOne;
		}

}
