import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Node, Node> map = new HashMap<>();

    public Node copyRandomList(Node head) {
        if (head == null) return null;

        if (map.containsKey(head)) return map.get(head);

        Node newNode = new Node(head.val);
        map.put(head, newNode);

        newNode.next = copyRandomList(head.next);
        newNode.random = copyRandomList(head.random);

        return newNode;
    }
}
/*
1. Base Cases:

If the input head is null, return null because there's nothing to copy.
Check if the hash map (mp) already contains the head node. If it does, return the corresponding copied node from the map. This is done to avoid copying the same node multiple times.

Creating a New Node:
If the head node is not in the hash map, create a new node (newNode) with the same value as the head node.
Store this mapping in the hash map, where the original head node is mapped to the newly created newNode.

Recursion:
Recursively call copyRandomList for the next and random pointers of the head node. This will ensure that we create deep copies of the nodes pointed to by next and random.
Assign the results of the recursive calls to newNode->next and newNode->random. This establishes the correct relationships in the copied list.

Return Result:
Return newNode as the result, which is the head of the copied list.
*/
