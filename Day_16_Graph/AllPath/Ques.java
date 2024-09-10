import java.util.*;
public class Ques{
    public static class Edge{
        int src;
        int dest;
       
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
          
        }
    }

    static void creategraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
            //0-vertax

        graph[0].add(new Edge(0,3));
        //2 -vertax
        graph[2].add(new Edge(2,3));
       
        //3 -vertax
        graph[3].add(new Edge(3,1));
       
        //4 -vertax
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
       
        //5 -vertax
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
       } 

   public static void printallpath(ArrayList<Edge>[] graph,int src,int dest,String path){
        if(src==dest){
            System.out.println(path+dest);
            return;
        }
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            printallpath(graph,e.dest,dest,path+src);
        }
   }
    
    public static void main(String args[]){
       int v=6;
       ArrayList<Edge>[] graph=new ArrayList[v];//empty arraylist
        creategraph(graph);  
        int src=5;
        int dest=1;
       printallpath(graph,src,dest," ");
 


      
      
    }
}


