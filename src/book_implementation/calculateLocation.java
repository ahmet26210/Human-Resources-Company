package src.book_implementation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class calculateLocation {
    public void calculate(String currentLocation) {
        int start;

        if(currentLocation.equals("Kartal"))
            start=0;
        else if(currentLocation.equals("Pendik"))
            start=1;
        else if(currentLocation.equals("Tuzla"))
            start=2;
        else if(currentLocation.equals("Kadıköy"))
            start=3;
        else if(currentLocation.equals("Maltepe"))
            start=4;
        else if(currentLocation.equals("Beykoz"))
            start=5;
        else if(currentLocation.equals("Beşiktaş"))
            start=6;
        else
        {
            return;

        }


        int numV = 0; // The number of vertices.
        Graph graph = null;
        //Load the graph from a file.
        try {
            File myObj = new File("graph.txt"); /* ./src/book_implementation/ */
            Scanner scan = new Scanner(myObj);
            graph = AbstractGraph.createGraph(scan, false, "List");
            numV = graph.getNumV();
        } catch (IOException ex) {
            System.err.println("IO Error while reading graph");
            System.err.println(ex.toString());
            System.exit(1);
        }
        //arrays for predecessors and distances
        int[] pred = new int[numV];
        double[] dist = new double[numV];

        //Execute Dijkstra's algorithm on the graph
        dijkstrasAlgorithm(graph, start, pred, dist);
        for(int i = 0; i < pred.length; i++){
            if(i==0 && dist[i]<60  && pred[i]==start)
                System.out.println("Kartal" + ":\t" + pred[i] + "\t" + dist[i]);
            if(i==1 && dist[i]<60  && pred[i]==start)
                System.out.println("Pendik" + ":\t" + pred[i] + "\t" + dist[i]);
            if(i==2 && dist[i]<60 && pred[i]==start)
                System.out.println("Tuzla" + ":\t"+ pred[i] + "\t" + dist[i]);
            if(i==3 && dist[i]<60  && pred[i]==start)
                System.out.println("Kadıköy" + ":\t" + pred[i] + "\t" + dist[i]);
            if(i==4 && dist[i]<60  && pred[i]==start)
                System.out.println("Maltepe" + ":\t" + pred[i] + "\t" + dist[i]);
            if(i==5 && dist[i]<60  && pred[i]==start)
                System.out.println("Beykoz" + ":\t"+ pred[i] + "\t" + dist[i]);
            if(i==6 && dist[i]<60  && pred[i]==start)
                System.out.println("Beşiktaş" + ":\t"+ pred[i] + "\t" + dist[i]);
        }


    }
    public static void dijkstrasAlgorithm(Graph graph,
                                          int start,
                                          int[] pred,
                                          double[] dist){
        int numV = graph.getNumV();
        HashSet<Integer> vMinusS = new HashSet<Integer>(numV);
        //Initialize V - S
        for(int i = 0; i < numV; i++){
            if(i != start)
                vMinusS.add(i);
        }
        // Initialize pred and dist
        for(int v : vMinusS){
            pred[v] = start;
            dist[v] = graph.getEdge(start, v).getWeight();
        }
        //Main loop
        while(vMinusS.size() != 0){
            //Find the value u in V - S with the smallest dist[u]
            double minDist = Double.POSITIVE_INFINITY;
            int u = -1;
            for(int v : vMinusS){
                if(dist[v] < minDist){
                    minDist = dist[v];
                    u = v;
                }
            }
            // Remove u from vMinusS
            vMinusS.remove(u);
            //Update the distances
            Iterator<Edge> edgeIter = graph.edgeIterator(u);
            while(edgeIter.hasNext()){
                Edge edge = edgeIter.next();
                int v = edge.getDest();
                if(vMinusS.contains(new Integer(v))){
                    double weight = edge.getWeight();
                    if(dist[u] + weight < dist[v]){
                        dist[v] = dist[u] + weight;
                        pred[v] = u;
                    }
                }
            }
        }
    }
}
