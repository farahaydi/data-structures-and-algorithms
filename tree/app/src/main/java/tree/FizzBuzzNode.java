package tree;
public class FizzBuzzNode extends BinaryTree.Node {
    String value;

    public FizzBuzzNode(String value) {
        super(0);
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}