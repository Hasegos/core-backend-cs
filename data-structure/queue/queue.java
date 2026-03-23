package queue; 
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();    
        add(queue);  // 값 추가 
        peek(queue); // 먼저 들어간 값 리턴   
        size(queue); // 크기 반환
        contains(queue); // 포함되어있는지 확인
        poll(queue); // 먼저 들어간 값 삭제
        isEmpty(queue); // 비어 있는지 확인
    }
    public static void add(Queue<String> queue){
        System.out.println("----------------Queue 입력---------------");
        System.out.println("입력을 종료하실려면 0을 입력해주세요.");
        while (true) {
            System.out.print("입력 >>>>>>> ");
            String add = sc.nextLine();
            if(add.equals("0")){
                System.out.println("시스템을 종료합니다.");                
                break;                
            }            
            queue.add(add);
        }        
    }
    public static void poll(Queue<String> queue){
        System.out.println("");
        System.out.println("----------------Queue Poll---------------");          
        Iterator<String> iter = queue.iterator();
        while (iter.hasNext()) {      
            Iterator<String> iter2 = queue.iterator();            
            while (iter2.hasNext()) {
                System.out.println(iter2.next());
            }           
            System.out.println("----------------Poll After---------------");
            System.out.println("삭제한 데이터 : " + queue.poll());                                      
        }
    }
    public static void peek(Queue<String> queue){
        System.out.println("");
        System.out.println("----------------Queue Peak---------------");       
        System.out.print("가장 첫번째 있는 데이터 ");     
        System.out.println(queue.peek());    
    }
    public static void size(Queue<String> queue){
        System.out.println("");
        System.out.println("----------------Queue Size---------------");       
        System.out.println("Queue Size : " + queue.size());       
    }
    public static void contains(Queue<String> queue){
        System.out.println("");
        System.out.println("----------------Queue Contains---------------");
        System.out.println("입력을 종료하실려면 0을 입력해주세요.");
        while (true) {
            System.out.print("입력 >>>>>>> ");
            String contains = sc.nextLine();
            if(contains.equals("0")){
                System.out.println("시스템을 종료합니다.");                
                break;                
            }            
            System.out.println(queue.contains(contains));            
        }
    }
    public static void isEmpty(Queue<String> queue){
        System.out.println("");
        System.out.println("----------------Queue isEmpty---------------");  
        System.out.println(queue.isEmpty());
    }
}