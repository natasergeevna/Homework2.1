public class Main {
    public static void main(String[] args) {
        //task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("\n");

        //task 2
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("\n");

        //task 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("\n");

        //task 4
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        System.out.println("\n");

        //task 5
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        System.out.println("\n");

        //task 6
        var weightFirstBoxes = 78.2;
        var weightSecondBoxers = 82.7;
        var totalWeight = weightFirstBoxes + weightSecondBoxers;
        System.out.println(totalWeight);
        var weightDifference = weightSecondBoxers - weightFirstBoxes;
        System.out.println(weightDifference);
        System.out.println("\n");

        //task 7
        var weightSubtraction = weightSecondBoxers - weightFirstBoxes;
        System.out.println(weightSubtraction);
        var divisionWeights = weightSecondBoxers % weightFirstBoxes;
        System.out.println(divisionWeights);
        System.out.println("\n");

        //task 8
        var numberOfHours = 640;
        var hoursOfOneEmployee = 8;
        var employee = numberOfHours / hoursOfOneEmployee;
        System.out.println("Всего работников в компании - " + employee + " человек");
        employee += 94;
        numberOfHours = employee * hoursOfOneEmployee;
        System.out.println("Если в компании работает " + employee + " человек, то всего " + numberOfHours + " часов может быть поделено между сотрудниками");




    }
}