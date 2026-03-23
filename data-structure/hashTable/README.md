# Hash Table (해시 테이블)

데이터를 효율적으로 저장하고 검색하기 위해 **Key-Value** 쌍을 활용하는 자료구조인 **Hash Table**에 대해 학습하고 구현하였습니다.

[자료구조로 돌아가기](../README.md)

## 목차 

+ [개요 (Introduction)](#개요-introduction)
+ [주요 개념 (Key Concepts)](#주요-개념-key-concepts)
+ [해시 충돌 해결 전략 (Collision Handling)](#해시-충돌-해결-전략-collision-handling)
+ [Java Hashtable 특징](#java-hashtable-특징)
+ [시간 복잡도 (Time Complexity)](#시간-복잡도-time-complexity)

## 개요 (Introduction)

해시 테이블은 해시 함수(Hash Function)를 사용하여 키(Key)를 특정 인덱스(Index)로 변환하고, 해당 인덱스에 값(Value)을 저장하는 자료구조입니다.<br>
데이터의 양과 상관없이 평균적으로 $O(1)$의 매우 빠른 탐색 속도를 제공합니다.

[목차로 돌아가기](#목차)

## 주요 개념 (Key Concepts)

* **Hash Function (해시 함수):** 가변 길이의 데이터를 고정된 길이의 정수(인덱스)로 변환하는 알고리즘입니다.

* **Bucket (버킷):** 실제 데이터가 저장되는 저장소의 각 칸입니다.

* **Collision (충돌):** 서로 다른 두 개의 키가 해시 함수를 거쳐 동일한 인덱스로 배정되는 현상입니다.

[목차로 돌아가기](#목차)

## 해시 충돌 해결 전략 (Collision Handling)

본 프로젝트에서는 해시 충돌을 해결하기 위해 다음 기법을 학습하고 적용했습니다.

### Separate Chaining (분리 연결법)

+ **원리:** 충돌이 발생하면 해당 버킷에 데이터를 덮어쓰지 않고, **Linked List**를 사용하여 노드를 체인처럼 연결하는 방식입니다.

+ **특징:** 테이블의 크기보다 더 많은 데이터를 저장할 수 있으며, 삭제 연산이 비교적 간단합니다.

+ **구현 사례:** [SeparateChaining.java](./SeparateChaining.java)

+ **활용 사례:** [HashTable.java](./HashTable.java)


[목차로 돌아가기](#목차)

## Java `Hashtable` 특징

프로젝트 구현에 사용된 `java.util.Hashtable`의 주요 특징은 다음과 같습니다.

1.  **Thread-Safe:** 모든 메서드가 동기화(Synchronized)되어 멀티스레드 환경에서 안전합니다.

2.  **No Nulls:** Key와 Value에 `null` 입력을 허용하지 않습니다.

3.  **Key Uniqueness:** 동일한 키로 데이터를 삽입할 경우 기존 데이터가 새로운 값으로 업데이트됩니다.

[목차로 돌아가기](#목차)

## 시간 복잡도 (Time Complexity)

| 연산 (Operation) | 평균 (Average) | 최악 (Worst) |
| :--- | :--- | :--- |
| **Search (탐색)** | $O(1)$ | $O(n)$ |
| **Insert (삽입)** | $O(1)$ | $O(n)$ |
| **Delete (삭제)** | $O(1)$ | $O(n)$ |

> **Note:** 최악의 경우 $O(n)$ 는 모든 데이터가 하나의 버킷으로 몰려 Linked List가 길어지는 상황(심한 충돌)을 의미합니다.

[목차로 돌아가기](#목차)