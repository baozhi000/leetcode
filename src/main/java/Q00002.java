import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Q00002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode median = null;

        int curor=0;

        do{
            int total=0;
            if(l1!=null){
                total+=l1.val;
            }
            if(l2!=null){
                total+=l2.val;
            }
            total+=curor;
            curor=total/10;
            ListNode current=new ListNode(total%10);
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
            if(result==null){
                result=current;
            }else if(result.next==null){
                result.next=current;
                median=current;
            }else{
                median.next=current;
                median=current;
            }

        }while (l1 != null || l2 != null||curor!=0);

        return  result;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(0);
//        l1.next=new ListNode(4);
//        l1.next.next=new ListNode(3);
//        l1.next.next.next=new ListNode(3);
//        l1.next.next.next.next=new ListNode(3);
        ListNode l2=new ListNode(0);
//        l2.next=new ListNode(6);
//        l2.next.next=new ListNode(4);
        Q00002 q2=new Q00002();
        q2.addTwoNumbers(l1,l2);

    }
    
}
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }