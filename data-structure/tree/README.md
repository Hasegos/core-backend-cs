# Tree (트리)

데이터를 부모-자식 관계의 계층적 구조로 관리하는 **비선형 자료구조**인 **Tree**에 대해 학습하고 구현하였습니다.

[자료구조로 돌아가기](../README.md)

## 목차 

+ [개요 (Introduction)](#개요-introduction)
+ [주요 개념 (Key Concepts)](#주요-개념-key-concepts)
+ [트리의 종류 (Types of Trees)](#트리의-종류-types-of-trees)
+ [트리 순회 (Tree Traversal)](#트리-순회-tree-traversal)
+ [시간 복잡도 (Time Complexity)](#시간-복잡도-time-complexity)

## 개요 (Introduction)

트리는 노드(Node)들이 나무 가지처럼 연결된 **계층형 자료구조**입니다.<br>
리스트, 스택, 큐와 같은 선형 구조와 달리, 데이터 간의 상하 관계를 표현하는 데 최적화되어 있으며 파일 시스템, 도메인 주소(DNS) 구조 등에 널리 사용됩니다.

[목차로 돌아가기](#목차)

## 주요 개념 (Key Concepts)

+ **Root Node (루트 노드):** 트리 구조의 최상단에 있는 노드입니다. (부모가 없는 노드)

+ **Leaf Node (단말 노드):** 자식이 없는 최하단의 노드입니다.

+ **Edge (간선):** 노드와 노드를 연결하는 선입니다.

+ **Height (높이):** 루트 노드에서 가장 먼 리프 노드까지의 거리입니다.

+ **Degree (차수):** 각 노드가 가진 자식 노드의 수입니다.

[목차로 돌아가기](#목차)

## 트리의 종류 (Types of Trees)

본 프로젝트에서는 가장 기본이 되는 다음 트리를 중점적으로 다루었습니다.

### Binary Search Tree (이진 탐색 트리, BST)

+ **원리:** 모든 노드가 최대 2개의 자식을 가지며, **왼쪽 자식은 부모보다 작고 오른쪽 자식은 부모보다 큰** 규칙을 유지합니다.

+ **특징:** 데이터 탐색 시 범위를 절반씩 줄여나갈 수 있어 탐색 효율이 높습니다.

+ **구현 사례:** [tree.java](./tree.java)

[목차로 돌아가기](#목차)

## 트리 순회 (Tree Traversal)

트리의 모든 노드를 중복 없이 방문하는 방법입니다.

+ **In-order (중위 순회):** Left → Root → Right (이진 탐색 트리에서 오름차순 정렬 결과 제공)

+ **Pre-order (전위 순회):** Root → Left → Right (트리 복사 시 활용)

+ **Post-order (후위 순회):** Left → Right → Root (트리 삭제 시 활용)

[목차로 돌아가기](#목차)

## 시간 복잡도 (Time Complexity)

| 연산 (Operation) | 평균 (Average) | 최악 (Worst / 편향 트리) |
| :--- | :--- | :--- |
| **Search (탐색)** | $O(\log n)$ | $O(n)$ |
| **Insert (삽입)** | $O(\log n)$ | $O(n)$ |
| **Delete (삭제)** | $O(\log n)$ | $O(n)$ |

> **Note:** 최악의 경우 $O(n)$ 는 트리가 한쪽으로 치우친 <strong>편향 트리(Skewed Tree)</strong>가 되어 연결 리스트와 같은 형태가 되는 상황을 의미합니다.<br>
이를 방지하기 위해 AVL 트리나 Red-Black 트리와 같은 자가 균형 트리가 사용됩니다.

[목차로 돌아가기](#목차)