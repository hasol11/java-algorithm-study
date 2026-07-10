import java.util.HashMap;
import java.util.Scanner;

public class MySolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();        
        int answer = 0;
        HashMap<Character, Integer> thm = new HashMap<>();
        for (char x : t.toCharArray()) {
            thm.put(x, thm.getOrDefault(x, 0) + 1);
        }
        HashMap<Character, Integer> shm = new HashMap<>();
        int len = t.length() - 1;
        for (int i = 0; i < len; i++) {
            shm.put(s.charAt(i), shm.getOrDefault(s.charAt(i), 0) + 1);
        }
        int lt = 0;
        for (int rt = len; rt < s.length(); rt++) {
            shm.put(s.charAt(rt), shm.getOrDefault(s.charAt(rt), 0) + 1);
            if (shm.equals(thm)) {
                answer++;
            }
            char leftChar = s.charAt(lt);
            shm.put(leftChar, shm.get(leftChar) - 1);
            if (shm.get(leftChar) == 0) {
                shm.remove(leftChar);
            }
            lt++;
        }
        
        System.out.println(answer);
    }
}