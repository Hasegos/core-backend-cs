# Queue (큐)

데이터를 **FIFO(First-In, First-Out, 선입선출)** 방식으로 관리하는 선형 자료구조에 대해 학습하고 구현하였습니다.

[개념 모음으로 돌아가기](../README.md)

## 목차 

+ [개요 (Introduction)](#개요-introduction)
+ [주요 개념 (Key Concepts)](#주요-개념-key-concepts)
+ [큐의 주요 연산 (Key Operations)](#큐의-주요-연산-key-operations)
+ [Java Queue의 특징](#java-queue의-특징)
+ [시간 복잡도 (Time Complexity)](#시간-복잡도-time-complexity)

## 개요 (Introduction)

큐는 먼저 들어온 데이터가 먼저 나가는 **선입선출(FIFO)** 원칙을 따르는 자료구조입니다.<br>
일상생활에서의 '<strong>줄 서기</strong>'와 같은 원리로, 데이터의 입력과 출력이 양방향에서 각각 일어나는 것이 특징입니다.

[목차로 돌아가기](#목차)

## 주요 개념 (Key Concepts)

+ **FIFO (First-In, First-Out):** 가장 먼저 추가된 항목이 가장 먼저 제거되는 논리적 순서입니다.

+ **Front (Head):** 데이터가 나가는 쪽(삭제 연산 발생)의 위치입니다.

+ **Rear (Tail):** 데이터가 들어오는 쪽(삽입 연산 발생)의 위치입니다.

+ **Overflow / Underflow:** 큐가 꽉 찼을 때 삽입하거나, 비어 있을 때 삭제를 시도하는 예외 상황입니다.

[목차로 돌아가기](#목차)

## 큐의 주요 연산 (Key Operations)

큐의 핵심 동작은 다음과 같습니다.

+ **Enqueue (Offer):** 큐의 뒷부분(Rear)에 새로운 데이터를 추가합니다.

+ **Dequeue (Poll):** 큐의 앞부분(Front)에서 데이터를 꺼내고 제거합니다.

+ **Peek:** 제거하지 않고 앞부분(Front)에 있는 데이터를 확인만 합니다.

+ **isEmpty:** 큐가 비어 있는지 확인합니다.

[목차로 돌아가기](#목차)

## Java `Queue`의 특징

Java 라이브러리에서 제공하는 `java.util.Queue`의 주요 특징은 다음과 같습니다.

1. **Interface 기반:** Java에서 Queue는 인터페이스로 정의되어 있으며, 주로 `LinkedList`나 `ArrayDeque` 클래스로 구현하여 사용합니다.

2. **다양한 구현체:**
    + `LinkedList`: 일반적인 큐 구현 시 사용. (메모리 가변적)

    +  `ArrayDeque`: 스택과 큐의 기능을 모두 가진 양방향 큐(Deque). 성능이 우수함.

3. **안정적인 메서드:** 큐가 비어있을 때 예외를 던지는 `remove()`보다, `null`을 반환하는 `poll()`을 사용하는 것이 안정적인 코드 작성에 유리합니다.

[목차로 돌아가기](#목차)

## 시간 복잡도 (Time Complexity)

| 연산 (Operation) | 평균 (Average) | 최악 (Worst) |
| :--- | :--- | :--- |
| **Enqueue (삽입)** | $O(1)$ | $O(1)$ |
| **Dequeue (삭제)** | $O(1)$ | $O(1)$ |
| **Search (탐색)** | $O(n)$ | $O(n)$ |

> **Note:** 큐는 삽입과 삭제가 양 끝(Front, Rear)에서 즉시 일어나므로 매우 효율적 $O(1)$ 이지만,<br>
특정 데이터를 찾는 탐색 작업은 전체 데이터를 순회해야 하므로 $O(n)$이 소요됩니다.

[목차로 돌아가기](#목차)