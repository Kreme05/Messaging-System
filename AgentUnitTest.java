/**
 * A test class that checks that the expected output matches the actual output.
 * This test checks the constructor, getters, setters, agentIDs and toString method.
 */
public class AgentUnitTest {
    /**
     * Runs all the tests.
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        testConstructorAndGetters();
        testSetters();
        testAgentIDs();
        testToString();
    }

    /**
     * Tests the constructors and getter methods.
     * Checks that the agent created matches the expected output.
     */
    public static void testConstructorAndGetters(){
        Agent agent1 = new Agent("Kaito Onyejeli", "Silver");

        System.out.println("\ntestConstructorAndGetters:");

        String expectedAgentName = "Kaito Onyejeli";
        String expectedCodeName = "Silver";
        String expectedUID = "Silver@549321";
        int expectedAgentID = 549321;

        System.out.println("Expected AgentName: " + expectedAgentName);
        System.out.println("Actual AgentName: " + agent1.getAgentName());
        if (expectedAgentName.equals(agent1.getAgentName())) {
            System.out.println("Test Passed for agentName");
        } else {
            System.out.println("Test Failed for agentName");
        }

        System.out.println("\nExpected CodeName: " + expectedCodeName);
        System.out.println("Actual CodeName: " + agent1.getCodeName());
        if (expectedCodeName.equals(agent1.getCodeName())) {
            System.out.println("Test Passed for codeName");
        } else {
            System.out.println("Test Failed for codeName");
        }

        System.out.println("\nExpected UID: " + expectedUID);
        System.out.println("Actual UID: " + agent1.getUID());
        if (expectedUID.equals(agent1.getUID())) {
            System.out.println("Test Passed for UID");
        } else {
            System.out.println("Test Failed for UID");
        }

        System.out.println("\nExpected AgentID: " + expectedAgentID);
        System.out.println("Actual AgentID: " + agent1.getAgentID());
        if (expectedAgentID == agent1.getAgentID()) {
            System.out.println("Test Passed for agentID");
        } else {
            System.out.println("Test Failed for agentID");
        }
    }

    /**
     * Tests the setter methods.
     * Checks that the agentName and CodeName is updated correctly.
     */
    public static void testSetters(){
        Agent agent1 = new Agent("Kaito Onyejeli", "Silver");

        agent1.setAgentName("Kaito Onyejeli");
        agent1.setCodeName("Silver");

        System.out.println("\n\ntestSetters:");

        String expectedAgentName = "Kaito Onyejeli";
        String expectedCodeName = "Silver";

        System.out.println("Expected AgentName: " + expectedAgentName);
        System.out.println("Actual AgentName: " + agent1.getAgentName());
        if (expectedAgentName.equals(agent1.getAgentName())) {
            System.out.println("Test Passed for toString");
        } else {
            System.out.println("Test Failed for toString");
        }

        System.out.println("\nExpected CodeName: " + expectedCodeName);
        System.out.println("Actual CodeName: " + agent1.getCodeName());
        if (expectedCodeName.equals(agent1.getCodeName())) {
            System.out.println("Test Passed for toString");
        } else {
            System.out.println("Test Failed for toString");
        }
    }

    /**
     * Tests the agentIDs method.
     * Checks that the agentID starts from 594321 and is incremented for each agent.
     */
    public static void testAgentIDs(){
        //Resets the firstAgentID so that the test starts from 549321
        Agent.setFirstAgentID(549321);
        Agent agent1 = new Agent("Kaito Onyejeli", "Silver");
        Agent agent2 = new Agent("John Doe", "Gold");

        System.out.println("\n\ntestAgentIDs:");

        int expectedAgentID1 = 549321;
        int expectedAgentID2 = 549322;

        System.out.println("Expected AgentID 1: " + expectedAgentID1);
        System.out.println("Actual AgentID 1: " + agent1.getAgentID());
        if (expectedAgentID1 == agent1.getAgentID()) {
            System.out.println("Test Passed for agent1");
        } else {
            System.out.println("Test Failed for agent1");
        }

        System.out.println("\nExpected AgentID 2: " + expectedAgentID2);
        System.out.println("Actual AgentID 2: " + agent2.getAgentID());
        if (expectedAgentID2 == agent2.getAgentID()) {
            System.out.println("Test Passed for agent2");
        } else {
            System.out.println("Test Failed for agent2");
        }
    }

    /**
     * Tests the toString method.
     * Checks that the format of the toString method is correct.
     */
    public static void testToString(){
        //Resets the firstAgentID so that the test starts from 549321
        Agent.setFirstAgentID(549321);
        Agent agent1 = new Agent("Kaito Onyejeli", "Silver");
        System.out.println("\n\ntestToString:");

        String expectedOutput = "Agent Name: Kaito Onyejeli\n" + "Code Name: Silver\n"
                + "UID: Silver@549321\n" + "AgentID: 549321\n" + "Clearance Level: LEVEL_3";

        System.out.println("Expected Output: " + expectedOutput);
        System.out.println("Actual Output: " + agent1);
        if (expectedOutput.equals(agent1.toString())) {
            System.out.println("Test Passed for toString");
        } else {
            System.out.println("Test Failed for toString");
        }
    }

}
