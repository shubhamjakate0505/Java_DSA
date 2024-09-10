import java.util.*;
public class kahns{
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

    public static void calIndeg(ArrayList<Edge>[] graph,int indeg[]){
        for(int i=0;i<graph.length;i++){
            int v=i;
            for(int j=0;j<graph[v].size();j++){
                Edge e=graph[v].get(j);
                indeg[e.dest]++;
            }
        }
    }
    public static void topsort(ArrayList<Edge>[] graph){
        int indeg[]=new int[graph.length];
        calIndeg(graph,indeg);
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }
        //bsf
        while(!q.isEmpty()){
            int curr=q.remove();
            System.out.println(curr+" ");
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest]==0){
                    q.add(e.dest);
                }
            }   
        }
        System.out.println();
    }
    public static void main(String args[]){
       int v=6;
       ArrayList<Edge>[] graph=new ArrayList[v];//empty arraylist
        creategraph(graph);  

        topsort(graph);

      
      
    }
}


