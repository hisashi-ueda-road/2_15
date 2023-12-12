package study;

public class Task2_7 {
    /**
     * ➀下記の「red」と「blue」に「フィールド変数＋アクセス修飾子」を追加して下さい。
     */
    public String red = "赤";
    public String blue = "青";
    
    public static void main(String[] args) {
        
        /**
         * ②Bikeクラスをインスタンス化して下さい。
         * 　下記条件にしたがって作成して下さい。
         * 条件1：変数名「bike1」「bike2」でそれぞれをインスタンス化して下さい。
         * 条件2：「bike1」「bike2」に適切な引数を設定して下さい。
         */
        Bike bike1 = new Bike("赤","250cc");
        Bike bike2 = new Bike("青","700cc");

        
        bike1.run();
        System.out.println("car1は" + bike1.color + "色で" + bike1.type + "タイプです。 現在" + bike1.check());
        bike2.stop();
        System.out.println("car2は" + bike2.color + "色で" + bike2.type + "タイプです。 現在" + bike2.check());
    }
}
 
class Bike {
    String color;
    String type;
    Boolean state;
 
    public Bike(String color) {
        this.color = color;
        this.type = "250cc";
    }
 
    public Bike(String color, String type) {
        this.color = color;
        this.type = type;
    }
 
    public void run() {
        this.state = true;
    }
 
    public void stop() {
        this.state = false;
    }
 
    public String check( ) {
        if(this.state) {
            return "走行中です。";
        } else {
            return "停止中です。";
        }
    }
}
