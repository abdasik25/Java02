import java.lang.Math;

public class dataTest{
    public static void testInt(){
        int a = 1 + (int) (Math.random() * 20);
        int b = 1 + (int) (Math.random() * 20);
        int c;

        System.out.println ("\n\n\n************ Test Integer ************\n");
        System.out.println ("\n************ Arithmetical Operations ************\n");

        // addiction
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception
        a = 5;
        // unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
        c = a & b; // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = a | b; // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = a ^ b; // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = ~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        c = a << 1; // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = -5;
        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = 5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = -5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c = (int) l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
        c = (int) f;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
        c = (int) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
        // c = (int)bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
                bool);
    }
    public static void testByte(){
        byte a =  (byte) (1 + (Math.random() * 20));
        byte b = (byte) (1 + (Math.random() * 20));
        byte c;

        System.out.println ("\n\n\n************ Test Byte ************\n");
        System.out.println ("\n************ Arithmetical Operations ************\n");

        // addiction
        c = (byte) (a + b);
        System.out.printf("(byte) (%d + %d) = %d\n", a, b, c);
        // subtraction
        c = (byte) (a - b);
        System.out.printf("(byte) (%d - %d) = %d\n", a, b, c);
        // multiplication
        c = (byte) (a * b);
        System.out.printf("(byte) (%d * %d) = %d\n", a, b, c);
        // division
        c = (byte) (a / b);
        System.out.printf("(byte) (%d / %d) = %d\n", a, b, c);
        // modulus
        c = (byte) (a % b);
        System.out.printf("(byte) (%d %% %d) = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception
        a = 5;
        // unary minus
        c = (byte) -a;
        System.out.printf("(byte) -%d = %d\n", a, c);
        // unary plus
        c = (byte) +a;
        System.out.printf("(byte) +%d = %d\n", a, c);
        // prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");
        c = (byte) (a & b); // bitwise AND
        System.out.printf("(byte) (d & %d) = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (byte) (a | b); // bitwise OR
        System.out.printf("(byte) (%d | %d) = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (byte) (a ^ b); // bitwise XOR
        System.out.printf("(byte) (%d ^ %d) = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (byte) ~a; // bitwise unary compliment
        System.out.printf("(byte) ~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        c = (byte) (a << 1); // left shift
        System.out.printf("(byte) %d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        c = (byte) (a >> 1); // right shift
        System.out.printf("(byte) %d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = -5;
        c = (byte) (a >> 1); // right shift
        System.out.printf("(byte) %d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = 5;
        c = (byte) (a >>> 1); // zero fill right shift
        System.out.printf("(byte) %d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = -5;
        c = (byte) (a >>> 1); // zero fill right shift
        System.out.printf("(byte) %d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));
        System.out.println("\nType Cast Operator:");

        byte bt = 22;
        short sh = -32320;
        char ch = '\u1000';
        long l = 1000099999900000L;
        float f = 1.1f;
        double d = 189.625;
        boolean bool = true;
        c = bt;
        System.out.printf("byte = byte: c = %d --> c = %d\n", bt, c);
        c = (byte) sh;
        System.out.printf("byte = short: c = (byte)%d --> c = %d\n", sh, c);
        c = (byte) ch;
        System.out.printf("byte = char: c = '%c' --> c = %d\n", ch, c);
        c = (byte) l;
        System.out.printf("byte = long: c = (byte) %d --> c = %d\n", l, c);
        c = (byte) f;
        System.out.printf("byte = float: c =(byte) %f --> c = %d\n", f, c);
        c = (byte) d;
        System.out.printf("byte = double: c = (byte) %f --> c = %d\n", d, c);
        //c = (byte) bool;
        System.out.printf("byte = boolean: c = (byte) %b --> Compile Error\n",
                bool);

    }
    public static void testShort(){
        short a = (short) (1 + (short) (Math.random() * 20));
        short b = (short) (1 + (short) (Math.random() * 20));
        short c = 0;

        System.out.println ("\n\n\n************ Test Short ************\n");
        System.out.println ("\n************ Arithmetical Operations ************\n");

        // addiction
        c = (short) (a + b);
        System.out.printf("(short) (%d + %d) = %d\n", a, b, c);
        // subtraction
        c = (short) (a - b);
        System.out.printf("(short) (%d - %d) = %d\n", a, b, c);
        // multiplication
        c = (short) (a * b);
        System.out.printf("(short) (%d * %d) = %d\n", a, b, c);
        // division
        c = (short) (a / b);
        System.out.printf("(short) (%d / %d) = %d\n", a, b, c);
        // modulus
        c = (short) (a % b);
        System.out.printf("(short) (%d %% %d) = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception
        a = 5;
        // unary minus
        c = (short) -a;
        System.out.printf("(short) -%d = %d\n", a, c);
        // unary plus
        c = (short) +a;
        System.out.printf("(short) +%d = %d\n", a, c);
        // prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
        c = (short) (a & b); // bitwise AND
        System.out.printf("(short) (&d & %d) = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (short) (a | b); // bitwise OR
        System.out.printf("(short) (%d | %d) = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (short) (a ^ b); // bitwise XOR
        System.out.printf("(short) (%d ^ %d) = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (short) (~a); // bitwise unary compliment
        System.out.printf("(short) ~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        c = (short) (a << 1); // left shift
        System.out.printf("(short) (&d << 1) = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("(short) (%s << 1) = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        c = (short) (a >> 1); // right shift
        System.out.printf("(short) (%d >> 1) = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = -5;
        c = (short) (a >> 1); // right shift
        System.out.printf("(short) (%d >> 1) = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = 5;
        c = (short) (a >>> 1); // zero fill right shift
        System.out.printf("(short) (%d >>> 1) = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        a = -5;
        c = (short) (a >>> 1); // zero fill right shift
        System.out.printf("(short) (%d >>> 1) = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));
        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 25;
        short sh = -3230;
        char ch = '\u0002';
        long l = 5325350000L;
        float f = 8.9f;
        double d = 16789.625;
        boolean bool = false;
        c = bt;
        System.out.printf("short = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("short = short: c = %d --> c = %d\n", sh, c);
        c = (short) ch;
        System.out.printf("short = char: c = (short)'%c' --> c = %d\n", ch, c);
        c = (short) l;
        System.out.printf("short = long: c = (short)%d --> c = %d\n", l, c);
        c = (short) f;
        System.out.printf("short = float: c = (short)%f --> c = %d\n", f, c);
        c = (short) d;
        System.out.printf("short = double: c = (short)%f --> c = %d\n", d, c);
        // c = (short)bool;
        System.out.printf("short = boolean: c = (short)%b --> Compile Error\n",
                bool);
    }
    public static void testChar() {
        char a = 'A';
        char b = '!';
        char c;

        System.out.println("***** Arithmetical Operators *****");

        //addition +
        c = (char) (a + b);
        int d = c;
        int e = b;
        int f = a;
        //System.out.println((char) (a + 4));
        System.out.printf("(char) (%c + %c) = %c\n", a, b, c);
        //System.out.println(f + " + " + e + " = " + d);
        //subtraction -
        c = (char) (a - b);
        System.out.printf("'%c' = (char) ('%c' - '%c')\n", c, a, b);
        //multiplication *
        c = (char) (a * b);
        System.out.printf("'%c' = (char) ('%c' * '%c')\n", c, a, b);
        //division
        c = (char) (a / b);
        System.out.printf("'%c' = (char) ('%c' / '%c')\n", c, a, b);
        //modulus
        c = (char) (a % b);
        System.out.printf("'%c' = (char) ('%c' %% '%c')\n", c, a, b);
        //unary plus / minus
        c = (char)-a;
        System.out.printf("(char)-'%c' = '%c'\n", a, c);
        c = (char)+a;
        System.out.printf("(char)+'%c' = '%c'\n", a, c);
        //increment ++
        a = 'A';
        System.out.printf("++'%c' = '%c'\n", a, ++a);
        a = 'A';
        System.out.printf("%c'++ = '%c'\n", a, a++);
        //decrement --
        a = 'A';
        System.out.printf("--'%c' = '%c'\n", a, --a);
        a = 'A';
        System.out.printf("'%c'-- = '%c'\n", a, a--);


        System.out.println("\n***** Relational Operators *****");
        System.out.println("\n!!Relational operators use int value of appropriate char");
        a = 'A';
        b = '!';
        //equal to ==
        System.out.printf("%c == %c - - > %b\n", d, e, d == e);
        //not equal to !=
        System.out.printf("%c != %c - - > %b\n", a, b, a != b);
        //greater than >
        System.out.printf("%c > %c - - > %b\n", a, b, a > b);
        //less than <
        System.out.printf("%c < %c - - > %b\n", a, b, a < b);
        //greater than or equal to >=
        System.out.printf("%c >= %c - - > %b\n", a, b, a>= b);
        //less than or equal to <=
        System.out.printf("%c <= %c - - > %b\n", a, b, a<=b);

        System.out.println("\n***** Logical Operators *****");
        System.out.println("\n!! Logical operators use int value of appropriate char");
        //logical not !
        System.out.printf("!(%c > %c) - - > %b\n", a, b, !(a>b));
        System.out.printf("!(%c < %c) - - > %b\n", a, b, !(a<b));
        //logical xor ^
        System.out.printf("%c >= %c | %c != 0 - - > %b\n", a, b, b, a>=b ^ b!=0);
        System.out.printf("%c <= %c | %c != 0 - - > %b\n", a, b, b, a<=b ^ b!=0);
        System.out.printf("%c <= %c | %c != 2 - - > %b\n", a, b, b, a<=b ^ b!=2);
        //logical AND &&
        System.out.printf("%c > %c && %c > 0 - - > %b\n", a, b, a, a>b && a>0);
        System.out.printf("%c < %c && %c > 0 - - > %b\n", a, b, a, a<b && a>0);
        System.out.printf("%c < %c && %c < 0 - - > %b\n", a, b, a, a<b && a<0);
        //logical OR ||
        System.out.printf("%c > %c || %c < 0 - - > %b\n", a, b, a, a>b || a<0);
        System.out.printf("%c < %c || %c < 0 - - > %b\n", a, b, a, a<b || a<0);
        System.out.printf("%c < %c || %c < 0 - - > %b\n", a, b, a, a>b || a<0);

        System.out.println("\n***** Bitwise Operators *****");
        System.out.println("\n!Bitwise operators use int value of appropriate char");
        //bitwise AND &
        c = (char) (a & b);
        System.out.printf("(char) (%c & %c) = %c\n", a, b, c);
        System.out.printf("In binary form: (char) (%s & %s) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise OR |
        c = (char) (a | b);
        System.out.printf("(char) (%c | %c) = %c\n", a, b, c);
        System.out.printf("in binary form: (char) (%s | %s) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise XOR ^
        c = (char) (a ^ b);
        System.out.printf("(char) (%c ^ %c) = %c\n", a, b, c);
        System.out.printf("In binary form: (char) (%s ^ %s) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
        //bitwise compliment ~
        c = (char) ~a;
        System.out.printf("(char) ~%c = %c\n", a, c);
        System.out.printf("In binary form: (char) ~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        //left shift <<
        c = (char) (a << 1);
        System.out.printf(" (char) (%c << 1) = %c\n", a, c);
        System.out.printf("In binary form: (char) (%s << 1) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        //right shift >>
        a = 'A';
        c = (char) (a >> 1);
        System.out.printf(" (char) (%c >> 1) = %c\n", a, c);
        System.out.printf("In binary form: (char) (%s >> 1) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
        //zero fill right shift >>>
        a = 'A';
        c = (char) (a >>> 1);
        System.out.printf(" (char) (%c >>> 1) = %c\n", a, c);
        System.out.printf("In binary form: (char) (%s >>> 1) = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators*****");
        System.out.println("\n!!  Assignment operators use int value of appropriate char");
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c += a --> " + "c = " + (c += a));
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c -= a --> " + "c = " + (c -= a));
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c *= a --> " + "c = " + (c *= a));
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c /= a --> " + "c = " + (c /= a));
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c %= a --> " + "c = " + (c %= a));
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c <<= a --> " + "c = " + (c <<= a));
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c >>= a --> " + "c = " + (c >>= a));
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c >>>= a --> " + "c = " + (c >>>= a));
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c &= a --> " + "c = " + (c &= a));
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c ^= a --> " + "c = " + (c ^= a));
        c = '!';
        a = 'A';
        System.out.println("c = !, a = A, c |= a --> " + "c = " + (c |= a));

        System.out.println("\n***** Conditional Operators *****");
        System.out.println("\n!!  Conditional operators use int value of appropriate char");
        a = 'A';
        b = '!';
        System.out.printf("%c > %c ? %c : %c --> %c\n", a,b,a,b,(a>b?a:b));

        System.out.println("\n***** TypeCast Operators *****");
        byte byt = 33;
        short sh = 32000;
        //char cha = '!';
        int i = -11;
        long lon = -2_000_000_000_000L;
        float floa = 222.345F;
        double doubl = -55.9321;
        boolean bool = true;

        c = (char) byt;
        System.out.printf("char = byte(only positive): c = (char)%d --> c = %c\n", byt, c);
        c = (char) sh;
        System.out.printf("char = short(only positive): c = (char)'%c' --> c = %c\n", sh, c);
        c = (char) i;
        System.out.printf("char = int: c = (char)%d --> c = %c\n", i, c);
        c = (char) lon;
        System.out.printf("char = long: c = (char)%d --> c = %c\n", lon, c);
        c = (char) floa;
        System.out.printf("char = float: c = (char)%f --> c = %c\n", floa, c);
        c = (char) doubl;
        System.out.printf("char = double: c = (char)%f --> c = %c\n", doubl, c);
        //c = bool;
        System.out.printf("short = boolean: Error\n");
    }
    public static void testLong(){
        long a = 1 + (long) (Math.random() * 20);
        long b = 1 + (long) (Math.random() * 20);
        long c = 0;

        System.out.println ("\n\n\n************ Test Long ************\n");
        System.out.println ("\n************ Arithmetical Operations ************\n");

        // addiction
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception
        a = 5;
        // unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
        c = a & b; // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));
        c = a | b; // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));
        c = a ^ b; // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));
        c = ~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        c = a << 1; // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        a = -5;
        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        a = 5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        a = -5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 10;
        short sh = -3330;
        char ch = '\u0002';
        long l = 1000033432432000000L;
        float f = 5.9f;
        double d = 12345234249.625;
        boolean bool = true;
        c = bt;
        System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);
        c = l;
        System.out.printf("long = long: c = %d --> c = %d\n", l, c);
        c = (long) f;
        System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
        c = (long) d;
        System.out.printf("long = double: c = (long)%f --> c = %d\n", d, c);
        // c = (long)bool;
        System.out.printf("long = boolean: c = (long)%b --> Compile Error\n",
                bool);
    }
    public static void testDouble(){
        double a = (float) (1 + (Math.random() * 20));
        double b = (float) (1 + (Math.random() * 20));
        double c = 0;

        System.out.println ("\n\n\n************ Test Double ************\n");
        System.out.println ("\n************ Arithmetical Operations ************\n");

        // addiction
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        // multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);
        // division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception
        a = 5;
        // unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);
        // prefix increment
        a = 5;
        System.out.printf("++%f = %f\n", a, ++a);
        // postfix increment
        a = 5;
        System.out.printf("%f++ = %f\n", a, a++);
        // prefix decrement
        a = 5;
        System.out.printf("--%f = %f\n", a, --a);
        // postfix decrement
        a = 5;
        System.out.printf("%f-- = %f\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
        System.out.println("\n***** Bitwise operators cannot be applied for float type *****");
        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f  --> c = %f\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.println("\n***** <==, >>>=, >>=, &=, ^= cannot be applied for float type *****");
        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%f > %f ? %f: %f --> %f\n", a, b, a, b,
                (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 123;
        short sh = -3340;
        char ch = '\u0122';
        long l = 1002324242000L;
        float f = 15.9f;
        double d = 123453453789.625;
        boolean bool = false;
        c = bt;
        System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("float = short: c = %d--> c = %f\n", sh, c);
        c = ch;
        System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c);
        c = l;
        System.out.printf("float = long: c = %d --> c = %f\n", l, c);
        c =  f;
        System.out.printf("float = float: c = %f --> c = %f\n", f, c);
        c = (float) d;
        System.out.printf("float = double: c = %f --> c = %f\n", d, c);
        // c = (float)bool
        System.out.printf("float = boolean: c = %b --> Compile Error\n",
                bool);
    }
    public static void testBoolean(){
            boolean a = true;
            boolean b = false;
            boolean c;
            System.out.println ("\n\n\n************ Test Boolean ************\n");
            System.out.println("***** Arithmetical Operators *****");
            System.out.println("\nArithmetical operators cannot be applied for boolean");

            System.out.println("\n***** Relational Operators *****");
            //equal to ==
            System.out.printf("\nequal to: %b == %b - - > %b\n", a, b, a == b);
            //not equal to !=
            System.out.printf("not equal to: %b != %b - - > %b\n", a, b, a != b);
            System.out.println("\nOther operators cannot be applied");

            System.out.println("\n***** Logical Operators *****");
            //logical not !
            System.out.printf("!%b - - -> %b\n", a, !a);
            //logical xor ^
            c = a ^ b;
            System.out.printf("%b ^ %b = %b\n", a, b, c);

            //logical AND &&
            c = a && b;
            System.out.printf("%b && %b = %b\n", a, b, c);

            //logical OR ||
            c = a || b;
            System.out.printf("%b || %b = %b\n", a, b, c);

            System.out.println("\n***** Bitwise Operators *****");
            //bitwise xor ^
            c = a ^ b;
            System.out.printf("%b ^ %b = %b\n", a, b, c);

            //bitwise AND &
            c = a & b;
            System.out.printf("%b & %b = %b\n", a, b, c);

            //bitwise OR |
            c = a | b;
            System.out.printf("%b | %b = %b\n", a, b, c);

            System.out.println("\nOther operators are unavailable");

            System.out.println("\n***** Assignment Operators*****");

            System.out.printf("%b &= %b - - > c = %b\n", c, a, c &= a);
            System.out.printf("%b |= %b - - > c = %b\n", c, a, c |= a);
            System.out.printf("%b ^= %b - - > c = %b\n", c, a, c ^= a);

            System.out.println("\nOther operators cannot be applied");

            System.out.println("\n***** Conditional Operators *****");

            System.out.printf("%b ? %b : %b - - > %b\n", c, a, b, (c ? a : b));

            System.out.println("\n***** TypeCast Operators *****");
            //int i = 1;
            //a = (boolean) i;
            System.out.println("Cannot cast to boolean :(");
        }
    public static void testFloat(){
        float a = (float) (1 + (Math.random() * 20));
        float b = (float) (1 + (Math.random() * 20));
        float c = 0;

        System.out.println ("\n\n\n************ Test Float ************\n");
        System.out.println ("\n************ Arithmetical Operations ************\n");

        // addiction
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        // multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);
        // division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception
        a = 5;
        // unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);
        // prefix increment
        a = 5;
        System.out.printf("++%f = %f\n", a, ++a);
        // postfix increment
        a = 5;
        System.out.printf("%f++ = %f\n", a, a++);
        // prefix decrement
        a = 5;
        System.out.printf("--%f = %f\n", a, --a);
        // postfix decrement
        a = 5;
        System.out.printf("%f-- = %f\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
        System.out.println("\n***** Bitwise operators cannot be applied for float type *****");
        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f  --> c = %f\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.println("\n***** <==, >>>=, >>=, &=, ^= cannot be applied for float type *****");
        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%f > %f ? %f: %f --> %f\n", a, b, a, b,
                (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 123;
        short sh = -3340;
        char ch = '\u0122';
        long l = 1002324242000L;
        float f = 15.9f;
        double d = 123453453789.625;
        boolean bool = false;
        c = bt;
        System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("float = short: c = %d--> c = %f\n", sh, c);
        c = ch;
        System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c);
        c = l;
        System.out.printf("float = long: c = %d --> c = %f\n", l, c);
        c =  f;
        System.out.printf("float = float: c = %f --> c = %f\n", f, c);
        c = (float) d;
        System.out.printf("float = double: c = %f --> c = %f\n", d, c);
        // c = (float)bool
        System.out.printf("float = boolean: c = %b --> Compile Error\n",
                bool);

    }

    public static void testString() {
        String a = "Alexander";
        String b = "Lomat";
        String c;

        System.out.println("***** Arithmetical Operators *****");
        //addition +
        c = a + b;
        System.out.printf("%s + %s = %s\n", a, b, c);
        System.out.println("Only  + is available");

        System.out.println("\n***** Relational Operators *****");
        //equal to ==
        System.out.printf("%s == %s --> %b\n", a, b, a == b);
        //not equal to !=
        System.out.printf("%s != %s - - > %b\n", a, b, a != b);
        System.out.println("Other operators are unavailable");

        System.out.println("\n***** Logical Operators *****");
        System.out.println("Cannot be applied for String type");

        System.out.println("\n***** Bitwise Operators *****");
        System.out.println("Cannot be applied for String type");

        System.out.println("\n***** Assignment Operators*****");
        a = "Alex";
        c = "Sanya";
        System.out.println("a = Alex, c = Sanya, c += a --> " + "c = " + (c += a));

        System.out.println("\n***** Conditional Operators *****");
        System.out.println("Cannot be applied for String type");

        System.out.println("\n***** TypeCast Operators *****");
        byte b1 = -1;
        short sh = 32000;
        char c1 = '!';
        int i = 12;
        long l1 = -2_000_000_000_000L;
        float f1 = 2.345F;
        double d1 = -5.9321;
        boolean bool = true;

        c = Byte.toString(b1);
        System.out.printf("String = byte: c = %d --> c = %s\n", b1, c);
        c = Short.toString(sh);
        System.out.printf("String = short: c = %d --> c = %s\n", sh, c);
        c = Character.toString(c1);
        System.out.printf("String = char: c = '%c' --> c = %s\n", c1, c);
        c = Integer.toString(i);
        System.out.printf("String = int: c = %d --> c = %s\n", i, c);
        c = Long.toString(l1);
        System.out.printf("String = long: c = %d --> c = %s\n", l1, c);
        c = Float.toString(f1);
        System.out.printf("String = float: c = %f --> c = %s\n", f1, c);
        c = Double.toString(d1);
        System.out.printf("String = double: c = %f --> c = %s\n", d1, c);
        c = Boolean.toString(bool);
        System.out.printf("String = boolean: c = %b --> c = %s\n", bool, c);
    }

    public static void testStudent() {

        Student student1 = new Student("Alexander", 10);
        Student student2 = new Student("Sasha", 8);
        Student student3;

        System.out.println("***** Arithmetical Operators *****");
        System.out.println("Cannot be applied");


        System.out.println("\n***** Relational Operators *****");
        System.out.println("Instead you can use override of quals() method");

        System.out.println("\n***** Logical Operators *****");
        System.out.println("Cannot be applied (Overloading is not available)");

        System.out.println("\n***** Bitwise Operators *****");
        System.out.println("Cannot be applied (Overloading is not available)");

        System.out.println("\n***** Assignment Operators*****");
        System.out.println("Cannot be applied (Overloading is not available)");

        System.out.println("\n***** Conditional Operators *****");
        System.out.println("Cannot be applied (Overloading is not available)");

        System.out.println("\n***** TypeCast Operators *****");
        System.out.println("Incompatible types error");
    }

    public static void main(String[] args){
        dataTest.testByte();
        dataTest.testChar();
        dataTest.testShort();
        dataTest.testFloat();
        dataTest.testInt();
        dataTest.testLong();
        dataTest.testDouble();
        dataTest.testBoolean();
        dataTest.testString();
        dataTest.testStudent();
    }
}
