class Solution:
    def mergesort(self,a,l,m,r):
        n1=m-l+1
        n2=r-m
        L=[0]*n1
        R=[0]*n2

        for i in range(n1):
            L[i]=a[l+i]
        
        for j in range(n2):
            R[j]=a[m+1+j]
        
        i=0
        j=0
        k=l
        while i<n1 and j<n2:
            if L[i]<=R[j]:
                a[k]=L[i]
                i+=1
            else:
                a[k]=R[j]
                j+=1
            k+=1

        while i<n1:
            a[k]=L[i]
            i+=1
            k+=1

        while j<n2:
            a[k]=R[j]
            j+=1
            k+=1
        
    def merge(self,a,l,r):
        if l<r:
            m=(l+r)//2
            self.merge(a,l,m)
            self.merge(a,m+1,r)
            self.mergesort(a,l,m,r)
    def maximumGap(self, nums: List[int]) -> int:
        
        self.merge(nums,0,len(nums)-1)
        print(nums)
        gap=0
        for i in range(len(nums)-1):
            gap=max(gap,nums[i+1]-nums[i])
        return gap
