class Election {
    public static void main(String[] args) 
    {
        // Creating objects using different constructors
        Candidate c1 = new Candidate("Hrishabh", 32);
        Candidate c2 = new Candidate("Jagrati", 35, 1002);

        // Displaying candidate details
        System.out.println("------------------Candidate 1 Details:------------------");
        c1.displayDetails();
        System.out.println("Candidate Age (Protected Access): " + c1.getAge());
        System.out.println();

        System.out.println("------------------Candidate 2 Details:------------------");
        c2.displayDetails();
        System.out.println("Candidate Age (protected Access): " + c2.getAge());
        System.out.println();

        // Casting votes
        c1.castVote(); // Increment by 1
        c2.castVote(3); // Increment by a custom value

        System.out.println("------------------After Casting Votes :------------------\n");
        System.out.println("\t\t   Candidate 1 Details:\t\t");
        c1.displayDetails();
        c1.voteResultDeclaration();
        System.out.println();

        System.out.println("\t\t   Candidate 2 Details:\t\t");
        c2.displayDetails();
        c2.voteResultDeclaration(30);
    }
}
