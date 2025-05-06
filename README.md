## Project Structure - Secret Agent Messaging System
- A modular Java project that models secure communication between agents, featuring auto-incremented IDs, security clearances, messaging with encryption, and a custom inbox system.

## 📌 Features by Stage
### Stage 1: Agent Class
- Attributes: agentName, codeName, UID, agentID (starts from 549321)
- UID format: codeName@agentID
- Auto-incremented agentID
- Full encapsulation with getters/setters
- toString() method for agent details

### Stage 2: Unit Testing
- AgentUnitTest contains:
  - testConstructorAndGetters()
  - testSetters()
  - testAgentIDs()
  - testToString()
-Prints test results to console

### Stage 3: Clearance Enum
- Enum: LEVEL1A, LEVEL1B, LEVEL2, LEVEL3
- agentClearance field added to Agent
- Overloaded constructor supports clearance
- getAgentInfo() method returns extended agent info

### Stage 4: Message Class
- Attributes: from (Agent), to (Agent), contents (String)
- Fully encapsulated
- toString() for formatted message output

### Stage 5: Inbox System (LIFO Linked List)
- Message objects include next pointer
- Inbox class supports:
  - receive(Message msg)
  - read() – removes & returns latest message
  - printAll() – recursively prints messages ending with <no more messages>

### Stage 6: Message Encoding
- encoded[]: stores ASCII values of contents
- encode() converts contents to ASCII
- getEncoded(): returns formatted output of encoded[]

### Stage 7: Encryption & Decryption
- Encryption Method: Caesar cipher
- Fields: encrypted[], decrypted[]
  - encrypt(int key) – shifts characters
  - decrypt(int key) – reverses the shift
- debugString() – shows encoded/encrypted/decrypted message states

### 🚀 How to Run
- Compile all .java files.
- Run AgentUnitTest to verify functionality.
- Use the Agent, Message, and Inbox classes to simulate secure communication.

### 🔧 Technologies
- Java (OOP, Linked Lists, Enums)
- JUnit-style testing (manual)
- Caesar Cipher Encryption

## Learning Outcomes
- The importance of a testing code from each class
- Implement and use basic data structures (linked lists, arrays)
- Apply recursion and string manipulation
- Follow the code conventions to in my software development model
