# Linked List Challenge 05
The task involves building a Linked List class with fundamental methods. You'll define a Node class to hold values and references. Then, create the LinkedList class, implementing methods for insertion, value checking, and generating formatted output. Focus on clean, reusable code while following naming conventions. Validate with tests covering various scenarios before submission.

## Whiteboard Process
[linkedList](./Screenshot%20(422).png)

## Approach & Efficiency
Approach: Build a Node class to hold values and references. Create the LinkedList class with essential methods - insert adds nodes at the beginning, includes checks value existence, and to_string generates formatted output. Thoroughly test for different scenarios.

Efficiency:

Insert Method: O(1) as it adds nodes at the start.
Includes Method: O(n) in worst case due to linear traversal.
to_string Method: O(n) to format the output based on node count.

## Solution
public class Linkylist {
public Node head;
public Linkylist()
{
this.head=null;
}
public void insert (int value)
{
try {
Node nodeValue = new Node(value);
nodeValue.nextValue = head;
head = nodeValue;
}catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
}
}
public boolean includes (int value)
{
Node i =head;
while (i!=null)
{
if(i.value == value)
{return true;}
i=i.nextValue;
}
return false;
}
public String to_string() {
try {
String output = "";
Node heady = head;
while (heady != null) {
output += "{" + heady.value + "} -> ";
heady = heady.nextValue;
}
output += "NULL";
return output;
} catch (Exception e) {
System.out.println("An error occurred: " + e.getMessage());
return null;
}
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
public class Node {
public int value;
public linklist.Node nextValue;
public Node(int value)
{
this.value = value;
this.nextValue=null;
}