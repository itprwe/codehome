package my.prwe.oo;

import java.util.Scanner;

public class TestInstrument {
    public static void main(String[] args) {
        Musician m = new Musician();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入乐手名字：");
        scanner.nextLine();
        System.out.print("请输入想听的乐器==>1-erhu; 2-panio; 3-violin：");
        int a = scanner.nextInt();

        switch (a){
            case 1:
                m.play(new EeHu());
                break;
            case 2:
                m.play(new Paino());
                break;
            case 3:
                m.play(new Violin());
                break;
            default:
                System.out.println("输入错误，请重新输入！");
                break;
        }


    }
}

class Instrument{
    public void makeSound(){
        System.out.println("发出声音，，，");
    }
}

class EeHu extends Instrument{
    @Override
    public void makeSound() {
        System.out.println("二胡发出声音，，，");
    }
}

class Paino extends Instrument{
    @Override
    public void makeSound() {
        System.out.println("钢琴发出声音，，，");
    }
}

class Violin extends Instrument{
    @Override
    public void makeSound() {
        System.out.println("小提琴发出声音，，，");
    }
}

class Musician{
    public void play(Instrument i){
        i.makeSound();
    }
}