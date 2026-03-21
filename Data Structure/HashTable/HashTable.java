package HashTable;
import java.util.Hashtable; 
import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;

public class HashTable extends Thread {

    Hashtable<String,String> hashtable = new Hashtable<>();
    @Override
    public void run() {
        putHashtable(); // 값 추가       
        printHashtable(hashtable); // hashtable 보여주기   
        removeHashtable(hashtable); // hashtable 삭제하기        
    }
    public void putHashtable(){        
        try{            
            // hashtable 값 추가
            hashtable.put("수성","5,790만 km");
            hashtable.put("금성","1억821만 km");
            hashtable.put("지구","1억4,960만 km");
            hashtable.put("화성","2억 2,739만 km");
            hashtable.put("목성","7억 7,792만 km");
            hashtable.put("토성","14억 3,018만 km");
            hashtable.put("천완성","28억 6,933만 km");
            hashtable.put("해완성","45억 745만 km");            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void printHashtable(Hashtable<String,String> hashtable){
        try{
             // Set과 Iterator 사용해서 값 가져오기
            System.out.println("--------------------Print---------------------");
            Set<String> set =  hashtable.keySet();
            Iterator<String> iter = set.iterator();
            while(iter.hasNext()){
                // key 값 가져오기
                String key = iter.next();
                System.out.println("Key : " + key + "   value : " + hashtable.get(key));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void removeHashtable(Hashtable<String,String> hashtable){
        try{
            // hastable 값 삭제          
            Scanner sc = new Scanner(System.in);
            System.out.println("--------------------Remove---------------------");                             
            System.out.println("종료하실려면 0을 입력해주세요");            
            
            while (!hashtable.isEmpty()) {
                System.out.print("입력 >>>>>>> ");                
                String remove = sc.nextLine();
                if(remove.equals("0")){
                    System.out.println("시스템을 종료합니다.");
                    break;
                }
                hashtable.remove(remove); 
                Iterator<String> iter = hashtable.keySet().iterator();
                System.out.println("--------------------Remove Key After--------------------");           
                while (iter.hasNext()) {
                    String key = iter.next();
                    System.out.println("Key : " + key + "  value : " + hashtable.get(key));
                }    
                printSize(hashtable); // hashtable 크기보여주기
            }                                        
            sc.close();
        }     
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void printSize(Hashtable<String, String> hashtable){
        try{
            System.out.println("--------------------Hashtable Size--------------------");
            System.out.println("Hastable Size : "+ hashtable.size());            
        }
        catch(Exception e){
            e.printStackTrace();
        }       
    }
    public static void main(String[] args) {
        HashTable thread = new HashTable();
        thread.start();       
    }
}