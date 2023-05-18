package inflearn.section7;


public class Dfs9 {
    Node root;

    public int DFS(int level, Node root) {
        if (root.lt == null && root.rt == null) {
            return level;
        } else {
            return Math.min(DFS(level+1, root.lt), DFS(level+1, root.rt));
        }
    }


    public static void main(String[] args) {
        Dfs9 tree = new Dfs9();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(0,tree.root);

    }
}
