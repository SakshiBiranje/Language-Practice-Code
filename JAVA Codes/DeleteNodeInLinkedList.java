import java.util.Scanner;

class ListNode
{
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class DeleteNodeInLinkedList 
{

    public void deleteNode(ListNode node) 
    {
        if (node == null || node.next == null) 
        {
            System.out.println("Cannot delete the node");
            return;
        }
        node.val = node.next.val;  
        node.next = node.next.next;  
    }

    public void printList(ListNode head) 
    {
        ListNode current = head;
        while (current != null) 
        {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public ListNode insertNode(ListNode head, int val) 
    {
        if (head == null) {
            return new ListNode(val);
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(val);
        return head;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        DeleteNodeInLinkedList obj = new DeleteNodeInLinkedList();

        ListNode head = null;
        System.out.println("Enter the number of nodes in the linked list:");
        int n = sc.nextInt();

        System.out.println("Enter the values for the linked list:");
        for (int i = 0; i < n; i++) 
        {
            int val = sc.nextInt();
            head = obj.insertNode(head, val);
        }

        System.out.println("Linked list before deletion:");
        obj.printList(head);

        System.out.println("Enter the value of the node to delete (not the last node):");
        int deleteVal = sc.nextInt();

        ListNode nodeToDelete = head;
        while (nodeToDelete != null && nodeToDelete.val != deleteVal) {
            nodeToDelete = nodeToDelete.next;
        }

        if (nodeToDelete != null && nodeToDelete.next != null) {
            obj.deleteNode(nodeToDelete);
        } else {
            System.out.println("Node cannot be deleted (it may be the last node or doesn't exist).");
        }

        System.out.println("Linked list after deletion:");
        obj.printList(head);

        sc.close();
    }
}
