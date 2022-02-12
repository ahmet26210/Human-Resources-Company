package src;

public interface UsersInterface {

    /**
     * Returns user name
     * @return name of user.
     */
    public String getName();

    /**
     * Sets name of user
     * @param name name of user.
     */
    public void setName(String name);

    /**
     * Returns user id
     * @return id of user
     */
    public int getUserID();

    /**
     * Sets user id.
     * @param userID id of user
     */
    public void setUserID(int userID);

    /**
     * Returns user password
     * @return password of user.
     */
    public String getPassword();

    /**
     * Sets user password
     * @param password sets password.
     */
    public void setPassword(String password);

    /**
     * Returns user type
     * @return type of user.
     */
    public int getType();


}
