package machine.processor.data.structure;

public class Queue{

    private Item head;
    private Item tail;

    public Queue(){
        head = new Queue.Item(null);
        tail = head;
    }

    void enqueue(Node node){
        if ( head.element == null)
            head.element = node;
        else {
            Item temp = new Item(node);
            tail.setNext(temp);
            tail = temp;
        }
    }

    Node dequeue(){
        if (head == tail){
            Node temp = head.element;
            head.element = null;
            return temp;
        } else {
            Node temp = head.element;
            head = head.next;
            return temp;
        }
    }

    class Item{
        private Item next;
        private Node element;

        Item(Node element){
            this.element = element;
        }

        void setNext(Item item){
            this.next = item;
        }
    }
}
