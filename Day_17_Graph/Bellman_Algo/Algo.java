import java.util.*;
public class Algo{
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
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
       
        //1 -vertax
        graph[1].add(new Edge(1,2,-4));
        
       
        //2 -vertax
        graph[2].add(new Edge(2,3,2));
       
        //5 -vertax
        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));
        
    } 
    public static void ballmanFord(ArrayList<Edge>[] graph,int src){
        int dist[]=new int [graph.length];
        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        int v=graph.length;
        for(int i=0;i<v-1;i++){
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    Edge e=graph[j].get(k);
                    int u=e.src;
                    int dest=e.dest;
                    int wt=e.wt;

                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[dest]){
                        dist[dest]=dist[u]+wt;
                    }
                }


            }

        }   
        //print
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");

        }
        System.out.println();
    }
    


    public static void main(String args[]){
       int v=5;
       ArrayList<Edge>[] graph=new ArrayList[v];//empty arraylist
        creategraph(graph); 
        // int src=0; 
        ballmanFord(graph,0);
        
    }
}


