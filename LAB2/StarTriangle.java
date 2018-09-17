public class StarTriangle {
    public static int width;

    public StarTriangle(int width){
        this.width = width;
    }

    public String ToString(){
        int cnt = 0;
        String s = "";
        for(int i = 0; i < width; i++){
            cnt++;
            for(int j = 0; j < cnt; j++){
                s += "[*]";
            }
            s+="\n";
        }
        return s;
    }

    public static void main(String[] args){
        StarTriangle small = new StarTriangle(5);
        System.out.println(small.ToString());
    }
}
