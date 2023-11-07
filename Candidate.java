class Candidate 
{
    private String name;
    protected int age;
    int id;
    public int votes;

    // Default constructor
    public Candidate() 
    {
        this.name = "NULL";
        this.age = 0;
        this.id = 0;
        this.votes = 0;
    }

    // Parameterized constructor with two parameters
    public Candidate(String name, int age) 
    {
        this.name = name;
        this.age = age;
        this.id = 1001;
        this.votes = 7;
    }

    // Parameterized constructor with three parameters
    public Candidate(String name, int age, int id) 
    {
        this.name = name;
        this.age = age;
        this.id = id;
        this.votes = 28;
    }

    // Method overloading for Vote casting methods
    public void castVote() 
    {
        this.votes++;
    }

    public void castVote(int increment) // Overloaded method with one parameter
    {
        this.votes += increment;
    }

    // Method overloading for Vote result declaration
    public void voteResultDeclaration() 
    {
        if (this.votes < 10) 
        {
            System.out.println(this.name + " has received fewer votes.");
        } else 
        {
            System.out.println(this.name + " has received a considerable number of votes.");
        }
    }

    public void voteResultDeclaration(int threshold) //Overloaded voteResultDeclaration Method  with a parameter
    {
        if (this.votes < threshold) 
        {
            System.out.println(this.name + " has received fewer votes than the threshold.");
        } else {
            System.out.println(this.name + " has received votes greater than the threshold.");
        }
    }
    // Accessor methods - public
    public String getName() {
        return this.name;
    }

    // Accessor methods - protected
    protected int getAge() {
        return this.age;
    }

    // Accessor methods - default (package-private)
    int getId() {
        return this.id;
    }

    // Display method - public
    public void displayDetails() {
        System.out.println("Name of the Candidate: " + this.name);
        System.out.println("Age of the Candidate: " + this.age);
        System.out.println("ID of the Candidate: " + this.id);
        System.out.println("Total Votes of the Candidate: " + this.votes);
    }
}