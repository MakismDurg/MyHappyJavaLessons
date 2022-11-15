public class IfElseStatementTheme {
	public static void main(String[] args) {
		System.out.println("1. Перевод псевдокода на язык Java\n");
		int age = 29;
		if(age > 20) {
			System.out.println("Тебе более 20 лет");
		} else {
			System.out.println("Тебе меньше 20 лет");
		}
		boolean isThisMale = true;
		if(!isThisMale) {
			System.out.println("Женщина)");
		} else {
			System.out.println("Мужчина");
		}
		float height = 1.74f;
		if(height < 1.80) {
			System.out.println("Рост менее 1м 80см");
		} else {
			System.out.println("Рост более 1м 80см");
		}
		char firstLetterOfName = "Maksim".charAt(0);
		if(firstLetterOfName == 'M') {
			System.out.println("имя начинается на букву «М»");
		}  else if(firstLetterOfName == 'I') {
			System.out.println("имя начинается на букву «I»");
		} else {
			System.out.println("Допустимы имена, начинающиеся на «М» или «I». " 
				+ "Ведённое имя не подходит");
		}

		System.out.println("\n2. Поиск max и min числа\n");
		int num1 = 18;
		int num2 = 3;
		if(num1 > num2) {
			System.out.println("Число num1 больше, чем число num2");
		} else if(num1 < num2) { 
			System.out.println("Число num2 больше, чем число num1 ");
		} else if (num1 == num2) {
			System.out.println("Число num1 равно числу num2");
		}

		System.out.println("\n3. Проверка числа\n");
		int numN = 749;
		if(numN == 0){
			System.out.println("Число N равно нулю");
		} else if(numN % 2 == 0) {
			System.out.println("Число N является чётными и равно " + numN);
			if(numN > 0) {
				System.out.println("Число N положительное");
			} else if(numN < 0) {
				System.out.println("Число N отрицательное");
			}
		} else if(numN % 2 != 0) {
			System.out.println("Число N не является чётными и равно " + numN);
			if(numN > 0) {
				System.out.println("Число N положительное");
			} else if(numN < 0) {
				System.out.println("Число N отрицательное");
			}
		}

		System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        num1 = 111;
        num2 = 211;
        int digitI1 = num1 % 10;
        int digitII1 = num1 / 10 % 10;
        int digitIII1 = num1 / 100;
        int digitI2 = num2 % 10;
        int digitII2 = num2 / 10 % 10;
        int digitIII2 = num2 / 100; 
        System.out.println("Есть числа: " + num1 + " и " + num2);
        if(digitI1 == digitI2) {
            if(digitII1 == digitII2) {
                if(digitIII1 == digitIII2) {
                    System.out.println("Совпадают цифры I, II и III разрядов");
                }
            }
        } else if(digitI1 ==  digitI2) {
            if(digitII1 != digitII2) {
                if(digitIII1 != digitIII2) {
                    System.out.println("Совпадают цифры I разряда");
                }
            }
        } else if(digitI1 !=  digitI2) {
            if(digitII1 == digitII2) {
                if(digitIII1 != digitIII2) {
                    System.out.println("Совпадают цифры II разряда");
                }
            }
        } else if(digitI1 !=  digitI2) {
            if(digitII1 != digitII2) {
                if(digitIII1 == digitIII2) {
                    System.out.println("Совпадают цифры III разряда");
                }
            }
        } else if(digitI1 ==  digitI2) {
            if(digitII1 == digitII2) {
                if(digitIII1 != digitIII2) {
                    System.out.println("Совпадают цифры I и II разряда");
                }
            }
        } else if(digitI1 !=  digitI2) {
            if(digitII1 == digitII2) {
                if(digitIII1 == digitIII2) {
                    System.out.println("Совпадают цифры II и III разряда");
                }
            }
        } else if(digitI1 ==  digitI2) {
            if(digitII1 != digitII2) {
                if(digitIII1 == digitIII1) {
                    System.out.println("Совпадают цифры I и III разряда");
                }
            }
        } else {
        	System.out.println("Совпадений в цифрах по разрядам нет");
       }
  
	}
}