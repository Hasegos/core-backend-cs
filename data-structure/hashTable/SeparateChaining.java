package HashTable;

import java.util.LinkedList;
import java.util.Scanner;

public class SeparateChaining {

    // 데이터를 저장할 단위 (Key-Value 쌍)
    class Node {
        private String key;
        private String value;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    // Hash Table 배열: 각 요소는 LinkedList를 담고 있어 충돌 시 노드를 체이닝함
    private LinkedList<Node>[] table;

    // 생성자: 배열의 크기를 받아 초기화
    public SeparateChaining(int size) {
        // 자바 제약상 제네릭 배열은 직접 생성이 불가능하여 raw type으로 생성 후 할당
        table = new LinkedList[size];
    }

    /**
     * 해시 함수: 문자열 키를 고유한 롱타입 숫자로 변환
     * 31을 곱하는 이유는 소수(Prime Number)를 활용해 해시 분포를 균등하게 하기 위함
     */
    public Long getHashCode(String key) {
        Long hashcode = 0L;
        for (char c : key.toCharArray()) {
            hashcode += 31 * (long) c;
        }
        return hashcode;
    }

    /**
     * 인덱스 변환: 생성된 해시코드를 배열의 크기 안의 범위(인덱스)로 압축
     */
    public int getIndex(long hashcode) {
        return (int) (hashcode % table.length);
    }

    /**
     * 노드 탐색: 특정 인덱스의 리스트를 순회하며 키가 일치하는 노드를 검색
     */
    Node searchNode(int index, String key) {
        LinkedList<Node> indexList = table[index];
        if (indexList == null) return null; // 버킷이 비어있는 경우 안전하게 처리

        for (Node n : indexList) {
            if (n.key.equals(key)) {
                return n; // 키가 일치하는 노드 발견
            }
        }
        return null; // 일치하는 키가 없음
    }

    /**
     * 데이터 삽입(Put): 새로운 데이터를 저장하거나 기존 데이터를 수정
     */
    public void put(String key, String value) {
        Long hashcode = getHashCode(key);
        int index = getIndex(hashcode);

        // 1. 해당 인덱스(버킷)에 리스트가 없으면 새로 생성 (최초 삽입)
        if (table[index] == null) {
            table[index] = new LinkedList<Node>();
            table[index].add(new Node(key, value));
        } else {
            // 2. 이미 리스트가 존재하면(충돌 가능성), 기존 키가 있는지 확인
            Node searched = searchNode(index, key);
            if (searched != null) {
                // 기존 키가 존재하면 값만 업데이트 (수정)
                searched.value = value;
            } else {
                // 새로운 키라면 리스트의 끝에 추가 (Chaining 발생)
                table[index].add(new Node(key, value));
            }
        }
    }

    /**
     * 데이터 탐색(Get): 키를 입력받아 저장된 값을 반환
     */
    public String get(String key) {
        Long hashcode = getHashCode(key);
        int index = getIndex(hashcode);

        Node searched = searchNode(index, key);
        if (searched == null) return "데이터가 없습니다.";
        else return searched.value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n몇 개의 키와 값을 입력할지 입력해주세요.");
        System.out.print("입력 >>>>> ");

        int number = sc.nextInt();
        sc.nextLine(); // 숫자 입력 후 남은 줄바꿈 문자 제거

        SeparateChaining table = new SeparateChaining(number);
        String[] keys = new String[number];

        // 데이터 입력 루프
        for (int i = 0; i < number; i++) {
            System.out.println((i + 1) + "번째");
            System.out.print("키 : ");
            keys[i] = sc.nextLine();
            System.out.print("값 : ");
            table.put(keys[i], sc.nextLine());
        }

        // 결과 검증 및 출력
        System.out.println("\n--- 결과 출력 ---");
        for (int i = 0; i < number; i++) {
            System.out.println("키: " + keys[i] + " | 값: " + table.get(keys[i]));
        }
        sc.close();
    }
}