class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        for i in range(len(s)):
            if s[i] in ')]}' and len(stack)==0:
                return False
            if s[i] in '([{':
                stack.append(s[i])
            elif s[i] in ')]}':
                if s[i]==')' and stack[-1]=='(':
                    stack.pop(-1)
                elif s[i]==']' and stack[-1]=='[':
                    stack.pop(-1)
                elif s[i]=='}' and stack[-1]=='{':
                    stack.pop(-1)
                else:
                    return False
        if len(stack)==0:
            return True
        return False
