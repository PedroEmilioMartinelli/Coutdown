public class Main {
    private static void coutdown(int i){
        if(i <= 0){
            return;
        } else{
            coutdown(i -1);
        }

    }
    public static void main(String[] args){
        coutdown(5);

    }
}

