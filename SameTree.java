public class SameTree {

    static class node {
        int data;
        node left, right;

        node(int data) {
            this.data = data;
        }
    }

    public static boolean isSameTree(node p, node q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.data != q.data) {
            return false;
        }

        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {

        node root1 = new node(1);
        root1.left = new node(2);
        root1.right = new node(3);

        node root2 = new node(1);
        root2.left = new node(2);
        root2.right = new node(3);

        System.out.println(isSameTree(root1, root2));
    }
}
