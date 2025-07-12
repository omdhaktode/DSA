# code for to finding maximum from array


def solve(arr,key):
    list=[]
    for i in range(len(arr)-key+1):
        list.append(max(arr[i:i+key]))
    return list


arr= [1,3,-1,-3,5,3,6,7]
key=3
print(solve(arr,key))