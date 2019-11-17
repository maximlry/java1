import ru.progwards.java1.lessons.classes.ComplexNum;
import ru.progwards.java1.lessons.classes.Cow;
import ru.progwards.java1.lessons.classes.Duck;
import ru.progwards.java1.lessons.classes.Hamster;

public class temp {
    public static void main(String[] args) {

        ComplexNum CN3;

    Cow Cow = new Cow(1.0);
    Duck Duck = new Duck(1.0);
    Hamster Hamstel = new Hamster(1.0);

        System.out.println(Cow.toString());
        System.out.println(Hamstel.toString());
        System.out.println(Duck.toString());

    ComplexNum CN1 = new ComplexNum(1,2);
    ComplexNum CN2 = new ComplexNum(4,2);

        System.out.println(CN1);
        System.out.println(CN2);

        CN3 = ComplexNum.add(CN1, CN2);
        System.out.println(CN3);

        System.out.println(ComplexNum.sub(CN1, CN2));

        System.out.println(ComplexNum.mul(CN1, CN2));

        System.out.println(ComplexNum.div(CN1, CN2));

    }
}
