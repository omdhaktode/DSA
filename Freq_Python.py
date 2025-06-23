# determine frequency of no using python

def freq(list,key):
    count=0
    for item in list:
        if(item == key):
            count+=1
    return count


list=[1,2,3,4,5,1]
key=1
ans=freq(list,key)
print(ans)