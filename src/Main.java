import java.util.*;

class Main {
    public String parts ;
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
         while (true){
             System.out.println("Введите арефметическое выражение: ");
              String parts = scanner.nextLine();
              if (parts.equals("exit")){
                  System.out.println("программа завершена");
                  break;
              }
              String result = calculator(parts);
         }
         scanner.close();


    }
    static String calculator(String input) {

        String[] parts = input.split(" ");
        if (parts.length > 3 ){
            throw new IllegalArgumentException("Некорректный ввод данных");
        }

        int x = 0;
        int c = 0;
        try {
            x = Integer.parseInt(parts[0]);

        }catch (NumberFormatException e) {
            }

        try {
            c = Integer.parseInt(parts[2]);

        }catch (NumberFormatException e) {
        }
        if (c > 0 & x <= 0) {
            throw new IllegalArgumentException("Нельзя совмещать системы чисел");
        } if (x > 0 & c <= 0) {
            throw new IllegalArgumentException("Нельзя совмещать системы чисел");

        }


        String number = parts[0];
        String number1 = parts[2];
        int num = x;
        int num1 = c;
        switch (number){
            case "1":
                x = Integer.parseInt(parts[0]);
                break;
            case "2":
                x = Integer.parseInt(parts[0]);
                break;
                case "3":
                x = Integer.parseInt(parts[0]);
                break;
            case "4":
                x = Integer.parseInt(parts[0]);
                break;
            case "5":
                x = Integer.parseInt(parts[0]);
                break;
            case "6":
                x = Integer.parseInt(parts[0]);
                break;
            case "7":
                x = Integer.parseInt(parts[0]);
                break;
            case "8":
                x = Integer.parseInt(parts[0]);
                break;
            case "9":
                x = Integer.parseInt(parts[0]);
                break;
            case "0":
                x = Integer.parseInt(parts[0]);
                break;

            default:
                x = convertToNumber(parts[0]);

        }
        switch (number1){
            case "1":
                c = Integer.parseInt(parts[2]);
                break;
            case "2":
                c = Integer.parseInt(parts[2]);
                break;
            case "3":
                c = Integer.parseInt(parts[2]);
                break;
            case "4":
                c = Integer.parseInt(parts[2]);
                break;
            case "5":
                c = Integer.parseInt(parts[2]);
                break;
            case "6":
                c = Integer.parseInt(parts[2]);
                break;
            case "7":
                c = Integer.parseInt(parts[2]);
                break;
            case "8":
                c = Integer.parseInt(parts[2]);
                break;
            case "9":
                c = Integer.parseInt(parts[2]);
                break;
            case "0":
                c = Integer.parseInt(parts[2]);
                break;
            default:
                c = convertToNumber(parts[2]);

        }
        num = x;
         num1 = c;

        String operator = parts[1];
        int result = 0;
        switch (operator) {
            case "+":
                result = num + num1;
                break;
            case "-":
                result = num - num1;
                break;
            case "*":
                result = num * num1;
                break;
            case "/":
                result = num / num1;
                break;
            default:
                throw new IllegalArgumentException("Неподдерживаемая арифметическая операция: " + operator);

        }

        try{
        if(Integer.parseInt(parts[0]) > 0) {
            System.out.println("результат " + result);
        }}
        catch (NumberFormatException e){
        {
            intToRoman(result);
             Result(result);
                return convertToRoman(result);
            }
       }
        return operator;
    }

        static int convertToNumber(String roman){
        int number = 0;
        int prev = 0;
        for(int i = roman.length() - 1; i >= 0 ; i--){
            int value = romanToArabic(roman.charAt(i));
            if(value < prev) {
                number -= value;
            }else {
                number += value;
            }
            prev = value;
        }
           return number;
    }
    static int romanToArabic(char roman){
        switch (roman){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            default:
                throw new
                     IllegalArgumentException("Неверный римский символ " + roman);
        }
    }
    static String convertToRoman(int number){
        if (number < 0){
            throw new IllegalArgumentException("Результат не может быть меньше нуля");
        }
        if (number == 0) {
            throw new
                    IllegalArgumentException("Результат не может быть равен нулю.");
        }
        StringBuilder roman = new StringBuilder();
        int[] values = {10,9,8,7,6,5,4,3,2,1};
        String[] romans = {"X","IX","VIII","VII","VI","V","IV","III","II","I"};
             int i = 0;
             while(number > 0){
                 if (number - values[i] >= 0 ){
                     roman.append(romans[i]);
                     number -= values[i];
                 }else {
                     i++;
                 }
             }
             return roman.toString();
    }
    static String intToRoman(int num) {
        int[] arabicValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumeral = new StringBuilder();

        for (int i = 0; i < arabicValues.length; i++) {
            while (num >= arabicValues[i]) {
                romanNumeral.append(romanNumerals[i]);
                num -= arabicValues[i];
            }
        }

        return romanNumeral.toString();
    }


    static int Result(int result){
        Main intToRoman = new Main();
        int num = result;
        System.out.println(intToRoman.intToRoman(num));
        return result;
    }
}

