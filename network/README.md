# 🌐 Network (네트워크)

컴퓨터 간의 데이터 통신 원리를 이해하고, 현대 인터넷을 구성하는 주요 프로토콜과 계층 구조를 정리한 프로젝트입니다.<br>
각 항목을 클릭하면 해당 개념의 상세 설명 문서로 이동합니다.

[개념 모음으로 돌아가기](../README.md)

## 📑 목차 (Contents)

### 1. 네트워크 기초 (Network Fundamentals)

네트워크의 정의와 성능 지표, 그리고 물리적인 연결 형태를 다룹니다.

+ [**Network Basic (네트워크 기초)**](./Network%20Basic.md) - 처리량(Throughput), 지연시간(Latency) 및 토폴로지(Topology) 이해

+ [**Network Devices (네트워크 기기)**](./Network%20Devices.md) - 허브, 스위치, 라우터 등 각 계층별 장비의 역할 학습

### 2. 계층 모델 및 프로토콜 (Layer Models & Protocols)
데이터 전송의 표준 규격과 웹 통신 프로토콜을 다룹니다.

+ [**OSI 7계층 & TCP/IP 4계층**](./OSI%207계층.md) - 네트워크 통신 단계별 표준 모델 및 캡슐화 이해

+ [**HTTP & HTTPS**](./HTTP%20HTTPS%20프로토콜.md) - 웹 프로토콜의 동작 원리와 SSL/TLS를 통한 보안 강화 학습

+ [**DNS (도메인 네임 시스템)**](./DNS.md) - 도메인 주소를 IP 주소로 변환하는 계층적 분산 시스템 이해

### 3. 전송 제어 및 보안 (Transmission & Security)
신뢰성 있는 데이터 전달 방식과 암호화 원리를 다룹니다.

+ [**TCP Handshake**](./TCP%20Handshake.md) - 3-way(연결 수립) 및 4-way(연결 해제) 핸드쉐이크 절차 상세 분석

+ [**TCP vs UDP**](./TCP%20vs%20UDP.md) - 신뢰성 중심(TCP)과 속도 중심(UDP) 프로토콜의 차이점 비교

+ [**개인키 vs 공개키**](./개인키%20vs%20공개키.md) - 대칭키/비대칭키 암호화 방식 및 전자서명 원리 이해

## 🛠 학습 포인트 (Quick Summary)

+ **계층별 이해:** 각 계층이 제공하는 기능과 데이터 단위(PDU)의 변화 파악

+ **신뢰성 보장:** 패킷 손실 방지를 위한 TCP의 흐름 제어 및 혼잡 제어 메커니즘 학습

+ **성능 분석:** `ping`, `netstat`, `nslookup`, `tracert` 등을 활용한 상태 분석 능력 배양

## 🔗 바로가기 (Quick Links)

| 주제 | 상세 설명 링크 | 핵심 키워드 |
| :--- | :--- | :--- |
| **TCP Handshake** | [이동하기](./TCP%20Handshake.md) | `SYN/ACK`, `ESTABLISHED`, `TIME_WAIT` |
| **HTTP/HTTPS** | [이동하기](./HTTP%20HTTPS%20프로토콜.md) | `Stateless`, `SSL/TLS`, `Port 443` |
| **OSI 7 계층** | [이동하기](./OSI%207계층.md) | `L2/L3/L4`, `Encapsulation`, `PDU` |
| **DNS** | [이동하기](./DNS.md) | `Iterative Query`, `Root Server`, `TLD` |
| **암호화 키** | [이동하기](./개인키%20vs%20공개키.md) | `Symmetric`, `Asymmetric`, `Key Pair` |
| **기초 지표** | [이동하기](./Network%20Basic.md) | `Latency`, `Throughput`, `Topology` |

[목차로 돌아가기](#📑-목차-contents)