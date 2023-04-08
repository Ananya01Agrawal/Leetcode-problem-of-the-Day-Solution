class Solution{
HashMap<Node, Node> mp = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        if (mp.containsKey(node)) return mp.get(node);

        Node newNode = new Node(node.val);
        mp.put(node, newNode);
        
        for (Node nb: node.neighbors) {
            newNode.neighbors.add(cloneGraph(nb));
        }

        return newNode;
    }
}
