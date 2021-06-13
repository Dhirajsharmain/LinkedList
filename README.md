# LinkedList

**UC1-CreateSimpleLinkedList**

Description : Lets create a simple Linked List of 56, 30 and 70

**UC2-AddAtStart**

Description : Ability to create Linked List by adding 30 and 56 to 70
- Node with data 70 is First Created
- Next 30 is added to 70
- Finally, 56 is added to 30
- LinkedList Sequence: 56->30->70

**UC3-AppendingTheList**

Description : Ability to create Linked List by appending 30 and 70 to 56
- Node with data 56 is First Created
- Next Append 30 to 56
- Finally, Append 70 to 30
- LinkedList Sequence: 56->30->70

**UC4-InsertAtIndex**

Description : Ability to insert 30 between 56 and 70
- Final Sequence: 56->30->70

**UC5-DeleteFirstElement**

Description : Ability to delete the first element in the LinkedList of sequence 56->30->70 
- Write pop method
- Note there is new head
- Final Sequence: 30->70

**UC6-DeleteLastElement**

Description : Ability to delete the last element in the LinkedList of sequence 56->30->70 
- Write popLast method
- Note there is new tail
- Final Sequence: 56->30

**UC7-SearchByValue**

Description : Ability to search LinkedList to find Node with value 30
- Write Junit Test Case as demonstrated in class
- Loop through LinkedList to find node with key 30

**UC8-SearchByValueAndInsert**

Description : Ability to insert 40 after 30 to the Linked List sequence of 56->30->70
- Write Junit Test Case as demonstrated in class
- Search LinkedList to get Node with key value 30
- Then Insert 40 to 30
- Final Sequence: 56->30->40->70