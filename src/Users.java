package src;
 
/**
 * @author Group1
 * Abstract user class that contains basic info of an user.
 */
public class Users implements  UsersInterface{
    private String name;
    private int userID;
    private String password;
    private int type;
    public static final int HUMAN_SOURCES = 1;
    public static final int CANDIDATE = 2;
    public static final int ADMIN = 3;
    public static final int COMPANY = 4;

    /**
     * 
     * @param userID email of user
     * @param name Name of user
     * @param password password of user
     */
    public Users(int userID, String name, String password, int type){
        this.userID = userID;
        this.password = password;
        this.type = type;
        this.name = name;
    }

    /**
     * @return name of user.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Sets name of user
     * @param name name of user.
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return id of user
     */
    @Override
    public int getUserID(){
        return userID;
    }

    /**
     * Sets user id.
     * @param userID id of user
     */
    @Override
    public void setUserID(int userID){
        this.userID = userID;
    }

    /**
     * @return password of user.
     */
    @Override
    public String getPassword() {
        return password;
    }

    /**
     * @param password sets password.
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * return type of user.
     */
    @Override
    public int getType(){
        return type;
    } 

    public boolean equals(Object o){
        if(o instanceof Users){
            Users u=(Users)o;
            return getUserID()==u.getUserID() && getPassword().equals(u.getPassword());
        }
        return super.equals(o);
    }
    
}
