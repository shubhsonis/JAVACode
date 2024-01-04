class A17{
    public static void main(String[] args) {
        String a[] = {"Shubh1", "Shubh2", "Shubh3", "Shubh4" };
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]+ "is a Duplicate " +j);
                }
            }
        }
    }
}