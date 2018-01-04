package java_04_java语言程序设计.第28章_图及其应用;

public class Edge {
    int u;
    int v;

    public Edge(int u, int v) {
        this.u = u;
        this.v = v;
    }

    @Override
    public boolean equals(Object o) {
        return u==((Edge)o).u&&v==((Edge) o).v;
    }


}
