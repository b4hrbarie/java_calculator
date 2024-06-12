package application;

import java.util.Scanner;

import entities.Calculator;

public class Program {

public static void main(String[] args) {
  Calculator myCalc = new Calculator();
  char useRes = 'n';
  char operator = ' ';
  char continues = 's';
  System.out.println("Boas vindas à calculadora!");
  
  while (continues == 's') {
      switch (useRes){
        case 'n':
         System.out.println("Digite o primeiro número:");
         Scanner scan1 = new Scanner(System.in);
         double numb1 = scan1.nextDouble();
         myCalc.setNumber1(numb1);
         break;
        case 's':
          myCalc.useRes();
          break;
        default:
          System.out.println("Opção inválida!");
      }  
        
      System.out.println("Digite o segundo número:");
      Scanner scan2 = new Scanner(System.in);
      double numb2 = scan2.nextDouble();
      myCalc.setNumber2 (numb2);
      
    System.out.println("Digite o operador:");
    System.out.println("1 - Soma");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - Divisão");
    Scanner scan3 = new Scanner(System.in);
    operator = scan3.next().charAt(0);
    
     switch (operator){
       case '1':
         myCalc.result = myCalc.Sum();
         System.out.println("O resultado da soma é: " + myCalc.result);
         break;
       case '2':
         myCalc.result = myCalc.Sub();
         System.out.println("O resultado da subtração é: " + myCalc.result);
         break;
       case '3':
         myCalc.result = myCalc.Mult();
         System.out.println("O resultado da multiplicação é: " + myCalc.result);
         break;
       case '4':
         myCalc.result = myCalc.Div();
         System.out.println("O resultado da divisão é: " + myCalc.result);
         break;
       default :
        System.out.println("Operador inválido");  
     }
  
  System.out.println("Deseja contiuar calculando? (s = sim / outro caractere = sair)");
  Scanner scan4 = new Scanner(System.in);
  continues = scan4.next().charAt(0);
    if (continues =='s') {
        System.out.println("Deseja usar o resultado do cálculo anterior na próxima operação?         (s = sim / n = não)");
         Scanner scan5 = new Scanner(System.in);
         useRes = scan5.next().charAt(0);
    }
}

}
  
}
