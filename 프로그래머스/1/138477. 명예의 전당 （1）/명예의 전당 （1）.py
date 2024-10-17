def solution(k, score):
    # 상위 k개의 점수로 갱신되는 leage()변수
    # leage()최하위인 k등의 점수를 담는 변수
    leage = []
    result = []
    # 아래 과정을 i번 반복한다. 
    for i in score:
        # 하루가 지날 때마다 leage에 새로운 점수를 넣어준다.
        leage.append(i)
        # 해당 leage의 점수를 내림차순 정렬해준다. 
        leage.sort(reverse = True)
        # 만약 리그가 k개를 넘어가면 마지막 점수를 제거하여 
        # 상위k개의 값만 leage에 속할 수 있게 조정한다. 
        if len(leage) > k:
            leage.pop()
        # 조정된 k개의 leage 중 가장 하위값을 result리스트에 추가한다. 
        result.append(min(leage))
    return result