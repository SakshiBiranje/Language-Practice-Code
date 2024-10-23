import java.util.Scanner;

//delete node in a linked list
public class DeleteNode{
    // method 
    public void DeleteNodeinLinkedList(ListNode node){
        node.val = node.next.value;
        node.next= node.next.next;

    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of linked list : ");
        int size = sc.nextInt();
        int[] node = new node;
        System.out.print("Enter the elements in a linked list : ");
        for(int i=0;i<size;i++) {
            node[size]= sc.nextInt();
        }
        DeleteNode obj = new DeleteNode();
        int ListNode= sc.DeleteNodeinLinkedList(node);
        System.out.println("node : "+ListNode);
        
    }
}