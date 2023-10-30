package Exercises13;

import java.math.BigInteger;

public class RationalBigInt extends Number implements Comparable<RationalBigInt> {
 // Data fields for numerator and denominator
 private BigInteger numerator =  new BigInteger("0");
 private BigInteger denominator = new BigInteger("1");

 /** Construct a rational with default properties */
 public RationalBigInt() {
 this(0, 1);
 }

 /** Construct a rational with specified numerator and denominator */
 public RationalBigInt(long numerator, long denominator) {
 long gcd = gcd(numerator, denominator);
 this.numerator = new BigInteger (""+ (denominator > 0 ? 1 : -1) * numerator / gcd);
 this.denominator = new BigInteger(""+ Math.abs(denominator) / gcd);
 }

 /** Find GCD of two numbers */
 public static long gcd(long n, long d) {
 long n1 = Math.abs(n);
 long n2 = Math.abs(d);
 int gcd = 1;

 for (int k = 1; k <= n1 && k <= n2; k++) {
 if (n1 % k == 0 && n2 % k == 0)
 gcd = k;
 }

 return gcd;
 }

 /** Return numerator */
 public long getNumerator() {
 return numerator.longValue();
 }

 /** Return denominator */
 public long getDenominator() {
 return denominator.longValue();
 }

 /** Add a rational number to this rational */
 public Rational add(RationalBigInt secondRational) {
 long n = numerator.longValue() * secondRational.getDenominator() +
 denominator.longValue() * secondRational.getNumerator();
 long d = denominator.longValue() * secondRational.getDenominator();
 return new Rational(n, d);
 }

 /** Subtract a rational number from this rational */
 public Rational subtract(RationalBigInt secondRational) {
 long n = numerator.longValue() * secondRational.getDenominator()
 - denominator.longValue() * secondRational.getNumerator();
 long d = denominator.longValue() * secondRational.getDenominator();
 return new Rational(n, d);
 }

 /** Multiply a rational number by this rational */
 public Rational multiply(RationalBigInt secondRational) {
 long n = numerator.longValue() * secondRational.getNumerator();
 long d = denominator.longValue() * secondRational.getDenominator();
 return new Rational(n, d);
 }

 /** Divide a rational number by this rational */
 public Rational divide(RationalBigInt secondRational) {
 long n = numerator.longValue() * secondRational.getDenominator();
 long d = denominator.longValue() * secondRational.numerator.longValue();
 return new Rational(n, d);
 }

 @Override
 public String toString() {
 if (denominator.longValue() == 1)
 return numerator + "";
 else
 return numerator + "/" + denominator;
 }

 @Override // Override the equals method in the Object class
 public boolean equals(Object other) {
 if ((this.subtract((RationalBigInt)(other))).getNumerator() == 0)
 return true;
 else
 return false;
 }

 @Override // Implement the abstract intValue method in Number
 public int intValue() {
 return (int)doubleValue();
 }

 @Override // Implement the abstract floatValue method in Number
 public float floatValue() {
 return (float)doubleValue();
 }

 @Override // Implement the doubleValue method in Number
 public double doubleValue() {
 return numerator.longValue() * 1.0 / denominator.longValue();
 }

 @Override // Implement the abstract longValue method in Number
 public long longValue() {
 return (long)doubleValue();
 }

 @Override // Implement the compareTo method in Comparable
 public int compareTo(RationalBigInt o) {
 if (this.subtract(o).getNumerator() > 0)
 return 1;
 else if (this.subtract(o).getNumerator() < 0)
 return -1;
 else
 return 0;
 }
 }