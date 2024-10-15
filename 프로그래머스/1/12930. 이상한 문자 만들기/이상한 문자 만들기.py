def solution(s):
    answer = ''
    cnt = 0
    for k in s:
        if k ==' ':
            cnt = 0
            answer += ' '
            continue
        cnt += 1
        if cnt % 2 != 0: # 홀수
            answer += k.upper()
        else:
            answer += k.lower()

    return answer
