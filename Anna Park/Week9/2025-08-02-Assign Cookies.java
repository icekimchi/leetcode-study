import java.util.Arrays;

public class assignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); 
        Arrays.sort(s); 

        int child = 0;  
        int cookie = 0; 

        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) 
                child++;
            }
            // 쿠키 인덱스는 항상 증가
            cookie++;
        }

        return child;
    }
}
