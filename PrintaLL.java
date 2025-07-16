import java.util.LinkedList;

public class PrintaLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode= new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        
    }

    public void print(){
        if(head==tail){
            System.out.println("null");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public void reverse(){
        Node prev=null;
        Node curr= tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void dltNthfromEnd(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        //sz-n
        int i=1;
        int itoFind=sz-n;
        Node prev=head;
        while(i< itoFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;   
    }

    public static void removeCycle(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                cycle = true;
                break;
            }
        }
        if(cycle==false)
        return;

        slow=head;
        Node prev= null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    }

    public static void main(String[] args) {
        PrintaLL ll= new PrintaLL();
        
    //     ll.addFirst(2);
    //     ll.addFirst(1);
    //     ll.addLast(3);
    //     ll.addLast();
    //     ll.addLast(4);
    // //    // ll.print();
    // //     ll.reverse();
    // //    // ll.print();
    //     ll.dltNthfromEnd();
    //     ll.print();
    //     // System.out.println(ll.itrSearch(6));
    head=new Node(1);
    Node temp= new Node(2);
    head.next=temp;
    head.next.next=new Node(3);
    head.next.next.next=temp;
        removeCycle();
        System.out.println(isCycle());

    }

}
