class MyHashMap {

    int ans[];
    public MyHashMap() {
        ans=new int[1000001];
        Arrays.fill(ans,-1);
    }

    public void put(int key, int value) {
        ans[key]=value;
    }

    public int get(int key) {
        return ans[key];

    }

    public void remove(int key) {
        ans[key]=-1;

    }
}
