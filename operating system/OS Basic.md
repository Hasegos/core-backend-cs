# 운영체제 기초 (OS Basic)

사용자와 하드웨어 사이에서 인터페이스를 제공하고, 시스템 자원을 효율적으로 관리하는 운영체제의 핵심 원리를 정리한 문서입니다.

+ [개념모음으로 이동](../README.md)

## 목차

+ [운영체제란](#운영체제란)
+ [프로세스와 스레드](#프로세스와-스레드)
+ [컨텍스트 스위칭 (Context Switching)](#컨텍스트-스위칭-context-switching)
+ [공유 자원과 동기화 문제](#공유-자원과-동기화-문제)

## 운영체제란

<strong>운영체제(OS, Operating System)</strong>는 사용자와 컴퓨터 하드웨어 사이에서 **인터페이스를 제공**하며, 시스템의 자원(CPU, 메모리, 저장장치 등)을 **관리 및 분배**하는 소프트웨어입니다.

+ **주요 기능:** 프로세스 관리, 메모리 관리, 파일 시스템 관리, 네트워크 관리 등

+ **대표 예시:** Windows, macOS, Linux 등

<img width="450" src="https://github.com/user-attachments/assets/15544ca6-587a-4d68-85a0-00d40d930608" />
<br>

[목차로 돌아가기](#목차)

## 프로세스와 스레드

### 프로세스(Process)

컴퓨터에서 **현재 실행 중인 프로그램**을 의미합니다.<br>
디스크에 있던 프로그램이 메모리(RAM)에 올라오는 것을 <strong>"로드(Load)"</strong>라고 하며, 이때부터 CPU를 점유하여 실행될 수 있습니다.

<img width="450" src="https://github.com/user-attachments/assets/3f12410a-4170-41d9-8bf3-f10a2f49783a" />

### 스레드(Thread)

프로세스 내에서 작업을 처리하는 **실행 단위**입니다.

+ **구조:** 프로세스는 최소 하나 이상의 메인 스레드를 가집니다.

+ **자원 공유:** 스레드들은 프로세스의 **Code, Data, Heap 영역을 공유**하며, 각각 독립적인 **Stack 영역**만 할당받습니다.

<img width="450" src="https://github.com/user-attachments/assets/b8c66700-a6a0-4e34-8b28-239b33a6cc2f" />

> **멀티스레드(Multi-thread):** 작업을 분할해 동시에 처리함으로써 성능을 높이고 자원을 효율적으로 관리합니다.<br>
다만 공유 자원으로 인한 동기화 문제가 발생할 수 있습니다.

<img width="450" src="https://github.com/user-attachments/assets/70d9f138-4866-4aec-ad8c-1d35d760e312" />
<br>

[목차로 돌아가기](#목차)

## 컨텍스트 스위칭 (Context Switching)

CPU가 한 프로세스에서 다른 프로세스로 제어권을 넘겨줄 때, 현재 상태를 저장하고 다음 상태를 불러오는 과정입니다.

<img width="450" src="https://github.com/user-attachments/assets/631525c3-e679-41ea-ab34-6176c7cbabe1" />

* **멀티태스킹(Multi-tasking):** 작업을 아주 빠르게 번갈아 가며 수행하여 사용자가 동시에 실행되는 것처럼 느끼게 하는 기술입니다.

<img width="450" src="https://github.com/user-attachments/assets/965bd2c5-421c-442f-a9aa-c2bc4e822b47" />
<br>

[목차로 돌아가기](#목차)

## 공유 자원과 동기화 문제

여러 스레드가 동일한 자원에 동시에 접근할 때 발생하는 문제입니다.

### 경쟁 조건 (Race Condition)

둘 이상의 작업이 공유 자원에 동시에 접근하여 예측할 수 없는 결과가 나타나는 현상입니다.<br>
(예: 동시에 입금할 때 합산 오류 발생)

<img width="450" src="https://github.com/user-attachments/assets/17a2b93e-05ed-45d3-9bf5-0d0d8570a1ba" />

### 임계 영역 (Critical Section) 해결 조건

경쟁 조건이 발생할 수 있는 코드 영역을 해결하기 위해 3가지 조건을 만족해야 합니다.

| 조건 | 설명 |
| :--- | :--- |
| **상호 배제 (Mutual Exclusion)** | 한 스레드가 사용 중이면 다른 스레드는 진입 불가 |
| **진행 (Progress)** | 영역이 비어있다면 대기 중인 스레드가 진입 가능해야 함 |
| **한정 대기 (Bounded Waiting)** | 특정 스레드가 진입을 위해 무한정 기다리지 않아야 함 |

[목차로 돌아가기](#목차)