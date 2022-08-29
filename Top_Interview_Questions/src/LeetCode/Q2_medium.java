package LeetCode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class Q2_medium {
	
	/* You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
	You may assume the two numbers do not contain any leading zero, except the number 0 itself. */
	public static void main(String[] args) {
		
	}
}


//Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution2{
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode current = dummyHead; // pointer
		int carry = 0; // The whole result list would be [0, x, y, z...]
		while (l1 != null || l2 != null || carry != 0) {
			int sum = 0;
			if (l1 != null) {
				sum = sum + l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum = sum + l2.val;
				l2 = l2.next;
			}
			sum = sum + carry;
			carry = sum / 10; // 0 or 1
			current.next = new ListNode(sum % 10); // linking this new node to the list
			current = current.next; // moving to the next 

		}
		
		return dummyHead.next; // returning the new head of the list
        
    }
	
}

