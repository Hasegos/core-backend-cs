package tree;

public class tree {
    
    int count;
    public tree(){
        count = 0;
    }
    class Node{
        Object object; // Node 안에들어가있는 데이터
        Node left;
        Node right;
        // Node 생성
        public Node(Object object){
            this.object = object;
            left = null;
            right = null;
        }
        // 오른쪽 추가
        public void addRight(Node node){
            right = node;
            count++;
        }   
        // 왼쪽 추가
        public void addLeft(Node node){
            left = node;
            count++;
        }   
        // 오른쪽 삭제
        public void deleteRight(){
            right = null;
            count--;
        }
        // 왼쪽 삭제
        public void deleteLeft(){
            left = null;
            count--;
        }
    }
    public Node addNode(Object object){
        Node node = new Node(object);
        return node;
    }
    // 전위 순회
    public void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.object + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    // 중위 순회
    public void inOrder(Node node){
        if(node == null){
            return;            
        }
        inOrder(node.left);
        System.out.print(node.object + " ");
        inOrder(node.right);
    }
    public void postOrder(Node node){
        if(node == null){
            return;            
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.object + " ");        
    }

    public static void main(String[] args) {
        // 트리 생성
        tree Tree = new tree();

        // 노드 생성
        Node node1 = Tree.addNode(1);
        Node node2 = Tree.addNode(2);
        Node node3 = Tree.addNode(3);
        Node node4 = Tree.addNode(4);
        Node node5 = Tree.addNode(5);
        Node node6 = Tree.addNode(6);
        Node node7 = Tree.addNode(7);

        /*
        트리 연결관계 형성
        이런 형태 형성
               1
            2     3
          4  5   6  7
        */        
        node1.addLeft(node2);
        node1.addRight(node3);
        node2.addLeft(node4);
        node2.addRight(node5);
        node3.addLeft(node6);
        node3.addRight(node7);
        
        // 전위 순회
        System.out.print("전위 순회 : ");
        Tree.preOrder(node1);
        System.out.println("");

        // 중위 순회
        System.out.print("중위 순회 : ");
        Tree.inOrder(node1);
        System.out.println("");

        // 후위 순회
        System.out.print("후위 순회 : ");
        Tree.postOrder(node1);
        System.out.println("");

        // 노드 삭제
        node2.deleteLeft();
        node3.deleteRight();

        /*
        이런 트리 형태
            1
          2   3
           5 6
        */
        System.out.println("");
        System.out.println("노드 삭제후");
        System.out.print("전위 순회 : ");
        Tree.preOrder(node1);
        System.out.println("");

        // 중위 순회
        System.out.print("중위 순회 : ");
        Tree.inOrder(node1);
        System.out.println("");

        // 후위 순회
        System.out.print("후위 순회 : ");
        Tree.postOrder(node1);
        System.out.println("");
    }
}