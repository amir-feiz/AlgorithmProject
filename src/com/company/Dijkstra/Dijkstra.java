package com.company.Dijkstra;

import com.company.View.PrintColor;

import java.util.*;

public class Dijkstra {
    public static Graph generateRandomGraph(int numVertices) {
        Graph graph = new Graph();

        // ایجاد رئوس
        for (int i = 0; i < numVertices; i++) {
            Vertex vertex = new Vertex(i+1);
            graph.addVertex(vertex);
        }

        // ایجاد یال‌ها
        for (int i = 0; i < numVertices; i++) {
            Vertex source = graph.getVertices().get(i);

            for (int j = i + 1; j < numVertices; j++) {
                Vertex destination = graph.getVertices().get(j);
                int weight = (int) (Math.random() * 10) + 1; // وزن تصادفی
                Edge edge = new Edge(source, destination, weight);
                graph.addEdge(edge);
            }
        }
        return graph;
    }
    public static void applyDijkstra(Graph graph, Vertex source) {
        Map<Vertex, Integer> distance = new HashMap<>();
        Map<Vertex, Vertex> previous = new HashMap<>();
        PriorityQueue<Vertex> queue =
                new PriorityQueue<>(Comparator.comparingInt(distance::get));

        // تنظیم فاصله اولیه برای همه رئوس به بی‌نهایت
        for (Vertex vertex : graph.getVertices()) {
            distance.put(vertex, Integer.MAX_VALUE);
        }

        // تنظیم فاصله اولیه برای رأس مبدأ به صفر
        distance.put(source, 0);

        // قرار دادن رئوس در صفوف اولیه
        queue.add(source);

        while (!queue.isEmpty()) {
            Vertex current = queue.poll();

            // بررسی همسایگان رئوس فعلی
            for (Edge edge : graph.getEdges()) {
                if (edge.getSource().equals(current)) {
                    Vertex neighbor = edge.getDestination();
                    int newDistance = distance.get(current) + edge.getWeight();

                    // اگر فاصله جدید به همسایه کمتر از فاصله قبلی باشد، به‌روزرسانی کن
                    if (newDistance < distance.get(neighbor)) {
                        distance.put(neighbor, newDistance);
                        previous.put(neighbor, current);
                        queue.remove(neighbor); // حذف همسایه از صف
                        queue.add(neighbor); // اضافه کردن همسایه با فاصله به‌روزرسانی شده به صف
                    }
                }
            }
        }

        // نمایش نزدیک ترین مسیرها به رئوس دیگر
        for (Vertex vertex : graph.getVertices()) {
            PrintColor.printBlu2("Vertex " + vertex.getId() + ": \t");
            if (distance.get(vertex) == Integer.MAX_VALUE) {
                PrintColor.printYel("No path\t");
            } else {
                List<Vertex> path = new ArrayList<>();
                Vertex current = vertex;
                while (current != null) {
                    path.add(current);
                    current = previous.get(current);
                }
                Collections.reverse(path);
                PrintColor.printNorm2("Path: ");
                for (Vertex v : path) {
                    PrintColor.printNorm2(v.getId() + ",");
                }

                PrintColor.printNorm("\b\t\tDistance: " + distance.get(vertex));
            }
        }
    }
}
