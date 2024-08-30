import java.util.*;
public class Solider{
    static class Row implements Comparable<Row>{
        //For the Storing Solidires and its idx
        int soldiers;
        int idx;

        public Row(int soldiers,int idx){
            this.soldiers=soldiers;
            this.idx=idx;
        }

        @Override
        public int compareTo(Row r2){
            //if the soldier cout is same than compare on the bases of idx
            if(this.soldiers==r2.soldiers){
                return this.idx-r2.idx;
            }else{
                return this.soldiers-r2.soldiers;
            }
        }
    }


    public static void main(String args[]){
        int matrix[][]={
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0}
        };

        int k=2;

        PriorityQueue<Row> pq=new PriorityQueue<>();

        for(int i=0;i<matrix.length;i++){
            int cout=0;
            for(int j=0; j<matrix[0].length;j++){
                cout+=matrix[i][j]==1? 1:0;
            }
            pq.add(new Row(cout,i));
        }

        for(int i=0;i<k;i++){
            System.out.println("R"+pq.remove().idx);
        }

    }
}