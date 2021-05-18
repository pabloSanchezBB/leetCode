package easy;

import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class ListCycle {
    public boolean hasCycle(ListNode head)
    {   //This vvv is Wrong, use an ArrayList and stroe the current node, ignore pos
//         //iterate through the nodes. If any have position null then the list is finished
//         if(head == null) return false;
//         if (head.next == null) return false;

//         //use Hashset to store the positions, if there's a duplicate return true
//         HashSet<Integer> set = new HashSet<>();
//         set.add(head.val);

//         while(head.next != null){
//             head = head.next;
//             if(set.contains(head.val)) return true;
//             else {
//                 set.add(head.val);
//             }
//         } return false;

        ListNode curr = head;
        ArrayList arrList = new ArrayList();

        while(curr != null){ //while the node is pointing to something
            if(arrList.contains(curr.next)) return true; //if we've already hit this node
            else arrList.add(curr.next); //else add current node's next node to the list

            //iterate to the next ListNode
            curr = curr.next;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
