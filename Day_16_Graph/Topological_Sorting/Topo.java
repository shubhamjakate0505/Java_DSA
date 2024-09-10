import java.util.*;
public class Topo{
    public static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    static void creategraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
       
        //2 -vertax
        graph[2].add(new Edge(2,3,1));
       
        //3 -vertax
        graph[3].add(new Edge(3,1,1));
       
        //4 -vertax
        graph[4].add(new Edge(4,0,1));
       
        //5 -vertax
        graph[5].add(new Edge(5,0,1));
        graph[5].add(new Edge(5,2,1));
       
       
    } 

    
    public static void topsort(ArrayList<Edge>[] graph){
        boolean vis[]=new boolean[graph.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<graph.length;i++){
                if(!vis[i]){
                    topsortutil(graph,i,vis,s);
                }
        }
        while(!s.isEmpty()){
            System.out.println(s.pop()+"");

        }
    } 

    public static void topsortutil(ArrayList<Edge>[] graph,int curr,boolean vis[],Stack<Integer> s){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                topsortutil(graph,i,vis,s);
            }
        }
        s.push(curr);
    }   

    public static void main(String args[]){
       int v=6;
       ArrayList<Edge>[] graph=new ArrayList[v];//empty arraylist
        creategraph(graph);  

       topsort(graph);
      
    }
}


