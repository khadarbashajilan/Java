import javax.lang.model.util.ElementScanner14;

public class Shortest_distance {
    public static float get(String path)
    {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if(dir=='S')
            {
                y--;
            }
            else if(dir=='N')
            {
                y++;
            }
            else if(dir=='E')
            {
                x++;
            }
            else 
            {
                x--;
            }
            }
            int x_2=x*x;
            int y_2=y*y;
            return (float)Math.sqrt(x_2+y_2);
        }
        public static void main(String[] args) {
            String str="WNEENESENNN";
            System.out.println(get(str));
        }
    }

