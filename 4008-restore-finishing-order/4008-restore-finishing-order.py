class Solution:
    def recoverOrder(self, order: List[int], friends: List[int]) -> List[int]:
        data = {}
        for i,j in enumerate(order):
            data[j]=i
        
        friends.sort(key=lambda x:data[x])
        return friends
