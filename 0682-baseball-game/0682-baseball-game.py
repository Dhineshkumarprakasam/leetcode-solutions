class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack=[]

        for i in range(len(operations)):
            if operations[i].isdigit():
                stack.append(int(operations[i]))

            if operations[i][0]=='-':
                stack.append(int(operations[i]))

            if operations[i]=='C':
                stack.pop(-1)
            if operations[i]=='D':
                stack.append(stack[-1]*2)
            if operations[i]=='+':
                stack.append(stack[-1] + stack[-2])
            print(stack)
        return sum(stack)
