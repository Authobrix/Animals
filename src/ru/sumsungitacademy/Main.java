package ru.sumsungitacademy;

public class Main {

    public static void main(String[] args) {
	Animals ouranimal = new Animals();
	ouranimal.eat();
	ouranimal.sleep();
	String say=ouranimal.speak ("Play with me");
	System.out.println(say);
	Bird pticha = new Bird();
	pticha.Flying();
	pticha.setColor("Blue");
    }
}
