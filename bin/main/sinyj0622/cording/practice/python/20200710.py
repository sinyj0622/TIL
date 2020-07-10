# a = [1,2,3]  리스트  생성수정삭제 가능
# a = (1,2,'a','b')  튜플 변경할 수 없다.

# 자료구조
# 숫자, 문자열, 불, 변수, 리스트, 튜플, 딕셔너리, 집합

# 딕셔너리 (key:value)
# a = {1:'a', 2:'b', 3:'c'}
# print(a.keys())
# print(a.values())
# print(a.items())
# for k, v in a.items():
#     print("키는 " + str(k))
#     print("값은 " + v)
# a.clear()
# print(a)
# print(a[4])
# print(a.get(4,'없음'))
# print(1 in a)

# 집합 (중복값 불가능, unordered) - 중복을 제거할 때 사용한다.
# l = [1,2,2,3,3]
# newList = list(set(l))
# print(newList)

# 교집합
# s1 = set([1,2,3,4,5,6])
# s2 = set([4,5,6,7,8,9])
# print(s1.intersection(s2))
# print(s1 & s2)

# 합집합
# s1 = set([1,2,3,4,5,6])
# s2 = set([4,5,6,7,8,9])
# print(s1.union(s2))
# print(s1 | s2)

# 차집합
# s1 = set([1,2,3,4,5,6])
# s2 = set([4,5,6,7,8,9])
# print(s2.difference(s1))
# print(s2 - s1)

# s1 = set([1,2,3,4,5,6])
# s1.remove(1)
# print(s1)

# from copy import copy
# a = [1,2,3,4]
# b = copy(a)
# a[1] = 4
# print(a)
# print(b)

# a = 3
# b = 5

# a,b = b,a
# print(a)
# print(b)
