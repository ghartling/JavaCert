package com.hartling.java8cert.nested;

public class HelloWorldAnonymousClasses {
	private String topLevelString = "topLevelString";

	interface HelloWorld {
		public void greet();

		public void greetSomeone(String someone);
	}

	public void sayHello() {

		class EnglishGreeting implements HelloWorld {
			String name = "world";

			public void printTopLevelString() {
				System.out.println("topLevelString: " + topLevelString);
			}

			@Override
			public void greet() {
				greetSomeone("world");
			}

			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hello " + name);
			}
		}

		HelloWorld englishGreeting = new EnglishGreeting();

		HelloWorld frenchGreeting = new HelloWorld() {
			String name = "tout le monde";

			@Override
			public void greet() {
				greetSomeone("tout le monde");
			}

			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Salut " + name);
			}
		};

		HelloWorld spanishGreeting = new HelloWorld() {
			String name = "mundo";

			@Override
			public void greet() {
				greetSomeone("mundo");
			}

			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hola, " + name);
			}
		};
		englishGreeting.greet();
		frenchGreeting.greetSomeone("Fred");
		spanishGreeting.greet();

		((EnglishGreeting) englishGreeting).printTopLevelString();
	}

	public static void main(String... args) {
		HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
		myApp.sayHello();
	}
}
