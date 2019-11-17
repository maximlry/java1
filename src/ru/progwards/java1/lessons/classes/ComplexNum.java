package ru.progwards.java1.lessons.classes;

public class ComplexNum {

    int a;
    int b;

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public int GetRe() {
        return a;
    }

    public int GetIm() {
        return b;
    }

    public String toString() {
        return (a + "+" + b + "i");
    }

    public ComplexNum add(ComplexNum num1, ComplexNum num2) {
        return new ComplexNum (num1.GetRe() + num2.GetRe(), num1.GetIm() + num2.GetIm());
    }

    public ComplexNum sub(ComplexNum num1, ComplexNum num2) {
        return new ComplexNum (num1.GetRe() - num2.GetRe(), num1.GetIm() - num2.GetIm());
    }

    public ComplexNum mul(ComplexNum num1, ComplexNum num2) {
        return new ComplexNum (num1.GetRe()*num2.GetRe()-num1.GetIm()*num2.GetIm(), num1.GetIm()*num2.GetRe()+num1.GetRe()*num2.GetIm());
    }

    public ComplexNum div(ComplexNum num1, ComplexNum num2) {
        return new ComplexNum((num1.GetRe()*num2.GetRe()+num1.GetIm()*num2.GetIm())/(num2.GetRe()*num2.GetRe()+num2.GetIm()*num2.GetIm()),(num1.GetIm()*num2.GetRe()-num1.GetRe()*num2.GetIm())/(num2.GetRe()*num2.GetRe()+num2.GetIm()*num2.GetIm()));
    }

}
