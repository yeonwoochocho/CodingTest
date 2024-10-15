def solution(t, p):
    answer = 0
    tl = len(t)
    pl = len(p)
    ip = int(p) #p를 정수로 표현한 값
    for i in range(tl - pl + 1):
        now = int(t[i:i+pl]) #i번째부터 i+pl번째까지의 부분 문자열 정수로 반환

        if now <= ip:
            answer += 1

    return answer