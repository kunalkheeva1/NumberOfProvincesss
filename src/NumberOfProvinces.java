import java.util.*;

public class NumberOfProvinces {

    static void dfs(int current, ArrayList<ArrayList<Integer>> adj, int v, int[] visited){
        for(int i=0; i<v; i++){
            if(adj.get(current).get(i) ==1 && visited[i]==0){
                visited[i]= 1;
                dfs(i, adj, v, visited);
            }
        }
    }

    static int numberOfProvinces(ArrayList<ArrayList<Integer>> adj, int v){
        int[] visited = new int[v];
        for(int i =0; i<v; i++){
            visited[i] =1;
        }
        int count =0;
        for(int i=0; i<v; i++){
            if(visited[i] ==0){
                visited[i] =1;
                count ++;
                dfs(i,adj, v, visited);
            }
        }return count;



    }
    public static void main(String[] args) {




    }
}
