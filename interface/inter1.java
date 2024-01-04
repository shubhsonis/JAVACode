interface I {
    int operation (int x, int y);
}
class Test {
    public static void main(String[] args) {
        I obj1 = (a,b) -> {return (10+20);};
        I obj2 = (a,b) -> {return (10-5);};
        I obj3 = (a,b) -> {
            if(a>b)
                return a;
                return b;
            
        };
    }
}
 