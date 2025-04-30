/**
 * A class for an agent with an agentName, codeName, UID, agentID.
 * The agentID starts as 549321 and increments with each new agent.
 */
public class Agent {
    private String agentName;
    private String codeName;
    private final String UID;
    private final int agentID;
    private static int firstAgentID = 549321;
    private Clearance agentClearance;

    /**
     * Stores the agentName and codeName of the new agent that has been created.
     * The agentID is automatically assigned and the UID is created with the codeName and agentID.
     * @param agentName The name of the agent.
     * @param codeName The code name of the agent.
     */
    public Agent(String agentName, String codeName) {
        this.agentName = agentName;
        this.codeName = codeName;
        this.agentID = firstAgentID++;
        this.UID = codeName + "@" + this.agentID;
    }

    /**
     * Overloading the Agent constructor to store clearance level as well as the agentName.
     * and codeName of the new agent that has been created.
     * The agentID is automatically assigned and the UID is created with the codeName and agentID.
     * @param agentName The name of the agent.
     * @param codeName The code name of the agent.
     * @param agentClearance The agent's clearance level.
     */
    public Agent(String agentName, String codeName, Clearance agentClearance) {
        this.agentName = agentName;
        this.codeName = codeName;
        this.agentID = firstAgentID++;
        this.UID = codeName + "@" + this.agentID;
        this.agentClearance = agentClearance;
    }

    /**
     * Accessor method for the agent name.
     * @return The name of the agent.
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * Mutator method for the agent name.
     * @param agentName The name of the agent.
     */
    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    /**
     * Accessor method for the agent's code name.
     * @return the agent's code name.
     */
    public String getCodeName() {
        return codeName;
    }

    /**
     * Mutator method for the code name.
     * @param codeName the agent's code name.
     */
    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    /**
     * Accessor method for the agent's UID.
     * @return the agent's UID.
     */
    public String getUID() {
        return UID;
    }

    /**
     * Accessor method for the agent's ID.
     * @return the agent's ID.
     */
    public int getAgentID() {
        return agentID;
    }

    /**
     * Accessor method for current first agent's ID.
     * @return the first agent's ID.
     */
    public int getFirstAgentID() {
        return firstAgentID;
    }

    /**
     * Mutator method for the first agent id.
     * @param newFirstAgentID the new first agent ID.
     */
    public static void setFirstAgentID(int newFirstAgentID) {
        firstAgentID = newFirstAgentID;
    }

    /**
     * Accessor method for the agent's clearance level.
     * @return the agents clearance level.
     */
    public Clearance getAgentClearance(){
        return agentClearance;
    }

    /**
     * A formatted string that includes the agent's UID and clearance level.
     * @return the agent's UID and clearance level.
     */
    public String getAgentInfo(){
        return UID + " (" + agentClearance + " clearance)";
    }

    /**
     * Displays all the agent's details.
     * @return A string that includes the agentName, codeName, UID and agentID.
     */
    @Override
    public String toString() {
        return "Agent Name: " + agentName + "\nCode Name: " + codeName
                + "\nUID: " + UID + "\nAgentID: " + agentID + "\nClearance Level: " + agentClearance;
    }
}
