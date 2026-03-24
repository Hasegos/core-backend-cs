# 🌐 TCP/IP 4계층 

인터넷 프로토콜 스위트(Internet Protocol Suite)는 인터넷에서 컴퓨터들이 정보를 주고받는 데 사용되는 프로토콜의 집합이며, 주로 TCP/IP 4계층 모델로 설명됩니다.<br>
이 모델은 특정 계층의 변경이 다른 계층에 영향을 주지 않도록 설계된 추상화 계층 구조를 가집니다.

[네트워크로 돌아가기](../README.md)

## 목차

+ [계층 구조 및 OSI 모델 비교](#계층-구조-및-osi-모델-비교)
+ [애플리케이션 계층 (Application Layer)](#애플리케이션-계층)
+ [전송 계층 (Transport Layer)](#전송-계층)
+ [인터넷 계층 (Internet Layer)](#인터넷-계층)
+ [링크 계층 (Link Layer)](#링크-계층)
+ [데이터 송수신 과정 (캡슐화 & PDU)](#데이터-송수신-과정)
+ [통신 과정 예시 (Web Browsing)](#통신-과정-예시-web-browsing)

## 계층 구조 및 OSI 모델 비교

TCP/IP 4계층은 실무적인 프로토콜 스택을 기준으로 하며, OSI 7계층과 다음과 같이 대응됩니다.

<img width=450 src="https://github.com/user-attachments/assets/23a56bd4-6f93-49c2-b2e0-4aea89d2b56b" />

+ **애플리케이션 계층:** OSI의 세션, 표현, 응용 계층을 포함합니다.

+ **전송 계층:** OSI의 전송 계층에 대응합니다.

+ **인터넷 계층:** OSI의 네트워크 계층에 대응합니다.

+ **링크 계층:** OSI의 데이터 링크와 물리 계층을 포함하며, '네트워크 액세스 계층'이라고도 불립니다.

[목차로 돌아가기](#목차)

## 애플리케이션 계층

웹 서비스, 이메일 등 실질적인 서비스를 사용자에게 제공하며, 서버나 클라이언트 응용 프로그램이 동작하는 단계입니다.

| 프로토콜 | 설명 | 
|----|---|
| **HTTP** | 웹 브라우저와 서버 간 정보를 주고받는 표준 프로토콜 |
| **DNS** | 도메인 이름을 IP 주소로 변환하여 매핑해주는 서비스 |
| **FTP/TFTP** |파일 전송 프로토콜 (FTP는 TCP 기반, TFTP는 UDP 기반) |
| **SSH** | 암호화된 네트워크 프로토콜을 통한 안전한 장치 운영 | 
| **SMTP** | 전자 메일 전송을 위한 인터넷 표준 프로토콜 | 
| **SNMP** |네트워크 장비를 모니터링하고 제어하기 위한 프로토콜 |

[목차로 돌아가기](#목차)

## 전송 계층

송신자와 수신자를 연결하는 통신 서비스를 제공하며 애플리케이션과 인터넷 계층 사이에서 데이터를 중계합니다.

### TCP (Transmission Control Protocol)

+ **특징:** 연결 지향적, 신뢰성 보장, 흐름 및 에러 제어, 패킷 순서 보장.

+ **방식:** 가상회선 패킷 교환 방식 (패킷이 전송된 순서대로 도착).

<img width=450 src="https://github.com/user-attachments/assets/eec77769-0d68-4462-8ac7-204e84c05a42" />

+ **연결 성립 (3-Way Handshake):** SYN(클라이언트 ISN 전송) → SYN+ACK(서버 수신 및 응답) → ACK(클라이언트 최종 확인) 과정을 거칩니다.

<img width=450 src="https://github.com/user-attachments/assets/ce4e3ea6-0014-48ef-8173-7547596a7c1e" />

+ **연결 해제 (4-Way Handshake):** FIN(송신 측) → ACK(수신 측) → FIN(수신 측 일정 시간 후) → ACK(송신 측 최종 응답 후 TIME_WAIT) 순으로 진행됩니다.

<img width=450 src="https://github.com/user-attachments/assets/d6d4b700-df6d-4faf-83a9-8721ca12b86d" />

### UDP (User Datagram Protocol)

+ **특징:** 비연결 지향적, 수신 여부 확인 안 함, 단순 전송으로 속도가 빠름.

+ **방식:** 데이터그램 패킷 교환 방식 (패킷이 독립적인 경로로 이동하여 순서가 바뀔 수 있음).

<img width=450 src="https://github.com/user-attachments/assets/e3702c72-0776-4fef-9cc6-b57dc67b06a7" />

[목차로 돌아가기](#목차)

## 인터넷 계층

장치로부터 받은 패킷을 IP 주소로 지정된 목적지로 전송하며, 상대방의 수신 여부를 보장하지 않는 비연결형 특징을 가집니다.

+ **IP:** 가장 효율적인 경로(Routing)를 설정하여 패킷을 전달합니다.

+ **ICMP:** IP 제어 및 오류 메시지 기능을 담당합니다.

+ **ARP/RARP:** IP 주소를 기반으로 상대방의 MAC 주소를 알아내거나(ARP), 반대로 MAC 주소로 IP를 확인(RARP)합니다.

[목차로 돌아가기](#목차)

## 링크 계층

실질적으로 장치 간에 신호를 주고받는 규칙을 정의하며, 전선/광섬유/무선 등 물리적 매체를 통해 데이터를 전달합니다.

+ **통신 방식:**
    + **전이중화(Full Duplex):** 양쪽 장치가 동시에 송수신 가능.

    <img width=450 src="https://github.com/user-attachments/assets/7bf76c48-5464-4220-a2fe-0d46da152934" />

    + **반이중화(Half Duplex):** 한 번에 한 방향만 통신 가능하며 충돌 방지(CSMA/CD, CSMA/CA)가 필요합니다.

+ **이더넷 프레임 구조:** 데이터의 에러를 검출하고 캡슐화를 수행합니다.

    + **Preamble/SFD:** 프레임 시작 알림.
    
    + **DMAC/SMAC:** 수신 및 송신 MAC 주소.
    
    + **EtherType:** 상위 계층인 IP 프로토콜 정보.
    
    + **Payload/CRC:** 전달 데이터와 에러 확인 비트.

<img width=450 src="https://github.com/user-attachments/assets/05273428-df55-4f0c-b798-ac51047f1379" />
<br>

[목차로 돌아가기](#목차)
    
## 데이터 송수신 과정

### 캡슐화(Encapsulation) & 비캡슐화(Decapsulation)

<img width=450 src="https://github.com/user-attachments/assets/d8d20d62-9cbc-45dd-bdd6-9ef5590d532e" />

송신 측에서는 상위 계층 헤더를 데이터에 붙여 하위로 내려보내고(캡슐화) 

<img width=450 src="https://github.com/user-attachments/assets/731aa7d7-d01f-4beb-beaa-e9417fcd176c" />

수신 측에서는 각 계층의 헤더를 제거하며 원본 데이터를 추출합니다(비캡슐화).

<img width=450 src="https://github.com/user-attachments/assets/0003a9ce-4744-4918-8269-eb2af057ffdd" />

### PDU (Protocol Data Unit)

각 계층에서 데이터가 전달되는 단위입니다.

+ **애플리케이션:** 메시지(Message)

+ **전송:** 세그먼트(Segment, TCP) / 데이터그램(Datagram, UDP)

+ **인터넷:** 패킷(Packet)

+ **링크:** 프레임(Frame, 데이터 링크) / 비트(Bits, 물리)

[목차로 돌아가기](#목차)

## 통신 과정 예시 (Web Browsing)

사용자가 웹 브라우저에 주소를 입력했을 때의 실제 동작 순서입니다.

<img width="500" src="https://github.com/user-attachments/assets/ad99e3bd-1458-4d18-bb4d-de451575f34d" />

1. **애플리케이션:** 웹 브라우저에서 HTTP 요청 생성 및 DNS를 통한 IP 주소 할당.

2. **전송:** PORT 정보(출발지/목적지), 전송 제어, 순서 정보를 담은 TCP 패킹 수행.

3. **인터넷:** 출발지 및 목적지 IP 정보를 패킹.

4. **링크:** MAC 주소 패킹 후 이더넷 프레임을 추가하여 인터넷망 접속.

5. **서버 도착:** 각 계층에서 패킷을 열어(비캡슐화) 목적지 포트의 애플리케이션에 데이터 전달 후 응답.

[목차로 돌아가기](#목차)