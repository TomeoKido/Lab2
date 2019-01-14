import java.util.Random;

public class PassGenerator {
    private int size;
    Random random = new Random();
    public String getPass(int size){
        this.size = size;
        String pass = "";
        for (int i = 0; i < size; i++){
            int buf = random.nextInt(4);
            switch(buf){
                case 0: pass += (char)rand('0', '9'); break;
                case 1: pass += (char)rand('a', 'z'); break;
                case 2: pass += (char)rand('A', 'Z'); break;
                case 3: pass += '_'; break;
            }
        }
        return pass;
    }
    private int rand(int nach, int kon){
        int val = nach + random.nextInt(kon-nach+1);
        return val;
    }
}
