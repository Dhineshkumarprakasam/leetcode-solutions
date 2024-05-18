/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* insertGreatestCommonDivisors(struct ListNode* head){
    struct ListNode *newnode,*temp;
    
    temp=head;
    while(temp->next!=0)
    {
        int a=temp->val;
        int b=temp->next->val;

        while (b != 0) 
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        newnode=malloc(sizeof(struct ListNode));
        newnode->val=a;
        newnode->next=temp->next;

        temp->next=newnode;
        temp=temp->next->next;

    }
    return head;
}