package inflearn.section7;


import java.util.LinkedList;
import java.util.Queue;

public class Bfs7 {
    Node root;

    public void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int level=0;

        while (!queue.isEmpty()) {
            System.out.print(level+": ");
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                Node cur = queue.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) {
                    queue.add(cur.lt);
                }
                if (cur.rt != null) {
                    queue.add(cur.rt);
                }
            }
            level++;
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Bfs7 tree = new Bfs7();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);

    }
}
