package com.company;

class Movie {
    private String name;

    public String getName() {
        return name;
    }

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot is here";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Alines attemps to take over earth";
    }
}

class Mezrunner extends Movie {
    public Mezrunner() {
        super("Mez Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class Starwars extends Movie {
    public Starwars() {
        super("Start Wars");
    }

    @Override
    public String plot() {
        return "Imperial Force takes over the universe";
    }
}

class Forgatable extends Movie {
    public Forgatable() {
        super("Forgatable");
    }
    //no plot method
}


public class Main {

    public static void main(String[] args) {
        for (int i = 1; i<10; i++){
        Movie movie = randomMovie();
            System.out.println("Movie # "+i+" : "+movie.getName() + "\n"+"Plot : "+movie.plot()+"\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) ((Math.random() * 5) + 1);
        System.out.println("Random number generated was :" + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new Mezrunner();

            case 4:
                return new Starwars();

            case 5:
                return new Forgatable();

            default:
                return null;
        }
    }
}
