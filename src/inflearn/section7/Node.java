package inflearn.section7;

class Node {
    int data;
    int level;
    Node lt, rt;

    public Node(int val) {
        this.data = val;
        this.lt = null;
        this.rt = null;
    }
}
