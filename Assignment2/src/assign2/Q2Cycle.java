package assign2;
public class Q2Cycle {
    public static class Solution {
        /**
         * Node class for representing each element in the linked list.
         * <p>
         * The implementation of Floyd's Tortoise and Hare algorithm for cycle detection
         * in this class is inspired by the explanation found at:
         * https://dev.to/alisabaj/floyd-s-tortoise-and-hare-algorithm-finding-a-cycle-in-a-linked-list-39af
         * This source provides a clear explanation of the algorithm's principles and its application
         * for detecting cycles in linked lists.
         */
        public static class Node {
            int val;
            public Node next; //made public to be accessed in main.java

            public Node(int x) {
                this.val = x;
                this.next = null;
            }
        }

        /**
         * Checks for a cycle in the linked list using Floyd's Tortoise and Hare algorithm.
         * This method employs two pointers that move at different speeds. The 'slow' pointer
         * moves one step at a time, whereas the 'fast' pointer moves two steps at a time.
         * If the linked list contains a cycle, the 'fast' pointer will eventually meet
         * the 'slow' pointer, indicating a cycle. Otherwise, the 'fast' pointer will reach
         * the end of the list without meeting the 'slow' pointer, indicating no cycle.
         *
         * @param head The head of the linked list to be checked for a cycle.
         * @return true if a cycle is detected; false otherwise.
         */
        public boolean containsCycle(Node head) {
            if (head == null || head.next == null) return false;

            Node slow = head; // 'slow' starts at the head
            Node fast = head.next; // 'fast' starts one node ahead

            while (slow != fast) {
                if (fast == null || fast.next == null) {
                    return false;
                }

                slow = slow.next;
                fast = fast.next.next;
            }

            return true;
        }
    }
}