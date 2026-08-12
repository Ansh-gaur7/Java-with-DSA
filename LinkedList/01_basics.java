class basics{
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    static void displayrec(Node head){
        if(head==null) return;
        System.out.print(head.val+" ");
        displayrec(head.next);
    }
    static void display(Node head){
        if(head==null) return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        displayrec(a);
        display (a);

        
    }
}