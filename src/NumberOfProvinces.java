import java.util.*;

public class NumberOfProvinces {


    //dfs method
    static void dfs(int current, ArrayList<ArrayList<Integer>> adj, int v, int[] visited){
        //adj matrix will have 1 if they are connected,
        //so the condition is if they are connected and not visited then mark them visited
        //and apply dfs to next elements
        for(int i=0; i<v; i++){
            if(adj.get(current).get(i) ==1 && visited[i]==0){
                visited[i]= 1;
                dfs(i, adj, v, visited);
            }
        }
    }

    static int numberOfProvinces(ArrayList<ArrayList<Integer>> adj, int v){

        //first of all get a visited array to keep the record for the visited elements
        // and mark all the elements not visited in it initially
        int[] visited = new int[v];
        for(int i =0; i<v; i++){
            visited[i] =1;
        }
        int count =0;
        //increase the count after every other depth first search
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
