import java.util.Scanner;

public class Main {
    public String parts ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите арефметическое выражение: ");
            String parts = scanner.nextLine();
            if (parts.equals("exit")) {
                System.out.println("программа завершена");
                break;
            }
            String result = calculator(parts);
        }
        scanner.close();
    }
    static String calculator(String input) {

        String[] parts = input.split(" ");
        try {
            int part1 = Integer.parseInt(parts[0]);
            if (part1 >= 0){
                throw new ArrayIndexOutOfBoundsException("Некорректный вводы данных");
            }
        }catch (IllegalArgumentException e){

        }
        String part1 = parts[0];
        if(part1.length() > 12 ){
            throw new IllegalArgumentException("Некорректный ввод данных");
        }
        String part2 = parts[2];

        if(part2.length() > 12){
            throw new IllegalArgumentException("Некорректный ввод данных");
        }
        if (parts.length > 3) {
            throw new IllegalArgumentException("Некорректный ввод данных");
        }
        String operator = parts[1];
        switch (operator) {
            case "+":
                Plus(parts);

             break;
            case "-":
                Minus(parts);
                break;
            case "/":
                Separation(parts);
                break;
            case "*":
                Multiplication(parts);
                break;


        }
        return input;
    }
     static String Plus(String[] parts){
        try{
            int part2 = Integer.parseInt(parts[2]);
            if (part2 >= 0){
                throw new ArrayIndexOutOfBoundsException("Некорректный ввод данных");
            }
        }catch (IllegalArgumentException e){

        }
        StringBuilder part1 = new StringBuilder(parts[0]);
        part1.deleteCharAt(part1.length() - 1);
         StringBuilder part2 = new StringBuilder(parts[2]);
         part2.deleteCharAt(0);
         String result = part1.toString() + part2.toString();
         System.out.println(result);

         return result;
    }
    static String Minus(String[] parts){
         try{
             int part2 = Integer.parseInt(parts[2]);
             if (part2 >= 0);
             throw new ArrayIndexOutOfBoundsException("Некорректный вод данных");
         }catch (IllegalArgumentException e){
         }
        String part1 = parts[0];
        StringBuilder charick = new StringBuilder(parts[2]);
        charick.deleteCharAt(0);
        int z = parts.length;
        charick.deleteCharAt(z);
        String part2 = new String(charick);
        String result = part1.replace(part2,"");

        System.out.println(result);
        return result;
    }

    static String Separation(String[] parts){
        StringBuilder part1 = new StringBuilder(parts[0]);
        int part2 = Integer.parseInt(parts[2]);
        if(part2 > 10){
            throw new IllegalArgumentException("Некорректный ввод данных");
        }
        int z = part1.length() - 2;
        int x = z/part2;
        part1.deleteCharAt(0);
        part1.deleteCharAt(part1.length() - 1);
        String result;

        for(int i = z; i > x; i--){
            z = z - 1;
            part1.deleteCharAt(z);

        }
        result = new String(part1);
        System.out.println("\"" + result + "\"" );

        return result;
    }


    static String Multiplication(String[] parts){
            StringBuilder part1 = new StringBuilder(parts[0]);
            try{
                int part2 = Integer.parseInt(parts[2]);

            }catch (IllegalArgumentException e){
                throw new IllegalArgumentException("Некорректный ввод данных");
            }
            int part2 = Integer.parseInt(parts[2]);
            part1.deleteCharAt(0);
            part1.deleteCharAt(part1.length() - 1);
            String result = new String(part1);

            if (part2 > 10) {
                throw new IllegalArgumentException("Некорректный ввод данных");
            }


            int z = part2 - 1;

            for (int i = 0; i < z; i++) {
                result = result.concat(new String(part1));

            }
            if (result.length() > 40) {
                StringBuilder result1 = new StringBuilder(result);
                int v = result.length();
                for (int i = v; i > 40; i--) {
                    v--;
                    result1.deleteCharAt(v);
                }
                System.out.println(result1 + "...");

            } else {
                System.out.println("\"" + result + "\"");
            }

            return result;

    }



}