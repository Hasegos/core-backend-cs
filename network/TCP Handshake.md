# TCP Handshake (3-way & 4-way)

TCP/IP 프로토콜을 사용하는 기기 간에 논리적인 연결을 설정하고 해제하기 위한 절차를 정리한 문서입니다.

[네트워크로 돌아가기](./README.md)

## 목차

+ [3-way Handshake (연결 설정)](#3-way-handshake-연결-설정)
+ [4-way Handshake (연결 해제)](#4-way-handshake-연결-해제)

## 3-way Handshake (연결 설정)

TCP/IP 프로토콜을 사용하여 통신을 하기 전, 양쪽 컴퓨터가 데이터를 주고받을 준비가 되었는지 확인하는 **연결 수립** 과정입니다.

### 연결 과정

1. **[Client → Server] SYN 패킷 전송**

   + 클라이언트는 서버에 접속을 요청하는 **SYN(Synchronize)** 패킷을 보냅니다.

   + 클라이언트는 `SYN_SENT` 상태가 되고, 서버는 요청을 기다리는 `LISTEN` 상태입니다.

2. **[Server → Client] SYN + ACK 패킷 전송**

   + 서버는 SYN 요청을 받고, 요청을 수락한다는 <strong>ACK(Acknowledgment)</strong>와 자신도 접속을 요청한다는 **SYN** 패킷을 함께 보냅니다.

   + 서버는 `SYN_RECEIVED` 상태가 됩니다.

3. **[Client → Server] ACK 패킷 전송**

   + 클라이언트는 서버의 응답을 확인하고 마지막으로 **ACK** 패킷을 보냅니다.

   + 이후 양쪽 모두 `ESTABLISHED` 상태가 되어 **데이터 전송이 가능한 연결 상태**가 됩니다.

<img width="500" src="https://github.com/user-attachments/assets/3b99b20f-2454-4b84-acb7-109bd6bd4e19" />
<br>

[목차로 돌아가기](#목차)

## 4-way Handshake (연결 해제)

데이터 전송이 완료된 후, TCP 연결을 안전하게 종료하기 위해 사용되는 **연결 해제** 절차입니다.

### 해제 과정

1. **[Client → Server] FIN 패킷 전송**

   + 클라이언트가 연결을 종료하겠다는 **FIN(Finish)** 패킷을 전송합니다.

   + 클라이언트는 `FIN_WAIT1` 상태가 됩니다.

2. **[Server → Client] ACK 패킷 전송**

   + 서버는 클라이언트의 종료 요청을 확인하고 **ACK**를 보냅니다.

   + 서버는 남은 데이터를 모두 보낼 때까지 잠시 대기하는 `CLOSE_WAIT` 상태가 됩니다.

   + 클라이언트는 서버의 응답을 받고 `FIN_WAIT2` 상태가 됩니다.

3. **[Server → Client] FIN 패킷 전송**

   + 서버가 남은 데이터를 모두 전송했다면, 자신도 연결을 종료하겠다는 **FIN** 패킷을 보냅니다.

   + 서버는 `LAST_ACK` 상태가 됩니다.

4. **[Client → Server] ACK 패킷 전송**

   + 클라이언트는 서버의 종료 요청을 확인하고 **ACK**를 보냅니다.

   + 클라이언트는 혹시 모를 남은 패킷에 대비해 일정 시간 동안 세션을 유지하는 `TIME_WAIT` 상태를 거친 후 종료(`CLOSED`)합니다.

   + 서버는 ACK를 받고 즉시 `CLOSED` 상태가 됩니다.

<img width="500" src="https://github.com/user-attachments/assets/13966d2f-28a5-4507-acb1-68033d74b1c7" />
<br>

### 핵심 요약

+ **3-way Handshake:** 연결을 시작할 때 사용하는 3단계 절차 (**"나 대화 가능해?" → "응 가능해, 너는?" → "나도 가능해!"**)

+ **4-way Handshake:** 연결을 끝낼 때 사용하는 4단계 절차 (**"나 끝낼게" → "알았어, 잠시만" → "나도 다 끝났어" → "확인했어, 안녕!"**)

[목차로 돌아가기](#목차)