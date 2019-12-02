package homework;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

/**
 * 编写一段程序，从命令行接受一个整数N 和double 值p（0 到1 之间）作为参数，
 * 在一个圆上画出大小为0.05 且间距相等的N 个点，然后将每对点按照概率p 用灰线连接。
 */
public class Prac1_1_31 {
    static  class Point {
        double x;
        double y;

        public Point(double x, double y) {
            super();
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
//        int N = Integer.parseInt(args[0]);
//        double p = Double.parseDouble(args[1]);
        int N = StdIn.readInt();
        double p = StdIn.readDouble();
//        if (p < 0 || p > 1) {
//            System.out.println("p is not valid!");
//            return;
//        }
        Point[] points = new Point[N];
        double angel = 360.0/N ;

        StdDraw.circle(0.5,0.5,0.5);
        StdDraw.setPenRadius(0.05);
        for (int i=0;i <N;i++){
            points[i] = new Point(0.5+0.5 * Math.cos(angel * i * Math.PI / 180),0.5+0.5 * Math.sin(angel * i * Math.PI / 180));
            StdDraw.point(points[i].x,points[i].y);
        }
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(Color.GRAY);
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (StdRandom.bernoulli(p)) {
                    StdDraw.line(points[i].x, points[i].y, points[j].x, points[j].y);
                }
            }
        }
    }
}




