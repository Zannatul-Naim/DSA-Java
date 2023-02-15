package graph;

import java.util.Scanner;

public class AdjacencyMatrix {
    
    int v, e;
    private int [][] mat;

    AdjacencyMatrix(int v, int e) {
        this.v = v;
        this.e = e;
        mat = new int [v][v];
        for(int i = 0; i < v; i++) {
            for(int j = 0; j < v; j++) {
                mat[i][j] = 0;
            }
        }
    }

    public void addEdge(int x, int y) {
        mat[x][y] = 1;
        mat[y][x] = 1;
    }

    public void printMatrix() {
        System.out.println("Adjacency matrix representation of the graph is: ");

        for(int i = 0; i < v; i++) {
            for(int j = 0; j < v; j++) {
                System.out.print(mat[i][j] + " ");
            } System.out.println();
        }
    }

    
    public static void main(String[] args) {

        int v, e;
        System.out.print("Enter number of vertices and edges: ");
        Scanner in = new Scanner(System.in);

        v = in.nextInt();
        e = in.nextInt();

        AdjacencyMatrix adm = new AdjacencyMatrix(v, e);

        System.out.println("Enter edges");
        for(int i = 0; i < e; i++) {
            int x, y;
            x = in.nextInt();
            y = in.nextInt();
            adm.addEdge(x, y);
        }

        adm.printMatrix();

        in.close();
    }
}
