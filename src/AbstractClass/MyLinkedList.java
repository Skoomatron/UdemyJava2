package AbstractClass;

public class MyLinkedList implements NodeList{

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }
        ListItem current = this.root;
        while (current != null) {
            int compare = current.compareTo(item);
            if (compare < 0) {
                if (current.next() != null) {
                    current = current.next();
                } else {
                    current.setNext(item);
                    item.setPrevious(current);
                    return true;
                }
            } else if (compare > 0) {
                if (current.previous() != null) {
                    current.previous().setNext(item);
                    item.setPrevious(item.previous());
                    current.setPrevious(item);
                } else {
                    item.setNext(this.root);
                    this.root.setPrevious(item);
                    this.root = item;
                }
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem current = this.root;
        while (current != null) {
            int compare = current.compareTo(item);
            if (compare == 0) {
                if (current == this.root) {
                    this.root = current.next();
                } else {
                    current.previous().setNext(current.next());
                    if (current.next() != null) {
                        current.next().setPrevious(current.previous());
                    }
                }
                return true;
            } else if (compare < 0) {
                current = current.next();
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("null");
        } else {
            while (root != null) {
                root = root.next();
            }
        }
    }
}
