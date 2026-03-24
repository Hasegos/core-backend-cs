# OSI 7계층 (Open Systems Interconnection)

네트워크 통신 과정을 7단계로 표준화하여 정의한 OSI 7계층 모델을 정리한 문서입니다.

[네트워크로 돌아가기](../README.md)

##  목차

+ [OSI 7계층이란?](#osi-7계층-이란)
+ [L1. 물리 계층 (Physical)](#l1-물리-계층-physical-layer)
+ [L2. 데이터 링크 계층 (Data Link)](#l2-데이터-링크-계층-data-link-layer)
+ [L3. 네트워크 계층 (Network)](#l3-네트워크-계층-network-layer)
+ [L4. 전송 계층 (Transport)](#l4-전송-계층-transport-layer)
+ [L5. 세션 계층 (Session)](#l5-세션-계층-session-layer)
+ [L6. 표현 계층 (Presentation)](#l6-표현-계층-presentation-layer)
+ [L7. 응용 계층 (Application)](#l7-응용-계층-application-layer)

## OSI 7계층 이란?

OSI 7계층은 네트워크 통신 과정을 7단계로 나눈 국제 표준 모델입니다.

### 계층화의 목적

+ **흐름 파악 용이:** 통신이 일어나는 과정을 단계별로 한눈에 파악할 수 있습니다.

+ **유지보수 효율화:** 특정 단계에 문제가 생기면 다른 단계를 건드리지 않고 해당 단계의 하드웨어나 소프트웨어만 수정하여 문제를 해결할 수 있습니다. (모듈화)

<img width="500" src="https://github.com/user-attachments/assets/6f23c78b-3b40-4f6a-9b93-12f2c2a46e82" />

<br>

[목차로 돌아가기](#목차)

## L1. 물리 계층 (Physical Layer)

데이터 전송에 필요한 물리적 매체를 통해 데이터를 전송합니다. 데이터를 전기적인 신호(0과 1)로 변환하여 송수신합니다.

+ **전송 단위:** 비트 (Bit)

+ **주요 장비:** 허브(Hub), 리피터(Repeater), 케이블 등

<img width="300" src="https://github.com/user-attachments/assets/c395854f-ce01-42e1-9f2d-d7fe2e9bde41" />
<br>

<img width="300" src="https://github.com/user-attachments/assets/779e5ab0-f37a-4608-b587-ce6515b7fca8" />

[목차로 돌아가기](#목차)

## L2. 데이터 링크 계층 (Data Link Layer)

물리 계층을 통해 송수신되는 정보의 오류와 흐름을 관리하여 신뢰성 있는 전송을 보장합니다. **MAC 주소**를 사용하여 통신합니다.

+ **주요 기능:**

    + **흐름 제어:** 송신 측과 수신 측의 속도 차이를 조정

    + **오류 제어:** 오류 검출 및 재전송(CRC 기반)

    + **프레임 동기화:** 프레임의 시작과 끝을 구분

+ **전송 단위:** 프레임 (Frame)

+ **주요 장비:** 스위치(Switch), 브릿지(Bridge), 이더넷 등

<img width="500" src="https://github.com/user-attachments/assets/f545011c-918b-4ca3-bc7c-93b58dd6f836" />

[목차로 돌아가기](#목차)

## L3. 네트워크 계층 (Network Layer)
데이터를 목적지까지 가장 안전하고 빠르게 전달하기 위한 **경로 설정(Routing)** 및 **주소(IP) 배정**을 담당합니다.

+ **핵심 역할:** 최적의 경로(Best Path) 설정

+ **전송 단위:** 패킷 (Packet / Datagram)

+ **주요 장비:** 라우터(Router), L3 스위치

[목차로 돌아가기](#목차)

## L4. 전송 계층 (Transport Layer)
양 끝단(End-to-End)의 사용자들 간에 신뢰성 있는 데이터를 주고받게 해주는 역할을 합니다. **Port 번호**를 사용하여 프로세스를 구분합니다.

+ **핵심 역할:** 오류 검출 및 복구, 흐름 제어, 중복 검사

+ **주요 프로토콜:** TCP, UDP

+ **전송 단위:** 세그먼트 (Segment)

[목차로 돌아가기](#목차)

## L5. 세션 계층 (Session Layer)

응용 프로세스 간의 통신 관리 방법을 정의합니다. 통신 세션을 설정, 유지, 종료하는 역할을 하며 데이터 교환의 동기화를 담당합니다.

+ **핵심 역할:** TCP/IP 세션 생성 및 제거, 복구(체크포인트 설정)

[목차로 돌아가기](#목차)

## L6. 표현 계층 (Presentation Layer)

전송하는 데이터의 표현 방식을 결정합니다. 서로 다른 기기 간에 데이터를 이해할 수 있도록 변환합니다.

+ **3대 주요 기능:**

    + **부호화(Encoding):** 데이터 변환 (예: ASCII, JPEG, MPEG)

    + **압축(Compression):** 전송 효율을 위한 데이터 크기 축소

    + **암호화(Encryption):** 데이터 보안을 위한 암복호화

[목차로 돌아가기](#목차)

## L7. 응용 계층 (Application Layer)

사용자와 가장 가까운 계층으로, 사용자 인터페이스와 네트워크 서비스를 제공합니다.

* **주요 프로토콜:** HTTP, FTP, SMTP, DNS 등
* **핵심 역할:** 사용자가 네트워크에 접근할 수 있도록 서비스 제공

<img width="500" src="https://github.com/user-attachments/assets/7ff4932c-75fd-486f-8df0-813c76f98b26" />

[목차로 돌아가기](#목차)

## 요약 표

| 계층 | 계층명 | PDU | 주요 주소/장비 |
| :--- | :--- | :--- | :--- |
| **L7** | **응용** | Data | HTTP, FTP |
| **L6** | **표현** | Data | JPEG, MPEG, 암호화 |
| **L5** | **세션** | Data | API, Socket |
| **L4** | **전송** | **Segment** | TCP, UDP / Port 번호 |
| **L3** | **네트워크** | **Packet** | IP / 라우터 |
| **L2** | **데이터 링크** | **Frame** | MAC 주소 / 스위치 |
| **L1** | **물리** | **Bit** | 케이블, 허브 |

[목차로 돌아가기](#목차)