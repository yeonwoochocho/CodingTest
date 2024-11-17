def convert(length): 
    result = ""
    while length > 0:
        if length % 2 == 0:
            result = '0' + result
        else:
            result = '1' + result
        length //= 2
    return result

def solution(s): 
    counter = 0 
    numOfOnes = 0 
    numOfZerosToRemove = 0 
    
    while len(s) > 1:
        counter += 1 
        numOfOnes = 0  
        for num in s:
            if num == '1':
                numOfOnes += 1
        numOfZerosToRemove += len(s) - numOfOnes
        s = convert(numOfOnes) 
    return [counter, numOfZerosToRemove]