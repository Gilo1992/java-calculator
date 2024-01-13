import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       Double answer = 0d;
       String operation = null; 

       try (Scanner scanner = new Scanner(System.in)) {
        while(true) {
            String line = scanner.nextLine();

            if (isNumeric(line)) {
                Double number = Double.parseDouble(line);
                if (operation != null) {
                    switch (operation) {
                    case "+":
                        answer += number;
                        break;
                    case "-":
                        answer -= number;
                        break;
                    case "*":
                        answer *= number;
                        break;
                        case "/":
                        answer /= number;
                   







                    }
                    System.out.println(answer);
                } else {
                    answer = number;
                }
            } else {
                switch(line) {
                    case "+":
                    case "-":
                    case "*":
                    operation = line;
                    break;
                }
            }
              if ("Q".equals(line)) {
                System.exit(0);
              }  else if ("C".equals(line) ) {
                answer =0d;
                operation = null;
                System.out.println(answer);
              }
            }
        }
       }
private static boolean isNumeric(String line) {
    try {
        Double.parseDouble(line);
        return true;
    }catch (Exception e) {
        return false;
    }
}

    }
    
