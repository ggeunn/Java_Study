package com.ogiraffers.section01.comditional;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        A_if a = new A_if();
        B_ifElse b = new B_ifElse();
        C_ifElseIf c = new C_ifElseIf();
        D_switch d = new D_switch();

//        a.testSimpleIfStatement();
//        a.testNestedIfStatement();

//        b.testSimpleIfElseStatement();
//        b.testNestedIfElseStatement();

//        c.testSimpleIfElseIfStatement();

//        d.testSimpleSwitchStatement();
        d.testSwitchVendingMachine();

    }
}
