# 재귀 (Recursion)

<strong>재귀(Recursion)</strong>란 어떤 함수가 자기 자신을 다시 호출하여 문제를 해결하는 기법입니다. 복잡한 문제를 동일한 구조의 더 작은 문제로 나누어 해결할 때 유용합니다.

[알고리즘으로 돌아가기](../README.md)

## 목차

+ [재귀의 기본 조건](#재귀의-기본-조건)
+ [Recursion vs Iteration](#recursion-vs-iteration)
+ [미로 찾기 (Maze Solving)](#미로-찾기-maze-solving)
+ [Counting Cells in a Blob](#counting-cells-in-a-blob)
+ [N-Queens 문제 (Backtracking)](#n-queens-문제-backtracking)

## 재귀의 기본 조건

재귀 함수가 무한 루프에 빠지지 않으려면 다음 두 가지 조건을 반드시 만족해야 합니다.

+ **Base Case (기본 케이스):** 재귀 호출을 멈추는 조건이 적어도 하나 존재해야 합니다.

+ **Recursive Case (재귀 케이스):** 문제를 점점 작게 만들어 결국 Base Case로 수렴하게 설계해야 합니다.

[목차로 돌아가기](#목차)

## Recursion vs Iteration

| 구분 | 재귀 (Recursion) | 반복문 (Iteration) |
| :--- | :--- | :--- |
| **코드 가독성** | 복잡한 로직을 간결하게 표현 가능 | 로직이 복잡해질수록 가독성 저하 |
| **메모리 사용** | 스택 프레임 생성으로 오버헤드 발생 | 메모리 사용이 상대적으로 효율적 |
| **상호 변환** | 모든 재귀는 반복문으로 변환 가능 | 모든 반복문은 재귀로 변환 가능 |

[목차로 돌아가기](#목차)

## 미로 찾기 (Maze Solving)

현재 위치에서 4방향(북, 동, 남, 서)을 재귀적으로 탐색하여 출구를 찾는 알고리즘입니다.

<img width="450" src="https://github.com/user-attachments/assets/a2385f50-1dab-433d-9d19-8c360fec1284" />

* **핵심 전략:** 방문한 경로는 '방문 표시'를 하여 무한 루프를 방지하고, 막힌 길일 경우 이전 단계로 돌아가는 <strong>백트래킹(Backtracking)</strong>을 수행합니다.

+ **구현 사례:** [MazeSolver.java](./MazeSolver.java)

<img width="450" src="https://github.com/user-attachments/assets/be617604-a7aa-4107-999a-2cb166a6d65d" />

[목차로 돌아가기](#목차)

## Counting Cells in a Blob

이미지 픽셀 데이터에서 서로 연결된 픽셀(Blob)의 크기를 계산하는 알고리즘입니다.

<img width="450" src="https://github.com/user-attachments/assets/932cf2cd-937a-4857-a96c-3d118ac4a03f" />

+ **탐색 범위:** 현재 셀을 기준으로 8방향(상하좌우 + 대각선)을 조사합니다.\

+ **중복 방지:** 이미 카운트한 셀은 색상을 변경하여 중복 계산을 피합니다.

+ **구현 사례:** [BlobCounter.java](./BlobCounter.java)

<img width="450" src="https://github.com/user-attachments/assets/32964ae5-0be8-4961-abf2-4440ecb15898" />
<br><br>

<img width="450" src="https://github.com/user-attachments/assets/b7299dec-0d9b-4ba8-a00f-50ce5a38cccb" />

[목차로 돌아가기](#목차)

## N-Queens 문제 (Backtracking)

$N \times N$ 체스판에 $N$개의 퀸을 서로 공격할 수 없게 배치하는 문제입니다.

<img width="450" src="https://github.com/user-attachments/assets/a0902d91-c327-4908-9062-2bb7e46024e5" />

+ <strong>전략: 상태 공간 트리(State Space Tree)</strong>를 깊이 우선 탐색(DFS) 방식으로 탐색하며, 퀸을 놓을 수 없는 경로는 즉시 차단(Pruning)합니다.

+ **구현 사례:** [NQueens.java](./NQueens.java)

<img width="450" src="https://github.com/user-attachments/assets/6fe8bbf7-bed1-40f6-945a-8873c3457ae0" />

[목차로 돌아가기](#목차)