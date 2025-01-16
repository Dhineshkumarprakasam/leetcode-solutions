class Solution:
    def noDup(self,arr):
        if len(set(arr))==len(arr):
            return True
        return False

    def minimumOperations(self, nums: List[int]) -> int:
        op=0
        while len(nums)>0 and self.noDup(nums)==False:
            nums=nums[3:]
            op+=1
        return op



        