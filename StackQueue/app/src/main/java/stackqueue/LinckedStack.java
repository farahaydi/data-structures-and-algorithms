package stackqueue;

    public class LinckedStack<T extends Number> {
        public Node top;
        public int length;

        public LinckedStack() {
            this.top = null;
            this.length = 0;
        }

        public boolean isEmpty() {
            return this.top == null;
        }

        public void push(T newValue) {
            if (!(newValue instanceof Number)) {
                throw new IllegalArgumentException("Only numeric values are allowed.");
            }

            Node newItem = new Node(newValue.intValue());
            newItem.next = this.top;
            this.top = newItem;
            length++;
        }

        public int pop() {
            if (isEmpty()) {
                throw new IllegalArgumentException("Stack Is Empty");
            }
            int removedValue = top.item;
            top = top.next;
            length--;
            return removedValue;
        }

        public int peek() {
            if (isEmpty()) {
                throw new IllegalArgumentException("Stack Is Empty");
            }
            return top.item;
        }
        public int getMax() {
            if (isEmpty()) {
                throw new IllegalArgumentException("Stack Is Empty");
            }

            Node current = top;
            int max = current.item;

            while (current != null) {
                if (current.item > max) {
                    max = current.item;
                }
                current = current.next;
            }

            return max;
        }

    }




