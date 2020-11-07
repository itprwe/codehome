import java.awt.*;
import javax.swing.*;
public class BallGame extends JFrame {

    //加载图片
    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

    double x=100;//小球横坐标
    double y=100;//小球纵坐标

    boolean right = true;//为true小球向右
    public void paint(Graphics g){
        System.out.println("桌面被画了一次");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);

        if(right){
            x=x+10;
        }else{
            x=x-10;
        }
        if(x>856-40-30){
            right=false;
        }
        if(x<40){
            right=true;
        }
    }

    //窗口加载
    void launchFrame(){
        setSize(856,500);
        setLocation(50,50);//窗口左上角位于离电脑屏幕左上角的50,50c处
        setVisible(true);

        //重画窗口，小球动起来
        while(true){
            repaint();
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("===========");
        BallGame game = new BallGame();
        game.launchFrame();
    }
}
