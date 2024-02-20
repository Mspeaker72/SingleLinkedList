# Single Linked List Implementation

This is a Java implementation of a single linked list data structure.

## Overview

The `SingleLinkedList` class provides methods to perform various operations on a single linked list, including:

- Creation of a single linked list with a specified head node or head and tail nodes.
- Printing the elements of the linked list.
- Checking if the linked list is empty.
- Getting the size of the linked list.
- Searching for a target value in the linked list and printing its index if found.
- Inserting a node at the end of the linked list (append).
- Inserting a node at a specified index in the linked list.
- Deleting a node with a specified target value from the linked list.
- Deleting a node at a specified index in the linked list.
- Getting the value of the last node in the linked list.
- Getting the value of the first node in the linked list.

## Time Complexity

- Insertion at the end of the list (append) takes constant time O(1).
- Insertion at a specific index takes linear time O(n) because it requires traversing the list.
- Deletion of a node with a specific target value or index also takes linear time O(n) due to traversal.
- Other operations such as printing, checking emptiness, and getting size take linear time O(n) as they involve traversing the entire list.

## Usage

To use the `SingleLinkedList` class, follow these steps:

1. Create a new instance of the `SingleLinkedList` class.
2. Use the provided methods to perform desired operations on the linked list.

Example usage:

```java
// Create a new empty linked list
SingleLinkedList myList = new SingleLinkedList();

// Append nodes to the list
myList.append(new Node(10));
myList.append(new Node(20));

// Print the list
myList.printList();

// Search for a value
myList.search(20);

// Delete a node
myList.delete(10);
