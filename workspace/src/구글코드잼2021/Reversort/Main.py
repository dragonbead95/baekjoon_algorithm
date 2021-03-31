def Reverse(L, i, j):
    cost = 0
    size = j-i+1
    for idx, idx2 in zip(range(i, j+1), range(0, size)):
        if size == 1:
            return 1
        if idx2 >= int(size/2):
            cost = cost + (size-idx2)
            return cost

        temp = L[idx]
        L[idx] = L[size-idx-1]
        L[size-idx-1] = temp

        cost = cost + 1
    return cost


def ReverSort(L):
    answer = 0
    for i in range(0, len(L)-1):
        sub_L = L[i:len(L)]
        j = L.index(min(sub_L))
        answer = answer + Reverse(L, i, j)
    return answer


def main():
    tc = int(input())

    for i in range(tc):
        n = int(input())
        L = list(map(int, input().split(" ")))
        print("Case #{}: {}".format(i+1, ReverSort(L)))


main()
