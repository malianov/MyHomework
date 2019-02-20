package quickTasks.golovach;

public class Habrahabr_short_conspect {

//      Catch, throw, throws можно использовать исключительно с java.lang.Throwable или его потомками
        public static void main(String[] args) throws Throwable {
//      public static void main(String[] args) throws String {}       //Не будет работать из-за String)
        }
    }



class Habrahabr_1_catch {
        public static void main(String[] args) {
            try {
            } catch (Throwable t) {}
//          } catch (String s) {}       // Не будет работать из-за String)
        }
    }


class Habrahabr_throw {
    public static void main(String[] args) {
        // Error - потомок Throwable
        throw new Error();
//      throw new String("Hello!");     // Не будет работать из-за String)
//      throw null;                     // throw требуется не-null аргумент, иначе NullPointerException в момент выполнения
    }
}

class Habrahabr_throw_2 {
    public static void main(String[] args) {
                                    // throw и new — это две независимых операции.
        Error ref = new Error();    // Создали экземпляр
        throw ref;                  // "бросили" экземпляр
    }
}
class Habrahabr_throw_3 {
    public static void main(String[] args) {
        f(null);
    }

    public static void f(NullPointerException e) {
        try {
            throw e;
        } catch (NullPointerException npe) {
            f(npe);
        }
    }
}

class Sout2 {
    public static void main(String[] args) {
        System.out.println("sout");
        throw new Error();
    }
}
/*
System.out — buffered-поток вывода, а System.err — нет.

                       буфер сообщений
                     +----------------+
                 +-> | msg2 msg1 msg0 | --> out
                /    +----------------+          \
               /                                 +-> +--------+
ВАШЕ ПРИЛОЖЕНИЕ                                      | КОНСОЛЬ|
               \                                 +-> +--------+
                \                               /
                 +------------------------> err
                  нет буфера, сразу печатаем

Когда пишем в System.err — наше сообщение тут же выводится на консоль,
но когда пишете в System.out, то оно может на какое-то время быть
буферизированно. Stacktrace необработанного исключение выводится через
System.err, что позволяет им обгонять «обычные» сообщения.

*/
class RequiredReturn {
    public double sqr_1(double arg) {   // надо double
        return arg * arg;               // double * double - это double
    }

    public double sqr_2(double arg) {   // надо double
        int k = 1;                      // есть int
        return k;                       // можно неявно преобразовать int в double
    }

    public double sqr_3(double arg) {     // надо double
        int k = 1;                      // есть int
        return (double) k;              // явное преобразование int в double
    }

    /*
        public static double sqr(double arg) {
            return "hello!";
        }
        >>COMPILATION ERROR: Incompatible types. Required: double. Found: java.lang.String
    ----------------------------------------------------------------------------------------
            public static double sqr(double arg) {
        }
        >> COMPILATION ERROR: Missing return statement
    ----------------------------------------------------------------------------------------
        public static double sqr(double arg) {
            if (System.currentTimeMillis() % 2 == 0) {
                return arg * arg;                           // если currentTimeMillis() - четное число, то все ОК
            }
                                                            // а если нечетное, что нам возвращать?
        }
        >> COMPILATION ERROR: Missing return statement
    ----------------------------------------------------------------------------------------
        public static void main(String[] args) {
            double d = sqr(10.0);                           // ну, и чему равно d?
            System.out.println(d);
        }
        public static double sqr(double arg) {
                                                            // nothing
        }
        >> COMPILATION ERROR: Missing return statement
    ----------------------------------------------------------------------------------------
    */
    public static double sqr4(double arg) {
        while (true);                                   // Удивительно, но КОМПИЛИРУЕТСЯ!
    }
    //----------------------------------------------------------------------------------------
    public static void main(String[] args) {
        double d = sqr5(10.0);                           // sqr - навсегда "повиснет", и
        System.out.println(d);                          // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
    }
    public static double sqr5(double arg) {
        while (true);                                   // Вот тут мы на века "повисли"
    }
//----------------------------------------------------------------------------------------

    public static double sqr6(double arg) {
        if (System.currentTimeMillis() % 2 == 0) {
            return arg * arg;                          // ну ладно, вот твой double
        } else {
            while (true);                              // а тут "виснем" навсегда
        }
    }
    //----------------------------------------------------------------------------------------
    public static double sqr7(double arg) {
        throw new RuntimeException();       //Но механизм исключений позволяет НИЧЕГО НЕ ВОЗВРАЩАТЬ!
    }
}

//----------------------------------------------------------------------------------------
/*
Итак, у нас есть ТРИ варианта для компилятора
    public static double sqr8(double arg) {      // согласно объявлению метода ты должен вернуть double
        long time = System.currentTimeMillis();
        if (time % 2 == 0) {
            return arg * arg;                   // ок, вот твой double
        } else if (time % 2 == 1) {
            {
                while (true) ;                       // не, я решил "повиснуть"
            } else{
                throw new RuntimeException();       // или бросить исключение
            }
        }*/
