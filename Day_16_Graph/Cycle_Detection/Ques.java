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
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        
        //1 -vertax
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));
        
        //2 -vertax
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        //3 -vertax
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        //4 -vertax
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,5,1));

        //5 -vertax
        graph[5].add(new Edge(5,6,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,3,1));

        //6 -vertax
        graph[6].add(new Edge(6,5,1));

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

    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        q.add(0);//source

        while(!q.isEmpty()){//jab tak Q empty nhi hoth tab tak remove karo
            int curr=q.remove();

            if(!vis[curr]){//if curr not visited than vist  
                    System.out.print(curr+" ");
                    vis[curr]=true;
                    for(int i=0;i<graph[curr].size();i++){
                        Edge e=graph[curr].get(i);
                        q.add(e.dest);
                    }
            }
        }


    }

    public static void main(String args[]){
       int v=7;
       ArrayList<Edge>[] graph=new ArrayList[v];//empty arraylist
        creategraph(graph);  

        bfs(graph);
      
    }
}


