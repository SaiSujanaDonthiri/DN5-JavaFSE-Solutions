interface Playable{
    void play();
}
class Guitar implements Playable{
    public void play(){
        System.out.println("Playing guitar");
    }
}
class Piano implements Playable{
    public void play(){
        System.out.println("Playing piano");
    }
}
public class Interface{
    public static void main(String[] args) {
        Guitar g = new Guitar();
        Piano p = new Piano();
        g.play();
        p.play();
    }
}