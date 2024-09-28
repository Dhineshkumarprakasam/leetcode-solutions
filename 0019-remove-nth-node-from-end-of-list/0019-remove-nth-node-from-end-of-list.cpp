/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int length=0;
        ListNode *temp=head;

        while(temp!=nullptr)
        {
            length++;
            temp=temp->next;
        }
        if(length==1)
            return nullptr;

        int pos=length-n;
        if(pos==0)
        {
            return head->next;
        }
        temp=head;
        for(int i=0;i<pos-1;i++)
            temp=temp->next;
        ListNode *garbage = temp->next;
        temp->next=temp->next->next;
        delete garbage;
        return head;
    }
};