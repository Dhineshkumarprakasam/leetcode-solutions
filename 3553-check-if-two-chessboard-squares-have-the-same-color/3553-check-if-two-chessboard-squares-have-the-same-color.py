class Solution:
    def check(self,s):
        oddAl=['b','d','f','h']

        if s[0] in oddAl and int(s[1])%2!=0:
            color="black"
        elif s[0] not in oddAl and int(s[1])%2!=0:
            color="white"
        elif s[0] in oddAl and int(s[1])%2==0:
            color="white"
        elif s[0] not in oddAl and int(s[1])%2==0:
            color="black"
        return color

    def checkTwoChessboards(self, coordinate1: str, coordinate2: str) -> bool:
        first=self.check(coordinate1)
        second=self.check(coordinate2)
        print(first,second)
        if first==second:
            return True
        return False