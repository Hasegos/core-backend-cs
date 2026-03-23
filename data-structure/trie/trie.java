package trie;
import java.util.HashMap;
import java.util.Map;

class Node{
    Map<Character, Node> chiledNode = new HashMap<Character,Node>();    
    boolean endOfWord; // 문자열 끝을 확인을 위해
}
class Node_tries{
    Node rootNode = new Node();
    void insert(String str){
        // 최상위 루트 
        Node node = this.rootNode;

        for(int i = 0; i < str.length(); i++){
            // 입력 받은 문자열의 문자 마다 key가 존재하면 null 반환 존재하지않으면 key 값에 새로운 노드 반환
            // 이미 문자 마다 루트를 뚫어놓고 똑같은 문자 받았을시 null 반환
            node = node.chiledNode.computeIfAbsent(str.charAt(i), key -> new Node());
        }
        // boolean을 통해 문자열 끝 구분
        node.endOfWord = true; 
    }
    boolean search(String str){
        // 최상위 루트
        Node node = this.rootNode;
        for(int i =  0;  i < str.length(); i++){
            // getOrDefault : 찾는 key가 존재하면 key에 매핑된 값을 반환 아니면 default값 반환
            // 즉, 중간에 하나라도 null값 반환이면 존재하지않는다.
            node = node.chiledNode.getOrDefault(str.charAt(i), null);
            if(node == null){
                return false;
            }
        }
        // 문자열의 문자가 끝까지 존재시 true반환
        return node.endOfWord;
    }
} 
public class trie {
    public static void main(String[] args) {
        Node_tries tt = new Node_tries();
        tt.insert("태양계");
        tt.insert("수성");
        tt.insert("금성");
        tt.insert("지구");
        tt.insert("목성");
        tt.insert("토성");
        tt.insert("천완성");
        tt.insert("해완성");        

        System.out.println(tt.search("지구"));
        System.out.println(tt.search("남구"));
        System.out.println(tt.search("토성"));
        System.out.println(tt.search("해토성"));
    }
}