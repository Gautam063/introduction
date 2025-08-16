//Give a route conataning 4 direction (E,W,N,S), find the shortest path to reach destination

public class sortestP {
    public static float sortestPath(String path){
        int x =0;
        int y=0;
        for(int i=0; i< path.length();  i++){
           char dir= path.charAt(i);
           // S
           if(dir == 'S'){
            y-=1;
           }
           // N
           else if (dir == 'N') {
               y+=1;
           }
           // W
           else if (dir=='W') {
              x -=1;
           }
           // E
           else  {
              x+=1;
           }

        }
         System.out.println("processing");
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+ Y2);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(sortestPath(str));
    }
}
