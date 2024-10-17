def solution(answers):
    answer = []
    # 각 학생들의 정답 패턴
    players = [[1,2,3,4,5], [2,1,2,3,2,4,2,5], [3,3,1,1,2,2,4,4,5,5]]
    return lucky(answers, players)

def lucky(answers, players):
    counts = [0]*len(players) # 각 학생이 맞힌 문제 수를 저장
    for i, answer in enumerate(answers): # 문제의 인덱스와 답 순회
        for j, player in enumerate(players): # 각 학생의 답안 패턴 순회
            if player[i%len(player)] == answer:
                counts[j] += 1 # 학생의 답안이 실제 정답과 맞으면 해당 학생의 점수 증가
    max_count = max(counts) # 가장 많이 맞힌 문제 수
    return  [index+1 for index, count in enumerate(counts) if count == max_count] # 가장 많이 맞힌 학생 찾아서 반환