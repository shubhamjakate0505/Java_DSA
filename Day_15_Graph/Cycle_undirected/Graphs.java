import java.util.*;
public class Graphs{
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
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        graph[0].add(new Edge(0,3,1));
        
        //1 -vertax
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,2,1));
        
        //2 -vertax
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,1,1));

        //3 -vertax
       graph[3].add(new Edge(3,4,1));
       
        //4 -vertax
        graph[4].add(new Edge(4,3,1));
} 


public static boolean DetectCycle(ArrayList<Edge>[] graph){//O(v+e)
    boolean vis[]=new boolean[graph.length];
    for(int i=0;i<graph.length;i++){
        if(!vis[i]){
            if(DetectCycleUtility(graph,vis,i,-1)){
                return true;
                //cycal exit one of the part
            }
            
        }
    }
    return false;

}

public static boolean DetectCycleUtility(ArrayList<Edge>[] graph,boolean vis[],int curr,int par){
    vis[curr]=true;
    for(int i=0;i<graph[curr].size();i++){
        Edge e=graph[curr].get(i);
        //case 3
        if(!vis[e.dest]){
            if(DetectCycleUtility(graph,vis,e.dest,curr)){
                 return true;
            }
            
        }
    //case 1
    if(vis[e.dest] && e.dest!=par){
        return true;
    }
    //case 2 do nathing
    
    }
    return false;

}


public static void main(String args[]){

            
                       /* 
        0 - - - 3 
      / |       |    
    /               
  /     |       |            
1
  \     |       |             
    \                 
      \ |       |        
        2       4         */

       int v=5;
       ArrayList<Edge>[] graph=new ArrayList[v];//empty arraylist
       creategraph(graph);  
      
       System.out.println( DetectCycle(graph));
        
    }
}


