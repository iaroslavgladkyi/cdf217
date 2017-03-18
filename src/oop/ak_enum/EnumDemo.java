package oop.ak_enum;

/**
 * Created by codefire on 26.02.17.
 */
public class EnumDemo {
    public static void main(String[] args) {
        // FigureType figure = FigureType.CIRCLE;
        FigureType[] array = FigureType.values();
        FigureType figure = array[(int) (Math.random() * array.length)];

        String translation = translate(figure);
        System.out.println(translation);
    }

    private static String translate(FigureType figure) {
        String result;
        switch (figure) {
            case RECTANGLE:
                result = "Прмоугольник";
                break;
            case CIRCLE:
                result = "Окружность";
                break;
            default:
                result = "хз что";
        }
        return result;
    }
}