//----------------------------------------------------------------------------------------
/*
Но КАКОЙ ЖЕ double вернет функция, бросающая RuntimeException?
А НИКАКОЙ!

    public static void main(String[] args) {
                                        // sqr - "сломается" (из него "выскочит" исключение),
        double d = sqr(10.0);           // выполнение метода main() прервется в этой строчке и
                                        // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
        System.out.println(d);          // и печатать нам ничего не придется!
    }
    public static double sqr(double arg) {
        throw new RuntimeException();   // "бросаем" исключение
    }

    Подытожим: бросаемое исключение — это дополнительный возвращаемый тип. Если ваш метод объявил,
    что возвращает double, но у вас нет double — можете бросить исключение. Если ваш метод объявил,
    что ничего не возвращает (void), но у вам таки есть что сказать — можете бросить исключение.
*/
//----------------------------------------------------------------------------------------
/*
    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
        }
    return width * height;

    Если обнаружили возможное некорректное поведение, то вычисления остановить,
    сгенерировать сообщение-поломку, которое трудно игнорировать, предоставить
    пользователю информацию о причине, предоставить пользователю возможность
    все починить (загрузить белье назад и повторно нажать кнопку старт)
*/

/*

>> #1.in
>> .   #2.in
>> .   .   #3.in
>> .   .   .   #4.in
>> .   .   .   #4.THROW
>> #1.CATCH
>> #1.out

*/

class Example_catch {
    public static void main(String[] args) {
        System.err.println("#1.in");
        try {
            f();                                // создаем фрейм, помещаем в стек, передаем в него управление
        } catch (Error e) {                     // "перехватили" "летящее" исключение
            System.err.println("#1.CATCH");     // и работаем
        }
        System.err.println("#1.out");           // работаем дальше
    }

    public static void f() {
        System.err.println(".   #2.in");
        g();                                    // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println(".   #2.out");       // ПРОПУСТИЛИ!
    }

    public static void g() {
        System.err.println(".   .   #3.in");
        h();                                    // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println(".   .   #3.out");   // ПРОПУСТИЛИ!
    }

    public static void h() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.THROW");
            throw new Error();                      // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
        }
        System.err.println(".   .   .   #4.out");   // ПРОПУСТИЛИ!
    }
}

/*

>> #1.in
>> .   #2.in
>> .   .   #3.in
>> .   .   .   #4.in
>> .   .   .   #4.RETURN
>> .   .   #3.out
>> .   #2.out
>> #1.out

*/

class Example_return {
    public static void main(String[] args) {
        System.err.println("#1.in");
        f();                                        // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println("#1.out");               // вернулись
    }                                               // выходим из текущего фрейма, кончились инструкции

    public static void f() {
        System.err.println(".   #2.in");
        g();                                        // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println(".   #2.out");           // вернулись
    }                                               // выходим из текущего фрейма, кончились инструкции

    public static void g() {
        System.err.println(".   .   #3.in");
        h();                                        // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println(".   .   #3.out");       // вернулись
    }                                               // выходим из текущего фрейма, кончились инструкции

    public static void h() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.RETURN");
            return;                                 // выходим из текущего фрейма по 'return'
        }
        System.err.println(".   .   .   #4.out");   // ПРОПУСКАЕМ
    }
}

/*

>> #1.in
>> .   #2.in
>> .   .   #3.in
>> .   .   .   #4.in
>> .   .   .   #4.THROW
>> RUNTIME ERROR: Exception in thread "main" java.lang.Error

*/

class Example_throw {
    public static void main(String[] args) {
        System.err.println("#1.in");
        f();                                        // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println("#1.out");               // ПРОПУСТИЛИ!
    }

    public static void f() {
        System.err.println(".   #2.in");
        g();                                        // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println(".   #2.out");           // ПРОПУСТИЛИ!
    }

    public static void g() {
        System.err.println(".   .   #3.in");
        h();                                        // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println(".   .   #3.out");       // ПРОПУСТИЛИ!
    }

    public static void h() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.THROW");
            throw new Error();                      // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
        }
        System.err.println(".   .   .   #4.out");   // ПРОПУСТИЛИ!
    }
}

/*

>> #1.in
>> .   #2.in
>> .   .   #3.in
>> .   .   .   #4.in
>> .   .   .   #4.THROW
>> .   .   #3.CATCH
>> .   .   #3.out
>> .   #2.out
>> #1.out

*/


class Example_throw_catch {
    public static void main(String[] args) {
        System.err.println("#1.in");
        f();                                    // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println("#1.out");           // вернулись и работаем
    }

    public static void f() {
        System.err.println(".   #2.in");
        g();                                    // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println(".   #2.out");       // вернулись и работаем
    }

    public static void g() {
        System.err.println(".   .   #3.in");
        try {
            h();                                    // создаем фрейм, помещаем в стек, передаем в него управление
        } catch (Error e) {                         // "перехватили" "летящее" исключение
            System.err.println(".   .   #3.CATCH"); // и работаем
        }
        System.err.println(".   .   #3.out");       // работаем дальше
    }

    public static void h() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.THROW");
            throw new Error();                      // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
        }
        System.err.println(".   .   .   #4.out");   // ПРОПУСТИЛИ!
    }
}

//to be continued