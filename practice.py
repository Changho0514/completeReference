
import sys

s_list = [input() for _ in range(3)]
# print(s_list)
# print("s_list의 사이즈는 ", len(s_list))

c = [] 
for i in range(len(s_list)):
    # print(s_list[i])
    b = str(s_list[i]).split("/")
    c.append(b)
    
# print("c = ", c)

for i in range(len(c)):
    bank = c[i][0]
    if "은행" in bank:
        c[i][0] = bank[0:-2]

    account = c[i][1]
    count = 0
    print(account)
    print("account[0] = ", account[0])
    print("account[len(account)] = ", account[len(account)-1])
    # for j in range(0, len(account)-1):
    #     if account[j] == "-":
    #         count += 1
    #         if count >= 1:
    #             account = account[0:j] + account[j: len(account)+1]
print(c)
        





# a = "우체국/23324-3242341-14/당근"
# print(a.split("/"))

# 하나은행/14435-234-23512-11/핸드폰
# 우리/457-34-23-111-12/PC
# 우체국은행/23324-3242341-14/당근
