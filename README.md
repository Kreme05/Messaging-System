# CS-115 Programming II - Coursework 1: Spies!
> ⚠️ Academic Integrity Notice  
> The code in this repository is part of my university coursework. It is shared for learning and portfolio purposes only. Please do not copy or submit this as your own work in any course or assignment.

## Assignment Structure

### Stage 1: Agent Class
- Attributes: `agentName`, `codeName`, `UID`, `agentID`
- `agentID` auto-increments from 549321
- Encapsulation through getters/setters
- `UID` is `codeName@agentID`
- Includes a `toString()` method

### Stage 2: AgentUnitTest
- Four static test methods:
  - `testConstructorAndGetters()`
  - `testSetters()`
  - `testAgentIDs()`
  - `testToString()`
- Outputs test results to the console

### Stage 3: Clearance Enum
- Enum values: `LEVEL1A`, `LEVEL1B`, `LEVEL2`, `LEVEL3`
- `agentClearance` added to Agent class
- Overloaded constructor and `getAgentInfo()` method

### Stage 4: Message Class
- Attributes: `from`, `to` (Agent), `contents` (String)
- Encapsulation and a `toString()` method that formats output:

### Stage 5: Inbox (Linked List)
- Each Message includes a `next` pointer
- `Inbox` has:
- `receive(Message)`
- `read()`: LIFO reading and removal
- `printAll()`: recursive message printing ending with `<no more messages>`

### Stage 6: Message Encoding
- Added `encoded[]` (int array)
- `encode()` method converts `contents` to ASCII codes
- `getEncoded()` returns formatted output

## Stage 7: Encrypting & Decrypting
-`encrypted[]` and decrypted[] arrays added to Message class
- `encrypt(int key)` method for Caesar cipher encryption
- `decrypt(int key)` method for decrypting the message
- `debugString()` method for debugging message states

## Learning Outcomes
- The importance of a testing code from each class
- Implement and use basic data structures (linked lists, arrays)
- Apply recursion and string manipulation
- Follow the code conventions to in my software development model
