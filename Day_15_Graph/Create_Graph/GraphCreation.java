import java.util.*;
public class GraphCreation{
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

    public static void main(String args[]){
        int v=5;
        ArrayList<Edge>[] graph=new ArrayList[v];//empty arraylist

        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        //o -vertax
        graph[0].add(new Edge(0,1,5));
        
        //1 -vertax
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        //2 -vertax
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));


        //3 -vertax
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        //4 -vertax
        graph[1].add(new Edge(4,2,2));
       
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.println(e.dest);
        }
    }
}