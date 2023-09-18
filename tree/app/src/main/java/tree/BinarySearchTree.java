    package tree;

    public class BinarySearchTree extends BinaryTree{
        public BinarySearchTree() {
            super();
        }

        public void add(int value) {
            root = addRecursive(root, value);
        }

        private Node addRecursive(Node current, int value) {
            if (current == null) {
                return new Node(value);
            }

            if (value < current.value) {
                current.left = addRecursive(current.left, value);
            } else if (value > current.value) {
                current.right = addRecursive(current.right, value);
            }

            return current;
        }
        public boolean contains(int value) {
            return containsRecursive(root, value);
        }

        private boolean containsRecursive(Node current, int value) {
            if (current == null) {
                return false;
            }

            if (value == current.value) {
                return true;
            }

            return value < current.value
                    ? containsRecursive(current.left, value)
                    : containsRecursive(current.right, value);
        }

    }
