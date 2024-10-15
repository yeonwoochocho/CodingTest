def solution(sizes):
    answer = 0
    for s in sizes:
        s.sort() # 각 명함의 크기 정렬
    w=[] # 가로 세로 값 따로 저장
    h=[]
    for s in sizes:
        w.append(s[0]) # 작은 쪽은 가로(w) 리스트에 추가
        h.append(s[1]) # 큰 쪽은 세로(h) 리스트에 추가

    answer = max(w)*max(h)

    return answer