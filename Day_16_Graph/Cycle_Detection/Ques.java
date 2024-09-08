
// import java.util.ArrayList;
import java.util.*;
public class Ques{
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
         //0 -vertax
        graph[0].add(new Edge(0,2,1));
       
        
        //1 -vertax
        graph[1].add(new Edge(1,0,1));
        
        
        //2 -vertax
        graph[2].add(new Edge(2,3,1));
        

        //3 -vertax
        graph[3].add(new Edge(3,0,1));
      

        
                       /* 
        1 - - - 3 
      /         |   \ 
    /               
  /             |     \
0
  \             |      5 - - -6
    \                 /
      \         |  /
       2 - - - 4         */

        
    } 

   


    public static boolean isCycle(ArrayList<Edge>[] graph){
      boolean vis[]=new boolean[graph.length];
      boolean
    }

    public static void main(String args[]){
       int v=4;
       ArrayList<Edge>[] graph=new ArrayList[v];//empty arraylist
      creategraph(graph);  

        
      
    }
}


