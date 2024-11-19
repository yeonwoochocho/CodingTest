def solution(b, y):
    
    ys = [i for i in range(1,y+1) if y%i == 0]
    for i in ys[::-1]:
        if b == (i+2 + y//i)*2 : return [i+2, y//i+2]