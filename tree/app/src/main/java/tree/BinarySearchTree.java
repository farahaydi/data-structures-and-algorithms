    package tree;
    public class BinarySearchTree extends BinaryTree {
        public BinarySearchTree() {
            super();
        }

        public void add(int value) {
            root = addRecursive(root, value);
        }

        private FizzBuzzNode addRecursive(FizzBuzzNode current, int value) {
            if (current == null) {
                return new FizzBuzzNode(Integer.toString(value));
            }

            if (value < Integer.parseInt(current.value)) {
                current.left = addRecursive((FizzBuzzNode) current.left, value);
            } else if (value > Integer.parseInt(current.value)) {
                current.right = addRecursive((FizzBuzzNode) current.right, value);
            }

            return current;
        }

        public boolean contains(int value) {
            return containsRecursive(root, value);
        }

        private boolean containsRecursive(FizzBuzzNode current, int value) {
            if (current == null) {
                return false;
            }

            if (value == Integer.parseInt(current.value)) {
                return true;
            }

            return value < Integer.parseInt(current.value)
                    ? containsRecursive((FizzBuzzNode) current.left, value)
                    : containsRecursive((FizzBuzzNode) current.right, value);
        }

        public FizzBuzzNode fizzBuzzTree(FizzBuzzNode node) {
            if (node == null) {
                return null;
            }

            FizzBuzzNode newNode = new FizzBuzzNode("");

            if (Integer.parseInt(node.getValue()) % 3 == 0 && Integer.parseInt(node.getValue()) % 5 == 0) {
                newNode.setValue("FizzBuzz");
            } else if (Integer.parseInt(node.getValue()) % 3 == 0) {
                newNode.setValue("Fizz");
            } else if (Integer.parseInt(node.getValue()) % 5 == 0) {
                newNode.setValue("Buzz");
            } else {
                newNode.setValue(node.getValue());
            }

            newNode.left = fizzBuzzTree((FizzBuzzNode) node.left);
            newNode.right = fizzBuzzTree((FizzBuzzNode) node.right);

            return newNode;
        }
    }
