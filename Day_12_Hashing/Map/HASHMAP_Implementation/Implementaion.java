import java.util.*;
public class Implementation{
    public class HashMap<K,V>{//generic
        private class Node{
            K key;
            V value;

            public Node(k key,V value){
                this.K=key;
                this.V=value;
            }
        } 
        private int n;
        private int N;
        private LinkedList<Node> buckets();//N=bucket.length

        @SuperssWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.bucket=new LinkedList[4];
            for(i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }

// ---------------------------------
        private int hashFunction(K key){
            int hc=key.hashCode();//returen a hash code values
            return Math.abs(hc)% N;

        }     

        private int  searchInLL(K key,int bi){
            LinkedList<Node> ll=buckets[bi];
            int di=0;

            for(int i=0;i<ll.size();i++){
                Node node=ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
        }  

        private void rehash(){
            LinkedList<Node> oldBuck[]=buckets;
            buckets=new LinkedList[N*2];
            N=2+N  ;
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }

            //nodes -> add in new  bucket

            for(int i=0;i<oldBuck.length;i++){
                LinkedList<Node> ll=oldBuck[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.remove();
                    put(node.key,node.value);
                }
            }
        }

        public void put(K key,V value){
           int bi=hashFunction(key);
           int di=searchInLL(key,bi)


           if(di != -1){
            Node node=backets[bi].get(di);
            node.value=value;
           }else{
            buckets[bi].add(new Node(key,value));
            n++;
           }

           double lambda=(double)n/N;
           if(lambda>2.0){
            rehash();
           }

        }

        public boolean containsKey(K key){
            int bi=hashFunction(key);
           int di=searchInLL(key,bi)


           if(di != -1){
            return true;
           }else{
            return false;
           }
        }

        public V remove(K key){
           int bi=hashFunction(key);
           int di=searchInLL(key,bi);


           if(di != -1){
            Node node=backets[bi].remove(di);
            n--;
            return node.value;
           }else{
            return null;
           }
        }



        public V get(K key){
           int bi=hashFunction(key);
           int di=searchInLL(key,bi)


           if(di != -1){
            Node node=backets[bi].get(di);
           return node.value
           }else{
           return null;
           }
        }

        public ArrayList<k> keySet(){
            ArrayList <k> keys=new ArrayList<>();

            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for(Node node:ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }   
    }
    
    public static void main(String args){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",200);
        hm.put("pakistan",20);
        hm.put("Us",40);
        hm.put("Amrica",44);
        
        ArrayList<String> keys=hm.keySet();
        for(String key:keys){
            System.out.println(key);
        }        
        System.out.println(hm.get(key:"india"));
        System.out.println(hm.remove(key:"india"));
        System.out.println(hm.get(key:"india"));
    }
}