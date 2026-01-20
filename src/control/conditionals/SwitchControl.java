package control.conditionals;

public class SwitchControl {

    public static void main(String[] args) {

        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Segunda-feira";
                break;
            case 2:
                dayName = "Terça-feira";
                break;
            case 3:
                dayName = "Quarta-feira";
                break;
            case 4:
                dayName = "Quinta-feira";
                break;
            case 5:
                dayName = "Sexta-feira";
                break;
            case 6:
                dayName = "Sábado";
                break;
            case 7:
                dayName = "Domingo";
                break;
            default:
                dayName = "Dia inválido";
        }

        System.out.println(dayName);
    }
}
